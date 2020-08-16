/*
 * Copyright 2015-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import dev.whyoleg.kamp.publication.*
import org.gradle.api.*

private val publication = Publication(
    name = "rsocket-kotlin",
    description = "Kotlin Multi-platform RSocket implementation",
    licenses = listOf(License.apache2),
    developers = listOf(Developer("whyoleg", "Oleg", "whyoleg@gmail.com")),
    url = "https://github.com/whyoleg/rsocket-kotlin",
    vcsUrl = "https://github.com/whyoleg/rsocket-kotlin"
)

private val publisher = BintrayPublisher("whyoleg", "rsocket-kotlin", "rsocket-kotlin-dev")

fun Project.configurePublication() {
    mppPublication(publication, publisher)
}
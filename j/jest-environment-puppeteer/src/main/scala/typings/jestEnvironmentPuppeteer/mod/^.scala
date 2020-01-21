package typings.jestEnvironmentPuppeteer.mod

import typings.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Note: TestEnvironment is sandboxed. Each test suite will trigger setup/teardown in their own TestEnvironment. */
@JSImport("jest-environment-puppeteer", JSImport.Namespace)
@js.native
class ^ protected () extends PuppeteerEnvironment {
  def this(config: ProjectConfig) = this()
}


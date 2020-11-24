package typings.jestEnvironmentPuppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Note: TestEnvironment is sandboxed. Each test suite will trigger setup/teardown in their own TestEnvironment. */
@js.native
trait PuppeteerEnvironment
  extends typings.jestEnvironmentNode.mod.^ {
  
  @JSName("global")
  var global_PuppeteerEnvironment: Global_ = js.native
}

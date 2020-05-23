package typings.jest.mod.jest

import typings.jest.anon.Typeofjest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest", "jest.resetModuleRegistry")
@js.native
object resetModuleRegistry extends js.Object {
  /**
    * Resets the module registry - the cache of all required modules. This is
    * useful to isolate modules where local state might conflict between tests.
    */
  def apply(): Typeofjest = js.native
}


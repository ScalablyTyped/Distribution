package typings.jest.mod.jest

import typings.jest.anon.Typeofjest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest", "jest.setMock")
@js.native
object setMock extends js.Object {
  /**
    * Explicitly supplies the mock object that the module system should return
    * for the specified module.
    */
  def apply[T](moduleName: String, moduleExports: T): Typeofjest = js.native
}


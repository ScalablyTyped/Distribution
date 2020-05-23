package typings.jest.mod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest", "jest.requireActual")
@js.native
object requireActual extends js.Object {
  /**
    * Returns the actual module instead of a mock, bypassing all checks on
    * whether the module should receive a mock implementation or not.
    */
  def apply[TModule](moduleName: String): TModule = js.native
}


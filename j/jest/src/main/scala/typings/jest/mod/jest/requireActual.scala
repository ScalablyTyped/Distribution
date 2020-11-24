package typings.jest.mod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest", "jest.requireActual")
@js.native
object requireActual extends js.Object {
  
  /**
    * Returns the actual module instead of a mock, bypassing all checks on
    * whether the module should receive a mock implementation or not.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def apply[TModule](moduleName: String): TModule = js.native
}

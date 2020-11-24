package typings.jest.mod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest", "jest.requireMock")
@js.native
object requireMock extends js.Object {
  
  /**
    * Returns a mock module instead of the actual module, bypassing all checks
    * on whether the module should be required normally or not.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def apply[TModule](moduleName: String): TModule = js.native
}

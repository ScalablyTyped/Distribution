package typings.jest.mod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest", "jest.genMockFromModule")
@js.native
object genMockFromModule extends js.Object {
  
  /**
    * (renamed to `createMockFromModule` in Jest 26.0.0+)
    * Use the automatic mocking system to generate a mocked version of the given module.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def apply[T](moduleName: String): T = js.native
}

package typings.jestResolve

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.jestResolve.moduleNotFoundErrorMod.ModuleNotFoundError
import typings.jestResolve.moduleNotFoundErrorMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait TypeofModuleNotFoundError
    extends Instantiable1[/* message */ String, default]
       with Instantiable2[/* message */ String, /* moduleName */ String, default] {
    
    def duckType(error: ModuleNotFoundError): ModuleNotFoundError = js.native
  }
}

package typings.hyperformula.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula", "FunctionPluginValidationError")
@js.native
open class FunctionPluginValidationError ()
  extends typings.hyperformula.errorsMod.FunctionPluginValidationError
/* static members */
object FunctionPluginValidationError {
  
  @JSImport("hyperformula", "FunctionPluginValidationError")
  @js.native
  val ^ : js.Any = js.native
  
  inline def functionMethodNotFound(functionName: String, pluginName: String): typings.hyperformula.errorsMod.FunctionPluginValidationError = (^.asInstanceOf[js.Dynamic].applyDynamic("functionMethodNotFound")(functionName.asInstanceOf[js.Any], pluginName.asInstanceOf[js.Any])).asInstanceOf[typings.hyperformula.errorsMod.FunctionPluginValidationError]
  
  inline def functionNotDeclaredInPlugin(functionId: String, pluginName: String): typings.hyperformula.errorsMod.FunctionPluginValidationError = (^.asInstanceOf[js.Dynamic].applyDynamic("functionNotDeclaredInPlugin")(functionId.asInstanceOf[js.Any], pluginName.asInstanceOf[js.Any])).asInstanceOf[typings.hyperformula.errorsMod.FunctionPluginValidationError]
}

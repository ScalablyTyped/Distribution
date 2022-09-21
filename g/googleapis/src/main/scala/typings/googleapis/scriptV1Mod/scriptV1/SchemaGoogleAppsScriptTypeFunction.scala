package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsScriptTypeFunction extends StObject {
  
  /**
    * The function name in the script project.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ordered list of parameter names of the function in the script project.
    */
  var parameters: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleAppsScriptTypeFunction {
  
  inline def apply(): SchemaGoogleAppsScriptTypeFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeFunction]
  }
  
  extension [Self <: SchemaGoogleAppsScriptTypeFunction](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParameters(value: js.Array[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: String*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}

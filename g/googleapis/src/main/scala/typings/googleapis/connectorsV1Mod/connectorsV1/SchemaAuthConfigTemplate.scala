package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAuthConfigTemplate extends StObject {
  
  /**
    * The type of authentication configured.
    */
  var authType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Config variables to describe an `AuthConfig` for a `Connection`.
    */
  var configVariableTemplates: js.UndefOr[js.Array[SchemaConfigVariableTemplate]] = js.undefined
}
object SchemaAuthConfigTemplate {
  
  inline def apply(): SchemaAuthConfigTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthConfigTemplate]
  }
  
  extension [Self <: SchemaAuthConfigTemplate](x: Self) {
    
    inline def setAuthType(value: String): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
    
    inline def setAuthTypeNull: Self = StObject.set(x, "authType", null)
    
    inline def setAuthTypeUndefined: Self = StObject.set(x, "authType", js.undefined)
    
    inline def setConfigVariableTemplates(value: js.Array[SchemaConfigVariableTemplate]): Self = StObject.set(x, "configVariableTemplates", value.asInstanceOf[js.Any])
    
    inline def setConfigVariableTemplatesUndefined: Self = StObject.set(x, "configVariableTemplates", js.undefined)
    
    inline def setConfigVariableTemplatesVarargs(value: SchemaConfigVariableTemplate*): Self = StObject.set(x, "configVariableTemplates", js.Array(value*))
  }
}

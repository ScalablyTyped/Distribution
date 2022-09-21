package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsScriptTypeExecutionApiConfig extends StObject {
  
  /**
    * Who has permission to run the API executable.
    */
  var access: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsScriptTypeExecutionApiConfig {
  
  inline def apply(): SchemaGoogleAppsScriptTypeExecutionApiConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeExecutionApiConfig]
  }
  
  extension [Self <: SchemaGoogleAppsScriptTypeExecutionApiConfig](x: Self) {
    
    inline def setAccess(value: String): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setAccessNull: Self = StObject.set(x, "access", null)
    
    inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
  }
}

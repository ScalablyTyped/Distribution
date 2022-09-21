package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsScriptTypeExecutionApiEntryPoint extends StObject {
  
  /**
    * The entry point's configuration.
    */
  var entryPointConfig: js.UndefOr[SchemaGoogleAppsScriptTypeExecutionApiConfig] = js.undefined
}
object SchemaGoogleAppsScriptTypeExecutionApiEntryPoint {
  
  inline def apply(): SchemaGoogleAppsScriptTypeExecutionApiEntryPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeExecutionApiEntryPoint]
  }
  
  extension [Self <: SchemaGoogleAppsScriptTypeExecutionApiEntryPoint](x: Self) {
    
    inline def setEntryPointConfig(value: SchemaGoogleAppsScriptTypeExecutionApiConfig): Self = StObject.set(x, "entryPointConfig", value.asInstanceOf[js.Any])
    
    inline def setEntryPointConfigUndefined: Self = StObject.set(x, "entryPointConfig", js.undefined)
  }
}

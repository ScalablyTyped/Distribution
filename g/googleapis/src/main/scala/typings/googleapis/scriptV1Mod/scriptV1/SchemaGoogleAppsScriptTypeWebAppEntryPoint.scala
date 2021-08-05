package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A web application entry point.
  */
trait SchemaGoogleAppsScriptTypeWebAppEntryPoint extends StObject {
  
  /**
    * The entry point&#39;s configuration.
    */
  var entryPointConfig: js.UndefOr[SchemaGoogleAppsScriptTypeWebAppConfig] = js.undefined
  
  /**
    * The URL for the web application.
    */
  var url: js.UndefOr[String] = js.undefined
}
object SchemaGoogleAppsScriptTypeWebAppEntryPoint {
  
  inline def apply(): SchemaGoogleAppsScriptTypeWebAppEntryPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeWebAppEntryPoint]
  }
  
  extension [Self <: SchemaGoogleAppsScriptTypeWebAppEntryPoint](x: Self) {
    
    inline def setEntryPointConfig(value: SchemaGoogleAppsScriptTypeWebAppConfig): Self = StObject.set(x, "entryPointConfig", value.asInstanceOf[js.Any])
    
    inline def setEntryPointConfigUndefined: Self = StObject.set(x, "entryPointConfig", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}

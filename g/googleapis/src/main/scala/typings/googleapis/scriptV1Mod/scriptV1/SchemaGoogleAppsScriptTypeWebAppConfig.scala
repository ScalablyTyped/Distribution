package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Web app entry point configuration.
  */
trait SchemaGoogleAppsScriptTypeWebAppConfig extends StObject {
  
  /**
    * Who has permission to run the web app.
    */
  var access: js.UndefOr[String] = js.undefined
  
  /**
    * Who to execute the web app as.
    */
  var executeAs: js.UndefOr[String] = js.undefined
}
object SchemaGoogleAppsScriptTypeWebAppConfig {
  
  inline def apply(): SchemaGoogleAppsScriptTypeWebAppConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeWebAppConfig]
  }
  
  extension [Self <: SchemaGoogleAppsScriptTypeWebAppConfig](x: Self) {
    
    inline def setAccess(value: String): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    inline def setExecuteAs(value: String): Self = StObject.set(x, "executeAs", value.asInstanceOf[js.Any])
    
    inline def setExecuteAsUndefined: Self = StObject.set(x, "executeAs", js.undefined)
  }
}

package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Web app entry point configuration.
  */
@js.native
trait SchemaGoogleAppsScriptTypeWebAppConfig extends StObject {
  
  /**
    * Who has permission to run the web app.
    */
  var access: js.UndefOr[String] = js.native
  
  /**
    * Who to execute the web app as.
    */
  var executeAs: js.UndefOr[String] = js.native
}
object SchemaGoogleAppsScriptTypeWebAppConfig {
  
  @scala.inline
  def apply(): SchemaGoogleAppsScriptTypeWebAppConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeWebAppConfig]
  }
  
  @scala.inline
  implicit class SchemaGoogleAppsScriptTypeWebAppConfigMutableBuilder[Self <: SchemaGoogleAppsScriptTypeWebAppConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess(value: String): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    @scala.inline
    def setExecuteAs(value: String): Self = StObject.set(x, "executeAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecuteAsUndefined: Self = StObject.set(x, "executeAs", js.undefined)
  }
}

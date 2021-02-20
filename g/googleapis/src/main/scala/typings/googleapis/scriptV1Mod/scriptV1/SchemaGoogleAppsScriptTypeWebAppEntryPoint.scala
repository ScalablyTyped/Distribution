package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A web application entry point.
  */
@js.native
trait SchemaGoogleAppsScriptTypeWebAppEntryPoint extends StObject {
  
  /**
    * The entry point&#39;s configuration.
    */
  var entryPointConfig: js.UndefOr[SchemaGoogleAppsScriptTypeWebAppConfig] = js.native
  
  /**
    * The URL for the web application.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaGoogleAppsScriptTypeWebAppEntryPoint {
  
  @scala.inline
  def apply(): SchemaGoogleAppsScriptTypeWebAppEntryPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsScriptTypeWebAppEntryPoint]
  }
  
  @scala.inline
  implicit class SchemaGoogleAppsScriptTypeWebAppEntryPointMutableBuilder[Self <: SchemaGoogleAppsScriptTypeWebAppEntryPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntryPointConfig(value: SchemaGoogleAppsScriptTypeWebAppConfig): Self = StObject.set(x, "entryPointConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryPointConfigUndefined: Self = StObject.set(x, "entryPointConfig", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}

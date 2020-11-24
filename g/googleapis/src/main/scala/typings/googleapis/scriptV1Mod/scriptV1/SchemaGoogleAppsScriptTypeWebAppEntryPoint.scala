package typings.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A web application entry point.
  */
@js.native
trait SchemaGoogleAppsScriptTypeWebAppEntryPoint extends js.Object {
  
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
  implicit class SchemaGoogleAppsScriptTypeWebAppEntryPointOps[Self <: SchemaGoogleAppsScriptTypeWebAppEntryPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEntryPointConfig(value: SchemaGoogleAppsScriptTypeWebAppConfig): Self = this.set("entryPointConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntryPointConfig: Self = this.set("entryPointConfig", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}

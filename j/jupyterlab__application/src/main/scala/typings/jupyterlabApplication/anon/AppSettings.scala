package typings.jupyterlabApplication.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppSettings extends js.Object {
  
  val appSettings: String = js.native
  
  val schemas: String = js.native
  
  val serverRoot: String = js.native
  
  val static: String = js.native
  
  val templates: String = js.native
  
  val themes: String = js.native
  
  val userSettings: String = js.native
  
  val workspaces: String = js.native
}
object AppSettings {
  
  @scala.inline
  def apply(
    appSettings: String,
    schemas: String,
    serverRoot: String,
    static: String,
    templates: String,
    themes: String,
    userSettings: String,
    workspaces: String
  ): AppSettings = {
    val __obj = js.Dynamic.literal(appSettings = appSettings.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], serverRoot = serverRoot.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], themes = themes.asInstanceOf[js.Any], userSettings = userSettings.asInstanceOf[js.Any], workspaces = workspaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppSettings]
  }
  
  @scala.inline
  implicit class AppSettingsOps[Self <: AppSettings] (val x: Self) extends AnyVal {
    
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
    def setAppSettings(value: String): Self = this.set("appSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemas(value: String): Self = this.set("schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerRoot(value: String): Self = this.set("serverRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatic(value: String): Self = this.set("static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplates(value: String): Self = this.set("templates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemes(value: String): Self = this.set("themes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserSettings(value: String): Self = this.set("userSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaces(value: String): Self = this.set("workspaces", value.asInstanceOf[js.Any])
  }
}

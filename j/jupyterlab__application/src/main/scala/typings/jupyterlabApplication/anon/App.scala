package typings.jupyterlabApplication.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait App extends js.Object {
  
  val app: String = js.native
  
  val base: String = js.native
  
  val hubHost: js.UndefOr[String] = js.native
  
  val hubPrefix: js.UndefOr[String] = js.native
  
  val hubServerName: js.UndefOr[String] = js.native
  
  val hubUser: js.UndefOr[String] = js.native
  
  val notFound: js.UndefOr[String] = js.native
  
  val settings: String = js.native
  
  val static: String = js.native
  
  val themes: String = js.native
  
  val tree: String = js.native
  
  val workspaces: String = js.native
}
object App {
  
  @scala.inline
  def apply(
    app: String,
    base: String,
    settings: String,
    static: String,
    themes: String,
    tree: String,
    workspaces: String
  ): App = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], themes = themes.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], workspaces = workspaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  
  @scala.inline
  implicit class AppOps[Self <: App] (val x: Self) extends AnyVal {
    
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
    def setApp(value: String): Self = this.set("app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: String): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatic(value: String): Self = this.set("static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemes(value: String): Self = this.set("themes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTree(value: String): Self = this.set("tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaces(value: String): Self = this.set("workspaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHubHost(value: String): Self = this.set("hubHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHubHost: Self = this.set("hubHost", js.undefined)
    
    @scala.inline
    def setHubPrefix(value: String): Self = this.set("hubPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHubPrefix: Self = this.set("hubPrefix", js.undefined)
    
    @scala.inline
    def setHubServerName(value: String): Self = this.set("hubServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHubServerName: Self = this.set("hubServerName", js.undefined)
    
    @scala.inline
    def setHubUser(value: String): Self = this.set("hubUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHubUser: Self = this.set("hubUser", js.undefined)
    
    @scala.inline
    def setNotFound(value: String): Self = this.set("notFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotFound: Self = this.set("notFound", js.undefined)
  }
}

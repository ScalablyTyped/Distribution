package typings.hapiHapi.mod

import typings.hapiHapi.anon.Bind
import typings.hapiHapi.anon.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerRealm extends js.Object {
  
  /** when the server object is provided as an argument to the plugin register() method, modifiers provides the registration preferences passed the server.register() method and includes: */
  var modifiers: Route = js.native
  
  /** the realm of the parent server object, or null for the root server. */
  var parent: ServerRealm | Null = js.native
  
  /** the active plugin name (empty string if at the server root). */
  var plugin: String = js.native
  
  /** the plugin options object passed at registration. */
  var pluginOptions: js.Object = js.native
  
  /** plugin-specific state to be shared only among activities sharing the same active state. plugins is an object where each key is a plugin name and the value is the plugin state. */
  var plugins: PluginsStates = js.native
  
  /** settings overrides */
  var settings: Bind = js.native
}
object ServerRealm {
  
  @scala.inline
  def apply(modifiers: Route, plugin: String, pluginOptions: js.Object, plugins: PluginsStates, settings: Bind): ServerRealm = {
    val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], pluginOptions = pluginOptions.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerRealm]
  }
  
  @scala.inline
  implicit class ServerRealmOps[Self <: ServerRealm] (val x: Self) extends AnyVal {
    
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
    def setModifiers(value: Route): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlugin(value: String): Self = this.set("plugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginOptions(value: js.Object): Self = this.set("pluginOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlugins(value: PluginsStates): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: Bind): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: ServerRealm): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
  }
}

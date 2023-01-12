package typings.hapiHapi.mod

import typings.hapiHapi.anon.Bind
import typings.hapiHapi.anon.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerRealm extends StObject {
  
  /** when the server object is provided as an argument to the plugin register() method, modifiers provides the registration preferences passed the server.register() method and includes: */
  var modifiers: Route
  
  /** the realm of the parent server object, or null for the root server. */
  var parent: ServerRealm | Null
  
  /** the active plugin name (empty string if at the server root). */
  var plugin: String
  
  /** the plugin options object passed at registration. */
  var pluginOptions: js.Object
  
  /** plugin-specific state to be shared only among activities sharing the same active state. plugins is an object where each key is a plugin name and the value is the plugin state. */
  var plugins: PluginsStates
  
  /** settings overrides */
  var settings: Bind
}
object ServerRealm {
  
  inline def apply(modifiers: Route, plugin: String, pluginOptions: js.Object, plugins: PluginsStates, settings: Bind): ServerRealm = {
    val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], pluginOptions = pluginOptions.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], parent = null)
    __obj.asInstanceOf[ServerRealm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerRealm] (val x: Self) extends AnyVal {
    
    inline def setModifiers(value: Route): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setParent(value: ServerRealm): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    
    inline def setPluginOptions(value: js.Object): Self = StObject.set(x, "pluginOptions", value.asInstanceOf[js.Any])
    
    inline def setPlugins(value: PluginsStates): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: Bind): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}

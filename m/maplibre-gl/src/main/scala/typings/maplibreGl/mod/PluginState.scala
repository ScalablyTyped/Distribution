package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginState extends StObject {
  
  var pluginStatus: String
  
  var pluginURL: String
}
object PluginState {
  
  inline def apply(pluginStatus: String, pluginURL: String): PluginState = {
    val __obj = js.Dynamic.literal(pluginStatus = pluginStatus.asInstanceOf[js.Any], pluginURL = pluginURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginState]
  }
  
  extension [Self <: PluginState](x: Self) {
    
    inline def setPluginStatus(value: String): Self = StObject.set(x, "pluginStatus", value.asInstanceOf[js.Any])
    
    inline def setPluginURL(value: String): Self = StObject.set(x, "pluginURL", value.asInstanceOf[js.Any])
  }
}

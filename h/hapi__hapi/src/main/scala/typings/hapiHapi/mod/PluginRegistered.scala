package typings.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginRegistered extends StObject {
  
  /**
    * the plugin name.
    */
  var name: String
  
  /**
    * options used to register the plugin.
    */
  var options: js.Object
  
  /**
    * the plugin version.
    */
  var version: String
}
object PluginRegistered {
  
  inline def apply(name: String, options: js.Object, version: String): PluginRegistered = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRegistered]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PluginRegistered] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

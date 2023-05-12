package typings.hapiHapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plugin[T, D] extends StObject {
  
  var plugin: typings.hapiHapi.libTypesPluginMod.Plugin[T, D]
}
object Plugin {
  
  inline def apply[T, D](plugin: typings.hapiHapi.libTypesPluginMod.Plugin[T, D]): Plugin[T, D] = {
    val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin[T, D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Plugin[?, ?], T, D] (val x: Self & (Plugin[T, D])) extends AnyVal {
    
    inline def setPlugin(value: typings.hapiHapi.libTypesPluginMod.Plugin[T, D]): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
  }
}

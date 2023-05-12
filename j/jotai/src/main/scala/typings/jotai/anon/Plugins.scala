package typings.jotai.anon

import typings.babelCore.mod.PluginItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plugins extends StObject {
  
  var plugins: js.Array[PluginItem]
}
object Plugins {
  
  inline def apply(plugins: js.Array[PluginItem]): Plugins = {
    val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugins]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Plugins] (val x: Self) extends AnyVal {
    
    inline def setPlugins(value: js.Array[PluginItem]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsVarargs(value: PluginItem*): Self = StObject.set(x, "plugins", js.Array(value*))
  }
}

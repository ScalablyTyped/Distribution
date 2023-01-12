package typings.less.Less

import typings.less.LessStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plugin extends StObject {
  
  def install(less: LessStatic, pluginManager: PluginManager): Unit
  
  var minVersion: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.undefined
}
object Plugin {
  
  inline def apply(install: (LessStatic, PluginManager) => Unit): Plugin = {
    val __obj = js.Dynamic.literal(install = js.Any.fromFunction2(install))
    __obj.asInstanceOf[Plugin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Plugin] (val x: Self) extends AnyVal {
    
    inline def setInstall(value: (LessStatic, PluginManager) => Unit): Self = StObject.set(x, "install", js.Any.fromFunction2(value))
    
    inline def setMinVersion(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
    
    inline def setMinVersionUndefined: Self = StObject.set(x, "minVersion", js.undefined)
  }
}

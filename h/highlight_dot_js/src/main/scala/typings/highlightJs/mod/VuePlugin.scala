package typings.highlightJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VuePlugin extends StObject {
  
  def install(vue: Any): Unit
}
object VuePlugin {
  
  inline def apply(install: Any => Unit): VuePlugin = {
    val __obj = js.Dynamic.literal(install = js.Any.fromFunction1(install))
    __obj.asInstanceOf[VuePlugin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VuePlugin] (val x: Self) extends AnyVal {
    
    inline def setInstall(value: Any => Unit): Self = StObject.set(x, "install", js.Any.fromFunction1(value))
  }
}

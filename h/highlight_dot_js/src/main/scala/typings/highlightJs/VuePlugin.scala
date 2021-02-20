package typings.highlightJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VuePlugin extends StObject {
  
  def install(vue: js.Any): Unit = js.native
}
object VuePlugin {
  
  @scala.inline
  def apply(install: js.Any => Unit): VuePlugin = {
    val __obj = js.Dynamic.literal(install = js.Any.fromFunction1(install))
    __obj.asInstanceOf[VuePlugin]
  }
  
  @scala.inline
  implicit class VuePluginMutableBuilder[Self <: VuePlugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstall(value: js.Any => Unit): Self = StObject.set(x, "install", js.Any.fromFunction1(value))
  }
}

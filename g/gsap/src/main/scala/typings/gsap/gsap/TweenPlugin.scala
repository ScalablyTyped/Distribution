package typings.gsap.gsap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TweenPlugin extends StObject {
  
  def activate(plugins: js.Array[js.Any]): Boolean
}
object TweenPlugin {
  
  inline def apply(activate: js.Array[js.Any] => Boolean): TweenPlugin = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate))
    __obj.asInstanceOf[TweenPlugin]
  }
  
  extension [Self <: TweenPlugin](x: Self) {
    
    inline def setActivate(value: js.Array[js.Any] => Boolean): Self = StObject.set(x, "activate", js.Any.fromFunction1(value))
  }
}

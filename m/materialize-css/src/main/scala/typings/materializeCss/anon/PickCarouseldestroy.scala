package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<materialize-css.M.Carousel, 'destroy'> */
trait PickCarouseldestroy extends StObject {
  
  def destroy(): Unit
  @JSName("destroy")
  var destroy_Original: js.Function0[Unit]
}
object PickCarouseldestroy {
  
  inline def apply(destroy: () => Unit): PickCarouseldestroy = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[PickCarouseldestroy]
  }
  
  extension [Self <: PickCarouseldestroy](x: Self) {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
  }
}

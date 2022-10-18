package typings.materializecssMaterialize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@materializecss/materialize.M.Pushpin, 'destroy'> */
trait PickPushpindestroy extends StObject {
  
  def destroy(): Unit
  @JSName("destroy")
  var destroy_Original: js.Function0[Unit]
}
object PickPushpindestroy {
  
  inline def apply(destroy: () => Unit): PickPushpindestroy = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[PickPushpindestroy]
  }
  
  extension [Self <: PickPushpindestroy](x: Self) {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
  }
}

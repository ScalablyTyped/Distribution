package typings.materializecssMaterialize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@materializecss/materialize.M.Collapsible, 'destroy'> */
trait PickCollapsibledestroy extends StObject {
  
  def destroy(): Unit
  @JSName("destroy")
  var destroy_Original: js.Function0[Unit]
}
object PickCollapsibledestroy {
  
  inline def apply(destroy: () => Unit): PickCollapsibledestroy = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[PickCollapsibledestroy]
  }
  
  extension [Self <: PickCollapsibledestroy](x: Self) {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
  }
}

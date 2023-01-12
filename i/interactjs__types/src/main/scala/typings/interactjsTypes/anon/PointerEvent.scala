package typings.interactjsTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerEvent extends StObject {
  
  var pointerEvent: typings.std.PointerEvent
}
object PointerEvent {
  
  inline def apply(pointerEvent: typings.std.PointerEvent): PointerEvent = {
    val __obj = js.Dynamic.literal(pointerEvent = pointerEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointerEvent] (val x: Self) extends AnyVal {
    
    inline def setPointerEvent(value: typings.std.PointerEvent): Self = StObject.set(x, "pointerEvent", value.asInstanceOf[js.Any])
  }
}

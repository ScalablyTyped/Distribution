package typings.interactjsTypes.anon

import typings.interactjsTypes.coreTypesMod.PointerEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pointer extends StObject {
  
  var event: PointerEventType
  
  var eventTarget: typings.std.Node
  
  var pointer: typings.interactjsTypes.coreTypesMod.PointerType
}
object Pointer {
  
  inline def apply(
    event: PointerEventType,
    eventTarget: typings.std.Node,
    pointer: typings.interactjsTypes.coreTypesMod.PointerType
  ): Pointer = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], eventTarget = eventTarget.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pointer]
  }
  
  extension [Self <: Pointer](x: Self) {
    
    inline def setEvent(value: PointerEventType): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventTarget(value: typings.std.Node): Self = StObject.set(x, "eventTarget", value.asInstanceOf[js.Any])
    
    inline def setPointer(value: typings.interactjsTypes.coreTypesMod.PointerType): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
  }
}

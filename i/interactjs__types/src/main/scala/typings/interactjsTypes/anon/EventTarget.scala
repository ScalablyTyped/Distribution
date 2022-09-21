package typings.interactjsTypes.anon

import typings.interactjsTypes.interactjsPointerEventsMod.EventTargetList
import typings.interactjsTypes.typesMod.PointerEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventTarget extends StObject {
  
  var event: PointerEventType | typings.std.PointerEvent
  
  var eventTarget: typings.std.Node
  
  var interaction: typings.interactjsTypes.interactionMod.Interaction[Null]
  
  var pointer: typings.interactjsTypes.typesMod.PointerType | typings.std.PointerEvent
  
  var pointerEvent: typings.std.PointerEvent
  
  var targets: js.UndefOr[EventTargetList] = js.undefined
  
  var `type`: String
}
object EventTarget {
  
  inline def apply(
    event: PointerEventType | typings.std.PointerEvent,
    eventTarget: typings.std.Node,
    interaction: typings.interactjsTypes.interactionMod.Interaction[Null],
    pointer: typings.interactjsTypes.typesMod.PointerType | typings.std.PointerEvent,
    pointerEvent: typings.std.PointerEvent,
    `type`: String
  ): EventTarget = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], eventTarget = eventTarget.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], pointerEvent = pointerEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTarget]
  }
  
  extension [Self <: EventTarget](x: Self) {
    
    inline def setEvent(value: PointerEventType | typings.std.PointerEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventTarget(value: typings.std.Node): Self = StObject.set(x, "eventTarget", value.asInstanceOf[js.Any])
    
    inline def setInteraction(value: typings.interactjsTypes.interactionMod.Interaction[Null]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setPointer(value: typings.interactjsTypes.typesMod.PointerType | typings.std.PointerEvent): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
    
    inline def setPointerEvent(value: typings.std.PointerEvent): Self = StObject.set(x, "pointerEvent", value.asInstanceOf[js.Any])
    
    inline def setTargets(value: EventTargetList): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    inline def setTargetsVarargs(value: Eventable*): Self = StObject.set(x, "targets", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

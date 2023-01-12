package typings.interactjsTypes.anon

import typings.interactjsTypes.coreTypesMod.PointerEventType
import typings.interactjsTypes.pointerEventsBaseMod.EventTargetList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventTarget extends StObject {
  
  var event: PointerEventType | typings.std.PointerEvent
  
  var eventTarget: typings.std.Node
  
  var interaction: typings.interactjsTypes.coreInteractionMod.Interaction[Null]
  
  var pointer: typings.interactjsTypes.coreTypesMod.PointerType | typings.std.PointerEvent
  
  var pointerEvent: typings.std.PointerEvent
  
  var targets: js.UndefOr[EventTargetList] = js.undefined
  
  var `type`: String
}
object EventTarget {
  
  inline def apply(
    event: PointerEventType | typings.std.PointerEvent,
    eventTarget: typings.std.Node,
    interaction: typings.interactjsTypes.coreInteractionMod.Interaction[Null],
    pointer: typings.interactjsTypes.coreTypesMod.PointerType | typings.std.PointerEvent,
    pointerEvent: typings.std.PointerEvent,
    `type`: String
  ): EventTarget = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], eventTarget = eventTarget.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], pointerEvent = pointerEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventTarget] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: PointerEventType | typings.std.PointerEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventTarget(value: typings.std.Node): Self = StObject.set(x, "eventTarget", value.asInstanceOf[js.Any])
    
    inline def setInteraction(value: typings.interactjsTypes.coreInteractionMod.Interaction[Null]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setPointer(value: typings.interactjsTypes.coreTypesMod.PointerType | typings.std.PointerEvent): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
    
    inline def setPointerEvent(value: typings.std.PointerEvent): Self = StObject.set(x, "pointerEvent", value.asInstanceOf[js.Any])
    
    inline def setTargets(value: EventTargetList): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    inline def setTargetsVarargs(value: Eventable*): Self = StObject.set(x, "targets", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

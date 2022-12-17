package typings.interactjsTypes.anon

import typings.interactjsTypes.coreInteractEventMod.EventPhase
import typings.interactjsTypes.coreInteractEventMod.InteractEvent
import typings.interactjsTypes.coreTypesMod.ActionName
import typings.interactjsTypes.coreTypesMod.Point
import typings.interactjsTypes.coreTypesMod.PointerEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@interactjs/types.@interactjs/core/Interaction.DoAnyPhaseArg> & {  phase :@interactjs/types.@interactjs/core/InteractEvent.EventPhase,   preEnd :boolean | undefined,   skipModifiers :number | undefined,   modifiedCoords :@interactjs/types.@interactjs/core/types.Point | undefined} */
trait PartialDoAnyPhaseArgphase extends StObject {
  
  var event: js.UndefOr[PointerEventType] = js.undefined
  
  var iEvent: js.UndefOr[InteractEvent[ActionName, EventPhase]] = js.undefined
  
  var interaction: js.UndefOr[typings.interactjsTypes.coreInteractionMod.Interaction[ActionName]] = js.undefined
  
  var modifiedCoords: js.UndefOr[Point] = js.undefined
  
  var phase: js.UndefOr[EventPhase] = js.undefined
  
  var preEnd: js.UndefOr[Boolean] = js.undefined
  
  var skipModifiers: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object PartialDoAnyPhaseArgphase {
  
  inline def apply(): PartialDoAnyPhaseArgphase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDoAnyPhaseArgphase]
  }
  
  extension [Self <: PartialDoAnyPhaseArgphase](x: Self) {
    
    inline def setEvent(value: PointerEventType): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setIEvent(value: InteractEvent[ActionName, EventPhase]): Self = StObject.set(x, "iEvent", value.asInstanceOf[js.Any])
    
    inline def setIEventUndefined: Self = StObject.set(x, "iEvent", js.undefined)
    
    inline def setInteraction(value: typings.interactjsTypes.coreInteractionMod.Interaction[ActionName]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setInteractionUndefined: Self = StObject.set(x, "interaction", js.undefined)
    
    inline def setModifiedCoords(value: Point): Self = StObject.set(x, "modifiedCoords", value.asInstanceOf[js.Any])
    
    inline def setModifiedCoordsUndefined: Self = StObject.set(x, "modifiedCoords", js.undefined)
    
    inline def setPhase(value: EventPhase): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setPhaseUndefined: Self = StObject.set(x, "phase", js.undefined)
    
    inline def setPreEnd(value: Boolean): Self = StObject.set(x, "preEnd", value.asInstanceOf[js.Any])
    
    inline def setPreEndUndefined: Self = StObject.set(x, "preEnd", js.undefined)
    
    inline def setSkipModifiers(value: Double): Self = StObject.set(x, "skipModifiers", value.asInstanceOf[js.Any])
    
    inline def setSkipModifiersUndefined: Self = StObject.set(x, "skipModifiers", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

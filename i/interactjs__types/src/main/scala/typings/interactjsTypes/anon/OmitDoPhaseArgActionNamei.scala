package typings.interactjsTypes.anon

import typings.interactjsTypes.interactEventMod.EventPhase
import typings.interactjsTypes.typesMod.ActionName
import typings.interactjsTypes.typesMod.PointerEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@interactjs/types.@interactjs/core/Interaction.DoPhaseArg<@interactjs/types.@interactjs/core/types.ActionName, 'inertiastart'>, 'iEvent'> */
trait OmitDoPhaseArgActionNamei extends StObject {
  
  var event: PointerEventType
  
  var interaction: typings.interactjsTypes.interactionMod.Interaction[ActionName]
  
  var phase: EventPhase
  
  var preEnd: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object OmitDoPhaseArgActionNamei {
  
  inline def apply(
    event: PointerEventType,
    interaction: typings.interactjsTypes.interactionMod.Interaction[ActionName],
    phase: EventPhase
  ): OmitDoPhaseArgActionNamei = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitDoPhaseArgActionNamei]
  }
  
  extension [Self <: OmitDoPhaseArgActionNamei](x: Self) {
    
    inline def setEvent(value: PointerEventType): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setInteraction(value: typings.interactjsTypes.interactionMod.Interaction[ActionName]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setPhase(value: EventPhase): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setPreEnd(value: Boolean): Self = StObject.set(x, "preEnd", value.asInstanceOf[js.Any])
    
    inline def setPreEndUndefined: Self = StObject.set(x, "preEnd", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

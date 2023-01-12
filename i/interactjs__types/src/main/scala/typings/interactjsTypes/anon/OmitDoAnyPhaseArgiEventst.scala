package typings.interactjsTypes.anon

import typings.interactjsTypes.coreInteractEventMod.EventPhase
import typings.interactjsTypes.coreTypesMod.ActionName
import typings.interactjsTypes.coreTypesMod.PointerEventType
import typings.interactjsTypes.modifiersTypesMod.ModifierState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@interactjs/types.@interactjs/core/Interaction.DoAnyPhaseArg, 'iEvent'> & {  state :@interactjs/types.@interactjs/modifiers/types.ModifierState<unknown, unknown, any> | undefined} */
trait OmitDoAnyPhaseArgiEventst extends StObject {
  
  var event: PointerEventType
  
  var interaction: typings.interactjsTypes.coreInteractionMod.Interaction[ActionName]
  
  var phase: EventPhase
  
  var preEnd: js.UndefOr[Boolean] = js.undefined
  
  var state: js.UndefOr[ModifierState[Any, Any, Any]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object OmitDoAnyPhaseArgiEventst {
  
  inline def apply(
    event: PointerEventType,
    interaction: typings.interactjsTypes.coreInteractionMod.Interaction[ActionName],
    phase: EventPhase
  ): OmitDoAnyPhaseArgiEventst = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitDoAnyPhaseArgiEventst]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitDoAnyPhaseArgiEventst] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: PointerEventType): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setInteraction(value: typings.interactjsTypes.coreInteractionMod.Interaction[ActionName]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setPhase(value: EventPhase): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setPreEnd(value: Boolean): Self = StObject.set(x, "preEnd", value.asInstanceOf[js.Any])
    
    inline def setPreEndUndefined: Self = StObject.set(x, "preEnd", js.undefined)
    
    inline def setState(value: ModifierState[Any, Any, Any]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

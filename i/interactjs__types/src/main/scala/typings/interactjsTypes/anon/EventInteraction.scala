package typings.interactjsTypes.anon

import typings.interactjsTypes.interactjsTypesStrings.blur
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventInteraction extends StObject {
  
  var event: typings.std.Event
  
  var interaction: typings.interactjsTypes.coreInteractionMod.Interaction[scala.Nothing]
  
  var `type`: blur
}
object EventInteraction {
  
  inline def apply(
    event: typings.std.Event,
    interaction: typings.interactjsTypes.coreInteractionMod.Interaction[scala.Nothing]
  ): EventInteraction = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("blur")
    __obj.asInstanceOf[EventInteraction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventInteraction] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: typings.std.Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setInteraction(value: typings.interactjsTypes.coreInteractionMod.Interaction[scala.Nothing]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setType(value: blur): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

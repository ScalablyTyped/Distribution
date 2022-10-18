package typings.interactjsTypes.anon

import typings.interactjsTypes.interactjsTypesStrings.gesture
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionPartial extends StObject {
  
  var element: typings.std.Element
  
  var interaction: Partial[typings.interactjsTypes.coreInteractionMod.Interaction[gesture]]
}
object InteractionPartial {
  
  inline def apply(
    element: typings.std.Element,
    interaction: Partial[typings.interactjsTypes.coreInteractionMod.Interaction[gesture]]
  ): InteractionPartial = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionPartial]
  }
  
  extension [Self <: InteractionPartial](x: Self) {
    
    inline def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setInteraction(value: Partial[typings.interactjsTypes.coreInteractionMod.Interaction[gesture]]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
  }
}

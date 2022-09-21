package typings.interactjsTypes.anon

import typings.interactjsTypes.interactjsTypesStrings.drop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionInteraction extends StObject {
  
  var interaction: typings.interactjsTypes.interactionMod.Interaction[drop]
  
  var pointer: typings.interactjsTypes.typesMod.PointerType
}
object InteractionInteraction {
  
  inline def apply(
    interaction: typings.interactjsTypes.interactionMod.Interaction[drop],
    pointer: typings.interactjsTypes.typesMod.PointerType
  ): InteractionInteraction = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionInteraction]
  }
  
  extension [Self <: InteractionInteraction](x: Self) {
    
    inline def setInteraction(value: typings.interactjsTypes.interactionMod.Interaction[drop]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setPointer(value: typings.interactjsTypes.typesMod.PointerType): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
  }
}

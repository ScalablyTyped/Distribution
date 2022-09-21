package typings.interactjsTypes.anon

import typings.interactjsTypes.interactjsTypesStrings.resize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionInteractionPointerPointerType extends StObject {
  
  var interaction: typings.interactjsTypes.interactionMod.Interaction[resize]
  
  var pointer: typings.interactjsTypes.typesMod.PointerType
}
object InteractionInteractionPointerPointerType {
  
  inline def apply(
    interaction: typings.interactjsTypes.interactionMod.Interaction[resize],
    pointer: typings.interactjsTypes.typesMod.PointerType
  ): InteractionInteractionPointerPointerType = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionInteractionPointerPointerType]
  }
  
  extension [Self <: InteractionInteractionPointerPointerType](x: Self) {
    
    inline def setInteraction(value: typings.interactjsTypes.interactionMod.Interaction[resize]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setPointer(value: typings.interactjsTypes.typesMod.PointerType): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
  }
}

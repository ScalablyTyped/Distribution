package typings.interactjsTypes.anon

import typings.interactjsTypes.interactjsTypesStrings.drag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionPointer extends StObject {
  
  var interaction: typings.interactjsTypes.interactionMod.Interaction[drag]
  
  var pointer: typings.interactjsTypes.typesMod.PointerType
}
object InteractionPointer {
  
  inline def apply(
    interaction: typings.interactjsTypes.interactionMod.Interaction[drag],
    pointer: typings.interactjsTypes.typesMod.PointerType
  ): InteractionPointer = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionPointer]
  }
  
  extension [Self <: InteractionPointer](x: Self) {
    
    inline def setInteraction(value: typings.interactjsTypes.interactionMod.Interaction[drag]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setPointer(value: typings.interactjsTypes.typesMod.PointerType): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
  }
}

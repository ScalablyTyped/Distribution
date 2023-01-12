package typings.interactjsTypes.anon

import typings.interactjsTypes.interactjsTypesStrings.drag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionPointer extends StObject {
  
  var interaction: typings.interactjsTypes.coreInteractionMod.Interaction[drag]
  
  var pointer: typings.interactjsTypes.coreTypesMod.PointerType
}
object InteractionPointer {
  
  inline def apply(
    interaction: typings.interactjsTypes.coreInteractionMod.Interaction[drag],
    pointer: typings.interactjsTypes.coreTypesMod.PointerType
  ): InteractionPointer = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionPointer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InteractionPointer] (val x: Self) extends AnyVal {
    
    inline def setInteraction(value: typings.interactjsTypes.coreInteractionMod.Interaction[drag]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setPointer(value: typings.interactjsTypes.coreTypesMod.PointerType): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
  }
}

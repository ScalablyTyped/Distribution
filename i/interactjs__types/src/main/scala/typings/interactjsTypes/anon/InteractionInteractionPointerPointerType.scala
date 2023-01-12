package typings.interactjsTypes.anon

import typings.interactjsTypes.interactjsTypesStrings.resize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionInteractionPointerPointerType extends StObject {
  
  var interaction: typings.interactjsTypes.coreInteractionMod.Interaction[resize]
  
  var pointer: typings.interactjsTypes.coreTypesMod.PointerType
}
object InteractionInteractionPointerPointerType {
  
  inline def apply(
    interaction: typings.interactjsTypes.coreInteractionMod.Interaction[resize],
    pointer: typings.interactjsTypes.coreTypesMod.PointerType
  ): InteractionInteractionPointerPointerType = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionInteractionPointerPointerType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InteractionInteractionPointerPointerType] (val x: Self) extends AnyVal {
    
    inline def setInteraction(value: typings.interactjsTypes.coreInteractionMod.Interaction[resize]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setPointer(value: typings.interactjsTypes.coreTypesMod.PointerType): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
  }
}

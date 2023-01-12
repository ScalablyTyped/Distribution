package typings.interactjsTypes.anon

import typings.interactjsTypes.interactjsTypesStrings.gesture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerPointerType extends StObject {
  
  var interaction: typings.interactjsTypes.coreInteractionMod.Interaction[gesture]
  
  var pointer: typings.interactjsTypes.coreTypesMod.PointerType
}
object PointerPointerType {
  
  inline def apply(
    interaction: typings.interactjsTypes.coreInteractionMod.Interaction[gesture],
    pointer: typings.interactjsTypes.coreTypesMod.PointerType
  ): PointerPointerType = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerPointerType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointerPointerType] (val x: Self) extends AnyVal {
    
    inline def setInteraction(value: typings.interactjsTypes.coreInteractionMod.Interaction[gesture]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setPointer(value: typings.interactjsTypes.coreTypesMod.PointerType): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
  }
}

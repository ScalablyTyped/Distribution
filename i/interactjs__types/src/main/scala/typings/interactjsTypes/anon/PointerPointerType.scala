package typings.interactjsTypes.anon

import typings.interactjsTypes.interactjsTypesStrings.gesture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerPointerType extends StObject {
  
  var interaction: typings.interactjsTypes.interactionMod.Interaction[gesture]
  
  var pointer: typings.interactjsTypes.typesMod.PointerType
}
object PointerPointerType {
  
  inline def apply(
    interaction: typings.interactjsTypes.interactionMod.Interaction[gesture],
    pointer: typings.interactjsTypes.typesMod.PointerType
  ): PointerPointerType = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerPointerType]
  }
  
  extension [Self <: PointerPointerType](x: Self) {
    
    inline def setInteraction(value: typings.interactjsTypes.interactionMod.Interaction[gesture]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setPointer(value: typings.interactjsTypes.typesMod.PointerType): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
  }
}

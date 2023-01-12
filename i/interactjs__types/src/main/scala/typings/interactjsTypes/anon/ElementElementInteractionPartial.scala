package typings.interactjsTypes.anon

import typings.interactjsTypes.interactjsTypesStrings.resize
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementElementInteractionPartial extends StObject {
  
  var element: typings.std.Element
  
  var interaction: Partial[typings.interactjsTypes.coreInteractionMod.Interaction[resize]]
}
object ElementElementInteractionPartial {
  
  inline def apply(
    element: typings.std.Element,
    interaction: Partial[typings.interactjsTypes.coreInteractionMod.Interaction[resize]]
  ): ElementElementInteractionPartial = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementElementInteractionPartial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementElementInteractionPartial] (val x: Self) extends AnyVal {
    
    inline def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setInteraction(value: Partial[typings.interactjsTypes.coreInteractionMod.Interaction[resize]]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
  }
}

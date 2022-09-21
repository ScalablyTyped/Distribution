package typings.interactjsTypes.anon

import typings.interactjsTypes.interactjsTypesStrings.drop
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementElement extends StObject {
  
  var element: typings.std.Element
  
  var interaction: Partial[typings.interactjsTypes.interactionMod.Interaction[drop]]
}
object ElementElement {
  
  inline def apply(
    element: typings.std.Element,
    interaction: Partial[typings.interactjsTypes.interactionMod.Interaction[drop]]
  ): ElementElement = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementElement]
  }
  
  extension [Self <: ElementElement](x: Self) {
    
    inline def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setInteraction(value: Partial[typings.interactjsTypes.interactionMod.Interaction[drop]]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
  }
}

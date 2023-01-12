package typings.interactjsTypes.anon

import typings.interactjsTypes.interactjsTypesStrings.drag
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementInteraction extends StObject {
  
  var element: typings.std.Element
  
  var interaction: Partial[typings.interactjsTypes.coreInteractionMod.Interaction[drag]]
}
object ElementInteraction {
  
  inline def apply(
    element: typings.std.Element,
    interaction: Partial[typings.interactjsTypes.coreInteractionMod.Interaction[drag]]
  ): ElementInteraction = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementInteraction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementInteraction] (val x: Self) extends AnyVal {
    
    inline def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setInteraction(value: Partial[typings.interactjsTypes.coreInteractionMod.Interaction[drag]]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
  }
}

package typings.interactjsTypes.anon

import typings.interactjsTypes.coreTypesMod.ActionName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interaction extends StObject {
  
  var interaction: typings.interactjsTypes.coreInteractionMod.Interaction[ActionName]
}
object Interaction {
  
  inline def apply(interaction: typings.interactjsTypes.coreInteractionMod.Interaction[ActionName]): Interaction = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Interaction] (val x: Self) extends AnyVal {
    
    inline def setInteraction(value: typings.interactjsTypes.coreInteractionMod.Interaction[ActionName]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
  }
}

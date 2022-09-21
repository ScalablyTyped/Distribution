package typings.interactjsTypes.anon

import typings.interactjsTypes.typesMod.ActionName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interaction extends StObject {
  
  var interaction: typings.interactjsTypes.interactionMod.Interaction[ActionName]
}
object Interaction {
  
  inline def apply(interaction: typings.interactjsTypes.interactionMod.Interaction[ActionName]): Interaction = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interaction]
  }
  
  extension [Self <: Interaction](x: Self) {
    
    inline def setInteraction(value: typings.interactjsTypes.interactionMod.Interaction[ActionName]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
  }
}

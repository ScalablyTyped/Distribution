package typings.interactjsTypes.anon

import typings.interactjsTypes.typesMod.ActionName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchDetails extends StObject {
  
  var interaction: typings.interactjsTypes.interactionMod.Interaction[ActionName]
  
  var searchDetails: typings.interactjsTypes.interactionFinderMod.SearchDetails
}
object SearchDetails {
  
  inline def apply(
    interaction: typings.interactjsTypes.interactionMod.Interaction[ActionName],
    searchDetails: typings.interactjsTypes.interactionFinderMod.SearchDetails
  ): SearchDetails = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any], searchDetails = searchDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchDetails]
  }
  
  extension [Self <: SearchDetails](x: Self) {
    
    inline def setInteraction(value: typings.interactjsTypes.interactionMod.Interaction[ActionName]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setSearchDetails(value: typings.interactjsTypes.interactionFinderMod.SearchDetails): Self = StObject.set(x, "searchDetails", value.asInstanceOf[js.Any])
  }
}

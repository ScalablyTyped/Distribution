package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedCard extends StObject {
  
  /**
    * The actions of this card. They are added to a card's generated toolbar menu. For example, the following JSON constructs a card action menu with Settings and Send Feedback options:
    * ``` "card_actions": [ { "actionLabel": "Setting", "onClick": { "action": { "functionName": "goToView", "parameters": [ { "key": "viewType", "value": "SETTING" } ], "loadIndicator":
    * "LoadIndicator.SPINNER" } } }, { "actionLabel": "Send Feedback", "onClick": { "openLink": { "url": "https://example.com/feedback" } } } ] ```
    */
  var cardActions: js.UndefOr[js.Array[AppsDynamiteSharedCardCardAction]] = js.undefined
  
  /** The header of the card. A header usually contains a title and an image. */
  var header: js.UndefOr[AppsDynamiteSharedCardCardHeader] = js.undefined
  
  /** Name of the card, which is used as a identifier for the card in card navigation. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Sections are separated by a line divider. */
  var sections: js.UndefOr[js.Array[AppsDynamiteSharedCardSection]] = js.undefined
}
object AppsDynamiteSharedCard {
  
  inline def apply(): AppsDynamiteSharedCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedCard]
  }
  
  extension [Self <: AppsDynamiteSharedCard](x: Self) {
    
    inline def setCardActions(value: js.Array[AppsDynamiteSharedCardCardAction]): Self = StObject.set(x, "cardActions", value.asInstanceOf[js.Any])
    
    inline def setCardActionsUndefined: Self = StObject.set(x, "cardActions", js.undefined)
    
    inline def setCardActionsVarargs(value: AppsDynamiteSharedCardCardAction*): Self = StObject.set(x, "cardActions", js.Array(value*))
    
    inline def setHeader(value: AppsDynamiteSharedCardCardHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSections(value: js.Array[AppsDynamiteSharedCardSection]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
    
    inline def setSectionsVarargs(value: AppsDynamiteSharedCardSection*): Self = StObject.set(x, "sections", js.Array(value*))
  }
}

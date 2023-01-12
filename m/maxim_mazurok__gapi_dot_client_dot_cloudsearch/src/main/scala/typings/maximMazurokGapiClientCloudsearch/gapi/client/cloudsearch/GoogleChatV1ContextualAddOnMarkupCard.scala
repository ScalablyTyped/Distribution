package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleChatV1ContextualAddOnMarkupCard extends StObject {
  
  /** The actions of this card. */
  var cardActions: js.UndefOr[js.Array[GoogleChatV1ContextualAddOnMarkupCardCardAction]] = js.undefined
  
  /** The header of the card. A header usually contains a title and an image. */
  var header: js.UndefOr[GoogleChatV1ContextualAddOnMarkupCardCardHeader] = js.undefined
  
  /** Name of the card. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Sections are separated by a line divider. */
  var sections: js.UndefOr[js.Array[GoogleChatV1ContextualAddOnMarkupCardSection]] = js.undefined
}
object GoogleChatV1ContextualAddOnMarkupCard {
  
  inline def apply(): GoogleChatV1ContextualAddOnMarkupCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleChatV1ContextualAddOnMarkupCard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleChatV1ContextualAddOnMarkupCard] (val x: Self) extends AnyVal {
    
    inline def setCardActions(value: js.Array[GoogleChatV1ContextualAddOnMarkupCardCardAction]): Self = StObject.set(x, "cardActions", value.asInstanceOf[js.Any])
    
    inline def setCardActionsUndefined: Self = StObject.set(x, "cardActions", js.undefined)
    
    inline def setCardActionsVarargs(value: GoogleChatV1ContextualAddOnMarkupCardCardAction*): Self = StObject.set(x, "cardActions", js.Array(value*))
    
    inline def setHeader(value: GoogleChatV1ContextualAddOnMarkupCardCardHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSections(value: js.Array[GoogleChatV1ContextualAddOnMarkupCardSection]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
    
    inline def setSectionsVarargs(value: GoogleChatV1ContextualAddOnMarkupCardSection*): Self = StObject.set(x, "sections", js.Array(value*))
  }
}

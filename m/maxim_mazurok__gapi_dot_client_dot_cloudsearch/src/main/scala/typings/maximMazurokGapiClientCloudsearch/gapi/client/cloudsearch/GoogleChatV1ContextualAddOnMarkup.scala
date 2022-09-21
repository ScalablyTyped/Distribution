package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleChatV1ContextualAddOnMarkup extends StObject {
  
  /** A list of cards. A card must contain a header and at least 1 section. */
  var cards: js.UndefOr[js.Array[GoogleChatV1ContextualAddOnMarkupCard]] = js.undefined
}
object GoogleChatV1ContextualAddOnMarkup {
  
  inline def apply(): GoogleChatV1ContextualAddOnMarkup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleChatV1ContextualAddOnMarkup]
  }
  
  extension [Self <: GoogleChatV1ContextualAddOnMarkup](x: Self) {
    
    inline def setCards(value: js.Array[GoogleChatV1ContextualAddOnMarkupCard]): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
    
    inline def setCardsUndefined: Self = StObject.set(x, "cards", js.undefined)
    
    inline def setCardsVarargs(value: GoogleChatV1ContextualAddOnMarkupCard*): Self = StObject.set(x, "cards", js.Array(value*))
  }
}

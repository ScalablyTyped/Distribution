package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardWithId extends StObject {
  
  /** Card proto that allows Chat apps to specify UI elements and editable widgets. */
  var card: js.UndefOr[GoogleAppsCardV1Card] = js.undefined
  
  /** Required for `cardsV2` messages. Chat app-specified identifier for this widget. Scoped within a message. */
  var cardId: js.UndefOr[String] = js.undefined
}
object CardWithId {
  
  inline def apply(): CardWithId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardWithId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardWithId] (val x: Self) extends AnyVal {
    
    inline def setCard(value: GoogleAppsCardV1Card): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardId(value: String): Self = StObject.set(x, "cardId", value.asInstanceOf[js.Any])
    
    inline def setCardIdUndefined: Self = StObject.set(x, "cardId", js.undefined)
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
  }
}

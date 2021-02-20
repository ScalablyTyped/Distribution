package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Card extends StObject {
  
  /** The actions of this card. */
  var cardActions: js.UndefOr[js.Array[CardAction]] = js.native
  
  /** The header of the card. A header usually contains a title and an image. */
  var header: js.UndefOr[CardHeader] = js.native
  
  /** Name of the card. */
  var name: js.UndefOr[String] = js.native
  
  /** Sections are separated by a line divider. */
  var sections: js.UndefOr[js.Array[Section]] = js.native
}
object Card {
  
  @scala.inline
  def apply(): Card = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Card]
  }
  
  @scala.inline
  implicit class CardMutableBuilder[Self <: Card] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardActions(value: js.Array[CardAction]): Self = StObject.set(x, "cardActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardActionsUndefined: Self = StObject.set(x, "cardActions", js.undefined)
    
    @scala.inline
    def setCardActionsVarargs(value: CardAction*): Self = StObject.set(x, "cardActions", js.Array(value :_*))
    
    @scala.inline
    def setHeader(value: CardHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSections(value: js.Array[Section]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
    
    @scala.inline
    def setSectionsVarargs(value: Section*): Self = StObject.set(x, "sections", js.Array(value :_*))
  }
}

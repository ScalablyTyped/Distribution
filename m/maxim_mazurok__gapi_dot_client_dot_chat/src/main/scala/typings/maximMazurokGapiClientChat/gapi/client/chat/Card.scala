package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Card extends StObject {
  
  /** The actions of this card. */
  var cardActions: js.UndefOr[js.Array[CardAction]] = js.undefined
  
  /** The header of the card. A header usually contains a title and an image. */
  var header: js.UndefOr[CardHeader] = js.undefined
  
  /** Name of the card. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Sections are separated by a line divider. */
  var sections: js.UndefOr[js.Array[Section]] = js.undefined
}
object Card {
  
  inline def apply(): Card = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Card]
  }
  
  extension [Self <: Card](x: Self) {
    
    inline def setCardActions(value: js.Array[CardAction]): Self = StObject.set(x, "cardActions", value.asInstanceOf[js.Any])
    
    inline def setCardActionsUndefined: Self = StObject.set(x, "cardActions", js.undefined)
    
    inline def setCardActionsVarargs(value: CardAction*): Self = StObject.set(x, "cardActions", js.Array(value*))
    
    inline def setHeader(value: CardHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSections(value: js.Array[Section]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
    
    inline def setSectionsVarargs(value: Section*): Self = StObject.set(x, "sections", js.Array(value*))
  }
}

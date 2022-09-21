package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Card extends StObject {
  
  var cardActions: js.UndefOr[js.Array[CardAction]] = js.undefined
  
  var displayStyle: js.UndefOr[String] = js.undefined
  
  var fixedFooter: js.UndefOr[FixedFooter] = js.undefined
  
  var header: js.UndefOr[CardHeader] = js.undefined
  
  /** Name of the card used in CardNavigation.pop_to_card_name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** When displaying contextual content, the peek card header acts as a placeholder so that the user can navigate forward between the homepage cards and the contextual cards. */
  var peekCardHeader: js.UndefOr[CardHeader] = js.undefined
  
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
    
    inline def setDisplayStyle(value: String): Self = StObject.set(x, "displayStyle", value.asInstanceOf[js.Any])
    
    inline def setDisplayStyleUndefined: Self = StObject.set(x, "displayStyle", js.undefined)
    
    inline def setFixedFooter(value: FixedFooter): Self = StObject.set(x, "fixedFooter", value.asInstanceOf[js.Any])
    
    inline def setFixedFooterUndefined: Self = StObject.set(x, "fixedFooter", js.undefined)
    
    inline def setHeader(value: CardHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPeekCardHeader(value: CardHeader): Self = StObject.set(x, "peekCardHeader", value.asInstanceOf[js.Any])
    
    inline def setPeekCardHeaderUndefined: Self = StObject.set(x, "peekCardHeader", js.undefined)
    
    inline def setSections(value: js.Array[Section]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
    
    inline def setSectionsVarargs(value: Section*): Self = StObject.set(x, "sections", js.Array(value*))
  }
}

package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextualAddOnMarkup extends StObject {
  
  /** A card must contain a header and at least 1 section. */
  var cards: js.UndefOr[js.Array[Card]] = js.undefined
  
  /** Deprecated. */
  var toolbar: js.UndefOr[Toolbar] = js.undefined
}
object ContextualAddOnMarkup {
  
  inline def apply(): ContextualAddOnMarkup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextualAddOnMarkup]
  }
  
  extension [Self <: ContextualAddOnMarkup](x: Self) {
    
    inline def setCards(value: js.Array[Card]): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
    
    inline def setCardsUndefined: Self = StObject.set(x, "cards", js.undefined)
    
    inline def setCardsVarargs(value: Card*): Self = StObject.set(x, "cards", js.Array(value*))
    
    inline def setToolbar(value: Toolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
  }
}

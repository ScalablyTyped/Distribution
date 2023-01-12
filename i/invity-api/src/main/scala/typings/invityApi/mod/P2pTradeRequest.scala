package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait P2pTradeRequest extends StObject {
  
  var quotesRequest: P2pQuotesRequest
  
  var selectedQuote: P2pQuote
}
object P2pTradeRequest {
  
  inline def apply(quotesRequest: P2pQuotesRequest, selectedQuote: P2pQuote): P2pTradeRequest = {
    val __obj = js.Dynamic.literal(quotesRequest = quotesRequest.asInstanceOf[js.Any], selectedQuote = selectedQuote.asInstanceOf[js.Any])
    __obj.asInstanceOf[P2pTradeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: P2pTradeRequest] (val x: Self) extends AnyVal {
    
    inline def setQuotesRequest(value: P2pQuotesRequest): Self = StObject.set(x, "quotesRequest", value.asInstanceOf[js.Any])
    
    inline def setSelectedQuote(value: P2pQuote): Self = StObject.set(x, "selectedQuote", value.asInstanceOf[js.Any])
  }
}

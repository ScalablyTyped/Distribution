package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait P2pQuotesResponse extends StObject {
  
  var quotes: js.Array[P2pQuote]
}
object P2pQuotesResponse {
  
  inline def apply(quotes: js.Array[P2pQuote]): P2pQuotesResponse = {
    val __obj = js.Dynamic.literal(quotes = quotes.asInstanceOf[js.Any])
    __obj.asInstanceOf[P2pQuotesResponse]
  }
  
  extension [Self <: P2pQuotesResponse](x: Self) {
    
    inline def setQuotes(value: js.Array[P2pQuote]): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
    
    inline def setQuotesVarargs(value: P2pQuote*): Self = StObject.set(x, "quotes", js.Array(value*))
  }
}

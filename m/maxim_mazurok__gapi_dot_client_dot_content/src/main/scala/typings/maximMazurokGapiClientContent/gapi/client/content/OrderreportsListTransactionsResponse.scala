package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderreportsListTransactionsResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#orderreportsListTransactionsResponse`". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The token for the retrieval of the next page of transactions. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of transactions. */
  var transactions: js.UndefOr[js.Array[OrderReportTransaction]] = js.undefined
}
object OrderreportsListTransactionsResponse {
  
  inline def apply(): OrderreportsListTransactionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderreportsListTransactionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderreportsListTransactionsResponse] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTransactions(value: js.Array[OrderReportTransaction]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
    
    inline def setTransactionsUndefined: Self = StObject.set(x, "transactions", js.undefined)
    
    inline def setTransactionsVarargs(value: OrderReportTransaction*): Self = StObject.set(x, "transactions", js.Array(value*))
  }
}

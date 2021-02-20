package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderreportsListTransactionsResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#orderreportsListTransactionsResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** The token for the retrieval of the next page of transactions. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of transactions. */
  var transactions: js.UndefOr[js.Array[OrderReportTransaction]] = js.native
}
object OrderreportsListTransactionsResponse {
  
  @scala.inline
  def apply(): OrderreportsListTransactionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderreportsListTransactionsResponse]
  }
  
  @scala.inline
  implicit class OrderreportsListTransactionsResponseMutableBuilder[Self <: OrderreportsListTransactionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTransactions(value: js.Array[OrderReportTransaction]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionsUndefined: Self = StObject.set(x, "transactions", js.undefined)
    
    @scala.inline
    def setTransactionsVarargs(value: OrderReportTransaction*): Self = StObject.set(x, "transactions", js.Array(value :_*))
  }
}

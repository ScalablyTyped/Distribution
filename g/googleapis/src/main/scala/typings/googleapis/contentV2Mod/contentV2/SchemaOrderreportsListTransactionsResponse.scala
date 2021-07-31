package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderreportsListTransactionsResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#orderreportsListTransactionsResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The token for the retrieval of the next page of transactions.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of transactions.
    */
  var transactions: js.UndefOr[js.Array[SchemaOrderReportTransaction]] = js.undefined
}
object SchemaOrderreportsListTransactionsResponse {
  
  @scala.inline
  def apply(): SchemaOrderreportsListTransactionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderreportsListTransactionsResponse]
  }
  
  @scala.inline
  implicit class SchemaOrderreportsListTransactionsResponseMutableBuilder[Self <: SchemaOrderreportsListTransactionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTransactions(value: js.Array[SchemaOrderReportTransaction]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionsUndefined: Self = StObject.set(x, "transactions", js.undefined)
    
    @scala.inline
    def setTransactionsVarargs(value: SchemaOrderReportTransaction*): Self = StObject.set(x, "transactions", js.Array(value :_*))
  }
}

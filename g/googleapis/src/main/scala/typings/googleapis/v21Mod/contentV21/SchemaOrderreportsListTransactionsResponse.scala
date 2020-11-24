package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrderreportsListTransactionsResponse extends js.Object {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#orderreportsListTransactionsResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The token for the retrieval of the next page of transactions.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The list of transactions.
    */
  var transactions: js.UndefOr[js.Array[SchemaOrderReportTransaction]] = js.native
}
object SchemaOrderreportsListTransactionsResponse {
  
  @scala.inline
  def apply(): SchemaOrderreportsListTransactionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderreportsListTransactionsResponse]
  }
  
  @scala.inline
  implicit class SchemaOrderreportsListTransactionsResponseOps[Self <: SchemaOrderreportsListTransactionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setTransactionsVarargs(value: SchemaOrderReportTransaction*): Self = this.set("transactions", js.Array(value :_*))
    
    @scala.inline
    def setTransactions(value: js.Array[SchemaOrderReportTransaction]): Self = this.set("transactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactions: Self = this.set("transactions", js.undefined)
  }
}

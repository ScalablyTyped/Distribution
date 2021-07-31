package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionInfo extends StObject {
  
  /** [Output-only] // [Alpha] Id of the transaction. */
  var transactionId: js.UndefOr[String] = js.undefined
}
object TransactionInfo {
  
  @scala.inline
  def apply(): TransactionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionInfo]
  }
  
  @scala.inline
  implicit class TransactionInfoMutableBuilder[Self <: TransactionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}

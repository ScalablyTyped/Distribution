package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionInfo extends StObject {
  
  /** [Output-only] // [Alpha] Id of the transaction. */
  var transactionId: js.UndefOr[String] = js.undefined
}
object TransactionInfo {
  
  inline def apply(): TransactionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransactionInfo] (val x: Self) extends AnyVal {
    
    inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}

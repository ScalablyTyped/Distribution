package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeginTransactionRequest extends StObject {
  
  /** Options for a new transaction. */
  var transactionOptions: js.UndefOr[TransactionOptions] = js.undefined
}
object BeginTransactionRequest {
  
  inline def apply(): BeginTransactionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeginTransactionRequest]
  }
  
  extension [Self <: BeginTransactionRequest](x: Self) {
    
    inline def setTransactionOptions(value: TransactionOptions): Self = StObject.set(x, "transactionOptions", value.asInstanceOf[js.Any])
    
    inline def setTransactionOptionsUndefined: Self = StObject.set(x, "transactionOptions", js.undefined)
  }
}

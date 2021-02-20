package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeginTransactionRequest extends StObject {
  
  /** Options for a new transaction. */
  var transactionOptions: js.UndefOr[TransactionOptions] = js.native
}
object BeginTransactionRequest {
  
  @scala.inline
  def apply(): BeginTransactionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeginTransactionRequest]
  }
  
  @scala.inline
  implicit class BeginTransactionRequestMutableBuilder[Self <: BeginTransactionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransactionOptions(value: TransactionOptions): Self = StObject.set(x, "transactionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionOptionsUndefined: Self = StObject.set(x, "transactionOptions", js.undefined)
  }
}

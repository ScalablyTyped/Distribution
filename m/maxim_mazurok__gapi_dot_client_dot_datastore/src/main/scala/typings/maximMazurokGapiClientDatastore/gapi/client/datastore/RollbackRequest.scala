package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollbackRequest extends StObject {
  
  /** Required. The transaction identifier, returned by a call to Datastore.BeginTransaction. */
  var transaction: js.UndefOr[String] = js.undefined
}
object RollbackRequest {
  
  inline def apply(): RollbackRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollbackRequest]
  }
  
  extension [Self <: RollbackRequest](x: Self) {
    
    inline def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}

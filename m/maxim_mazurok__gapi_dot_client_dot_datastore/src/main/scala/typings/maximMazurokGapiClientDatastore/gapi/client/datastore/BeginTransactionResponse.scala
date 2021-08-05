package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeginTransactionResponse extends StObject {
  
  /** The transaction identifier (always present). */
  var transaction: js.UndefOr[String] = js.undefined
}
object BeginTransactionResponse {
  
  inline def apply(): BeginTransactionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeginTransactionResponse]
  }
  
  extension [Self <: BeginTransactionResponse](x: Self) {
    
    inline def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}

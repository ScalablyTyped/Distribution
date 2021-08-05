package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadOptions extends StObject {
  
  /** The non-transactional read consistency to use. Cannot be set to `STRONG` for global queries. */
  var readConsistency: js.UndefOr[String] = js.undefined
  
  /** The identifier of the transaction in which to read. A transaction identifier is returned by a call to Datastore.BeginTransaction. */
  var transaction: js.UndefOr[String] = js.undefined
}
object ReadOptions {
  
  inline def apply(): ReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadOptions]
  }
  
  extension [Self <: ReadOptions](x: Self) {
    
    inline def setReadConsistency(value: String): Self = StObject.set(x, "readConsistency", value.asInstanceOf[js.Any])
    
    inline def setReadConsistencyUndefined: Self = StObject.set(x, "readConsistency", js.undefined)
    
    inline def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}

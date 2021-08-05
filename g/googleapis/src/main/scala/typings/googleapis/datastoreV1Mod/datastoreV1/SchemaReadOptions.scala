package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options shared by read requests.
  */
trait SchemaReadOptions extends StObject {
  
  /**
    * The non-transactional read consistency to use. Cannot be set to `STRONG`
    * for global queries.
    */
  var readConsistency: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the transaction in which to read. A transaction
    * identifier is returned by a call to Datastore.BeginTransaction.
    */
  var transaction: js.UndefOr[String] = js.undefined
}
object SchemaReadOptions {
  
  inline def apply(): SchemaReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReadOptions]
  }
  
  extension [Self <: SchemaReadOptions](x: Self) {
    
    inline def setReadConsistency(value: String): Self = StObject.set(x, "readConsistency", value.asInstanceOf[js.Any])
    
    inline def setReadConsistencyUndefined: Self = StObject.set(x, "readConsistency", js.undefined)
    
    inline def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}

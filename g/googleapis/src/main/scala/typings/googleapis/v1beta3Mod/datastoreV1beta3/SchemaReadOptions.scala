package typings.googleapis.v1beta3Mod.datastoreV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReadOptions extends StObject {
  
  /**
    * The non-transactional read consistency to use.
    */
  var readConsistency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Reads entities as they were at the given time. This may not be older than 270 seconds. This value is only supported for Cloud Firestore in Datastore mode.
    */
  var readTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The identifier of the transaction in which to read. A transaction identifier is returned by a call to Datastore.BeginTransaction.
    */
  var transaction: js.UndefOr[String | Null] = js.undefined
}
object SchemaReadOptions {
  
  inline def apply(): SchemaReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReadOptions]
  }
  
  extension [Self <: SchemaReadOptions](x: Self) {
    
    inline def setReadConsistency(value: String): Self = StObject.set(x, "readConsistency", value.asInstanceOf[js.Any])
    
    inline def setReadConsistencyNull: Self = StObject.set(x, "readConsistency", null)
    
    inline def setReadConsistencyUndefined: Self = StObject.set(x, "readConsistency", js.undefined)
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeNull: Self = StObject.set(x, "readTime", null)
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionNull: Self = StObject.set(x, "transaction", null)
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}

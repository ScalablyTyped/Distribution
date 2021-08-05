package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for Datastore.Rollback.
  */
trait SchemaRollbackRequest extends StObject {
  
  /**
    * The transaction identifier, returned by a call to
    * Datastore.BeginTransaction.
    */
  var transaction: js.UndefOr[String] = js.undefined
}
object SchemaRollbackRequest {
  
  inline def apply(): SchemaRollbackRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRollbackRequest]
  }
  
  extension [Self <: SchemaRollbackRequest](x: Self) {
    
    inline def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}

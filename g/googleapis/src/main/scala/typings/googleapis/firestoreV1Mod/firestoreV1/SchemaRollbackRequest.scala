package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for Firestore.Rollback.
  */
trait SchemaRollbackRequest extends StObject {
  
  /**
    * The transaction to roll back.
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

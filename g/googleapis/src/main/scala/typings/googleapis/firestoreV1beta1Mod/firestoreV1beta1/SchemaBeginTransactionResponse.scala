package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for Firestore.BeginTransaction.
  */
trait SchemaBeginTransactionResponse extends StObject {
  
  /**
    * The transaction that was started.
    */
  var transaction: js.UndefOr[String] = js.undefined
}
object SchemaBeginTransactionResponse {
  
  inline def apply(): SchemaBeginTransactionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBeginTransactionResponse]
  }
  
  extension [Self <: SchemaBeginTransactionResponse](x: Self) {
    
    inline def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}

package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for Firestore.Commit.
  */
trait SchemaCommitRequest extends StObject {
  
  /**
    * If set, applies all writes in this transaction, and commits it.
    */
  var transaction: js.UndefOr[String] = js.undefined
  
  /**
    * The writes to apply.  Always executed atomically and in order.
    */
  var writes: js.UndefOr[js.Array[SchemaWrite]] = js.undefined
}
object SchemaCommitRequest {
  
  inline def apply(): SchemaCommitRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommitRequest]
  }
  
  extension [Self <: SchemaCommitRequest](x: Self) {
    
    inline def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
    
    inline def setWrites(value: js.Array[SchemaWrite]): Self = StObject.set(x, "writes", value.asInstanceOf[js.Any])
    
    inline def setWritesUndefined: Self = StObject.set(x, "writes", js.undefined)
    
    inline def setWritesVarargs(value: SchemaWrite*): Self = StObject.set(x, "writes", js.Array(value :_*))
  }
}

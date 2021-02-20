package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for Firestore.Commit.
  */
@js.native
trait SchemaCommitRequest extends StObject {
  
  /**
    * If set, applies all writes in this transaction, and commits it.
    */
  var transaction: js.UndefOr[String] = js.native
  
  /**
    * The writes to apply.  Always executed atomically and in order.
    */
  var writes: js.UndefOr[js.Array[SchemaWrite]] = js.native
}
object SchemaCommitRequest {
  
  @scala.inline
  def apply(): SchemaCommitRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommitRequest]
  }
  
  @scala.inline
  implicit class SchemaCommitRequestMutableBuilder[Self <: SchemaCommitRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
    
    @scala.inline
    def setWrites(value: js.Array[SchemaWrite]): Self = StObject.set(x, "writes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritesUndefined: Self = StObject.set(x, "writes", js.undefined)
    
    @scala.inline
    def setWritesVarargs(value: SchemaWrite*): Self = StObject.set(x, "writes", js.Array(value :_*))
  }
}

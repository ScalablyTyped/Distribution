package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for Commit.
  */
trait SchemaCommitRequest extends StObject {
  
  /**
    * The mutations to be executed when this transaction commits. All mutations
    * are applied atomically, in the order they appear in this list.
    */
  var mutations: js.UndefOr[js.Array[SchemaMutation]] = js.undefined
  
  /**
    * Execute mutations in a temporary transaction. Note that unlike commit of
    * a previously-started transaction, commit with a temporary transaction is
    * non-idempotent. That is, if the `CommitRequest` is sent to Cloud Spanner
    * more than once (for instance, due to retries in the application, or in
    * the transport library), it is possible that the mutations are executed
    * more than once. If this is undesirable, use BeginTransaction and Commit
    * instead.
    */
  var singleUseTransaction: js.UndefOr[SchemaTransactionOptions] = js.undefined
  
  /**
    * Commit a previously-started transaction.
    */
  var transactionId: js.UndefOr[String] = js.undefined
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
    def setMutations(value: js.Array[SchemaMutation]): Self = StObject.set(x, "mutations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutationsUndefined: Self = StObject.set(x, "mutations", js.undefined)
    
    @scala.inline
    def setMutationsVarargs(value: SchemaMutation*): Self = StObject.set(x, "mutations", js.Array(value :_*))
    
    @scala.inline
    def setSingleUseTransaction(value: SchemaTransactionOptions): Self = StObject.set(x, "singleUseTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleUseTransactionUndefined: Self = StObject.set(x, "singleUseTransaction", js.undefined)
    
    @scala.inline
    def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}

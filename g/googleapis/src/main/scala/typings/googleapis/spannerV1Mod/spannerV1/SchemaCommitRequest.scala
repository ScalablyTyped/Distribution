package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCommitRequest extends StObject {
  
  /**
    * The mutations to be executed when this transaction commits. All mutations are applied atomically, in the order they appear in this list.
    */
  var mutations: js.UndefOr[js.Array[SchemaMutation]] = js.undefined
  
  /**
    * Common options for this request.
    */
  var requestOptions: js.UndefOr[SchemaRequestOptions] = js.undefined
  
  /**
    * If `true`, then statistics related to the transaction will be included in the CommitResponse. Default value is `false`.
    */
  var returnCommitStats: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Execute mutations in a temporary transaction. Note that unlike commit of a previously-started transaction, commit with a temporary transaction is non-idempotent. That is, if the `CommitRequest` is sent to Cloud Spanner more than once (for instance, due to retries in the application, or in the transport library), it is possible that the mutations are executed more than once. If this is undesirable, use BeginTransaction and Commit instead.
    */
  var singleUseTransaction: js.UndefOr[SchemaTransactionOptions] = js.undefined
  
  /**
    * Commit a previously-started transaction.
    */
  var transactionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCommitRequest {
  
  inline def apply(): SchemaCommitRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommitRequest]
  }
  
  extension [Self <: SchemaCommitRequest](x: Self) {
    
    inline def setMutations(value: js.Array[SchemaMutation]): Self = StObject.set(x, "mutations", value.asInstanceOf[js.Any])
    
    inline def setMutationsUndefined: Self = StObject.set(x, "mutations", js.undefined)
    
    inline def setMutationsVarargs(value: SchemaMutation*): Self = StObject.set(x, "mutations", js.Array(value*))
    
    inline def setRequestOptions(value: SchemaRequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
    
    inline def setReturnCommitStats(value: Boolean): Self = StObject.set(x, "returnCommitStats", value.asInstanceOf[js.Any])
    
    inline def setReturnCommitStatsNull: Self = StObject.set(x, "returnCommitStats", null)
    
    inline def setReturnCommitStatsUndefined: Self = StObject.set(x, "returnCommitStats", js.undefined)
    
    inline def setSingleUseTransaction(value: SchemaTransactionOptions): Self = StObject.set(x, "singleUseTransaction", value.asInstanceOf[js.Any])
    
    inline def setSingleUseTransactionUndefined: Self = StObject.set(x, "singleUseTransaction", js.undefined)
    
    inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdNull: Self = StObject.set(x, "transactionId", null)
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}

package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExecuteBatchDmlRequest extends StObject {
  
  /**
    * Common options for this request.
    */
  var requestOptions: js.UndefOr[SchemaRequestOptions] = js.undefined
  
  /**
    * Required. A per-transaction sequence number used to identify this request. This field makes each request idempotent such that if the request is received multiple times, at most one will succeed. The sequence number must be monotonically increasing within the transaction. If a request arrives for the first time with an out-of-order sequence number, the transaction may be aborted. Replays of previously handled requests will yield the same response as the first execution.
    */
  var seqno: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The list of statements to execute in this batch. Statements are executed serially, such that the effects of statement `i` are visible to statement `i+1`. Each statement must be a DML statement. Execution stops at the first failed statement; the remaining statements are not executed. Callers must provide at least one statement.
    */
  var statements: js.UndefOr[js.Array[SchemaStatement]] = js.undefined
  
  /**
    * Required. The transaction to use. Must be a read-write transaction. To protect against replays, single-use transactions are not supported. The caller must either supply an existing transaction ID or begin a new transaction.
    */
  var transaction: js.UndefOr[SchemaTransactionSelector] = js.undefined
}
object SchemaExecuteBatchDmlRequest {
  
  inline def apply(): SchemaExecuteBatchDmlRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecuteBatchDmlRequest]
  }
  
  extension [Self <: SchemaExecuteBatchDmlRequest](x: Self) {
    
    inline def setRequestOptions(value: SchemaRequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
    
    inline def setSeqno(value: String): Self = StObject.set(x, "seqno", value.asInstanceOf[js.Any])
    
    inline def setSeqnoNull: Self = StObject.set(x, "seqno", null)
    
    inline def setSeqnoUndefined: Self = StObject.set(x, "seqno", js.undefined)
    
    inline def setStatements(value: js.Array[SchemaStatement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
    
    inline def setStatementsVarargs(value: SchemaStatement*): Self = StObject.set(x, "statements", js.Array(value*))
    
    inline def setTransaction(value: SchemaTransactionSelector): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}

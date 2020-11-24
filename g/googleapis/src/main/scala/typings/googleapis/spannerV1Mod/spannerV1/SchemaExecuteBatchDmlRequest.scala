package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for ExecuteBatchDml
  */
@js.native
trait SchemaExecuteBatchDmlRequest extends js.Object {
  
  /**
    * A per-transaction sequence number used to identify this request. This is
    * used in the same space as the seqno in ExecuteSqlRequest. See more
    * details in ExecuteSqlRequest.
    */
  var seqno: js.UndefOr[String] = js.native
  
  /**
    * The list of statements to execute in this batch. Statements are executed
    * serially, such that the effects of statement i are visible to statement
    * i+1. Each statement must be a DML statement. Execution will stop at the
    * first failed statement; the remaining statements will not run.  REQUIRES:
    * statements_size() &gt; 0.
    */
  var statements: js.UndefOr[js.Array[SchemaStatement]] = js.native
  
  /**
    * The transaction to use. A ReadWrite transaction is required. Single-use
    * transactions are not supported (to avoid replay).  The caller must either
    * supply an existing transaction ID or begin a new transaction.
    */
  var transaction: js.UndefOr[SchemaTransactionSelector] = js.native
}
object SchemaExecuteBatchDmlRequest {
  
  @scala.inline
  def apply(): SchemaExecuteBatchDmlRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecuteBatchDmlRequest]
  }
  
  @scala.inline
  implicit class SchemaExecuteBatchDmlRequestOps[Self <: SchemaExecuteBatchDmlRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSeqno(value: String): Self = this.set("seqno", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeqno: Self = this.set("seqno", js.undefined)
    
    @scala.inline
    def setStatementsVarargs(value: SchemaStatement*): Self = this.set("statements", js.Array(value :_*))
    
    @scala.inline
    def setStatements(value: js.Array[SchemaStatement]): Self = this.set("statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatements: Self = this.set("statements", js.undefined)
    
    @scala.inline
    def setTransaction(value: SchemaTransactionSelector): Self = this.set("transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransaction: Self = this.set("transaction", js.undefined)
  }
}

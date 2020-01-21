package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    seqno: String = null,
    statements: js.Array[SchemaStatement] = null,
    transaction: SchemaTransactionSelector = null
  ): SchemaExecuteBatchDmlRequest = {
    val __obj = js.Dynamic.literal()
    if (seqno != null) __obj.updateDynamic("seqno")(seqno.asInstanceOf[js.Any])
    if (statements != null) __obj.updateDynamic("statements")(statements.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExecuteBatchDmlRequest]
  }
}


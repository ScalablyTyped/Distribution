package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for ExecuteSql and ExecuteStreamingSql.
  */
@js.native
trait SchemaExecuteSqlRequest extends js.Object {
  /**
    * It is not always possible for Cloud Spanner to infer the right SQL type
    * from a JSON value.  For example, values of type `BYTES` and values of
    * type `STRING` both appear in params as JSON strings.  In these cases,
    * `param_types` can be used to specify the exact SQL type for some or all
    * of the SQL statement parameters. See the definition of Type for more
    * information about SQL types.
    */
  var paramTypes: js.UndefOr[StringDictionary[SchemaType]] = js.native
  /**
    * The SQL string can contain parameter placeholders. A parameter
    * placeholder consists of `&#39;@&#39;` followed by the parameter name.
    * Parameter names consist of any combination of letters, numbers, and
    * underscores.  Parameters can appear anywhere that a literal value is
    * expected.  The same parameter name can be used more than once, for
    * example:   `&quot;WHERE id &gt; @msg_id AND id &lt; @msg_id + 100&quot;`
    * It is an error to execute an SQL statement with unbound parameters.
    * Parameter values are specified using `params`, which is a JSON object
    * whose keys are parameter names, and whose values are the corresponding
    * parameter values.
    */
  var params: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * If present, results will be restricted to the specified partition
    * previously created using PartitionQuery().  There must be an exact match
    * for the values of fields common to this message and the
    * PartitionQueryRequest message used to create this partition_token.
    */
  var partitionToken: js.UndefOr[String] = js.native
  /**
    * Used to control the amount of debugging information returned in
    * ResultSetStats. If partition_token is set, query_mode can only be set to
    * QueryMode.NORMAL.
    */
  var queryMode: js.UndefOr[String] = js.native
  /**
    * If this request is resuming a previously interrupted SQL statement
    * execution, `resume_token` should be copied from the last PartialResultSet
    * yielded before the interruption. Doing this enables the new SQL statement
    * execution to resume where the last one left off. The rest of the request
    * parameters must exactly match the request that yielded this token.
    */
  var resumeToken: js.UndefOr[String] = js.native
  /**
    * A per-transaction sequence number used to identify this request. This
    * makes each request idempotent such that if the request is received
    * multiple times, at most one will succeed.  The sequence number must be
    * monotonically increasing within the transaction. If a request arrives for
    * the first time with an out-of-order sequence number, the transaction may
    * be aborted. Replays of previously handled requests will yield the same
    * response as the first execution.  Required for DML statements. Ignored
    * for queries.
    */
  var seqno: js.UndefOr[String] = js.native
  /**
    * Required. The SQL string.
    */
  var sql: js.UndefOr[String] = js.native
  /**
    * The transaction to use. If none is provided, the default is a temporary
    * read-only transaction with strong concurrency.  The transaction to use.
    * For queries, if none is provided, the default is a temporary read-only
    * transaction with strong concurrency.  Standard DML statements require a
    * ReadWrite transaction. Single-use transactions are not supported (to
    * avoid replay).  The caller must either supply an existing transaction ID
    * or begin a new transaction.  Partitioned DML requires an existing
    * PartitionedDml transaction ID.
    */
  var transaction: js.UndefOr[SchemaTransactionSelector] = js.native
}

object SchemaExecuteSqlRequest {
  @scala.inline
  def apply(
    paramTypes: StringDictionary[SchemaType] = null,
    params: StringDictionary[js.Any] = null,
    partitionToken: String = null,
    queryMode: String = null,
    resumeToken: String = null,
    seqno: String = null,
    sql: String = null,
    transaction: SchemaTransactionSelector = null
  ): SchemaExecuteSqlRequest = {
    val __obj = js.Dynamic.literal()
    if (paramTypes != null) __obj.updateDynamic("paramTypes")(paramTypes.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (partitionToken != null) __obj.updateDynamic("partitionToken")(partitionToken.asInstanceOf[js.Any])
    if (queryMode != null) __obj.updateDynamic("queryMode")(queryMode.asInstanceOf[js.Any])
    if (resumeToken != null) __obj.updateDynamic("resumeToken")(resumeToken.asInstanceOf[js.Any])
    if (seqno != null) __obj.updateDynamic("seqno")(seqno.asInstanceOf[js.Any])
    if (sql != null) __obj.updateDynamic("sql")(sql.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExecuteSqlRequest]
  }
}


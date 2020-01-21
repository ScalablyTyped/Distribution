package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for Read and StreamingRead.
  */
@js.native
trait SchemaReadRequest extends js.Object {
  /**
    * The columns of table to be returned for each row matching this request.
    */
  var columns: js.UndefOr[js.Array[String]] = js.native
  /**
    * If non-empty, the name of an index on table. This index is used instead
    * of the table primary key when interpreting key_set and sorting result
    * rows. See key_set for further information.
    */
  var index: js.UndefOr[String] = js.native
  /**
    * Required. `key_set` identifies the rows to be yielded. `key_set` names
    * the primary keys of the rows in table to be yielded, unless index is
    * present. If index is present, then key_set instead names index keys in
    * index.  If the partition_token field is empty, rows are yielded in table
    * primary key order (if index is empty) or index key order (if index is
    * non-empty).  If the partition_token field is not empty, rows will be
    * yielded in an unspecified order.  It is not an error for the `key_set` to
    * name rows that do not exist in the database. Read yields nothing for
    * nonexistent rows.
    */
  var keySet: js.UndefOr[SchemaKeySet] = js.native
  /**
    * If greater than zero, only the first `limit` rows are yielded. If `limit`
    * is zero, the default is no limit. A limit cannot be specified if
    * `partition_token` is set.
    */
  var limit: js.UndefOr[String] = js.native
  /**
    * If present, results will be restricted to the specified partition
    * previously created using PartitionRead().    There must be an exact match
    * for the values of fields common to this message and the
    * PartitionReadRequest message used to create this partition_token.
    */
  var partitionToken: js.UndefOr[String] = js.native
  /**
    * If this request is resuming a previously interrupted read, `resume_token`
    * should be copied from the last PartialResultSet yielded before the
    * interruption. Doing this enables the new read to resume where the last
    * read left off. The rest of the request parameters must exactly match the
    * request that yielded this token.
    */
  var resumeToken: js.UndefOr[String] = js.native
  /**
    * Required. The name of the table in the database to be read.
    */
  var table: js.UndefOr[String] = js.native
  /**
    * The transaction to use. If none is provided, the default is a temporary
    * read-only transaction with strong concurrency.
    */
  var transaction: js.UndefOr[SchemaTransactionSelector] = js.native
}

object SchemaReadRequest {
  @scala.inline
  def apply(
    columns: js.Array[String] = null,
    index: String = null,
    keySet: SchemaKeySet = null,
    limit: String = null,
    partitionToken: String = null,
    resumeToken: String = null,
    table: String = null,
    transaction: SchemaTransactionSelector = null
  ): SchemaReadRequest = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (keySet != null) __obj.updateDynamic("keySet")(keySet.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (partitionToken != null) __obj.updateDynamic("partitionToken")(partitionToken.asInstanceOf[js.Any])
    if (resumeToken != null) __obj.updateDynamic("resumeToken")(resumeToken.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReadRequest]
  }
}


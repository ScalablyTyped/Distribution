package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for PartitionRead
  */
@js.native
trait SchemaPartitionReadRequest extends js.Object {
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
    * index.  It is not an error for the `key_set` to name rows that do not
    * exist in the database. Read yields nothing for nonexistent rows.
    */
  var keySet: js.UndefOr[SchemaKeySet] = js.native
  /**
    * Additional options that affect how many partitions are created.
    */
  var partitionOptions: js.UndefOr[SchemaPartitionOptions] = js.native
  /**
    * Required. The name of the table in the database to be read.
    */
  var table: js.UndefOr[String] = js.native
  /**
    * Read only snapshot transactions are supported, read/write and single use
    * transactions are not.
    */
  var transaction: js.UndefOr[SchemaTransactionSelector] = js.native
}

object SchemaPartitionReadRequest {
  @scala.inline
  def apply(
    columns: js.Array[String] = null,
    index: String = null,
    keySet: SchemaKeySet = null,
    partitionOptions: SchemaPartitionOptions = null,
    table: String = null,
    transaction: SchemaTransactionSelector = null
  ): SchemaPartitionReadRequest = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (keySet != null) __obj.updateDynamic("keySet")(keySet.asInstanceOf[js.Any])
    if (partitionOptions != null) __obj.updateDynamic("partitionOptions")(partitionOptions.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPartitionReadRequest]
  }
}


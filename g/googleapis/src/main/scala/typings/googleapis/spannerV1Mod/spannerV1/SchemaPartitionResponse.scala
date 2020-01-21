package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for PartitionQuery or PartitionRead
  */
@js.native
trait SchemaPartitionResponse extends js.Object {
  /**
    * Partitions created by this request.
    */
  var partitions: js.UndefOr[js.Array[SchemaPartition]] = js.native
  /**
    * Transaction created by this request.
    */
  var transaction: js.UndefOr[SchemaTransaction] = js.native
}

object SchemaPartitionResponse {
  @scala.inline
  def apply(partitions: js.Array[SchemaPartition] = null, transaction: SchemaTransaction = null): SchemaPartitionResponse = {
    val __obj = js.Dynamic.literal()
    if (partitions != null) __obj.updateDynamic("partitions")(partitions.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPartitionResponse]
  }
}


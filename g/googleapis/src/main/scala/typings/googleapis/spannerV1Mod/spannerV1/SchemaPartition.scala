package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information returned for each partition returned in a PartitionResponse.
  */
@js.native
trait SchemaPartition extends js.Object {
  /**
    * This token can be passed to Read, StreamingRead, ExecuteSql, or
    * ExecuteStreamingSql requests to restrict the results to those identified
    * by this partition token.
    */
  var partitionToken: js.UndefOr[String] = js.native
}

object SchemaPartition {
  @scala.inline
  def apply(partitionToken: String = null): SchemaPartition = {
    val __obj = js.Dynamic.literal()
    if (partitionToken != null) __obj.updateDynamic("partitionToken")(partitionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPartition]
  }
}


package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartitionMetadata extends js.Object {
  var isr: js.UndefOr[js.Array[Double]] = js.undefined
  var leader: Double
  var partitionErrorCode: js.UndefOr[Double] = js.undefined
  var partitionId: Double
  var replicas: js.UndefOr[js.Array[Double]] = js.undefined
}

object PartitionMetadata {
  @scala.inline
  def apply(
    leader: Double,
    partitionId: Double,
    isr: js.Array[Double] = null,
    partitionErrorCode: Int | Double = null,
    replicas: js.Array[Double] = null
  ): PartitionMetadata = {
    val __obj = js.Dynamic.literal(leader = leader, partitionId = partitionId)
    if (isr != null) __obj.updateDynamic("isr")(isr)
    if (partitionErrorCode != null) __obj.updateDynamic("partitionErrorCode")(partitionErrorCode.asInstanceOf[js.Any])
    if (replicas != null) __obj.updateDynamic("replicas")(replicas)
    __obj.asInstanceOf[PartitionMetadata]
  }
}


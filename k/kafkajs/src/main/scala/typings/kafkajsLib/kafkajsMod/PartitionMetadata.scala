package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartitionMetadata extends js.Object {
  var isr: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var leader: scala.Double
  var partitionErrorCode: js.UndefOr[scala.Double] = js.undefined
  var partitionId: scala.Double
  var replicas: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object PartitionMetadata {
  @scala.inline
  def apply(
    leader: scala.Double,
    partitionId: scala.Double,
    isr: js.Array[scala.Double] = null,
    partitionErrorCode: scala.Int | scala.Double = null,
    replicas: js.Array[scala.Double] = null
  ): PartitionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("leader")(leader)
    __obj.updateDynamic("partitionId")(partitionId)
    if (isr != null) __obj.updateDynamic("isr")(isr)
    if (partitionErrorCode != null) __obj.updateDynamic("partitionErrorCode")(partitionErrorCode.asInstanceOf[js.Any])
    if (replicas != null) __obj.updateDynamic("replicas")(replicas)
    __obj.asInstanceOf[PartitionMetadata]
  }
}


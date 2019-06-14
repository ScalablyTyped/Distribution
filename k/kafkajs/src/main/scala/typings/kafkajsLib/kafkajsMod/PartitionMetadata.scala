package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartitionMetadata extends js.Object {
  var isr: js.Array[scala.Double]
  var leader: scala.Double
  var partitionErrorCode: scala.Double
  var partitionId: scala.Double
  var replicas: js.Array[scala.Double]
}

object PartitionMetadata {
  @scala.inline
  def apply(
    isr: js.Array[scala.Double],
    leader: scala.Double,
    partitionErrorCode: scala.Double,
    partitionId: scala.Double,
    replicas: js.Array[scala.Double]
  ): PartitionMetadata = {
    val __obj = js.Dynamic.literal(isr = isr, leader = leader, partitionErrorCode = partitionErrorCode, partitionId = partitionId, replicas = replicas)
  
    __obj.asInstanceOf[PartitionMetadata]
  }
}


package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartitionerPartitionMetadata extends js.Object {
  var leader: scala.Double
  var partitionId: scala.Double
}

object PartitionerPartitionMetadata {
  @scala.inline
  def apply(leader: scala.Double, partitionId: scala.Double): PartitionerPartitionMetadata = {
    val __obj = js.Dynamic.literal(leader = leader, partitionId = partitionId)
  
    __obj.asInstanceOf[PartitionerPartitionMetadata]
  }
}


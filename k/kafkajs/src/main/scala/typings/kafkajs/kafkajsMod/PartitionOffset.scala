package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartitionOffset extends js.Object {
  var offset: String
  var partition: String
}

object PartitionOffset {
  @scala.inline
  def apply(offset: String, partition: String): PartitionOffset = {
    val __obj = js.Dynamic.literal(offset = offset, partition = partition)
  
    __obj.asInstanceOf[PartitionOffset]
  }
}


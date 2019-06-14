package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITopicMetadata extends js.Object {
  var partitions: js.Array[PartitionMetadata]
  var topic: java.lang.String
}

object ITopicMetadata {
  @scala.inline
  def apply(partitions: js.Array[PartitionMetadata], topic: java.lang.String): ITopicMetadata = {
    val __obj = js.Dynamic.literal(partitions = partitions, topic = topic)
  
    __obj.asInstanceOf[ITopicMetadata]
  }
}


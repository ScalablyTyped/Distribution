package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PartitionsTopic extends js.Object {
  var partitions: js.Array[Anon_OffsetPartition]
  var topic: java.lang.String
}

object Anon_PartitionsTopic {
  @scala.inline
  def apply(partitions: js.Array[Anon_OffsetPartition], topic: java.lang.String): Anon_PartitionsTopic = {
    val __obj = js.Dynamic.literal(partitions = partitions, topic = topic)
  
    __obj.asInstanceOf[Anon_PartitionsTopic]
  }
}


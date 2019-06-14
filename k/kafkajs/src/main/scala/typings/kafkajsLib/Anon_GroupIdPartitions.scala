package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GroupIdPartitions extends js.Object {
  var groupId: java.lang.String
  var partitions: js.Array[kafkajsLib.kafkajsMod.SeekEntry]
  var topic: java.lang.String
}

object Anon_GroupIdPartitions {
  @scala.inline
  def apply(
    groupId: java.lang.String,
    partitions: js.Array[kafkajsLib.kafkajsMod.SeekEntry],
    topic: java.lang.String
  ): Anon_GroupIdPartitions = {
    val __obj = js.Dynamic.literal(groupId = groupId, partitions = partitions, topic = topic)
  
    __obj.asInstanceOf[Anon_GroupIdPartitions]
  }
}


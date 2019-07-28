package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminSetOffsetsOptions extends js.Object {
  var groupId: String
  var partitions: js.Array[AdminSetOffsetsSeekEntry]
  var topic: String
}

object AdminSetOffsetsOptions {
  @scala.inline
  def apply(groupId: String, partitions: js.Array[AdminSetOffsetsSeekEntry], topic: String): AdminSetOffsetsOptions = {
    val __obj = js.Dynamic.literal(groupId = groupId, partitions = partitions, topic = topic)
  
    __obj.asInstanceOf[AdminSetOffsetsOptions]
  }
}


package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminFetchOffsetsOptions extends js.Object {
  var groupId: String
  var topic: String
}

object AdminFetchOffsetsOptions {
  @scala.inline
  def apply(groupId: String, topic: String): AdminFetchOffsetsOptions = {
    val __obj = js.Dynamic.literal(groupId = groupId, topic = topic)
  
    __obj.asInstanceOf[AdminFetchOffsetsOptions]
  }
}


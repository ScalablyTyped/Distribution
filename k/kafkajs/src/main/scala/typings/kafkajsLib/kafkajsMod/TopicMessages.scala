package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicMessages extends js.Object {
  var messages: js.Array[Message]
  var topic: java.lang.String
}

object TopicMessages {
  @scala.inline
  def apply(messages: js.Array[Message], topic: java.lang.String): TopicMessages = {
    val __obj = js.Dynamic.literal(messages = messages, topic = topic)
  
    __obj.asInstanceOf[TopicMessages]
  }
}


package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProducerTopicMessage extends js.Object {
  var messages: js.Array[ProducerMessage]
  var topic: java.lang.String
}

object ProducerTopicMessage {
  @scala.inline
  def apply(messages: js.Array[ProducerMessage], topic: java.lang.String): ProducerTopicMessage = {
    val __obj = js.Dynamic.literal(messages = messages, topic = topic)
  
    __obj.asInstanceOf[ProducerTopicMessage]
  }
}


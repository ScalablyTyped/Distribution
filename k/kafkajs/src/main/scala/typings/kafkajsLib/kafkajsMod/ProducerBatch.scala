package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProducerBatch extends js.Object {
  var acks: scala.Double
  var compression: CompressionTypes
  var timeout: scala.Double
  var topicMessages: js.Array[TopicMessages]
}

object ProducerBatch {
  @scala.inline
  def apply(
    acks: scala.Double,
    compression: CompressionTypes,
    timeout: scala.Double,
    topicMessages: js.Array[TopicMessages]
  ): ProducerBatch = {
    val __obj = js.Dynamic.literal(acks = acks, compression = compression, timeout = timeout, topicMessages = topicMessages)
  
    __obj.asInstanceOf[ProducerBatch]
  }
}


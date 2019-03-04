package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message extends js.Object {
  var message: kafkajsLib.kafkajsMod.ProducerMessage
  var partitionMetadata: js.Array[kafkajsLib.kafkajsMod.PartitionMetadata]
  var topic: java.lang.String
}

object Anon_Message {
  @scala.inline
  def apply(
    message: kafkajsLib.kafkajsMod.ProducerMessage,
    partitionMetadata: js.Array[kafkajsLib.kafkajsMod.PartitionMetadata],
    topic: java.lang.String
  ): Anon_Message = {
    val __obj = js.Dynamic.literal(message = message, partitionMetadata = partitionMetadata, topic = topic)
  
    __obj.asInstanceOf[Anon_Message]
  }
}


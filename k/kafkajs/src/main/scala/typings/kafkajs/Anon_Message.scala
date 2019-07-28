package typings.kafkajs

import typings.kafkajs.kafkajsMod.PartitionMetadata
import typings.kafkajs.kafkajsMod.ProducerMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message extends js.Object {
  var message: ProducerMessage
  var partitionMetadata: js.Array[PartitionMetadata]
  var topic: String
}

object Anon_Message {
  @scala.inline
  def apply(message: ProducerMessage, partitionMetadata: js.Array[PartitionMetadata], topic: String): Anon_Message = {
    val __obj = js.Dynamic.literal(message = message, partitionMetadata = partitionMetadata, topic = topic)
  
    __obj.asInstanceOf[Anon_Message]
  }
}


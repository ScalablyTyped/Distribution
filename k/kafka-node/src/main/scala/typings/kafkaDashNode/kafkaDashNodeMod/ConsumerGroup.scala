package typings.kafkaDashNode.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kafka-node", "ConsumerGroup")
@js.native
class ConsumerGroup protected () extends HighLevelConsumer {
  def this(options: ConsumerGroupOptions, topics: String) = this()
  def this(options: ConsumerGroupOptions, topics: js.Array[String]) = this()
  @JSName("client")
  var client_ConsumerGroup: KafkaClient with Client = js.native
  var generationId: Double = js.native
  var memberId: String = js.native
}


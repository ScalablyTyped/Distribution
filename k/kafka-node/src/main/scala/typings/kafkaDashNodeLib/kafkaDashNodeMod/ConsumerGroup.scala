package typings
package kafkaDashNodeLib.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kafka-node", "ConsumerGroup")
@js.native
class ConsumerGroup protected () extends HighLevelConsumer {
  def this(options: ConsumerGroupOptions, topics: java.lang.String) = this()
  def this(options: ConsumerGroupOptions, topics: js.Array[java.lang.String]) = this()
  @JSName("client")
  var client_ConsumerGroup: KafkaClient with Client = js.native
  var generationId: scala.Double = js.native
  var memberId: java.lang.String = js.native
}


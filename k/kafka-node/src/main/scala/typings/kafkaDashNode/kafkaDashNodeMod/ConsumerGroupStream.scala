package typings.kafkaDashNode.kafkaDashNodeMod

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kafka-node", "ConsumerGroupStream")
@js.native
class ConsumerGroupStream protected () extends Readable {
  def this(options: ConsumerGroupStreamOptions, topics: String) = this()
  def this(options: ConsumerGroupStreamOptions, topics: js.Array[String]) = this()
  var client: KafkaClient = js.native
  var consumerGroup: ConsumerGroup = js.native
  def close(cb: js.Function0[_]): Unit = js.native
  def commit(message: Message): Unit = js.native
  def commit(message: Message, force: Boolean): Unit = js.native
  def commit(message: Message, force: Boolean, cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): Unit = js.native
  def transmitMessages(): Unit = js.native
}


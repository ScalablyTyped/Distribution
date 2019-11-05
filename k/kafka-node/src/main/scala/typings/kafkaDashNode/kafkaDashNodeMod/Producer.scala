package typings.kafkaDashNode.kafkaDashNodeMod

import typings.kafkaDashNode.kafkaDashNodeStrings.error
import typings.kafkaDashNode.kafkaDashNodeStrings.ready
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kafka-node", "Producer")
@js.native
class Producer protected () extends EventEmitter {
  def this(client: KafkaClient) = this()
  def this(client: KafkaClient, options: ProducerOptions) = this()
  def this(client: KafkaClient, options: ProducerOptions, customPartitioner: CustomPartitioner) = this()
  def close(): Unit = js.native
  def close(cb: js.Function0[_]): Unit = js.native
  def createTopics(
    topics: js.Array[String],
    async: Boolean,
    cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]
  ): Unit = js.native
  def createTopics(topics: js.Array[String], cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): Unit = js.native
  @JSName("on")
  def on_error(eventName: error, cb: js.Function1[/* error */ js.Any, _]): this.type = js.native
  @JSName("on")
  def on_ready(eventName: ready, cb: js.Function0[_]): this.type = js.native
  def send(payloads: js.Array[ProduceRequest], cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): Unit = js.native
}


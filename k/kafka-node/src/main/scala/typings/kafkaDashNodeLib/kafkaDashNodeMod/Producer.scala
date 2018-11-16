package typings
package kafkaDashNodeLib.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kafka-node", "Producer")
@js.native
class Producer protected () extends js.Object {
  def this(client: Client) = this()
  def this(client: Client, options: ProducerOptions) = this()
  def this(client: Client, options: ProducerOptions, customPartitioner: CustomPartitioner) = this()
  def close(): scala.Unit = js.native
  def close(cb: js.Function0[_]): scala.Unit = js.native
  def createTopics(
    topics: js.Array[java.lang.String],
    async: scala.Boolean,
    cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]
  ): scala.Unit = js.native
  def createTopics(topics: js.Array[java.lang.String], cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): scala.Unit = js.native
  @JSName("on")
  def on_error(eventName: kafkaDashNodeLib.kafkaDashNodeLibStrings.error, cb: js.Function1[/* error */ js.Any, _]): scala.Unit = js.native
  @JSName("on")
  def on_ready(eventName: kafkaDashNodeLib.kafkaDashNodeLibStrings.ready, cb: js.Function0[_]): scala.Unit = js.native
  def send(payloads: js.Array[ProduceRequest], cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): scala.Unit = js.native
}


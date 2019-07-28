package typings.kafkajs.kafkajsMod

import typings.kafkajs.kafkajsStrings.producerDOTconnect
import typings.kafkajs.kafkajsStrings.producerDOTdisconnect
import typings.kafkajs.kafkajsStrings.producerDOTrequest
import typings.kafkajs.kafkajsStrings.producerDOTrequest_queue_size
import typings.kafkajs.kafkajsStrings.producerDOTrequest_timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Producer extends js.Object {
  var events: ProducerEvents = js.native
  def connect(): js.Promise[Unit] = js.native
  def disconnect(): js.Promise[Unit] = js.native
  @JSName("on")
  def on_producerconnect(event: producerDOTconnect, cb: js.Function1[/* e */ InstrumentationEvent, Unit]): js.Function0[this.type] = js.native
  @JSName("on")
  def on_producerdisconnect(event: producerDOTdisconnect, cb: js.Function1[/* e */ InstrumentationEvent, Unit]): js.Function0[this.type] = js.native
  @JSName("on")
  def on_producerrequest(event: producerDOTrequest, cb: js.Function1[/* e */ InstrumentationEvent, Unit]): js.Function0[this.type] = js.native
  @JSName("on")
  def on_producerrequestqueuesize(event: producerDOTrequest_queue_size, cb: js.Function1[/* e */ InstrumentationEvent, Unit]): js.Function0[this.type] = js.native
  @JSName("on")
  def on_producerrequesttimeout(event: producerDOTrequest_timeout, cb: js.Function1[/* e */ InstrumentationEvent, Unit]): js.Function0[this.type] = js.native
  def send(payload: MessagePayload): js.Promise[Unit] = js.native
  def sendBatch(payload: MessageBatchPayload): js.Promise[Unit] = js.native
  def transaction(): js.Promise[Transaction] = js.native
}


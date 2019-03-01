package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Producer extends js.Object {
  var events: ProducerEvents = js.native
  def connect(): js.Promise[scala.Unit] = js.native
  def disconnect(): js.Promise[scala.Unit] = js.native
  @JSName("on")
  def on_producerconnect(
    event: kafkajsLib.kafkajsLibStrings.producerDOTconnect,
    cb: js.Function1[/* e */ InstrumentationEvent, scala.Unit]
  ): js.Function0[this.type] = js.native
  @JSName("on")
  def on_producerdisconnect(
    event: kafkajsLib.kafkajsLibStrings.producerDOTdisconnect,
    cb: js.Function1[/* e */ InstrumentationEvent, scala.Unit]
  ): js.Function0[this.type] = js.native
  @JSName("on")
  def on_producerrequest(
    event: kafkajsLib.kafkajsLibStrings.producerDOTrequest,
    cb: js.Function1[/* e */ InstrumentationEvent, scala.Unit]
  ): js.Function0[this.type] = js.native
  @JSName("on")
  def on_producerrequest_queue_size(
    event: kafkajsLib.kafkajsLibStrings.producerDOTrequest_queue_size,
    cb: js.Function1[/* e */ InstrumentationEvent, scala.Unit]
  ): js.Function0[this.type] = js.native
  @JSName("on")
  def on_producerrequest_timeout(
    event: kafkajsLib.kafkajsLibStrings.producerDOTrequest_timeout,
    cb: js.Function1[/* e */ InstrumentationEvent, scala.Unit]
  ): js.Function0[this.type] = js.native
  def send(payload: MessagePayload): js.Promise[scala.Unit] = js.native
  def sendBatch(payload: MessageBatchPayload): js.Promise[scala.Unit] = js.native
  def transaction(): js.Promise[Transaction] = js.native
}


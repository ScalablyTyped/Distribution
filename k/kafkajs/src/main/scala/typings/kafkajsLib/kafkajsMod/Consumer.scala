package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Consumer extends js.Object {
  var events: ConsumerEvents
  def connect(): js.Promise[scala.Unit]
  def describeGroup(): js.Promise[GroupMetadata]
  def disconnect(): js.Promise[scala.Unit]
  def on(
    event: kafkajsLib.kafkajsLibStrings.consumerDOTgroup_join | kafkajsLib.kafkajsLibStrings.consumnerDOTend_batch_process | kafkajsLib.kafkajsLibStrings.consumerDOTconnect | kafkajsLib.kafkajsLibStrings.consumerDOTstop | kafkajsLib.kafkajsLibStrings.consumerDOTrequest_timeout | kafkajsLib.kafkajsLibStrings.consumerDOTstart_batch_process | kafkajsLib.kafkajsLibStrings.consumerDOTdisconnect | kafkajsLib.kafkajsLibStrings.consumerDOTcrash | kafkajsLib.kafkajsLibStrings.consumerDOTheartbeat | kafkajsLib.kafkajsLibStrings.consumerDOTcommit_offsets | kafkajsLib.kafkajsLibStrings.consumerDOTrequest | kafkajsLib.kafkajsLibStrings.consumerDOTrequest_queue_size | kafkajsLib.kafkajsLibStrings.consumerDOTfetch,
    cb: js.Function1[/* e */ InstrumentationEvent, scala.Unit]
  ): js.Function0[this.type]
  def pause(topics: js.Array[kafkajsLib.Anon_Topic]): scala.Unit
  def resume(topics: js.Array[kafkajsLib.Anon_Topic]): scala.Unit
  def run(options: ConsumerRunOptions): js.Promise[scala.Unit]
  def seek(options: ConsumerSeekOptions): scala.Unit
  def subscribe(options: ConsumerSubscribeOptions): js.Promise[scala.Unit]
}

object Consumer {
  @scala.inline
  def apply(
    connect: () => js.Promise[scala.Unit],
    describeGroup: () => js.Promise[GroupMetadata],
    disconnect: () => js.Promise[scala.Unit],
    events: ConsumerEvents,
    on: (kafkajsLib.kafkajsLibStrings.consumerDOTgroup_join | kafkajsLib.kafkajsLibStrings.consumnerDOTend_batch_process | kafkajsLib.kafkajsLibStrings.consumerDOTconnect | kafkajsLib.kafkajsLibStrings.consumerDOTstop | kafkajsLib.kafkajsLibStrings.consumerDOTrequest_timeout | kafkajsLib.kafkajsLibStrings.consumerDOTstart_batch_process | kafkajsLib.kafkajsLibStrings.consumerDOTdisconnect | kafkajsLib.kafkajsLibStrings.consumerDOTcrash | kafkajsLib.kafkajsLibStrings.consumerDOTheartbeat | kafkajsLib.kafkajsLibStrings.consumerDOTcommit_offsets | kafkajsLib.kafkajsLibStrings.consumerDOTrequest | kafkajsLib.kafkajsLibStrings.consumerDOTrequest_queue_size | kafkajsLib.kafkajsLibStrings.consumerDOTfetch, js.Function1[/* e */ InstrumentationEvent, scala.Unit]) => js.Function0[Consumer],
    pause: js.Array[kafkajsLib.Anon_Topic] => scala.Unit,
    resume: js.Array[kafkajsLib.Anon_Topic] => scala.Unit,
    run: ConsumerRunOptions => js.Promise[scala.Unit],
    seek: ConsumerSeekOptions => scala.Unit,
    subscribe: ConsumerSubscribeOptions => js.Promise[scala.Unit]
  ): Consumer = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect), describeGroup = js.Any.fromFunction0(describeGroup), disconnect = js.Any.fromFunction0(disconnect), events = events, on = js.Any.fromFunction2(on), pause = js.Any.fromFunction1(pause), resume = js.Any.fromFunction1(resume), run = js.Any.fromFunction1(run), seek = js.Any.fromFunction1(seek), subscribe = js.Any.fromFunction1(subscribe))
  
    __obj.asInstanceOf[Consumer]
  }
}


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
    event: kafkajsLib.kafkajsLibStrings.consumerDOTheartbeat | kafkajsLib.kafkajsLibStrings.consumerDOTcommit_offsets | kafkajsLib.kafkajsLibStrings.consumerDOTgroup_join | kafkajsLib.kafkajsLibStrings.consumerDOTfetch | kafkajsLib.kafkajsLibStrings.consumerDOTstart_batch_process | kafkajsLib.kafkajsLibStrings.consumnerDOTend_batch_process | kafkajsLib.kafkajsLibStrings.consumerDOTconnect | kafkajsLib.kafkajsLibStrings.consumerDOTdisconnect | kafkajsLib.kafkajsLibStrings.consumerDOTstop | kafkajsLib.kafkajsLibStrings.consumerDOTcrash | kafkajsLib.kafkajsLibStrings.consumerDOTrequest | kafkajsLib.kafkajsLibStrings.consumerDOTrequest_timeout | kafkajsLib.kafkajsLibStrings.consumerDOTrequest_queue_size,
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
    connect: js.Function0[js.Promise[scala.Unit]],
    describeGroup: js.Function0[js.Promise[GroupMetadata]],
    disconnect: js.Function0[js.Promise[scala.Unit]],
    events: ConsumerEvents,
    on: js.Function2[
      kafkajsLib.kafkajsLibStrings.consumerDOTheartbeat | kafkajsLib.kafkajsLibStrings.consumerDOTcommit_offsets | kafkajsLib.kafkajsLibStrings.consumerDOTgroup_join | kafkajsLib.kafkajsLibStrings.consumerDOTfetch | kafkajsLib.kafkajsLibStrings.consumerDOTstart_batch_process | kafkajsLib.kafkajsLibStrings.consumnerDOTend_batch_process | kafkajsLib.kafkajsLibStrings.consumerDOTconnect | kafkajsLib.kafkajsLibStrings.consumerDOTdisconnect | kafkajsLib.kafkajsLibStrings.consumerDOTstop | kafkajsLib.kafkajsLibStrings.consumerDOTcrash | kafkajsLib.kafkajsLibStrings.consumerDOTrequest | kafkajsLib.kafkajsLibStrings.consumerDOTrequest_timeout | kafkajsLib.kafkajsLibStrings.consumerDOTrequest_queue_size, 
      js.Function1[/* e */ InstrumentationEvent, scala.Unit], 
      js.Function0[Consumer]
    ],
    pause: js.Function1[js.Array[kafkajsLib.Anon_Topic], scala.Unit],
    resume: js.Function1[js.Array[kafkajsLib.Anon_Topic], scala.Unit],
    run: js.Function1[ConsumerRunOptions, js.Promise[scala.Unit]],
    seek: js.Function1[ConsumerSeekOptions, scala.Unit],
    subscribe: js.Function1[ConsumerSubscribeOptions, js.Promise[scala.Unit]]
  ): Consumer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connect")(connect)
    __obj.updateDynamic("describeGroup")(describeGroup)
    __obj.updateDynamic("disconnect")(disconnect)
    __obj.updateDynamic("events")(events)
    __obj.updateDynamic("on")(on)
    __obj.updateDynamic("pause")(pause)
    __obj.updateDynamic("resume")(resume)
    __obj.updateDynamic("run")(run)
    __obj.updateDynamic("seek")(seek)
    __obj.updateDynamic("subscribe")(subscribe)
    __obj.asInstanceOf[Consumer]
  }
}


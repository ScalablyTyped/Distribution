package typings.kafkajs.kafkajsMod

import typings.kafkajs.Anon_Topic
import typings.kafkajs.kafkajsStrings.consumerDOTcommit_offsets
import typings.kafkajs.kafkajsStrings.consumerDOTconnect
import typings.kafkajs.kafkajsStrings.consumerDOTcrash
import typings.kafkajs.kafkajsStrings.consumerDOTdisconnect
import typings.kafkajs.kafkajsStrings.consumerDOTfetch
import typings.kafkajs.kafkajsStrings.consumerDOTgroup_join
import typings.kafkajs.kafkajsStrings.consumerDOTheartbeat
import typings.kafkajs.kafkajsStrings.consumerDOTrequest
import typings.kafkajs.kafkajsStrings.consumerDOTrequest_queue_size
import typings.kafkajs.kafkajsStrings.consumerDOTrequest_timeout
import typings.kafkajs.kafkajsStrings.consumerDOTstart_batch_process
import typings.kafkajs.kafkajsStrings.consumerDOTstop
import typings.kafkajs.kafkajsStrings.consumnerDOTend_batch_process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Consumer extends js.Object {
  var events: ConsumerEvents
  def connect(): js.Promise[Unit]
  def describeGroup(): js.Promise[GroupMetadata]
  def disconnect(): js.Promise[Unit]
  def on(
    event: consumerDOTgroup_join | consumnerDOTend_batch_process | consumerDOTconnect | consumerDOTstop | consumerDOTrequest_timeout | consumerDOTstart_batch_process | consumerDOTdisconnect | consumerDOTcrash | consumerDOTheartbeat | consumerDOTcommit_offsets | consumerDOTrequest | consumerDOTrequest_queue_size | consumerDOTfetch,
    cb: js.Function1[/* e */ InstrumentationEvent, Unit]
  ): js.Function0[this.type]
  def pause(topics: js.Array[Anon_Topic]): Unit
  def resume(topics: js.Array[Anon_Topic]): Unit
  def run(options: ConsumerRunOptions): js.Promise[Unit]
  def seek(options: ConsumerSeekOptions): Unit
  def subscribe(options: ConsumerSubscribeOptions): js.Promise[Unit]
}

object Consumer {
  @scala.inline
  def apply(
    connect: () => js.Promise[Unit],
    describeGroup: () => js.Promise[GroupMetadata],
    disconnect: () => js.Promise[Unit],
    events: ConsumerEvents,
    on: (consumerDOTgroup_join | consumnerDOTend_batch_process | consumerDOTconnect | consumerDOTstop | consumerDOTrequest_timeout | consumerDOTstart_batch_process | consumerDOTdisconnect | consumerDOTcrash | consumerDOTheartbeat | consumerDOTcommit_offsets | consumerDOTrequest | consumerDOTrequest_queue_size | consumerDOTfetch, js.Function1[/* e */ InstrumentationEvent, Unit]) => js.Function0[Consumer],
    pause: js.Array[Anon_Topic] => Unit,
    resume: js.Array[Anon_Topic] => Unit,
    run: ConsumerRunOptions => js.Promise[Unit],
    seek: ConsumerSeekOptions => Unit,
    subscribe: ConsumerSubscribeOptions => js.Promise[Unit]
  ): Consumer = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect), describeGroup = js.Any.fromFunction0(describeGroup), disconnect = js.Any.fromFunction0(disconnect), events = events, on = js.Any.fromFunction2(on), pause = js.Any.fromFunction1(pause), resume = js.Any.fromFunction1(resume), run = js.Any.fromFunction1(run), seek = js.Any.fromFunction1(seek), subscribe = js.Any.fromFunction1(subscribe))
  
    __obj.asInstanceOf[Consumer]
  }
}


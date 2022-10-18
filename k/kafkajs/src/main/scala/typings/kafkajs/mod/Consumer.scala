package typings.kafkajs.mod

import typings.kafkajs.anon.PartitionsTopicString
import typings.kafkajs.kafkajsStrings.consumerDotcommit_offsets
import typings.kafkajs.kafkajsStrings.consumerDotconnect
import typings.kafkajs.kafkajsStrings.consumerDotcrash
import typings.kafkajs.kafkajsStrings.consumerDotdisconnect
import typings.kafkajs.kafkajsStrings.consumerDotend_batch_process
import typings.kafkajs.kafkajsStrings.consumerDotfetch
import typings.kafkajs.kafkajsStrings.consumerDotfetch_start
import typings.kafkajs.kafkajsStrings.consumerDotgroup_join
import typings.kafkajs.kafkajsStrings.consumerDotheartbeat
import typings.kafkajs.kafkajsStrings.consumerDotnetworkDotrequest
import typings.kafkajs.kafkajsStrings.consumerDotnetworkDotrequest_queue_size
import typings.kafkajs.kafkajsStrings.consumerDotnetworkDotrequest_timeout
import typings.kafkajs.kafkajsStrings.consumerDotrebalancing
import typings.kafkajs.kafkajsStrings.consumerDotreceived_unsubscribed_topics
import typings.kafkajs.kafkajsStrings.consumerDotstart_batch_process
import typings.kafkajs.kafkajsStrings.consumerDotstop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Consumer extends StObject {
  
  def commitOffsets(topicPartitions: js.Array[TopicPartitionOffsetAndMetadata]): js.Promise[Unit] = js.native
  
  def connect(): js.Promise[Unit] = js.native
  
  def describeGroup(): js.Promise[GroupDescription] = js.native
  
  def disconnect(): js.Promise[Unit] = js.native
  
  val events: ConsumerEvents = js.native
  
  def logger(): Logger = js.native
  
  def on(
    eventName: ValueOf[ConsumerEvents],
    listener: js.Function1[/* event */ InstrumentationEvent[Any], Unit]
  ): RemoveInstrumentationEventListener[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof eventName */ Any
  ] = js.native
  @JSName("on")
  def on_consumercommitoffsets(
    eventName: consumerDotcommit_offsets,
    listener: js.Function1[/* event */ ConsumerCommitOffsetsEvent, Unit]
  ): RemoveInstrumentationEventListener[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof eventName */ Any
  ] = js.native
  @JSName("on")
  def on_consumerconnect(eventName: consumerDotconnect, listener: js.Function1[/* event */ ConnectEvent, Unit]): RemoveInstrumentationEventListener[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof eventName */ Any
  ] = js.native
  @JSName("on")
  def on_consumercrash(eventName: consumerDotcrash, listener: js.Function1[/* event */ ConsumerCrashEvent, Unit]): RemoveInstrumentationEventListener[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof eventName */ Any
  ] = js.native
  @JSName("on")
  def on_consumerdisconnect(eventName: consumerDotdisconnect, listener: js.Function1[/* event */ DisconnectEvent, Unit]): RemoveInstrumentationEventListener[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof eventName */ Any
  ] = js.native
  @JSName("on")
  def on_consumerendbatchprocess(
    eventName: consumerDotend_batch_process,
    listener: js.Function1[/* event */ ConsumerEndBatchProcessEvent, Unit]
  ): RemoveInstrumentationEventListener[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof eventName */ Any
  ] = js.native
  @JSName("on")
  def on_consumerfetch(eventName: consumerDotfetch, listener: js.Function1[/* event */ ConsumerFetchEvent, Unit]): RemoveInstrumentationEventListener[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof eventName */ Any
  ] = js.native
  @JSName("on")
  def on_consumerfetchstart(
    eventName: consumerDotfetch_start,
    listener: js.Function1[/* event */ ConsumerFetchStartEvent, Unit]
  ): RemoveInstrumentationEventListener[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof eventName */ Any
  ] = js.native
  @JSName("on")
  def on_consumergroupjoin(eventName: consumerDotgroup_join, listener: js.Function1[/* event */ ConsumerGroupJoinEvent, Unit]): RemoveInstrumentationEventListener[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof eventName */ Any
  ] = js.native
  @JSName("on")
  def on_consumerheartbeat(eventName: consumerDotheartbeat, listener: js.Function1[/* event */ ConsumerHeartbeatEvent, Unit]): RemoveInstrumentationEventListener[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof eventName */ Any
  ] = js.native
  @JSName("on")
  def on_consumernetworkrequest(eventName: consumerDotnetworkDotrequest, listener: js.Function1[/* event */ RequestEvent, Unit]): RemoveInstrumentationEventListener[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof eventName */ Any
  ] = js.native
  @JSName("on")
  def on_consumernetworkrequestqueuesize(
    eventName: consumerDotnetworkDotrequest_queue_size,
    listener: js.Function1[/* event */ RequestQueueSizeEvent, Unit]
  ): RemoveInstrumentationEventListener[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof eventName */ Any
  ] = js.native
  @JSName("on")
  def on_consumernetworkrequesttimeout(
    eventName: consumerDotnetworkDotrequest_timeout,
    listener: js.Function1[/* event */ RequestTimeoutEvent, Unit]
  ): RemoveInstrumentationEventListener[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof eventName */ Any
  ] = js.native
  @JSName("on")
  def on_consumerrebalancing(
    eventName: consumerDotrebalancing,
    listener: js.Function1[/* event */ ConsumerRebalancingEvent, Unit]
  ): RemoveInstrumentationEventListener[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof eventName */ Any
  ] = js.native
  @JSName("on")
  def on_consumerreceivedunsubscribedtopics(
    eventName: consumerDotreceived_unsubscribed_topics,
    listener: js.Function1[/* event */ ConsumerReceivedUnsubcribedTopicsEvent, Unit]
  ): RemoveInstrumentationEventListener[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof eventName */ Any
  ] = js.native
  @JSName("on")
  def on_consumerstartbatchprocess(
    eventName: consumerDotstart_batch_process,
    listener: js.Function1[/* event */ ConsumerStartBatchProcessEvent, Unit]
  ): RemoveInstrumentationEventListener[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof eventName */ Any
  ] = js.native
  @JSName("on")
  def on_consumerstop(eventName: consumerDotstop, listener: js.Function1[/* event */ InstrumentationEvent[Null], Unit]): RemoveInstrumentationEventListener[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof eventName */ Any
  ] = js.native
  
  def pause(topics: js.Array[PartitionsTopicString]): Unit = js.native
  
  def paused(): js.Array[TopicPartitions] = js.native
  
  def resume(topics: js.Array[PartitionsTopicString]): Unit = js.native
  
  def run(): js.Promise[Unit] = js.native
  def run(config: ConsumerRunConfig): js.Promise[Unit] = js.native
  
  def seek(topicPartitionOffset: TopicPartitionOffset): Unit = js.native
  
  def stop(): js.Promise[Unit] = js.native
  
  def subscribe(subscription: ConsumerSubscribeTopic): js.Promise[Unit] = js.native
  def subscribe(subscription: ConsumerSubscribeTopics): js.Promise[Unit] = js.native
}

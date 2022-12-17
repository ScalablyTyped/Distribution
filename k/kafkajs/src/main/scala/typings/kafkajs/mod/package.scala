package typings.kafkajs.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.kafkajs.anon.ApiKey
import typings.kafkajs.anon.ApiName
import typings.kafkajs.anon.AssignedTopics
import typings.kafkajs.anon.Duration
import typings.kafkajs.anon.Error
import typings.kafkajs.anon.GroupGenerationIdGroupId
import typings.kafkajs.anon.GroupIdMemberId
import typings.kafkajs.anon.IBatchProcessEventduratio
import typings.kafkajs.anon.MaxVersion
import typings.kafkajs.anon.MemberId
import typings.kafkajs.anon.NodeIdNumber
import typings.kafkajs.anon.NumberOfBatches
import typings.node.bufferMod.global.Buffer
import typings.node.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ApiVersions = NumberDictionary[MaxVersion]

type Assignment = StringDictionary[js.Array[Double]]

type BrokersFunction = js.Function0[js.Array[String] | js.Promise[js.Array[String]]]

type ConnectEvent = InstrumentationEvent[Null]

type ConsumerCommitOffsetsEvent = InstrumentationEvent[GroupGenerationIdGroupId]

type ConsumerCrashEvent = InstrumentationEvent[Error]

type ConsumerEachBatchPayload = EachBatchPayload

type ConsumerEachMessagePayload = EachMessagePayload

type ConsumerEndBatchProcessEvent = InstrumentationEvent[IBatchProcessEventduratio]

type ConsumerFetchEvent = InstrumentationEvent[NumberOfBatches]

type ConsumerFetchStartEvent = InstrumentationEvent[NodeIdNumber]

type ConsumerGroupJoinEvent = InstrumentationEvent[Duration]

type ConsumerHeartbeatEvent = InstrumentationEvent[MemberId]

type ConsumerRebalancingEvent = InstrumentationEvent[GroupIdMemberId]

type ConsumerReceivedUnsubcribedTopicsEvent = InstrumentationEvent[AssignedTopics]

type ConsumerStartBatchProcessEvent = InstrumentationEvent[IBatchProcessEvent]

type DefaultPartitioner = ICustomPartitioner

type DisconnectEvent = InstrumentationEvent[Null]

type EachBatchHandler = js.Function1[/* payload */ EachBatchPayload, js.Promise[Unit]]

type EachMessageHandler = js.Function1[/* payload */ EachMessagePayload, js.Promise[Unit]]

type ICustomPartitioner = js.Function0[js.Function1[/* args */ PartitionerArgs, Double]]

type IHeaders = StringDictionary[js.UndefOr[Buffer | String | (js.Array[Buffer | String])]]

type IMemberAssignment = StringDictionary[js.Array[Double]]

type ISocketFactory = js.Function1[/* args */ ISocketFactoryArgs, Socket]

type LegacyPartitioner = ICustomPartitioner

type PartitionAssigner = js.Function1[/* config */ typings.kafkajs.anon.Cluster, Assigner]

type RemoveInstrumentationEventListener[T] = js.Function0[Unit]

type RequestEvent = InstrumentationEvent[ApiKey]

type RequestQueueSizeEvent = InstrumentationEvent[typings.kafkajs.anon.Broker]

type RequestTimeoutEvent = InstrumentationEvent[ApiName]

type SASLOptions = SASLMechanismOptions[SASLMechanism]

type SeekEntry = PartitionOffset

type ValueOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T | U extends object ? kafkajs.kafkajs.Without<T, U> & U | kafkajs.kafkajs.Without<U, T> & T : T | U
  }}}
  */
type XOR[T, U] = ((Without[T, U]) & U) | ((Without[U, T]) & T)

type logCreator = js.Function1[/* logLevel */ logLevel, js.Function1[/* entry */ LogEntry, Unit]]

package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kafkajsMod {
  type Assignment = org.scalablytyped.runtime.StringDictionary[js.Array[scala.Double]]
  type ConnectEvent = InstrumentationEvent[scala.Null]
  type ConsumerCommitOffsetsEvent = InstrumentationEvent[kafkajsLib.Anon_GroupGenerationIdGroupIdMemberId]
  type ConsumerCrashEvent = InstrumentationEvent[kafkajsLib.Anon_Error]
  type ConsumerEndBatchProcessEvent = InstrumentationEvent[IBatchProcessEvent with kafkajsLib.Anon_DurationNumber]
  type ConsumerFetchEvent = InstrumentationEvent[kafkajsLib.Anon_DurationNumberOfBatches]
  type ConsumerGroupJoinEvent = InstrumentationEvent[kafkajsLib.Anon_Duration]
  type ConsumerHeartbeatEvent = InstrumentationEvent[kafkajsLib.Anon_GroupGenerationIdGroupId]
  type ConsumerStartBatchProcessEvent = InstrumentationEvent[IBatchProcessEvent]
  type DefaultPartitioner = js.Function1[/* message */ kafkajsLib.Anon_Message, scala.Double]
  type DisconnectEvent = InstrumentationEvent[scala.Null]
  type ICustomPartitioner = js.Function0[js.Function1[/* message */ kafkajsLib.Anon_Message, scala.Double]]
  type IHeaders = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type IMemberAssignment = org.scalablytyped.runtime.StringDictionary[js.Array[scala.Double]]
  type ISocketFactory = js.Function4[
    /* host */ java.lang.String, 
    /* port */ scala.Double, 
    /* ssl */ nodeLib.tlsMod.SecureContextOptions, 
    /* onConnect */ js.Function0[scala.Unit], 
    nodeLib.netMod.Socket
  ]
  type JavaCompatiblePartitioner = js.Function1[/* message */ kafkajsLib.Anon_Message, scala.Double]
  type Logger = js.Function1[/* entry */ LogEntry, scala.Unit]
  type Producer = Sender with kafkajsLib.Anon_Args
  type RequestEvent = InstrumentationEvent[kafkajsLib.Anon_ApiKey]
  type RequestQueueSizeEvent = InstrumentationEvent[kafkajsLib.Anon_Broker]
  type RequestTimeoutEvent = InstrumentationEvent[kafkajsLib.Anon_ApiKeyApiName]
  type Transaction = Sender with kafkajsLib.Anon_Abort
  type ValueOf[T] = /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any
  type logCreator = js.Function1[
    /* logLevel */ java.lang.String, 
    js.Function4[
      /* namespace */ java.lang.String, 
      /* level */ java.lang.String, 
      /* label */ java.lang.String, 
      /* log */ java.lang.String, 
      scala.Unit
    ]
  ]
}

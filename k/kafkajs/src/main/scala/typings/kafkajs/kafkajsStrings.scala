package typings.kafkajs

import typings.kafkajs.mod.ConsumerGroupState
import typings.kafkajs.mod.SASLMechanism
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kafkajsStrings {
  
  @js.native
  sealed trait CompletingRebalance
    extends StObject
       with ConsumerGroupState
  inline def CompletingRebalance: CompletingRebalance = "CompletingRebalance".asInstanceOf[CompletingRebalance]
  
  @js.native
  sealed trait Dead
    extends StObject
       with ConsumerGroupState
  inline def Dead: Dead = "Dead".asInstanceOf[Dead]
  
  @js.native
  sealed trait Empty
    extends StObject
       with ConsumerGroupState
  inline def Empty: Empty = "Empty".asInstanceOf[Empty]
  
  @js.native
  sealed trait PreparingRebalance
    extends StObject
       with ConsumerGroupState
  inline def PreparingRebalance: PreparingRebalance = "PreparingRebalance".asInstanceOf[PreparingRebalance]
  
  @js.native
  sealed trait Stable
    extends StObject
       with ConsumerGroupState
  inline def Stable: Stable = "Stable".asInstanceOf[Stable]
  
  @js.native
  sealed trait Unknown
    extends StObject
       with ConsumerGroupState
  inline def Unknown: Unknown = "Unknown".asInstanceOf[Unknown]
  
  @js.native
  sealed trait adminDotconnect extends StObject
  inline def adminDotconnect: adminDotconnect = "admin.connect".asInstanceOf[adminDotconnect]
  
  @js.native
  sealed trait adminDotdisconnect extends StObject
  inline def adminDotdisconnect: adminDotdisconnect = "admin.disconnect".asInstanceOf[adminDotdisconnect]
  
  @js.native
  sealed trait adminDotnetworkDotrequest extends StObject
  inline def adminDotnetworkDotrequest: adminDotnetworkDotrequest = "admin.network.request".asInstanceOf[adminDotnetworkDotrequest]
  
  @js.native
  sealed trait adminDotnetworkDotrequest_queue_size extends StObject
  inline def adminDotnetworkDotrequest_queue_size: adminDotnetworkDotrequest_queue_size = "admin.network.request_queue_size".asInstanceOf[adminDotnetworkDotrequest_queue_size]
  
  @js.native
  sealed trait adminDotnetworkDotrequest_timeout extends StObject
  inline def adminDotnetworkDotrequest_timeout: adminDotnetworkDotrequest_timeout = "admin.network.request_timeout".asInstanceOf[adminDotnetworkDotrequest_timeout]
  
  @js.native
  sealed trait aws
    extends StObject
       with SASLMechanism
  inline def aws: aws = "aws".asInstanceOf[aws]
  
  @js.native
  sealed trait consumerDotcommit_offsets extends StObject
  inline def consumerDotcommit_offsets: consumerDotcommit_offsets = "consumer.commit_offsets".asInstanceOf[consumerDotcommit_offsets]
  
  @js.native
  sealed trait consumerDotconnect extends StObject
  inline def consumerDotconnect: consumerDotconnect = "consumer.connect".asInstanceOf[consumerDotconnect]
  
  @js.native
  sealed trait consumerDotcrash extends StObject
  inline def consumerDotcrash: consumerDotcrash = "consumer.crash".asInstanceOf[consumerDotcrash]
  
  @js.native
  sealed trait consumerDotdisconnect extends StObject
  inline def consumerDotdisconnect: consumerDotdisconnect = "consumer.disconnect".asInstanceOf[consumerDotdisconnect]
  
  @js.native
  sealed trait consumerDotend_batch_process extends StObject
  inline def consumerDotend_batch_process: consumerDotend_batch_process = "consumer.end_batch_process".asInstanceOf[consumerDotend_batch_process]
  
  @js.native
  sealed trait consumerDotfetch extends StObject
  inline def consumerDotfetch: consumerDotfetch = "consumer.fetch".asInstanceOf[consumerDotfetch]
  
  @js.native
  sealed trait consumerDotfetch_start extends StObject
  inline def consumerDotfetch_start: consumerDotfetch_start = "consumer.fetch_start".asInstanceOf[consumerDotfetch_start]
  
  @js.native
  sealed trait consumerDotgroup_join extends StObject
  inline def consumerDotgroup_join: consumerDotgroup_join = "consumer.group_join".asInstanceOf[consumerDotgroup_join]
  
  @js.native
  sealed trait consumerDotheartbeat extends StObject
  inline def consumerDotheartbeat: consumerDotheartbeat = "consumer.heartbeat".asInstanceOf[consumerDotheartbeat]
  
  @js.native
  sealed trait consumerDotnetworkDotrequest extends StObject
  inline def consumerDotnetworkDotrequest: consumerDotnetworkDotrequest = "consumer.network.request".asInstanceOf[consumerDotnetworkDotrequest]
  
  @js.native
  sealed trait consumerDotnetworkDotrequest_queue_size extends StObject
  inline def consumerDotnetworkDotrequest_queue_size: consumerDotnetworkDotrequest_queue_size = "consumer.network.request_queue_size".asInstanceOf[consumerDotnetworkDotrequest_queue_size]
  
  @js.native
  sealed trait consumerDotnetworkDotrequest_timeout extends StObject
  inline def consumerDotnetworkDotrequest_timeout: consumerDotnetworkDotrequest_timeout = "consumer.network.request_timeout".asInstanceOf[consumerDotnetworkDotrequest_timeout]
  
  @js.native
  sealed trait consumerDotrebalancing extends StObject
  inline def consumerDotrebalancing: consumerDotrebalancing = "consumer.rebalancing".asInstanceOf[consumerDotrebalancing]
  
  @js.native
  sealed trait consumerDotreceived_unsubscribed_topics extends StObject
  inline def consumerDotreceived_unsubscribed_topics: consumerDotreceived_unsubscribed_topics = "consumer.received_unsubscribed_topics".asInstanceOf[consumerDotreceived_unsubscribed_topics]
  
  @js.native
  sealed trait consumerDotstart_batch_process extends StObject
  inline def consumerDotstart_batch_process: consumerDotstart_batch_process = "consumer.start_batch_process".asInstanceOf[consumerDotstart_batch_process]
  
  @js.native
  sealed trait consumerDotstop extends StObject
  inline def consumerDotstop: consumerDotstop = "consumer.stop".asInstanceOf[consumerDotstop]
  
  @js.native
  sealed trait oauthbearer
    extends StObject
       with SASLMechanism
  inline def oauthbearer: oauthbearer = "oauthbearer".asInstanceOf[oauthbearer]
  
  @js.native
  sealed trait plain
    extends StObject
       with SASLMechanism
  inline def plain: plain = "plain".asInstanceOf[plain]
  
  @js.native
  sealed trait producerDotconnect extends StObject
  inline def producerDotconnect: producerDotconnect = "producer.connect".asInstanceOf[producerDotconnect]
  
  @js.native
  sealed trait producerDotdisconnect extends StObject
  inline def producerDotdisconnect: producerDotdisconnect = "producer.disconnect".asInstanceOf[producerDotdisconnect]
  
  @js.native
  sealed trait producerDotnetworkDotrequest extends StObject
  inline def producerDotnetworkDotrequest: producerDotnetworkDotrequest = "producer.network.request".asInstanceOf[producerDotnetworkDotrequest]
  
  @js.native
  sealed trait producerDotnetworkDotrequest_queue_size extends StObject
  inline def producerDotnetworkDotrequest_queue_size: producerDotnetworkDotrequest_queue_size = "producer.network.request_queue_size".asInstanceOf[producerDotnetworkDotrequest_queue_size]
  
  @js.native
  sealed trait producerDotnetworkDotrequest_timeout extends StObject
  inline def producerDotnetworkDotrequest_timeout: producerDotnetworkDotrequest_timeout = "producer.network.request_timeout".asInstanceOf[producerDotnetworkDotrequest_timeout]
  
  @js.native
  sealed trait `scram-sha-256`
    extends StObject
       with SASLMechanism
  inline def `scram-sha-256`: `scram-sha-256` = "scram-sha-256".asInstanceOf[`scram-sha-256`]
  
  @js.native
  sealed trait `scram-sha-512`
    extends StObject
       with SASLMechanism
  inline def `scram-sha-512`: `scram-sha-512` = "scram-sha-512".asInstanceOf[`scram-sha-512`]
}

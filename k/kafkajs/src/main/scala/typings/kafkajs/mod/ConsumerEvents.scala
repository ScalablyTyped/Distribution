package typings.kafkajs.mod

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

trait ConsumerEvents extends StObject {
  
  var COMMIT_OFFSETS: consumerDotcommit_offsets
  
  var CONNECT: consumerDotconnect
  
  var CRASH: consumerDotcrash
  
  var DISCONNECT: consumerDotdisconnect
  
  var END_BATCH_PROCESS: consumerDotend_batch_process
  
  var FETCH: consumerDotfetch
  
  var FETCH_START: consumerDotfetch_start
  
  var GROUP_JOIN: consumerDotgroup_join
  
  var HEARTBEAT: consumerDotheartbeat
  
  var REBALANCING: consumerDotrebalancing
  
  var RECEIVED_UNSUBSCRIBED_TOPICS: consumerDotreceived_unsubscribed_topics
  
  var REQUEST: consumerDotnetworkDotrequest
  
  var REQUEST_QUEUE_SIZE: consumerDotnetworkDotrequest_queue_size
  
  var REQUEST_TIMEOUT: consumerDotnetworkDotrequest_timeout
  
  var START_BATCH_PROCESS: consumerDotstart_batch_process
  
  var STOP: consumerDotstop
}
object ConsumerEvents {
  
  inline def apply(): ConsumerEvents = {
    val __obj = js.Dynamic.literal(COMMIT_OFFSETS = "consumer.commit_offsets", CONNECT = "consumer.connect", CRASH = "consumer.crash", DISCONNECT = "consumer.disconnect", END_BATCH_PROCESS = "consumer.end_batch_process", FETCH = "consumer.fetch", FETCH_START = "consumer.fetch_start", GROUP_JOIN = "consumer.group_join", HEARTBEAT = "consumer.heartbeat", REBALANCING = "consumer.rebalancing", RECEIVED_UNSUBSCRIBED_TOPICS = "consumer.received_unsubscribed_topics", REQUEST = "consumer.network.request", REQUEST_QUEUE_SIZE = "consumer.network.request_queue_size", REQUEST_TIMEOUT = "consumer.network.request_timeout", START_BATCH_PROCESS = "consumer.start_batch_process", STOP = "consumer.stop")
    __obj.asInstanceOf[ConsumerEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsumerEvents] (val x: Self) extends AnyVal {
    
    inline def setCOMMIT_OFFSETS(value: consumerDotcommit_offsets): Self = StObject.set(x, "COMMIT_OFFSETS", value.asInstanceOf[js.Any])
    
    inline def setCONNECT(value: consumerDotconnect): Self = StObject.set(x, "CONNECT", value.asInstanceOf[js.Any])
    
    inline def setCRASH(value: consumerDotcrash): Self = StObject.set(x, "CRASH", value.asInstanceOf[js.Any])
    
    inline def setDISCONNECT(value: consumerDotdisconnect): Self = StObject.set(x, "DISCONNECT", value.asInstanceOf[js.Any])
    
    inline def setEND_BATCH_PROCESS(value: consumerDotend_batch_process): Self = StObject.set(x, "END_BATCH_PROCESS", value.asInstanceOf[js.Any])
    
    inline def setFETCH(value: consumerDotfetch): Self = StObject.set(x, "FETCH", value.asInstanceOf[js.Any])
    
    inline def setFETCH_START(value: consumerDotfetch_start): Self = StObject.set(x, "FETCH_START", value.asInstanceOf[js.Any])
    
    inline def setGROUP_JOIN(value: consumerDotgroup_join): Self = StObject.set(x, "GROUP_JOIN", value.asInstanceOf[js.Any])
    
    inline def setHEARTBEAT(value: consumerDotheartbeat): Self = StObject.set(x, "HEARTBEAT", value.asInstanceOf[js.Any])
    
    inline def setREBALANCING(value: consumerDotrebalancing): Self = StObject.set(x, "REBALANCING", value.asInstanceOf[js.Any])
    
    inline def setRECEIVED_UNSUBSCRIBED_TOPICS(value: consumerDotreceived_unsubscribed_topics): Self = StObject.set(x, "RECEIVED_UNSUBSCRIBED_TOPICS", value.asInstanceOf[js.Any])
    
    inline def setREQUEST(value: consumerDotnetworkDotrequest): Self = StObject.set(x, "REQUEST", value.asInstanceOf[js.Any])
    
    inline def setREQUEST_QUEUE_SIZE(value: consumerDotnetworkDotrequest_queue_size): Self = StObject.set(x, "REQUEST_QUEUE_SIZE", value.asInstanceOf[js.Any])
    
    inline def setREQUEST_TIMEOUT(value: consumerDotnetworkDotrequest_timeout): Self = StObject.set(x, "REQUEST_TIMEOUT", value.asInstanceOf[js.Any])
    
    inline def setSTART_BATCH_PROCESS(value: consumerDotstart_batch_process): Self = StObject.set(x, "START_BATCH_PROCESS", value.asInstanceOf[js.Any])
    
    inline def setSTOP(value: consumerDotstop): Self = StObject.set(x, "STOP", value.asInstanceOf[js.Any])
  }
}

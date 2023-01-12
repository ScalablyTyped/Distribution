package typings.kafkaNode.mod

import typings.kafkaNode.kafkaNodeStrings.buffer
import typings.kafkaNode.kafkaNodeStrings.earliest
import typings.kafkaNode.kafkaNodeStrings.latest
import typings.kafkaNode.kafkaNodeStrings.none
import typings.kafkaNode.kafkaNodeStrings.range
import typings.kafkaNode.kafkaNodeStrings.roundrobin
import typings.kafkaNode.kafkaNodeStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumerGroupOptions extends StObject {
  
  var autoCommit: js.UndefOr[Boolean] = js.undefined
  
  var autoCommitIntervalMs: js.UndefOr[Double] = js.undefined
  
  var batch: js.UndefOr[AckBatchOptions] = js.undefined
  
  var connectOnReady: js.UndefOr[Boolean] = js.undefined
  
  var encoding: js.UndefOr[buffer | utf8] = js.undefined
  
  var fetchMaxBytes: js.UndefOr[Double] = js.undefined
  
  var fetchMaxWaitMs: js.UndefOr[Double] = js.undefined
  
  var fetchMinBytes: js.UndefOr[Double] = js.undefined
  
  var fromOffset: js.UndefOr[earliest | latest | none] = js.undefined
  
  var groupId: String
  
  var heartbeatInterval: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var kafkaHost: js.UndefOr[String] = js.undefined
  
  var keyEncoding: js.UndefOr[buffer | utf8] = js.undefined
  
  var maxNumSegments: js.UndefOr[Double] = js.undefined
  
  var maxTickMessages: js.UndefOr[Double] = js.undefined
  
  var migrateHLC: js.UndefOr[Boolean] = js.undefined
  
  var migrateRolling: js.UndefOr[Boolean] = js.undefined
  
  var onRebalance: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  
  var outOfRangeOffset: js.UndefOr[earliest | latest | none] = js.undefined
  
  var protocol: js.UndefOr[js.Array[roundrobin | range | CustomPartitionAssignmentProtocol]] = js.undefined
  
  var retries: js.UndefOr[Double] = js.undefined
  
  var retryFactor: js.UndefOr[Double] = js.undefined
  
  var retryMinTimeout: js.UndefOr[Double] = js.undefined
  
  var sasl: js.UndefOr[Any] = js.undefined
  
  var sessionTimeout: js.UndefOr[Double] = js.undefined
  
  var ssl: js.UndefOr[Boolean] = js.undefined
  
  var sslOptions: js.UndefOr[Any] = js.undefined
}
object ConsumerGroupOptions {
  
  inline def apply(groupId: String): ConsumerGroupOptions = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerGroupOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsumerGroupOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoCommit(value: Boolean): Self = StObject.set(x, "autoCommit", value.asInstanceOf[js.Any])
    
    inline def setAutoCommitIntervalMs(value: Double): Self = StObject.set(x, "autoCommitIntervalMs", value.asInstanceOf[js.Any])
    
    inline def setAutoCommitIntervalMsUndefined: Self = StObject.set(x, "autoCommitIntervalMs", js.undefined)
    
    inline def setAutoCommitUndefined: Self = StObject.set(x, "autoCommit", js.undefined)
    
    inline def setBatch(value: AckBatchOptions): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    inline def setConnectOnReady(value: Boolean): Self = StObject.set(x, "connectOnReady", value.asInstanceOf[js.Any])
    
    inline def setConnectOnReadyUndefined: Self = StObject.set(x, "connectOnReady", js.undefined)
    
    inline def setEncoding(value: buffer | utf8): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFetchMaxBytes(value: Double): Self = StObject.set(x, "fetchMaxBytes", value.asInstanceOf[js.Any])
    
    inline def setFetchMaxBytesUndefined: Self = StObject.set(x, "fetchMaxBytes", js.undefined)
    
    inline def setFetchMaxWaitMs(value: Double): Self = StObject.set(x, "fetchMaxWaitMs", value.asInstanceOf[js.Any])
    
    inline def setFetchMaxWaitMsUndefined: Self = StObject.set(x, "fetchMaxWaitMs", js.undefined)
    
    inline def setFetchMinBytes(value: Double): Self = StObject.set(x, "fetchMinBytes", value.asInstanceOf[js.Any])
    
    inline def setFetchMinBytesUndefined: Self = StObject.set(x, "fetchMinBytes", js.undefined)
    
    inline def setFromOffset(value: earliest | latest | none): Self = StObject.set(x, "fromOffset", value.asInstanceOf[js.Any])
    
    inline def setFromOffsetUndefined: Self = StObject.set(x, "fromOffset", js.undefined)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatInterval(value: Double): Self = StObject.set(x, "heartbeatInterval", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatIntervalUndefined: Self = StObject.set(x, "heartbeatInterval", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKafkaHost(value: String): Self = StObject.set(x, "kafkaHost", value.asInstanceOf[js.Any])
    
    inline def setKafkaHostUndefined: Self = StObject.set(x, "kafkaHost", js.undefined)
    
    inline def setKeyEncoding(value: buffer | utf8): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
    
    inline def setKeyEncodingUndefined: Self = StObject.set(x, "keyEncoding", js.undefined)
    
    inline def setMaxNumSegments(value: Double): Self = StObject.set(x, "maxNumSegments", value.asInstanceOf[js.Any])
    
    inline def setMaxNumSegmentsUndefined: Self = StObject.set(x, "maxNumSegments", js.undefined)
    
    inline def setMaxTickMessages(value: Double): Self = StObject.set(x, "maxTickMessages", value.asInstanceOf[js.Any])
    
    inline def setMaxTickMessagesUndefined: Self = StObject.set(x, "maxTickMessages", js.undefined)
    
    inline def setMigrateHLC(value: Boolean): Self = StObject.set(x, "migrateHLC", value.asInstanceOf[js.Any])
    
    inline def setMigrateHLCUndefined: Self = StObject.set(x, "migrateHLC", js.undefined)
    
    inline def setMigrateRolling(value: Boolean): Self = StObject.set(x, "migrateRolling", value.asInstanceOf[js.Any])
    
    inline def setMigrateRollingUndefined: Self = StObject.set(x, "migrateRolling", js.undefined)
    
    inline def setOnRebalance(value: () => js.Promise[Unit]): Self = StObject.set(x, "onRebalance", js.Any.fromFunction0(value))
    
    inline def setOnRebalanceUndefined: Self = StObject.set(x, "onRebalance", js.undefined)
    
    inline def setOutOfRangeOffset(value: earliest | latest | none): Self = StObject.set(x, "outOfRangeOffset", value.asInstanceOf[js.Any])
    
    inline def setOutOfRangeOffsetUndefined: Self = StObject.set(x, "outOfRangeOffset", js.undefined)
    
    inline def setProtocol(value: js.Array[roundrobin | range | CustomPartitionAssignmentProtocol]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setProtocolVarargs(value: (roundrobin | range | CustomPartitionAssignmentProtocol)*): Self = StObject.set(x, "protocol", js.Array(value*))
    
    inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
    
    inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    
    inline def setRetryFactor(value: Double): Self = StObject.set(x, "retryFactor", value.asInstanceOf[js.Any])
    
    inline def setRetryFactorUndefined: Self = StObject.set(x, "retryFactor", js.undefined)
    
    inline def setRetryMinTimeout(value: Double): Self = StObject.set(x, "retryMinTimeout", value.asInstanceOf[js.Any])
    
    inline def setRetryMinTimeoutUndefined: Self = StObject.set(x, "retryMinTimeout", js.undefined)
    
    inline def setSasl(value: Any): Self = StObject.set(x, "sasl", value.asInstanceOf[js.Any])
    
    inline def setSaslUndefined: Self = StObject.set(x, "sasl", js.undefined)
    
    inline def setSessionTimeout(value: Double): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
    
    inline def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
    
    inline def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    inline def setSslOptions(value: Any): Self = StObject.set(x, "sslOptions", value.asInstanceOf[js.Any])
    
    inline def setSslOptionsUndefined: Self = StObject.set(x, "sslOptions", js.undefined)
    
    inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
  }
}

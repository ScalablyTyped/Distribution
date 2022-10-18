package typings.kafkajs.mod

import typings.kafkajs.anon.RetryOptionsrestartOnFail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumerConfig extends StObject {
  
  var allowAutoTopicCreation: js.UndefOr[Boolean] = js.undefined
  
  var groupId: String
  
  var heartbeatInterval: js.UndefOr[Double] = js.undefined
  
  var maxBytes: js.UndefOr[Double] = js.undefined
  
  var maxBytesPerPartition: js.UndefOr[Double] = js.undefined
  
  var maxInFlightRequests: js.UndefOr[Double] = js.undefined
  
  var maxWaitTimeInMs: js.UndefOr[Double] = js.undefined
  
  var metadataMaxAge: js.UndefOr[Double] = js.undefined
  
  var minBytes: js.UndefOr[Double] = js.undefined
  
  var partitionAssigners: js.UndefOr[js.Array[PartitionAssigner]] = js.undefined
  
  var rackId: js.UndefOr[String] = js.undefined
  
  var readUncommitted: js.UndefOr[Boolean] = js.undefined
  
  var rebalanceTimeout: js.UndefOr[Double] = js.undefined
  
  var retry: js.UndefOr[RetryOptionsrestartOnFail] = js.undefined
  
  var sessionTimeout: js.UndefOr[Double] = js.undefined
}
object ConsumerConfig {
  
  inline def apply(groupId: String): ConsumerConfig = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerConfig]
  }
  
  extension [Self <: ConsumerConfig](x: Self) {
    
    inline def setAllowAutoTopicCreation(value: Boolean): Self = StObject.set(x, "allowAutoTopicCreation", value.asInstanceOf[js.Any])
    
    inline def setAllowAutoTopicCreationUndefined: Self = StObject.set(x, "allowAutoTopicCreation", js.undefined)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatInterval(value: Double): Self = StObject.set(x, "heartbeatInterval", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatIntervalUndefined: Self = StObject.set(x, "heartbeatInterval", js.undefined)
    
    inline def setMaxBytes(value: Double): Self = StObject.set(x, "maxBytes", value.asInstanceOf[js.Any])
    
    inline def setMaxBytesPerPartition(value: Double): Self = StObject.set(x, "maxBytesPerPartition", value.asInstanceOf[js.Any])
    
    inline def setMaxBytesPerPartitionUndefined: Self = StObject.set(x, "maxBytesPerPartition", js.undefined)
    
    inline def setMaxBytesUndefined: Self = StObject.set(x, "maxBytes", js.undefined)
    
    inline def setMaxInFlightRequests(value: Double): Self = StObject.set(x, "maxInFlightRequests", value.asInstanceOf[js.Any])
    
    inline def setMaxInFlightRequestsUndefined: Self = StObject.set(x, "maxInFlightRequests", js.undefined)
    
    inline def setMaxWaitTimeInMs(value: Double): Self = StObject.set(x, "maxWaitTimeInMs", value.asInstanceOf[js.Any])
    
    inline def setMaxWaitTimeInMsUndefined: Self = StObject.set(x, "maxWaitTimeInMs", js.undefined)
    
    inline def setMetadataMaxAge(value: Double): Self = StObject.set(x, "metadataMaxAge", value.asInstanceOf[js.Any])
    
    inline def setMetadataMaxAgeUndefined: Self = StObject.set(x, "metadataMaxAge", js.undefined)
    
    inline def setMinBytes(value: Double): Self = StObject.set(x, "minBytes", value.asInstanceOf[js.Any])
    
    inline def setMinBytesUndefined: Self = StObject.set(x, "minBytes", js.undefined)
    
    inline def setPartitionAssigners(value: js.Array[PartitionAssigner]): Self = StObject.set(x, "partitionAssigners", value.asInstanceOf[js.Any])
    
    inline def setPartitionAssignersUndefined: Self = StObject.set(x, "partitionAssigners", js.undefined)
    
    inline def setPartitionAssignersVarargs(value: PartitionAssigner*): Self = StObject.set(x, "partitionAssigners", js.Array(value*))
    
    inline def setRackId(value: String): Self = StObject.set(x, "rackId", value.asInstanceOf[js.Any])
    
    inline def setRackIdUndefined: Self = StObject.set(x, "rackId", js.undefined)
    
    inline def setReadUncommitted(value: Boolean): Self = StObject.set(x, "readUncommitted", value.asInstanceOf[js.Any])
    
    inline def setReadUncommittedUndefined: Self = StObject.set(x, "readUncommitted", js.undefined)
    
    inline def setRebalanceTimeout(value: Double): Self = StObject.set(x, "rebalanceTimeout", value.asInstanceOf[js.Any])
    
    inline def setRebalanceTimeoutUndefined: Self = StObject.set(x, "rebalanceTimeout", js.undefined)
    
    inline def setRetry(value: RetryOptionsrestartOnFail): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    inline def setSessionTimeout(value: Double): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
    
    inline def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
  }
}

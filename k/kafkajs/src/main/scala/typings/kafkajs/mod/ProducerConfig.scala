package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProducerConfig extends StObject {
  
  var allowAutoTopicCreation: js.UndefOr[Boolean] = js.undefined
  
  var createPartitioner: js.UndefOr[ICustomPartitioner] = js.undefined
  
  var idempotent: js.UndefOr[Boolean] = js.undefined
  
  var maxInFlightRequests: js.UndefOr[Double] = js.undefined
  
  var metadataMaxAge: js.UndefOr[Double] = js.undefined
  
  var retry: js.UndefOr[RetryOptions] = js.undefined
  
  var transactionTimeout: js.UndefOr[Double] = js.undefined
  
  var transactionalId: js.UndefOr[String] = js.undefined
}
object ProducerConfig {
  
  inline def apply(): ProducerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProducerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProducerConfig] (val x: Self) extends AnyVal {
    
    inline def setAllowAutoTopicCreation(value: Boolean): Self = StObject.set(x, "allowAutoTopicCreation", value.asInstanceOf[js.Any])
    
    inline def setAllowAutoTopicCreationUndefined: Self = StObject.set(x, "allowAutoTopicCreation", js.undefined)
    
    inline def setCreatePartitioner(value: () => js.Function1[/* args */ PartitionerArgs, Double]): Self = StObject.set(x, "createPartitioner", js.Any.fromFunction0(value))
    
    inline def setCreatePartitionerUndefined: Self = StObject.set(x, "createPartitioner", js.undefined)
    
    inline def setIdempotent(value: Boolean): Self = StObject.set(x, "idempotent", value.asInstanceOf[js.Any])
    
    inline def setIdempotentUndefined: Self = StObject.set(x, "idempotent", js.undefined)
    
    inline def setMaxInFlightRequests(value: Double): Self = StObject.set(x, "maxInFlightRequests", value.asInstanceOf[js.Any])
    
    inline def setMaxInFlightRequestsUndefined: Self = StObject.set(x, "maxInFlightRequests", js.undefined)
    
    inline def setMetadataMaxAge(value: Double): Self = StObject.set(x, "metadataMaxAge", value.asInstanceOf[js.Any])
    
    inline def setMetadataMaxAgeUndefined: Self = StObject.set(x, "metadataMaxAge", js.undefined)
    
    inline def setRetry(value: RetryOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    inline def setTransactionTimeout(value: Double): Self = StObject.set(x, "transactionTimeout", value.asInstanceOf[js.Any])
    
    inline def setTransactionTimeoutUndefined: Self = StObject.set(x, "transactionTimeout", js.undefined)
    
    inline def setTransactionalId(value: String): Self = StObject.set(x, "transactionalId", value.asInstanceOf[js.Any])
    
    inline def setTransactionalIdUndefined: Self = StObject.set(x, "transactionalId", js.undefined)
  }
}

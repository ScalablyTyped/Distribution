package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumerRunConfig extends StObject {
  
  var autoCommit: js.UndefOr[Boolean] = js.undefined
  
  var autoCommitInterval: js.UndefOr[Double | Null] = js.undefined
  
  var autoCommitThreshold: js.UndefOr[Double | Null] = js.undefined
  
  var eachBatch: js.UndefOr[EachBatchHandler] = js.undefined
  
  var eachBatchAutoResolve: js.UndefOr[Boolean] = js.undefined
  
  var eachMessage: js.UndefOr[EachMessageHandler] = js.undefined
  
  var partitionsConsumedConcurrently: js.UndefOr[Double] = js.undefined
}
object ConsumerRunConfig {
  
  inline def apply(): ConsumerRunConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumerRunConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsumerRunConfig] (val x: Self) extends AnyVal {
    
    inline def setAutoCommit(value: Boolean): Self = StObject.set(x, "autoCommit", value.asInstanceOf[js.Any])
    
    inline def setAutoCommitInterval(value: Double): Self = StObject.set(x, "autoCommitInterval", value.asInstanceOf[js.Any])
    
    inline def setAutoCommitIntervalNull: Self = StObject.set(x, "autoCommitInterval", null)
    
    inline def setAutoCommitIntervalUndefined: Self = StObject.set(x, "autoCommitInterval", js.undefined)
    
    inline def setAutoCommitThreshold(value: Double): Self = StObject.set(x, "autoCommitThreshold", value.asInstanceOf[js.Any])
    
    inline def setAutoCommitThresholdNull: Self = StObject.set(x, "autoCommitThreshold", null)
    
    inline def setAutoCommitThresholdUndefined: Self = StObject.set(x, "autoCommitThreshold", js.undefined)
    
    inline def setAutoCommitUndefined: Self = StObject.set(x, "autoCommit", js.undefined)
    
    inline def setEachBatch(value: /* payload */ EachBatchPayload => js.Promise[Unit]): Self = StObject.set(x, "eachBatch", js.Any.fromFunction1(value))
    
    inline def setEachBatchAutoResolve(value: Boolean): Self = StObject.set(x, "eachBatchAutoResolve", value.asInstanceOf[js.Any])
    
    inline def setEachBatchAutoResolveUndefined: Self = StObject.set(x, "eachBatchAutoResolve", js.undefined)
    
    inline def setEachBatchUndefined: Self = StObject.set(x, "eachBatch", js.undefined)
    
    inline def setEachMessage(value: /* payload */ EachMessagePayload => js.Promise[Unit]): Self = StObject.set(x, "eachMessage", js.Any.fromFunction1(value))
    
    inline def setEachMessageUndefined: Self = StObject.set(x, "eachMessage", js.undefined)
    
    inline def setPartitionsConsumedConcurrently(value: Double): Self = StObject.set(x, "partitionsConsumedConcurrently", value.asInstanceOf[js.Any])
    
    inline def setPartitionsConsumedConcurrentlyUndefined: Self = StObject.set(x, "partitionsConsumedConcurrently", js.undefined)
  }
}

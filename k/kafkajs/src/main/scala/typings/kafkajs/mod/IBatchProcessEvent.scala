package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBatchProcessEvent extends StObject {
  
  var batchSize: Double
  
  var firstOffset: String
  
  var highWatermark: String
  
  var lastOffset: String
  
  var offsetLag: String
  
  var offsetLagLow: String
  
  var partition: Double
  
  var topic: String
}
object IBatchProcessEvent {
  
  inline def apply(
    batchSize: Double,
    firstOffset: String,
    highWatermark: String,
    lastOffset: String,
    offsetLag: String,
    offsetLagLow: String,
    partition: Double,
    topic: String
  ): IBatchProcessEvent = {
    val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any], firstOffset = firstOffset.asInstanceOf[js.Any], highWatermark = highWatermark.asInstanceOf[js.Any], lastOffset = lastOffset.asInstanceOf[js.Any], offsetLag = offsetLag.asInstanceOf[js.Any], offsetLagLow = offsetLagLow.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBatchProcessEvent]
  }
  
  extension [Self <: IBatchProcessEvent](x: Self) {
    
    inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setFirstOffset(value: String): Self = StObject.set(x, "firstOffset", value.asInstanceOf[js.Any])
    
    inline def setHighWatermark(value: String): Self = StObject.set(x, "highWatermark", value.asInstanceOf[js.Any])
    
    inline def setLastOffset(value: String): Self = StObject.set(x, "lastOffset", value.asInstanceOf[js.Any])
    
    inline def setOffsetLag(value: String): Self = StObject.set(x, "offsetLag", value.asInstanceOf[js.Any])
    
    inline def setOffsetLagLow(value: String): Self = StObject.set(x, "offsetLagLow", value.asInstanceOf[js.Any])
    
    inline def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}

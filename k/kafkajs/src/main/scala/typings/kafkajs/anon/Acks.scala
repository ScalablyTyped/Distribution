package typings.kafkajs.anon

import typings.kafkajs.mod.CompressionTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Acks extends StObject {
  
  var acks: js.UndefOr[Double] = js.undefined
  
  var compression: js.UndefOr[CompressionTypes] = js.undefined
  
  var producerEpoch: js.UndefOr[Double] = js.undefined
  
  var producerId: js.UndefOr[Double] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var topicData: js.Array[TopicString]
  
  var transactionalId: js.UndefOr[String] = js.undefined
}
object Acks {
  
  inline def apply(topicData: js.Array[TopicString]): Acks = {
    val __obj = js.Dynamic.literal(topicData = topicData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Acks] (val x: Self) extends AnyVal {
    
    inline def setAcks(value: Double): Self = StObject.set(x, "acks", value.asInstanceOf[js.Any])
    
    inline def setAcksUndefined: Self = StObject.set(x, "acks", js.undefined)
    
    inline def setCompression(value: CompressionTypes): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    inline def setProducerEpoch(value: Double): Self = StObject.set(x, "producerEpoch", value.asInstanceOf[js.Any])
    
    inline def setProducerEpochUndefined: Self = StObject.set(x, "producerEpoch", js.undefined)
    
    inline def setProducerId(value: Double): Self = StObject.set(x, "producerId", value.asInstanceOf[js.Any])
    
    inline def setProducerIdUndefined: Self = StObject.set(x, "producerId", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTopicData(value: js.Array[TopicString]): Self = StObject.set(x, "topicData", value.asInstanceOf[js.Any])
    
    inline def setTopicDataVarargs(value: TopicString*): Self = StObject.set(x, "topicData", js.Array(value*))
    
    inline def setTransactionalId(value: String): Self = StObject.set(x, "transactionalId", value.asInstanceOf[js.Any])
    
    inline def setTransactionalIdUndefined: Self = StObject.set(x, "transactionalId", js.undefined)
  }
}

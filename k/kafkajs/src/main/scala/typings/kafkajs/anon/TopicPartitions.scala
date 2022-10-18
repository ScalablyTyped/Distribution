package typings.kafkajs.anon

import typings.kafkajs.mod.ITopicPartitionConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicPartitions extends StObject {
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var topicPartitions: js.Array[ITopicPartitionConfig]
  
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object TopicPartitions {
  
  inline def apply(topicPartitions: js.Array[ITopicPartitionConfig]): TopicPartitions = {
    val __obj = js.Dynamic.literal(topicPartitions = topicPartitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicPartitions]
  }
  
  extension [Self <: TopicPartitions](x: Self) {
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTopicPartitions(value: js.Array[ITopicPartitionConfig]): Self = StObject.set(x, "topicPartitions", value.asInstanceOf[js.Any])
    
    inline def setTopicPartitionsVarargs(value: ITopicPartitionConfig*): Self = StObject.set(x, "topicPartitions", js.Array(value*))
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}

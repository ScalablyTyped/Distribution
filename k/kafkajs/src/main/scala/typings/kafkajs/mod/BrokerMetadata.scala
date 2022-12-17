package typings.kafkajs.mod

import typings.kafkajs.anon.Rack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrokerMetadata extends StObject {
  
  var brokers: js.Array[Rack]
  
  var topicMetadata: js.Array[typings.kafkajs.anon.PartitionMetadata]
}
object BrokerMetadata {
  
  inline def apply(brokers: js.Array[Rack], topicMetadata: js.Array[typings.kafkajs.anon.PartitionMetadata]): BrokerMetadata = {
    val __obj = js.Dynamic.literal(brokers = brokers.asInstanceOf[js.Any], topicMetadata = topicMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerMetadata]
  }
  
  extension [Self <: BrokerMetadata](x: Self) {
    
    inline def setBrokers(value: js.Array[Rack]): Self = StObject.set(x, "brokers", value.asInstanceOf[js.Any])
    
    inline def setBrokersVarargs(value: Rack*): Self = StObject.set(x, "brokers", js.Array(value*))
    
    inline def setTopicMetadata(value: js.Array[typings.kafkajs.anon.PartitionMetadata]): Self = StObject.set(x, "topicMetadata", value.asInstanceOf[js.Any])
    
    inline def setTopicMetadataVarargs(value: typings.kafkajs.anon.PartitionMetadata*): Self = StObject.set(x, "topicMetadata", js.Array(value*))
  }
}

package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTopicPartitions extends StObject {
  
  /**
    * The number of partitions in the topic.
    */
  var partitionCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaTopicPartitions {
  
  inline def apply(): SchemaTopicPartitions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTopicPartitions]
  }
  
  extension [Self <: SchemaTopicPartitions](x: Self) {
    
    inline def setPartitionCount(value: String): Self = StObject.set(x, "partitionCount", value.asInstanceOf[js.Any])
    
    inline def setPartitionCountNull: Self = StObject.set(x, "partitionCount", null)
    
    inline def setPartitionCountUndefined: Self = StObject.set(x, "partitionCount", js.undefined)
  }
}

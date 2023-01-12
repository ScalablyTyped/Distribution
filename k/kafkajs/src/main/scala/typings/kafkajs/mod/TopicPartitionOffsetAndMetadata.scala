package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicPartitionOffsetAndMetadata
  extends StObject
     with TopicPartitionOffset {
  
  var metadata: js.UndefOr[String | Null] = js.undefined
}
object TopicPartitionOffsetAndMetadata {
  
  inline def apply(offset: String, partition: Double, topic: String): TopicPartitionOffsetAndMetadata = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicPartitionOffsetAndMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicPartitionOffsetAndMetadata] (val x: Self) extends AnyVal {
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}

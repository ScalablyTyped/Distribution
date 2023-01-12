package typings.kafkaNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetCommitRequest extends StObject {
  
  var metadata: js.UndefOr[String] = js.undefined
  
  var offset: Double
  
  var partition: js.UndefOr[Double] = js.undefined
  
  var topic: String
}
object OffsetCommitRequest {
  
  inline def apply(offset: Double, topic: String): OffsetCommitRequest = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetCommitRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OffsetCommitRequest] (val x: Self) extends AnyVal {
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}

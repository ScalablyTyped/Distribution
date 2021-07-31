package typings.kafkaNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetFetchRequest extends StObject {
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var partition: js.UndefOr[Double] = js.undefined
  
  var topic: String
}
object OffsetFetchRequest {
  
  @scala.inline
  def apply(topic: String): OffsetFetchRequest = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetFetchRequest]
  }
  
  @scala.inline
  implicit class OffsetFetchRequestMutableBuilder[Self <: OffsetFetchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}

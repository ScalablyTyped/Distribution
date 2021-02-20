package typings.kafkaNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OffsetRequest extends StObject {
  
  var maxNum: js.UndefOr[Double] = js.native
  
  var partition: js.UndefOr[Double] = js.native
  
  var time: js.UndefOr[Double] = js.native
  
  var topic: String = js.native
}
object OffsetRequest {
  
  @scala.inline
  def apply(topic: String): OffsetRequest = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetRequest]
  }
  
  @scala.inline
  implicit class OffsetRequestMutableBuilder[Self <: OffsetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxNum(value: Double): Self = StObject.set(x, "maxNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNumUndefined: Self = StObject.set(x, "maxNum", js.undefined)
    
    @scala.inline
    def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}

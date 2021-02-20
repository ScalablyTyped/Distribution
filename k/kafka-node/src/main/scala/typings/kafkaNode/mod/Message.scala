package typings.kafkaNode.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends StObject {
  
  var highWaterOffset: js.UndefOr[Double] = js.native
  
  var key: js.UndefOr[String | Buffer] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var partition: js.UndefOr[Double] = js.native
  
  var topic: String = js.native
  
  var value: String | Buffer = js.native
}
object Message {
  
  @scala.inline
  def apply(topic: String, value: String | Buffer): Message = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighWaterOffset(value: Double): Self = StObject.set(x, "highWaterOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighWaterOffsetUndefined: Self = StObject.set(x, "highWaterOffset", js.undefined)
    
    @scala.inline
    def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
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
    
    @scala.inline
    def setValue(value: String | Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

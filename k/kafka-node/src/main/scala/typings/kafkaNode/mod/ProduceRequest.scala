package typings.kafkaNode.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProduceRequest extends StObject {
  
  var attributes: js.UndefOr[Double] = js.native
  
  // string[] | Array<KeyedMessage> | string | KeyedMessage
  var key: js.UndefOr[String | Buffer] = js.native
  
  var messages: js.Any = js.native
  
  var partition: js.UndefOr[Double] = js.native
  
  var topic: String = js.native
}
object ProduceRequest {
  
  @scala.inline
  def apply(messages: js.Any, topic: String): ProduceRequest = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProduceRequest]
  }
  
  @scala.inline
  implicit class ProduceRequestMutableBuilder[Self <: ProduceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: Double): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMessages(value: js.Any): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}

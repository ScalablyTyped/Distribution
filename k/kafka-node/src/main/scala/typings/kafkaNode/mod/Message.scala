package typings.kafkaNode.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends js.Object {
  
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
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String | Buffer): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighWaterOffset(value: Double): Self = this.set("highWaterOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighWaterOffset: Self = this.set("highWaterOffset", js.undefined)
    
    @scala.inline
    def setKey(value: String | Buffer): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPartition(value: Double): Self = this.set("partition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartition: Self = this.set("partition", js.undefined)
  }
}

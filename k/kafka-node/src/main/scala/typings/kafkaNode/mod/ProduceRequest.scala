package typings.kafkaNode.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProduceRequest extends js.Object {
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
  implicit class ProduceRequestOps[Self <: ProduceRequest] (val x: Self) extends AnyVal {
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
    def setMessages(value: js.Any): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributes(value: Double): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setKey(value: String | Buffer): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setPartition(value: Double): Self = this.set("partition", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartition: Self = this.set("partition", js.undefined)
  }
  
}


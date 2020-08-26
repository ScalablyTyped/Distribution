package typings.kafkaNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OffsetRequest extends js.Object {
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
  implicit class OffsetRequestOps[Self <: OffsetRequest] (val x: Self) extends AnyVal {
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
    def setMaxNum(value: Double): Self = this.set("maxNum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxNum: Self = this.set("maxNum", js.undefined)
    @scala.inline
    def setPartition(value: Double): Self = this.set("partition", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartition: Self = this.set("partition", js.undefined)
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
  
}


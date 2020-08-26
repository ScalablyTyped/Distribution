package typings.loopback.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchFeedback extends js.Object {
  var batchFeedback: Boolean = js.native
  var gateway: String = js.native
  var interval: Double = js.native
  var port: Double = js.native
}

object BatchFeedback {
  @scala.inline
  def apply(batchFeedback: Boolean, gateway: String, interval: Double, port: Double): BatchFeedback = {
    val __obj = js.Dynamic.literal(batchFeedback = batchFeedback.asInstanceOf[js.Any], gateway = gateway.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchFeedback]
  }
  @scala.inline
  implicit class BatchFeedbackOps[Self <: BatchFeedback] (val x: Self) extends AnyVal {
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
    def setBatchFeedback(value: Boolean): Self = this.set("batchFeedback", value.asInstanceOf[js.Any])
    @scala.inline
    def setGateway(value: String): Self = this.set("gateway", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
  }
  
}


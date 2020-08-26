package typings.mangopay2NodejsSdk.mod.refund

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefundReason extends js.Object {
  var RefundReasonType: typings.mangopay2NodejsSdk.mod.refund.RefundReasonType = js.native
}

object RefundReason {
  @scala.inline
  def apply(RefundReasonType: RefundReasonType): RefundReason = {
    val __obj = js.Dynamic.literal(RefundReasonType = RefundReasonType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefundReason]
  }
  @scala.inline
  implicit class RefundReasonOps[Self <: RefundReason] (val x: Self) extends AnyVal {
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
    def setRefundReasonType(value: RefundReasonType): Self = this.set("RefundReasonType", value.asInstanceOf[js.Any])
  }
  
}


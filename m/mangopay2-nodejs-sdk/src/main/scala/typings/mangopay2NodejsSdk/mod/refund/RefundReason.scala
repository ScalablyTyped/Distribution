package typings.mangopay2NodejsSdk.mod.refund

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefundReason extends js.Object {
  var RefundReasonType: typings.mangopay2NodejsSdk.mod.refund.RefundReasonType
}

object RefundReason {
  @scala.inline
  def apply(RefundReasonType: RefundReasonType): RefundReason = {
    val __obj = js.Dynamic.literal(RefundReasonType = RefundReasonType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RefundReason]
  }
}


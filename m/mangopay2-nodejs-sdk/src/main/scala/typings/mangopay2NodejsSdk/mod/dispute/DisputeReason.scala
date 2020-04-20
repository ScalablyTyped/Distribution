package typings.mangopay2NodejsSdk.mod.dispute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisputeReason extends js.Object {
  var DisputeReasonMessage: String
  var DisputeReasonType: typings.mangopay2NodejsSdk.mod.dispute.DisputeReasonType
}

object DisputeReason {
  @scala.inline
  def apply(DisputeReasonMessage: String, DisputeReasonType: DisputeReasonType): DisputeReason = {
    val __obj = js.Dynamic.literal(DisputeReasonMessage = DisputeReasonMessage.asInstanceOf[js.Any], DisputeReasonType = DisputeReasonType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisputeReason]
  }
}


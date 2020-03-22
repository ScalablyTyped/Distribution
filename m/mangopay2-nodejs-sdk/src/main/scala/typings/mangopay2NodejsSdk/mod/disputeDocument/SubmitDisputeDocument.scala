package typings.mangopay2NodejsSdk.mod.disputeDocument

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATION_ASKED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubmitDisputeDocument extends js.Object {
  /**
    * The status of this KYC/Dispute document
    */
  var Status: VALIDATION_ASKED
  var Tag: js.UndefOr[String] = js.undefined
}

object SubmitDisputeDocument {
  @scala.inline
  def apply(Status: VALIDATION_ASKED, Tag: String = null): SubmitDisputeDocument = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitDisputeDocument]
  }
}


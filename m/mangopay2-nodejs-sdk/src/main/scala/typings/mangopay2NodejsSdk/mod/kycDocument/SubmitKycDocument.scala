package typings.mangopay2NodejsSdk.mod.kycDocument

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATION_ASKED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubmitKycDocument extends js.Object {
  /**
    * The status of this KYC/Dispute document
    */
  var Status: VALIDATION_ASKED
  var Tag: js.UndefOr[String] = js.undefined
}

object SubmitKycDocument {
  @scala.inline
  def apply(Status: VALIDATION_ASKED, Tag: String = null): SubmitKycDocument = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitKycDocument]
  }
}


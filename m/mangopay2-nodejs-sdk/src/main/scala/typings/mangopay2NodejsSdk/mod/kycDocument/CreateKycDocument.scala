package typings.mangopay2NodejsSdk.mod.kycDocument

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateKycDocument extends js.Object {
  var Tag: js.UndefOr[String] = js.undefined
  /**
    * Gives the type of the KYC document
    */
  var Type: KycDocumentType
}

object CreateKycDocument {
  @scala.inline
  def apply(Type: KycDocumentType, Tag: String = null): CreateKycDocument = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKycDocument]
  }
}


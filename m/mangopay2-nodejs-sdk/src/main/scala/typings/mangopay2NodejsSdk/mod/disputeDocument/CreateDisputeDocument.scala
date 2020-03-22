package typings.mangopay2NodejsSdk.mod.disputeDocument

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDisputeDocument extends js.Object {
  var Tag: js.UndefOr[String] = js.undefined
  /**
    * Gives the type of the KYC document
    */
  var Type: DisputeDocumentType
}

object CreateDisputeDocument {
  @scala.inline
  def apply(Type: DisputeDocumentType, Tag: String = null): CreateDisputeDocument = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDisputeDocument]
  }
}


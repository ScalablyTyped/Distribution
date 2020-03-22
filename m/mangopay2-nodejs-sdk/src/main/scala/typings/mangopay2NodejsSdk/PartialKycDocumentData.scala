package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.kycDocument.DocumentStatus
import typings.mangopay2NodejsSdk.mod.kycDocument.KYCDocumentRefusedReasonType
import typings.mangopay2NodejsSdk.mod.kycDocument.KycDocumentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.kycDocument.KycDocumentData> */
trait PartialKycDocumentData extends js.Object {
  var CreationDate: js.UndefOr[Double] = js.undefined
  var Id: js.UndefOr[String] = js.undefined
  var ProcessedDate: js.UndefOr[Timestamp] = js.undefined
  var RefusedReasonMessage: js.UndefOr[String] = js.undefined
  var RefusedReasonType: js.UndefOr[KYCDocumentRefusedReasonType] = js.undefined
  var Status: js.UndefOr[DocumentStatus] = js.undefined
  var Tag: js.UndefOr[String] = js.undefined
  var Type: js.UndefOr[KycDocumentType] = js.undefined
  var UserId: js.UndefOr[String] = js.undefined
}

object PartialKycDocumentData {
  @scala.inline
  def apply(
    CreationDate: Int | Double = null,
    Id: String = null,
    ProcessedDate: Int | Double = null,
    RefusedReasonMessage: String = null,
    RefusedReasonType: KYCDocumentRefusedReasonType = null,
    Status: DocumentStatus = null,
    Tag: String = null,
    Type: KycDocumentType = null,
    UserId: String = null
  ): PartialKycDocumentData = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (ProcessedDate != null) __obj.updateDynamic("ProcessedDate")(ProcessedDate.asInstanceOf[js.Any])
    if (RefusedReasonMessage != null) __obj.updateDynamic("RefusedReasonMessage")(RefusedReasonMessage.asInstanceOf[js.Any])
    if (RefusedReasonType != null) __obj.updateDynamic("RefusedReasonType")(RefusedReasonType.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (UserId != null) __obj.updateDynamic("UserId")(UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialKycDocumentData]
  }
}


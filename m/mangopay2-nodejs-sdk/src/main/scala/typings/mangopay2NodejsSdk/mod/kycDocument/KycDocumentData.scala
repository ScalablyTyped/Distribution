package typings.mangopay2NodejsSdk.mod.kycDocument

import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KycDocumentData extends EntityBaseData {
  /**
    * The date when the document was processed by MANGOPAY
    */
  var ProcessedDate: Timestamp
  /**
    * The message accompanying a refusal
    */
  var RefusedReasonMessage: String
  /**
    * The type of reason for refusal
    */
  var RefusedReasonType: KYCDocumentRefusedReasonType
  /**
    * The status of this KYC/Dispute document
    */
  var Status: DocumentStatus
  /**
    * Gives the type of the KYC document
    */
  var Type: KycDocumentType
  /**
    * The object owner's UserId
    */
  var UserId: String
}

object KycDocumentData {
  @scala.inline
  def apply(
    CreationDate: Double,
    Id: String,
    ProcessedDate: Timestamp,
    RefusedReasonMessage: String,
    RefusedReasonType: KYCDocumentRefusedReasonType,
    Status: DocumentStatus,
    Tag: String,
    Type: KycDocumentType,
    UserId: String
  ): KycDocumentData = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], ProcessedDate = ProcessedDate.asInstanceOf[js.Any], RefusedReasonMessage = RefusedReasonMessage.asInstanceOf[js.Any], RefusedReasonType = RefusedReasonType.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[KycDocumentData]
  }
}


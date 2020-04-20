package typings.mangopay2NodejsSdk.mod.disputeDocument

import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisputeDocumentData extends EntityBaseData {
  /**
    * The Id of a Dispute
    */
  var DisputeId: String
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
  var RefusedReasonType: typings.mangopay2NodejsSdk.mod.disputeDocument.RefusedReasonType
  /**
    * The status of this KYC/Dispute document
    */
  var Status: DocumentStatus
  /**
    * Gives the type of the KYC document
    */
  var Type: DisputeDocumentType
  /**
    * The object owner's UserId
    */
  var UserId: String
}

object DisputeDocumentData {
  @scala.inline
  def apply(
    CreationDate: Double,
    DisputeId: String,
    Id: String,
    ProcessedDate: Timestamp,
    RefusedReasonMessage: String,
    RefusedReasonType: RefusedReasonType,
    Status: DocumentStatus,
    Tag: String,
    Type: DisputeDocumentType,
    UserId: String
  ): DisputeDocumentData = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], DisputeId = DisputeId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], ProcessedDate = ProcessedDate.asInstanceOf[js.Any], RefusedReasonMessage = RefusedReasonMessage.asInstanceOf[js.Any], RefusedReasonType = RefusedReasonType.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisputeDocumentData]
  }
}


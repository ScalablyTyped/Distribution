package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.disputeDocument.DisputeDocumentData
import typings.mangopay2NodejsSdk.mod.disputeDocument.DisputeDocumentType
import typings.mangopay2NodejsSdk.mod.disputeDocument.DocumentStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.DisputeDocument")
@js.native
class DisputeDocument ()
  extends Document
     with DisputeDocumentData {
  /* CompleteClass */
  override var CreationDate: Double = js.native
  /**
    * The Id of a Dispute
    */
  /* CompleteClass */
  override var DisputeId: String = js.native
  /* CompleteClass */
  override var Id: String = js.native
  /**
    * The date when the document was processed by MANGOPAY
    */
  /* CompleteClass */
  override var ProcessedDate: Timestamp = js.native
  /**
    * The message accompanying a refusal
    */
  /* CompleteClass */
  override var RefusedReasonMessage: String = js.native
  /**
    * The type of reason for refusal
    */
  /* CompleteClass */
  override var RefusedReasonType: typings.mangopay2NodejsSdk.mod.disputeDocument.RefusedReasonType = js.native
  /**
    * The status of this KYC/Dispute document
    */
  /* CompleteClass */
  override var Status: DocumentStatus = js.native
  /* CompleteClass */
  override var Tag: String = js.native
  /**
    * Gives the type of the KYC document
    */
  /* CompleteClass */
  override var Type: DisputeDocumentType = js.native
  /**
    * The object owner's UserId
    */
  /* CompleteClass */
  override var UserId: String = js.native
}


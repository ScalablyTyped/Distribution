package typings.mangopay2NodejsSdk.mod.disputeDocument

import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisputeDocumentData extends EntityBaseData {
  
  /**
    * The Id of a Dispute
    */
  var DisputeId: String = js.native
  
  /**
    * The date when the document was processed by MANGOPAY
    */
  var ProcessedDate: Timestamp = js.native
  
  /**
    * The message accompanying a refusal
    */
  var RefusedReasonMessage: String = js.native
  
  /**
    * The type of reason for refusal
    */
  var RefusedReasonType: typings.mangopay2NodejsSdk.mod.disputeDocument.RefusedReasonType = js.native
  
  /**
    * The status of this KYC/Dispute document
    */
  var Status: DocumentStatus = js.native
  
  /**
    * Gives the type of the KYC document
    */
  var Type: DisputeDocumentType = js.native
  
  /**
    * The object owner's UserId
    */
  var UserId: String = js.native
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
  
  @scala.inline
  implicit class DisputeDocumentDataOps[Self <: DisputeDocumentData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisputeId(value: String): Self = this.set("DisputeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessedDate(value: Timestamp): Self = this.set("ProcessedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefusedReasonMessage(value: String): Self = this.set("RefusedReasonMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefusedReasonType(value: RefusedReasonType): Self = this.set("RefusedReasonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: DocumentStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DisputeDocumentType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = this.set("UserId", value.asInstanceOf[js.Any])
  }
}

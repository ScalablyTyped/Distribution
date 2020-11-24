package typings.mangopay2NodejsSdk.mod.dispute

import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisputeData extends EntityBaseData {
  
  /**
    * The deadline by which you must contest the dispute (if you wish to contest it)
    */
  var ContestDeadlineDate: Timestamp = js.native
  
  /**
    * The amount you wish to contest
    */
  var ContestedFunds: MoneyData = js.native
  
  /**
    * Info about the reason for the dispute
    */
  var DisputeReason: typings.mangopay2NodejsSdk.mod.dispute.DisputeReason = js.native
  
  /**
    * The type of dispute
    */
  var DisputeType: typings.mangopay2NodejsSdk.mod.dispute.DisputeType = js.native
  
  /**
    * The amount of funds that were disputed
    */
  var DisputedFunds: MoneyData = js.native
  
  /**
    * The initial transaction ID
    */
  var InitialTransactionId: String = js.native
  
  /**
    * The initial transaction type
    */
  var InitialTransactionType: TransactionType = js.native
  
  /**
    * The ID of the associated repudiation transaction
    */
  var RepudiationId: String = js.native
  
  /**
    * The result code
    */
  var ResultCode: String = js.native
  
  /**
    * A verbal explanation of the ResultCode
    */
  var ResultMessage: String = js.native
  
  /**
    * The status of the dispute
    */
  var Status: DisputeStatus = js.native
  
  /**
    * Used to communicate information about the dispute status to you
    */
  var StatusMessage: String = js.native
}
object DisputeData {
  
  @scala.inline
  def apply(
    ContestDeadlineDate: Timestamp,
    ContestedFunds: MoneyData,
    CreationDate: Double,
    DisputeReason: DisputeReason,
    DisputeType: DisputeType,
    DisputedFunds: MoneyData,
    Id: String,
    InitialTransactionId: String,
    InitialTransactionType: TransactionType,
    RepudiationId: String,
    ResultCode: String,
    ResultMessage: String,
    Status: DisputeStatus,
    StatusMessage: String,
    Tag: String
  ): DisputeData = {
    val __obj = js.Dynamic.literal(ContestDeadlineDate = ContestDeadlineDate.asInstanceOf[js.Any], ContestedFunds = ContestedFunds.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], DisputeReason = DisputeReason.asInstanceOf[js.Any], DisputeType = DisputeType.asInstanceOf[js.Any], DisputedFunds = DisputedFunds.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InitialTransactionId = InitialTransactionId.asInstanceOf[js.Any], InitialTransactionType = InitialTransactionType.asInstanceOf[js.Any], RepudiationId = RepudiationId.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], StatusMessage = StatusMessage.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisputeData]
  }
  
  @scala.inline
  implicit class DisputeDataOps[Self <: DisputeData] (val x: Self) extends AnyVal {
    
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
    def setContestDeadlineDate(value: Timestamp): Self = this.set("ContestDeadlineDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContestedFunds(value: MoneyData): Self = this.set("ContestedFunds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisputeReason(value: DisputeReason): Self = this.set("DisputeReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisputeType(value: DisputeType): Self = this.set("DisputeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisputedFunds(value: MoneyData): Self = this.set("DisputedFunds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialTransactionId(value: String): Self = this.set("InitialTransactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialTransactionType(value: TransactionType): Self = this.set("InitialTransactionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepudiationId(value: String): Self = this.set("RepudiationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultCode(value: String): Self = this.set("ResultCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultMessage(value: String): Self = this.set("ResultMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: DisputeStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
  }
}

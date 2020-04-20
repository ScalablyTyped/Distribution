package typings.mangopay2NodejsSdk.mod.dispute

import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisputeData extends EntityBaseData {
  /**
    * The deadline by which you must contest the dispute (if you wish to contest it)
    */
  var ContestDeadlineDate: Timestamp
  /**
    * The amount you wish to contest
    */
  var ContestedFunds: MoneyData
  /**
    * Info about the reason for the dispute
    */
  var DisputeReason: typings.mangopay2NodejsSdk.mod.dispute.DisputeReason
  /**
    * The type of dispute
    */
  var DisputeType: typings.mangopay2NodejsSdk.mod.dispute.DisputeType
  /**
    * The amount of funds that were disputed
    */
  var DisputedFunds: MoneyData
  /**
    * The initial transaction ID
    */
  var InitialTransactionId: String
  /**
    * The initial transaction type
    */
  var InitialTransactionType: TransactionType
  /**
    * The ID of the associated repudiation transaction
    */
  var RepudiationId: String
  /**
    * The result code
    */
  var ResultCode: String
  /**
    * A verbal explanation of the ResultCode
    */
  var ResultMessage: String
  /**
    * The status of the dispute
    */
  var Status: DisputeStatus
  /**
    * Used to communicate information about the dispute status to you
    */
  var StatusMessage: String
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
}


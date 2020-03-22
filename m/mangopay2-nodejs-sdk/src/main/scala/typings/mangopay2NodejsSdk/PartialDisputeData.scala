package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.dispute.DisputeReason
import typings.mangopay2NodejsSdk.mod.dispute.DisputeStatus
import typings.mangopay2NodejsSdk.mod.dispute.DisputeType
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.dispute.DisputeData> */
trait PartialDisputeData extends js.Object {
  var ContestDeadlineDate: js.UndefOr[Timestamp] = js.undefined
  var ContestedFunds: js.UndefOr[MoneyData] = js.undefined
  var CreationDate: js.UndefOr[Double] = js.undefined
  var DisputeReason: js.UndefOr[typings.mangopay2NodejsSdk.mod.dispute.DisputeReason] = js.undefined
  var DisputeType: js.UndefOr[typings.mangopay2NodejsSdk.mod.dispute.DisputeType] = js.undefined
  var DisputedFunds: js.UndefOr[MoneyData] = js.undefined
  var Id: js.UndefOr[String] = js.undefined
  var InitialTransactionId: js.UndefOr[String] = js.undefined
  var InitialTransactionType: js.UndefOr[TransactionType] = js.undefined
  var RepudiationId: js.UndefOr[String] = js.undefined
  var ResultCode: js.UndefOr[String] = js.undefined
  var ResultMessage: js.UndefOr[String] = js.undefined
  var Status: js.UndefOr[DisputeStatus] = js.undefined
  var StatusMessage: js.UndefOr[String] = js.undefined
  var Tag: js.UndefOr[String] = js.undefined
}

object PartialDisputeData {
  @scala.inline
  def apply(
    ContestDeadlineDate: Int | Double = null,
    ContestedFunds: MoneyData = null,
    CreationDate: Int | Double = null,
    DisputeReason: DisputeReason = null,
    DisputeType: DisputeType = null,
    DisputedFunds: MoneyData = null,
    Id: String = null,
    InitialTransactionId: String = null,
    InitialTransactionType: TransactionType = null,
    RepudiationId: String = null,
    ResultCode: String = null,
    ResultMessage: String = null,
    Status: DisputeStatus = null,
    StatusMessage: String = null,
    Tag: String = null
  ): PartialDisputeData = {
    val __obj = js.Dynamic.literal()
    if (ContestDeadlineDate != null) __obj.updateDynamic("ContestDeadlineDate")(ContestDeadlineDate.asInstanceOf[js.Any])
    if (ContestedFunds != null) __obj.updateDynamic("ContestedFunds")(ContestedFunds.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (DisputeReason != null) __obj.updateDynamic("DisputeReason")(DisputeReason.asInstanceOf[js.Any])
    if (DisputeType != null) __obj.updateDynamic("DisputeType")(DisputeType.asInstanceOf[js.Any])
    if (DisputedFunds != null) __obj.updateDynamic("DisputedFunds")(DisputedFunds.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (InitialTransactionId != null) __obj.updateDynamic("InitialTransactionId")(InitialTransactionId.asInstanceOf[js.Any])
    if (InitialTransactionType != null) __obj.updateDynamic("InitialTransactionType")(InitialTransactionType.asInstanceOf[js.Any])
    if (RepudiationId != null) __obj.updateDynamic("RepudiationId")(RepudiationId.asInstanceOf[js.Any])
    if (ResultCode != null) __obj.updateDynamic("ResultCode")(ResultCode.asInstanceOf[js.Any])
    if (ResultMessage != null) __obj.updateDynamic("ResultMessage")(ResultMessage.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDisputeData]
  }
}


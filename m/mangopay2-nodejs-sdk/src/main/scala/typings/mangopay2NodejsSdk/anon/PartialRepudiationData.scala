package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REPUDIATION
import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.refund.RefundReason
import typings.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.repudiation.RepudiationData> */
trait PartialRepudiationData extends js.Object {
  var AuthorId: js.UndefOr[String] = js.undefined
  var CreationDate: js.UndefOr[Double] = js.undefined
  var CreditedFunds: js.UndefOr[MoneyData] = js.undefined
  var CreditedUserId: js.UndefOr[String] = js.undefined
  var CreditedWalletId: js.UndefOr[String] = js.undefined
  var DebitedFunds: js.UndefOr[MoneyData] = js.undefined
  var DebitedWalletId: js.UndefOr[String] = js.undefined
  var ExecutionDate: js.UndefOr[Timestamp] = js.undefined
  var Fees: js.UndefOr[MoneyData] = js.undefined
  var Id: js.UndefOr[String] = js.undefined
  var InitialTransactionId: js.UndefOr[String] = js.undefined
  var InitialTransactionType: js.UndefOr[TransactionType] = js.undefined
  var Nature: js.UndefOr[REPUDIATION] = js.undefined
  var RefundReason: js.UndefOr[typings.mangopay2NodejsSdk.mod.refund.RefundReason] = js.undefined
  var ResultCode: js.UndefOr[String] = js.undefined
  var ResultMessage: js.UndefOr[String] = js.undefined
  var Status: js.UndefOr[TransactionStatus] = js.undefined
  var Tag: js.UndefOr[String] = js.undefined
  var Type: js.UndefOr[TransactionType] = js.undefined
}

object PartialRepudiationData {
  @scala.inline
  def apply(
    AuthorId: String = null,
    CreationDate: js.UndefOr[Double] = js.undefined,
    CreditedFunds: MoneyData = null,
    CreditedUserId: String = null,
    CreditedWalletId: String = null,
    DebitedFunds: MoneyData = null,
    DebitedWalletId: String = null,
    ExecutionDate: js.UndefOr[Timestamp] = js.undefined,
    Fees: MoneyData = null,
    Id: String = null,
    InitialTransactionId: String = null,
    InitialTransactionType: TransactionType = null,
    Nature: REPUDIATION = null,
    RefundReason: RefundReason = null,
    ResultCode: String = null,
    ResultMessage: String = null,
    Status: TransactionStatus = null,
    Tag: String = null,
    Type: TransactionType = null
  ): PartialRepudiationData = {
    val __obj = js.Dynamic.literal()
    if (AuthorId != null) __obj.updateDynamic("AuthorId")(AuthorId.asInstanceOf[js.Any])
    if (!js.isUndefined(CreationDate)) __obj.updateDynamic("CreationDate")(CreationDate.get.asInstanceOf[js.Any])
    if (CreditedFunds != null) __obj.updateDynamic("CreditedFunds")(CreditedFunds.asInstanceOf[js.Any])
    if (CreditedUserId != null) __obj.updateDynamic("CreditedUserId")(CreditedUserId.asInstanceOf[js.Any])
    if (CreditedWalletId != null) __obj.updateDynamic("CreditedWalletId")(CreditedWalletId.asInstanceOf[js.Any])
    if (DebitedFunds != null) __obj.updateDynamic("DebitedFunds")(DebitedFunds.asInstanceOf[js.Any])
    if (DebitedWalletId != null) __obj.updateDynamic("DebitedWalletId")(DebitedWalletId.asInstanceOf[js.Any])
    if (!js.isUndefined(ExecutionDate)) __obj.updateDynamic("ExecutionDate")(ExecutionDate.get.asInstanceOf[js.Any])
    if (Fees != null) __obj.updateDynamic("Fees")(Fees.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (InitialTransactionId != null) __obj.updateDynamic("InitialTransactionId")(InitialTransactionId.asInstanceOf[js.Any])
    if (InitialTransactionType != null) __obj.updateDynamic("InitialTransactionType")(InitialTransactionType.asInstanceOf[js.Any])
    if (Nature != null) __obj.updateDynamic("Nature")(Nature.asInstanceOf[js.Any])
    if (RefundReason != null) __obj.updateDynamic("RefundReason")(RefundReason.asInstanceOf[js.Any])
    if (ResultCode != null) __obj.updateDynamic("ResultCode")(ResultCode.asInstanceOf[js.Any])
    if (ResultMessage != null) __obj.updateDynamic("ResultMessage")(ResultMessage.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRepudiationData]
  }
}


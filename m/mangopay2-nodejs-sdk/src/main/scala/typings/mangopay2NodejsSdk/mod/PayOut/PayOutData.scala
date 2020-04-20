package typings.mangopay2NodejsSdk.mod.PayOut

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT
import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.Omit<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.transfer.TransferData, 'Type'> */
trait PayOutData extends js.Object {
  var AuthorId: String
  /**
    * An ID of a Bank Account
    */
  var BankAccountId: String
  /**
    * A custom reference you wish to appear on the user’s bank statement (your Client Name is already shown). This reference can contain max 12 characters
    */
  var BankWireRef: String
  var CreationDate: Double
  var CreditedFunds: MoneyData
  var CreditedUserId: String
  var CreditedWalletId: String
  var DebitedFunds: MoneyData
  var DebitedWalletId: String
  var ExecutionDate: Timestamp
  var Fees: MoneyData
  var Id: String
  var Nature: TransactionNature
  var PaymentType: BANK_WIRE
  var ResultCode: String
  var ResultMessage: String
  var Status: TransactionStatus
  var Tag: String
  /**
    * The type of the transaction
    */
  var Type: PAYOUT
}

object PayOutData {
  @scala.inline
  def apply(
    AuthorId: String,
    BankAccountId: String,
    BankWireRef: String,
    CreationDate: Double,
    CreditedFunds: MoneyData,
    CreditedUserId: String,
    CreditedWalletId: String,
    DebitedFunds: MoneyData,
    DebitedWalletId: String,
    ExecutionDate: Timestamp,
    Fees: MoneyData,
    Id: String,
    Nature: TransactionNature,
    PaymentType: BANK_WIRE,
    ResultCode: String,
    ResultMessage: String,
    Status: TransactionStatus,
    Tag: String,
    Type: PAYOUT
  ): PayOutData = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], BankAccountId = BankAccountId.asInstanceOf[js.Any], BankWireRef = BankWireRef.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayOutData]
  }
}


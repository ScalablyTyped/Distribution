package typings.mangopay2NodejsSdk.mod.payIn

import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.mod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasePayInData extends EntityBaseData {
  /**
    * A user's ID
    */
  var AuthorId: String
  /**
    * Details about the funds that are being credited (DebitedFunds – Fees = CreditedFunds)
    */
  var CreditedFunds: MoneyData
  /**
    * The user ID who is credited (defaults to the owner of the wallet)
    */
  var CreditedUserId: String
  /**
    * The ID of the wallet where money will be credited
    */
  var CreditedWalletId: String
  /**
    * Information about the funds that are being debited
    */
  var DebitedFunds: MoneyData
  /**
    * The ID of the wallet that was debited
    */
  var DebitedWalletId: String
  /**
    * When the transaction happened
    */
  var ExecutionDate: Timestamp
  /**
    * The type of execution for the payin
    */
  var ExecutionType: PayInExecutionType
  /**
    * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
    */
  var Fees: MoneyData
  /**
    * The nature of the transaction
    */
  var Nature: TransactionNature
  /**
    * The type of payin
    */
  var PaymentType: PayInPaymentType
  /**
    * The result code
    */
  var ResultCode: String
  /**
    * A verbal explanation of the ResultCode
    */
  var ResultMessage: String
  /**
    * The status of the transaction
    */
  var Status: TransactionStatus
  /**
    * The type of the transaction
    */
  var Type: TransactionType
}

object BasePayInData {
  @scala.inline
  def apply(
    AuthorId: String,
    CreationDate: Double,
    CreditedFunds: MoneyData,
    CreditedUserId: String,
    CreditedWalletId: String,
    DebitedFunds: MoneyData,
    DebitedWalletId: String,
    ExecutionDate: Timestamp,
    ExecutionType: PayInExecutionType,
    Fees: MoneyData,
    Id: String,
    Nature: TransactionNature,
    PaymentType: PayInPaymentType,
    ResultCode: String,
    ResultMessage: String,
    Status: TransactionStatus,
    Tag: String,
    Type: TransactionType
  ): BasePayInData = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePayInData]
  }
}


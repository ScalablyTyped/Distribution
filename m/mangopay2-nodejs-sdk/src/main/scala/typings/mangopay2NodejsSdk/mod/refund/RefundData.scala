package typings.mangopay2NodejsSdk.mod.refund

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUND
import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.transaction.TransactionData
import typings.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefundData extends TransactionData {
  /**
    * The initial transaction ID
    */
  var InitialTransactionId: String
  /**
    * The initial transaction type
    */
  var InitialTransactionType: TransactionType
  /**
    * The nature of the transaction
    */
  @JSName("Nature")
  var Nature_RefundData: REFUND
  /**
    * Contains info about the reason for refund
    */
  var RefundReason: typings.mangopay2NodejsSdk.mod.refund.RefundReason
}

object RefundData {
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
    Fees: MoneyData,
    Id: String,
    InitialTransactionId: String,
    InitialTransactionType: TransactionType,
    Nature: REFUND,
    RefundReason: RefundReason,
    ResultCode: String,
    ResultMessage: String,
    Status: TransactionStatus,
    Tag: String,
    Type: TransactionType
  ): RefundData = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InitialTransactionId = InitialTransactionId.asInstanceOf[js.Any], InitialTransactionType = InitialTransactionType.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], RefundReason = RefundReason.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RefundData]
  }
}


package typings.mangopay2NodejsSdk.mod.transfer

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER
import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.mod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferData extends EntityBaseData {
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
    * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
    */
  var Fees: MoneyData
  /**
    * The nature of the transaction
    */
  var Nature: TransactionNature
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
  var Type: TRANSFER
}

object TransferData {
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
    Nature: TransactionNature,
    ResultCode: String,
    ResultMessage: String,
    Status: TransactionStatus,
    Tag: String,
    Type: TRANSFER
  ): TransferData = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransferData]
  }
}


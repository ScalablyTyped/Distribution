package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.PartialCreateTransfer
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSFER
import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.mod.transfer.TransferData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mangopay2-nodejs-sdk", "models.Transfer")
@js.native
class Transfer protected ()
  extends EntityBase[TransferData]
     with TransferData {
  def this(data: PartialCreateTransfer) = this()
  /**
    * A user's ID
    */
  /* CompleteClass */
  override var AuthorId: String = js.native
  /* CompleteClass */
  override var CreationDate: Double = js.native
  /**
    * Details about the funds that are being credited (DebitedFunds – Fees = CreditedFunds)
    */
  /* CompleteClass */
  override var CreditedFunds: MoneyData = js.native
  /**
    * The user ID who is credited (defaults to the owner of the wallet)
    */
  /* CompleteClass */
  override var CreditedUserId: String = js.native
  /**
    * The ID of the wallet where money will be credited
    */
  /* CompleteClass */
  override var CreditedWalletId: String = js.native
  /**
    * Information about the funds that are being debited
    */
  /* CompleteClass */
  override var DebitedFunds: MoneyData = js.native
  /**
    * The ID of the wallet that was debited
    */
  /* CompleteClass */
  override var DebitedWalletId: String = js.native
  /**
    * When the transaction happened
    */
  /* CompleteClass */
  override var ExecutionDate: Timestamp = js.native
  /**
    * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
    */
  /* CompleteClass */
  override var Fees: MoneyData = js.native
  /* CompleteClass */
  override var Id: String = js.native
  /**
    * The nature of the transaction
    */
  /* CompleteClass */
  override var Nature: TransactionNature = js.native
  /**
    * The result code
    */
  /* CompleteClass */
  override var ResultCode: String = js.native
  /**
    * A verbal explanation of the ResultCode
    */
  /* CompleteClass */
  override var ResultMessage: String = js.native
  /**
    * The status of the transaction
    */
  /* CompleteClass */
  override var Status: TransactionStatus = js.native
  /* CompleteClass */
  override var Tag: String = js.native
  /**
    * The type of the transaction
    */
  /* CompleteClass */
  override var Type: TRANSFER = js.native
}


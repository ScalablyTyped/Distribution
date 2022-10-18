package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.anon.PartialRepudiationData
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REPUDIATION
import typings.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import typings.mangopay2NodejsSdk.typingsModelsRepudiationMod.repudiation.RepudiationData
import typings.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionType
import typings.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.Repudiation")
@js.native
open class Repudiation protected ()
  extends EntityBase[RepudiationData]
     with RepudiationData {
  def this(data: PartialRepudiationData) = this()
  
  /**
    * A user's ID
    */
  /* CompleteClass */
  var AuthorId: String = js.native
  
  /* CompleteClass */
  var CreationDate: Double = js.native
  
  /**
    * Details about the funds that are being credited (DebitedFunds – Fees = CreditedFunds)
    */
  /* CompleteClass */
  var CreditedFunds: MoneyData = js.native
  
  /**
    * The user ID who is credited (defaults to the owner of the wallet)
    */
  /* CompleteClass */
  var CreditedUserId: String = js.native
  
  /**
    * The ID of the wallet where money will be credited
    */
  /* CompleteClass */
  var CreditedWalletId: String = js.native
  
  /**
    * Information about the funds that are being debited
    */
  /* CompleteClass */
  var DebitedFunds: MoneyData = js.native
  
  /**
    * The ID of the wallet that was debited
    */
  /* CompleteClass */
  var DebitedWalletId: String = js.native
  
  /**
    * When the transaction happened
    */
  /* CompleteClass */
  var ExecutionDate: Timestamp = js.native
  
  /**
    * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
    */
  /* CompleteClass */
  var Fees: MoneyData = js.native
  
  /* CompleteClass */
  var Id: String = js.native
  
  /**
    * The initial transaction ID
    */
  /* CompleteClass */
  var InitialTransactionId: String = js.native
  
  /**
    * The initial transaction type
    */
  /* CompleteClass */
  var InitialTransactionType: TransactionType = js.native
  
  /**
    * The nature of the transaction
    */
  /* CompleteClass */
  var Nature: TransactionNature = js.native
  /**
    * The nature of the transaction
    */
  /* CompleteClass */
  @JSName("Nature")
  var Nature_RepudiationData: REPUDIATION = js.native
  
  /**
    * Contains info about the reason for refund
    */
  /* CompleteClass */
  var RefundReason: typings.mangopay2NodejsSdk.typingsModelsRefundMod.refund.RefundReason = js.native
  
  /**
    * The result code
    */
  /* CompleteClass */
  var ResultCode: String = js.native
  
  /**
    * A verbal explanation of the ResultCode
    */
  /* CompleteClass */
  var ResultMessage: String = js.native
  
  /**
    * The status of the transaction
    */
  /* CompleteClass */
  var Status: TransactionStatus = js.native
  
  /* CompleteClass */
  var Tag: String = js.native
  
  /**
    * The type of the transaction
    */
  /* CompleteClass */
  var Type: TransactionType = js.native
}

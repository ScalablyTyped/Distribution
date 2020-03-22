package typings.mangopay2NodejsSdk.mod.report

import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import typings.mangopay2NodejsSdk.typesMod.CurrencyISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filters extends js.Object {
  /**
    * To return only resources that have CreationDate AFTER this date
    */
  var AfterDate: Timestamp
  /**
    * A user's ID
    */
  var AuthorId: String
  /**
    * To return only resources that have CreationDate BEFORE this date
    */
  var BeforeDate: Timestamp
  /**
    * The maximum amount of DebitedFunds
    */
  var MaxDebitedFundsAmount: Double
  /**
    * The currency for the maximum amount of DebitedFunds
    */
  var MaxDebitedFundsCurrency: CurrencyISO
  /**
    * The maximum amount of Fees
    */
  var MaxFeesAmount: Double
  /**
    * The currency for the maximum amount of Fees
    */
  var MaxFeesCurrency: CurrencyISO
  /**
    * The minimum amount of DebitedFunds
    */
  var MinDebitedFundsAmount: Double
  /**
    * The currency for the minimum amount of DebitedFunds
    */
  var MinDebitedFundsCurrency: CurrencyISO
  /**
    * The minimum amount of Fees
    */
  var MinFeesAmount: Double
  /**
    * The currency for the minimum amount of Fees
    */
  var MinFeesCurrency: CurrencyISO
  /**
    * The nature of the transaction
    */
  var Nature: js.Array[TransactionNature]
  /**
    * The status of the transaction
    */
  var Status: js.Array[TransactionStatus]
  /**
    * The type of the transaction
    */
  var Type: js.Array[TransactionType]
  /**
    * The ID of a wallet
    */
  var WalletId: String
}

object Filters {
  @scala.inline
  def apply(
    AfterDate: Timestamp,
    AuthorId: String,
    BeforeDate: Timestamp,
    MaxDebitedFundsAmount: Double,
    MaxDebitedFundsCurrency: CurrencyISO,
    MaxFeesAmount: Double,
    MaxFeesCurrency: CurrencyISO,
    MinDebitedFundsAmount: Double,
    MinDebitedFundsCurrency: CurrencyISO,
    MinFeesAmount: Double,
    MinFeesCurrency: CurrencyISO,
    Nature: js.Array[TransactionNature],
    Status: js.Array[TransactionStatus],
    Type: js.Array[TransactionType],
    WalletId: String
  ): Filters = {
    val __obj = js.Dynamic.literal(AfterDate = AfterDate.asInstanceOf[js.Any], AuthorId = AuthorId.asInstanceOf[js.Any], BeforeDate = BeforeDate.asInstanceOf[js.Any], MaxDebitedFundsAmount = MaxDebitedFundsAmount.asInstanceOf[js.Any], MaxDebitedFundsCurrency = MaxDebitedFundsCurrency.asInstanceOf[js.Any], MaxFeesAmount = MaxFeesAmount.asInstanceOf[js.Any], MaxFeesCurrency = MaxFeesCurrency.asInstanceOf[js.Any], MinDebitedFundsAmount = MinDebitedFundsAmount.asInstanceOf[js.Any], MinDebitedFundsCurrency = MinDebitedFundsCurrency.asInstanceOf[js.Any], MinFeesAmount = MinFeesAmount.asInstanceOf[js.Any], MinFeesCurrency = MinFeesCurrency.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], WalletId = WalletId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Filters]
  }
}


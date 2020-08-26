package typings.mangopay2NodejsSdk.mod.report

import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import typings.mangopay2NodejsSdk.typesMod.CurrencyISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filters extends js.Object {
  /**
    * To return only resources that have CreationDate AFTER this date
    */
  var AfterDate: Timestamp = js.native
  /**
    * A user's ID
    */
  var AuthorId: String = js.native
  /**
    * To return only resources that have CreationDate BEFORE this date
    */
  var BeforeDate: Timestamp = js.native
  /**
    * The maximum amount of DebitedFunds
    */
  var MaxDebitedFundsAmount: Double = js.native
  /**
    * The currency for the maximum amount of DebitedFunds
    */
  var MaxDebitedFundsCurrency: CurrencyISO = js.native
  /**
    * The maximum amount of Fees
    */
  var MaxFeesAmount: Double = js.native
  /**
    * The currency for the maximum amount of Fees
    */
  var MaxFeesCurrency: CurrencyISO = js.native
  /**
    * The minimum amount of DebitedFunds
    */
  var MinDebitedFundsAmount: Double = js.native
  /**
    * The currency for the minimum amount of DebitedFunds
    */
  var MinDebitedFundsCurrency: CurrencyISO = js.native
  /**
    * The minimum amount of Fees
    */
  var MinFeesAmount: Double = js.native
  /**
    * The currency for the minimum amount of Fees
    */
  var MinFeesCurrency: CurrencyISO = js.native
  /**
    * The nature of the transaction
    */
  var Nature: js.Array[TransactionNature] = js.native
  /**
    * The status of the transaction
    */
  var Status: js.Array[TransactionStatus] = js.native
  /**
    * The type of the transaction
    */
  var Type: js.Array[TransactionType] = js.native
  /**
    * The ID of a wallet
    */
  var WalletId: String = js.native
}

object Filters {
  @scala.inline
  implicit class FiltersOps[Self <: Filters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAfterDate(value: Timestamp): Self = this.set("AfterDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthorId(value: String): Self = this.set("AuthorId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeforeDate(value: Timestamp): Self = this.set("BeforeDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxDebitedFundsAmount(value: Double): Self = this.set("MaxDebitedFundsAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxDebitedFundsCurrency(value: CurrencyISO): Self = this.set("MaxDebitedFundsCurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxFeesAmount(value: Double): Self = this.set("MaxFeesAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxFeesCurrency(value: CurrencyISO): Self = this.set("MaxFeesCurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinDebitedFundsAmount(value: Double): Self = this.set("MinDebitedFundsAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinDebitedFundsCurrency(value: CurrencyISO): Self = this.set("MinDebitedFundsCurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinFeesAmount(value: Double): Self = this.set("MinFeesAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinFeesCurrency(value: CurrencyISO): Self = this.set("MinFeesCurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def setNatureVarargs(value: TransactionNature*): Self = this.set("Nature", js.Array(value :_*))
    @scala.inline
    def setNature(value: js.Array[TransactionNature]): Self = this.set("Nature", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusVarargs(value: TransactionStatus*): Self = this.set("Status", js.Array(value :_*))
    @scala.inline
    def setStatus(value: js.Array[TransactionStatus]): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeVarargs(value: TransactionType*): Self = this.set("Type", js.Array(value :_*))
    @scala.inline
    def setType(value: js.Array[TransactionType]): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWalletId(value: String): Self = this.set("WalletId", value.asInstanceOf[js.Any])
  }
  
}


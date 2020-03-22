package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import typings.mangopay2NodejsSdk.typesMod.CurrencyISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.report.Filters> */
trait PartialFilters extends js.Object {
  var AfterDate: js.UndefOr[Timestamp] = js.undefined
  var AuthorId: js.UndefOr[String] = js.undefined
  var BeforeDate: js.UndefOr[Timestamp] = js.undefined
  var MaxDebitedFundsAmount: js.UndefOr[Double] = js.undefined
  var MaxDebitedFundsCurrency: js.UndefOr[CurrencyISO] = js.undefined
  var MaxFeesAmount: js.UndefOr[Double] = js.undefined
  var MaxFeesCurrency: js.UndefOr[CurrencyISO] = js.undefined
  var MinDebitedFundsAmount: js.UndefOr[Double] = js.undefined
  var MinDebitedFundsCurrency: js.UndefOr[CurrencyISO] = js.undefined
  var MinFeesAmount: js.UndefOr[Double] = js.undefined
  var MinFeesCurrency: js.UndefOr[CurrencyISO] = js.undefined
  var Nature: js.UndefOr[js.Array[TransactionNature]] = js.undefined
  var Status: js.UndefOr[js.Array[TransactionStatus]] = js.undefined
  var Type: js.UndefOr[js.Array[TransactionType]] = js.undefined
  var WalletId: js.UndefOr[String] = js.undefined
}

object PartialFilters {
  @scala.inline
  def apply(
    AfterDate: Int | Double = null,
    AuthorId: String = null,
    BeforeDate: Int | Double = null,
    MaxDebitedFundsAmount: Int | Double = null,
    MaxDebitedFundsCurrency: CurrencyISO = null,
    MaxFeesAmount: Int | Double = null,
    MaxFeesCurrency: CurrencyISO = null,
    MinDebitedFundsAmount: Int | Double = null,
    MinDebitedFundsCurrency: CurrencyISO = null,
    MinFeesAmount: Int | Double = null,
    MinFeesCurrency: CurrencyISO = null,
    Nature: js.Array[TransactionNature] = null,
    Status: js.Array[TransactionStatus] = null,
    Type: js.Array[TransactionType] = null,
    WalletId: String = null
  ): PartialFilters = {
    val __obj = js.Dynamic.literal()
    if (AfterDate != null) __obj.updateDynamic("AfterDate")(AfterDate.asInstanceOf[js.Any])
    if (AuthorId != null) __obj.updateDynamic("AuthorId")(AuthorId.asInstanceOf[js.Any])
    if (BeforeDate != null) __obj.updateDynamic("BeforeDate")(BeforeDate.asInstanceOf[js.Any])
    if (MaxDebitedFundsAmount != null) __obj.updateDynamic("MaxDebitedFundsAmount")(MaxDebitedFundsAmount.asInstanceOf[js.Any])
    if (MaxDebitedFundsCurrency != null) __obj.updateDynamic("MaxDebitedFundsCurrency")(MaxDebitedFundsCurrency.asInstanceOf[js.Any])
    if (MaxFeesAmount != null) __obj.updateDynamic("MaxFeesAmount")(MaxFeesAmount.asInstanceOf[js.Any])
    if (MaxFeesCurrency != null) __obj.updateDynamic("MaxFeesCurrency")(MaxFeesCurrency.asInstanceOf[js.Any])
    if (MinDebitedFundsAmount != null) __obj.updateDynamic("MinDebitedFundsAmount")(MinDebitedFundsAmount.asInstanceOf[js.Any])
    if (MinDebitedFundsCurrency != null) __obj.updateDynamic("MinDebitedFundsCurrency")(MinDebitedFundsCurrency.asInstanceOf[js.Any])
    if (MinFeesAmount != null) __obj.updateDynamic("MinFeesAmount")(MinFeesAmount.asInstanceOf[js.Any])
    if (MinFeesCurrency != null) __obj.updateDynamic("MinFeesCurrency")(MinFeesCurrency.asInstanceOf[js.Any])
    if (Nature != null) __obj.updateDynamic("Nature")(Nature.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (WalletId != null) __obj.updateDynamic("WalletId")(WalletId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialFilters]
  }
}


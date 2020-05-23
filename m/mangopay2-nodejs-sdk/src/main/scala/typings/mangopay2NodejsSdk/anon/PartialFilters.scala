package typings.mangopay2NodejsSdk.anon

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


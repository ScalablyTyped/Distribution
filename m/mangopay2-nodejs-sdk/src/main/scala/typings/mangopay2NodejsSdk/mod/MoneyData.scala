package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.typesMod.CurrencyISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoneyData extends js.Object {
  /**
    * An amount of money in the smallest sub-division of the currency, e.g. 12.60 EUR would be represented as 1260 whereas 12 JPY would be represented as just 12)
    */
  var Amount: Double
  /**
    * The currency - should be ISO_4217 format
    */
  var Currency: CurrencyISO
}

object MoneyData {
  @scala.inline
  def apply(Amount: Double, Currency: CurrencyISO): MoneyData = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], Currency = Currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoneyData]
  }
}


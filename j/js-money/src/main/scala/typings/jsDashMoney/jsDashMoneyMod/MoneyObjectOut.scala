package typings.jsDashMoney.jsDashMoneyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoneyObjectOut extends js.Object {
  var amount: Double
  var currency: String
}

object MoneyObjectOut {
  @scala.inline
  def apply(amount: Double, currency: String): MoneyObjectOut = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MoneyObjectOut]
  }
}


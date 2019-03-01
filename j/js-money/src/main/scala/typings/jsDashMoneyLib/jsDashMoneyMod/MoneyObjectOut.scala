package typings
package jsDashMoneyLib.jsDashMoneyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoneyObjectOut extends js.Object {
  var amount: scala.Double
  var currency: java.lang.String
}

object MoneyObjectOut {
  @scala.inline
  def apply(amount: scala.Double, currency: java.lang.String): MoneyObjectOut = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("amount")(amount)
    __obj.updateDynamic("currency")(currency)
    __obj.asInstanceOf[MoneyObjectOut]
  }
}


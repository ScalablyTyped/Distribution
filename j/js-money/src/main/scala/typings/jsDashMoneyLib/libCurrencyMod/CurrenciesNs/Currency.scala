package typings
package jsDashMoneyLib.libCurrencyMod.CurrenciesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Currency extends js.Object {
  var code: java.lang.String
  var decimal_digits: scala.Double
  var name: java.lang.String
  var name_plural: java.lang.String
  var rounding: scala.Double
  var symbol: java.lang.String
  var symbol_native: java.lang.String
}

object Currency {
  @scala.inline
  def apply(
    code: java.lang.String,
    decimal_digits: scala.Double,
    name: java.lang.String,
    name_plural: java.lang.String,
    rounding: scala.Double,
    symbol: java.lang.String,
    symbol_native: java.lang.String
  ): Currency = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("decimal_digits")(decimal_digits)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("name_plural")(name_plural)
    __obj.updateDynamic("rounding")(rounding)
    __obj.updateDynamic("symbol")(symbol)
    __obj.updateDynamic("symbol_native")(symbol_native)
    __obj.asInstanceOf[Currency]
  }
}


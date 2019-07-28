package typings.jsDashMoney.libCurrencyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Currency extends js.Object {
  var code: String
  var decimal_digits: Double
  var name: String
  var name_plural: String
  var rounding: Double
  var symbol: String
  var symbol_native: String
}

object Currency {
  @scala.inline
  def apply(
    code: String,
    decimal_digits: Double,
    name: String,
    name_plural: String,
    rounding: Double,
    symbol: String,
    symbol_native: String
  ): Currency = {
    val __obj = js.Dynamic.literal(code = code, decimal_digits = decimal_digits, name = name, name_plural = name_plural, rounding = rounding, symbol = symbol, symbol_native = symbol_native)
  
    __obj.asInstanceOf[Currency]
  }
}


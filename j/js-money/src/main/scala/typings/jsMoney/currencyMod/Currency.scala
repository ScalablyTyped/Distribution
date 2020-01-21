package typings.jsMoney.currencyMod

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
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], decimal_digits = decimal_digits.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], name_plural = name_plural.asInstanceOf[js.Any], rounding = rounding.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], symbol_native = symbol_native.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Currency]
  }
}


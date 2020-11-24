package typings.jsMoney.currencyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Currency extends js.Object {
  
  var code: String = js.native
  
  var decimal_digits: Double = js.native
  
  var name: String = js.native
  
  var name_plural: String = js.native
  
  var rounding: Double = js.native
  
  var symbol: String = js.native
  
  var symbol_native: String = js.native
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
  
  @scala.inline
  implicit class CurrencyOps[Self <: Currency] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimal_digits(value: Double): Self = this.set("decimal_digits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName_plural(value: String): Self = this.set("name_plural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRounding(value: Double): Self = this.set("rounding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: String): Self = this.set("symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol_native(value: String): Self = this.set("symbol_native", value.asInstanceOf[js.Any])
  }
}

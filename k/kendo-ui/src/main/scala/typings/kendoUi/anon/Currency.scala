package typings.kendoUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Currency extends js.Object {
  
  @JSName(",")
  var Comma: String = js.native
  
  @JSName(".")
  var Dot: String = js.native
  
  var currency: Decimals = js.native
  
  var decimals: Double = js.native
  
  var groupSize: js.Array[Double] = js.native
  
  var pattern: js.Array[String] = js.native
  
  var percent: Decimals = js.native
}
object Currency {
  
  @scala.inline
  def apply(
    Comma: String,
    Dot: String,
    currency: Decimals,
    decimals: Double,
    groupSize: js.Array[Double],
    pattern: js.Array[String],
    percent: Decimals
  ): Currency = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], groupSize = groupSize.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
    __obj.updateDynamic(",")(Comma.asInstanceOf[js.Any])
    __obj.updateDynamic(".")(Dot.asInstanceOf[js.Any])
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
    def setComma(value: String): Self = this.set(",", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDot(value: String): Self = this.set(".", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: Decimals): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimals(value: Double): Self = this.set("decimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupSizeVarargs(value: Double*): Self = this.set("groupSize", js.Array(value :_*))
    
    @scala.inline
    def setGroupSize(value: js.Array[Double]): Self = this.set("groupSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternVarargs(value: String*): Self = this.set("pattern", js.Array(value :_*))
    
    @scala.inline
    def setPattern(value: js.Array[String]): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercent(value: Decimals): Self = this.set("percent", value.asInstanceOf[js.Any])
  }
}

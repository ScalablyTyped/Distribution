package typings.kendoUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Decimals extends js.Object {
  
  @JSName(",")
  var Comma: String = js.native
  
  @JSName(".")
  var Dot: String = js.native
  
  var decimals: Double = js.native
  
  var groupSize: js.Array[Double] = js.native
  
  var pattern: js.Array[String] = js.native
  
  var symbol: String = js.native
}
object Decimals {
  
  @scala.inline
  def apply(
    Comma: String,
    Dot: String,
    decimals: Double,
    groupSize: js.Array[Double],
    pattern: js.Array[String],
    symbol: String
  ): Decimals = {
    val __obj = js.Dynamic.literal(decimals = decimals.asInstanceOf[js.Any], groupSize = groupSize.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.updateDynamic(",")(Comma.asInstanceOf[js.Any])
    __obj.updateDynamic(".")(Dot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decimals]
  }
  
  @scala.inline
  implicit class DecimalsOps[Self <: Decimals] (val x: Self) extends AnyVal {
    
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
    def setSymbol(value: String): Self = this.set("symbol", value.asInstanceOf[js.Any])
  }
}

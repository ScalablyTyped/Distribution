package typings.kendoUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Currency extends StObject {
  
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
  implicit class CurrencyMutableBuilder[Self <: Currency] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComma(value: String): Self = StObject.set(x, ",", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: Decimals): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDot(value: String): Self = StObject.set(x, ".", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupSize(value: js.Array[Double]): Self = StObject.set(x, "groupSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupSizeVarargs(value: Double*): Self = StObject.set(x, "groupSize", js.Array(value :_*))
    
    @scala.inline
    def setPattern(value: js.Array[String]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternVarargs(value: String*): Self = StObject.set(x, "pattern", js.Array(value :_*))
    
    @scala.inline
    def setPercent(value: Decimals): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
  }
}

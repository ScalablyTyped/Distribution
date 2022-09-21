package typings.kendoUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Currency extends StObject {
  
  @JSName(",")
  var Comma: String
  
  @JSName(".")
  var Dot: String
  
  var currency: Decimals
  
  var decimals: Double
  
  var groupSize: js.Array[Double]
  
  var pattern: js.Array[String]
  
  var percent: Decimals
}
object Currency {
  
  inline def apply(
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
  
  extension [Self <: Currency](x: Self) {
    
    inline def setComma(value: String): Self = StObject.set(x, ",", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: Decimals): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    inline def setDot(value: String): Self = StObject.set(x, ".", value.asInstanceOf[js.Any])
    
    inline def setGroupSize(value: js.Array[Double]): Self = StObject.set(x, "groupSize", value.asInstanceOf[js.Any])
    
    inline def setGroupSizeVarargs(value: Double*): Self = StObject.set(x, "groupSize", js.Array(value*))
    
    inline def setPattern(value: js.Array[String]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternVarargs(value: String*): Self = StObject.set(x, "pattern", js.Array(value*))
    
    inline def setPercent(value: Decimals): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
  }
}

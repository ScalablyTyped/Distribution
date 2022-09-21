package typings.kendoUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Decimals extends StObject {
  
  @JSName(",")
  var Comma: String
  
  @JSName(".")
  var Dot: String
  
  var decimals: Double
  
  var groupSize: js.Array[Double]
  
  var pattern: js.Array[String]
  
  var symbol: String
}
object Decimals {
  
  inline def apply(
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
  
  extension [Self <: Decimals](x: Self) {
    
    inline def setComma(value: String): Self = StObject.set(x, ",", value.asInstanceOf[js.Any])
    
    inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    inline def setDot(value: String): Self = StObject.set(x, ".", value.asInstanceOf[js.Any])
    
    inline def setGroupSize(value: js.Array[Double]): Self = StObject.set(x, "groupSize", value.asInstanceOf[js.Any])
    
    inline def setGroupSizeVarargs(value: Double*): Self = StObject.set(x, "groupSize", js.Array(value*))
    
    inline def setPattern(value: js.Array[String]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternVarargs(value: String*): Self = StObject.set(x, "pattern", js.Array(value*))
    
    inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}

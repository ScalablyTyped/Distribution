package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Edge extends StObject {
  
  def either(): Double
  
  def from(): Double
  
  var label: js.UndefOr[String] = js.undefined
  
  def other(x: Double): Double
  
  def to(): Double
  
  /* private */ var v: js.Any
  
  /* private */ var w: js.Any
  
  var weight: Double
}
object Edge {
  
  inline def apply(
    either: () => Double,
    from: () => Double,
    other: Double => Double,
    to: () => Double,
    v: js.Any,
    w: js.Any,
    weight: Double
  ): Edge = {
    val __obj = js.Dynamic.literal(either = js.Any.fromFunction0(either), from = js.Any.fromFunction0(from), other = js.Any.fromFunction1(other), to = js.Any.fromFunction0(to), v = v.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
  
  extension [Self <: Edge](x: Self) {
    
    inline def setEither(value: () => Double): Self = StObject.set(x, "either", js.Any.fromFunction0(value))
    
    inline def setFrom(value: () => Double): Self = StObject.set(x, "from", js.Any.fromFunction0(value))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOther(value: Double => Double): Self = StObject.set(x, "other", js.Any.fromFunction1(value))
    
    inline def setTo(value: () => Double): Self = StObject.set(x, "to", js.Any.fromFunction0(value))
    
    inline def setV(value: js.Any): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setW(value: js.Any): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}

package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Edge extends StObject {
  
  def either(): Double = js.native
  
  def from(): Double = js.native
  
  var label: js.UndefOr[String] = js.native
  
  def other(x: Double): Double = js.native
  
  def to(): Double = js.native
  
  var v: js.Any = js.native
  
  var w: js.Any = js.native
  
  var weight: Double = js.native
}
object Edge {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class EdgeMutableBuilder[Self <: Edge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEither(value: () => Double): Self = StObject.set(x, "either", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFrom(value: () => Double): Self = StObject.set(x, "from", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setOther(value: Double => Double): Self = StObject.set(x, "other", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTo(value: () => Double): Self = StObject.set(x, "to", js.Any.fromFunction0(value))
    
    @scala.inline
    def setV(value: js.Any): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW(value: js.Any): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}

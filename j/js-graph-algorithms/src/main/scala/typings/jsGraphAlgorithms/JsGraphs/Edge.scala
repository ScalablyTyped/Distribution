package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Edge extends js.Object {
  
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
  implicit class EdgeOps[Self <: Edge] (val x: Self) extends AnyVal {
    
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
    def setEither(value: () => Double): Self = this.set("either", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFrom(value: () => Double): Self = this.set("from", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOther(value: Double => Double): Self = this.set("other", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTo(value: () => Double): Self = this.set("to", js.Any.fromFunction0(value))
    
    @scala.inline
    def setV(value: js.Any): Self = this.set("v", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW(value: js.Any): Self = this.set("w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
}

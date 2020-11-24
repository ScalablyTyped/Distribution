package typings.linearGradient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gradient extends js.Object {
  
  /**
    * the input value should be normalized to the range between 0 and 1
    */
  def calcArray(normalizedPercent: Double): Color = js.native
  
  /**
    * the input value should be normalized to the range between 0 and 1
    */
  def calcHex(normalizedPrecent: Double): String = js.native
}
object Gradient {
  
  @scala.inline
  def apply(calcArray: Double => Color, calcHex: Double => String): Gradient = {
    val __obj = js.Dynamic.literal(calcArray = js.Any.fromFunction1(calcArray), calcHex = js.Any.fromFunction1(calcHex))
    __obj.asInstanceOf[Gradient]
  }
  
  @scala.inline
  implicit class GradientOps[Self <: Gradient] (val x: Self) extends AnyVal {
    
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
    def setCalcArray(value: Double => Color): Self = this.set("calcArray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalcHex(value: Double => String): Self = this.set("calcHex", js.Any.fromFunction1(value))
  }
}

package typings.kendoUi.kendo.effects

import typings.kendoUi.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Zoom extends Effect {
  
  def direction(value: String): Zoom = js.native
  
  def endValue(value: Double): Zoom = js.native
  
  def startValue(value: Double): Zoom = js.native
}
object Zoom {
  
  @scala.inline
  def apply(
    add: Effect => Effect,
    direction: String => Zoom,
    duration: Double => Effect,
    endValue: Double => Zoom,
    play: () => JQueryPromise[_],
    reverse: () => JQueryPromise[_],
    startValue: Double => Zoom,
    stop: () => Effect
  ): Zoom = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), direction = js.Any.fromFunction1(direction), duration = js.Any.fromFunction1(duration), endValue = js.Any.fromFunction1(endValue), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), startValue = js.Any.fromFunction1(startValue), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[Zoom]
  }
  
  @scala.inline
  implicit class ZoomOps[Self <: Zoom] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: String => Zoom): Self = this.set("direction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndValue(value: Double => Zoom): Self = this.set("endValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartValue(value: Double => Zoom): Self = this.set("startValue", js.Any.fromFunction1(value))
  }
}

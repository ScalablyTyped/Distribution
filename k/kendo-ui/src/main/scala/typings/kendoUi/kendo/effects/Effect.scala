package typings.kendoUi.kendo.effects

import typings.kendoUi.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Effect extends js.Object {
  
  def add(effect: Effect): Effect = js.native
  
  def duration(value: Double): Effect = js.native
  
  def play(): JQueryPromise[_] = js.native
  
  def reverse(): JQueryPromise[_] = js.native
  
  def stop(): Effect = js.native
}
object Effect {
  
  @scala.inline
  def apply(
    add: Effect => Effect,
    duration: Double => Effect,
    play: () => JQueryPromise[_],
    reverse: () => JQueryPromise[_],
    stop: () => Effect
  ): Effect = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), duration = js.Any.fromFunction1(duration), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[Effect]
  }
  
  @scala.inline
  implicit class EffectOps[Self <: Effect] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: Effect => Effect): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDuration(value: Double => Effect): Self = this.set("duration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPlay(value: () => JQueryPromise[_]): Self = this.set("play", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReverse(value: () => JQueryPromise[_]): Self = this.set("reverse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStop(value: () => Effect): Self = this.set("stop", js.Any.fromFunction0(value))
  }
}

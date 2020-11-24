package typings.ivViewer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderOptions extends js.Object {
  
  def isSliderEnabled(): Boolean = js.native
  
  def onEnd(): Unit = js.native
  
  def onMove(): Unit = js.native
  
  def onStart(): Unit = js.native
}
object SliderOptions {
  
  @scala.inline
  def apply(isSliderEnabled: () => Boolean, onEnd: () => Unit, onMove: () => Unit, onStart: () => Unit): SliderOptions = {
    val __obj = js.Dynamic.literal(isSliderEnabled = js.Any.fromFunction0(isSliderEnabled), onEnd = js.Any.fromFunction0(onEnd), onMove = js.Any.fromFunction0(onMove), onStart = js.Any.fromFunction0(onStart))
    __obj.asInstanceOf[SliderOptions]
  }
  
  @scala.inline
  implicit class SliderOptionsOps[Self <: SliderOptions] (val x: Self) extends AnyVal {
    
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
    def setIsSliderEnabled(value: () => Boolean): Self = this.set("isSliderEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnEnd(value: () => Unit): Self = this.set("onEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMove(value: () => Unit): Self = this.set("onMove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnStart(value: () => Unit): Self = this.set("onStart", js.Any.fromFunction0(value))
  }
}

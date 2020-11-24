package typings.jqueryCycle2.JQueryCycle2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsWithState extends Options {
  
  var busy: Boolean = js.native
  
  var currSlide: Double = js.native
  
  var nextSlide: Double = js.native
  
  @JSName("paused")
  var paused_OptionsWithState: Boolean = js.native
  
  var slideCount: Double = js.native
  
  var slideNum: Double = js.native
}
object OptionsWithState {
  
  @scala.inline
  def apply(
    busy: Boolean,
    currSlide: Double,
    nextSlide: Double,
    paused: Boolean,
    slideCount: Double,
    slideNum: Double
  ): OptionsWithState = {
    val __obj = js.Dynamic.literal(busy = busy.asInstanceOf[js.Any], currSlide = currSlide.asInstanceOf[js.Any], nextSlide = nextSlide.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], slideCount = slideCount.asInstanceOf[js.Any], slideNum = slideNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithState]
  }
  
  @scala.inline
  implicit class OptionsWithStateOps[Self <: OptionsWithState] (val x: Self) extends AnyVal {
    
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
    def setBusy(value: Boolean): Self = this.set("busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrSlide(value: Double): Self = this.set("currSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextSlide(value: Double): Self = this.set("nextSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideCount(value: Double): Self = this.set("slideCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideNum(value: Double): Self = this.set("slideNum", value.asInstanceOf[js.Any])
  }
}

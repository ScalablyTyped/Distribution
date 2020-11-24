package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationOptionsObject extends js.Object {
  
  /**
    * A callback function to exectute when the animation finishes.
    */
  var complete: js.UndefOr[js.Function] = js.native
  
  /**
    * The animation defer in milliseconds.
    */
  var defer: js.UndefOr[Double] = js.native
  
  /**
    * The animation duration in milliseconds.
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * The name of an easing function as defined on the `Math` object.
    */
  var easing: js.UndefOr[String | js.Function] = js.native
  
  /**
    * A callback function to execute on each step of each attribute or CSS
    * property that's being animated. The first argument contains information
    * about the animation and progress.
    */
  var step: js.UndefOr[js.Function] = js.native
}
object AnimationOptionsObject {
  
  @scala.inline
  def apply(): AnimationOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationOptionsObject]
  }
  
  @scala.inline
  implicit class AnimationOptionsObjectOps[Self <: AnimationOptionsObject] (val x: Self) extends AnyVal {
    
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
    def setComplete(value: js.Function): Self = this.set("complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setDefer(value: Double): Self = this.set("defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefer: Self = this.set("defer", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEasing(value: String | js.Function): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setStep(value: js.Function): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
}

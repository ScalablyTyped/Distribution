package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepperOption extends js.Object {
  
  var direction: js.UndefOr[Double] = js.native
  
  var pins: js.Any = js.native
  
  var rpm: js.UndefOr[Double] = js.native
  
  var stepsPerRev: Double = js.native
  
  var `type`: Double = js.native
}
object StepperOption {
  
  @scala.inline
  def apply(pins: js.Any, stepsPerRev: Double, `type`: Double): StepperOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any], stepsPerRev = stepsPerRev.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperOption]
  }
  
  @scala.inline
  implicit class StepperOptionOps[Self <: StepperOption] (val x: Self) extends AnyVal {
    
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
    def setPins(value: js.Any): Self = this.set("pins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsPerRev(value: Double): Self = this.set("stepsPerRev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: Double): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setRpm(value: Double): Self = this.set("rpm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRpm: Self = this.set("rpm", js.undefined)
  }
}

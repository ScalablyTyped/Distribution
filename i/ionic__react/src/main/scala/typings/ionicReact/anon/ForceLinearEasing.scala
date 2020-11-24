package typings.ionicReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForceLinearEasing extends js.Object {
  
  var forceLinearEasing: Boolean = js.native
  
  var step: js.UndefOr[Double] = js.native
}
object ForceLinearEasing {
  
  @scala.inline
  def apply(forceLinearEasing: Boolean): ForceLinearEasing = {
    val __obj = js.Dynamic.literal(forceLinearEasing = forceLinearEasing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceLinearEasing]
  }
  
  @scala.inline
  implicit class ForceLinearEasingOps[Self <: ForceLinearEasing] (val x: Self) extends AnyVal {
    
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
    def setForceLinearEasing(value: Boolean): Self = this.set("forceLinearEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
}

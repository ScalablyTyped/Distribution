package typings.jqueryNotifybar.JQueryNotifyBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotifyBarOptionsForAnimationSpeedNumber extends NotifyBarOptions {
  
  /**
    * How long this bar will be slided up and down.
    */
  @JSName("animationSpeed")
  var animationSpeed_NotifyBarOptionsForAnimationSpeedNumber: js.UndefOr[Double] = js.native
}
object NotifyBarOptionsForAnimationSpeedNumber {
  
  @scala.inline
  def apply(): NotifyBarOptionsForAnimationSpeedNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifyBarOptionsForAnimationSpeedNumber]
  }
  
  @scala.inline
  implicit class NotifyBarOptionsForAnimationSpeedNumberOps[Self <: NotifyBarOptionsForAnimationSpeedNumber] (val x: Self) extends AnyVal {
    
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
    def setAnimationSpeed(value: Double): Self = this.set("animationSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationSpeed: Self = this.set("animationSpeed", js.undefined)
  }
}

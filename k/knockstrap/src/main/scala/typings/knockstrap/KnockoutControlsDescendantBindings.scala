package typings.knockstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutControlsDescendantBindings extends js.Object {
  
  var controlsDescendantBindings: Boolean = js.native
}
object KnockoutControlsDescendantBindings {
  
  @scala.inline
  def apply(controlsDescendantBindings: Boolean): KnockoutControlsDescendantBindings = {
    val __obj = js.Dynamic.literal(controlsDescendantBindings = controlsDescendantBindings.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutControlsDescendantBindings]
  }
  
  @scala.inline
  implicit class KnockoutControlsDescendantBindingsOps[Self <: KnockoutControlsDescendantBindings] (val x: Self) extends AnyVal {
    
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
    def setControlsDescendantBindings(value: Boolean): Self = this.set("controlsDescendantBindings", value.asInstanceOf[js.Any])
  }
}

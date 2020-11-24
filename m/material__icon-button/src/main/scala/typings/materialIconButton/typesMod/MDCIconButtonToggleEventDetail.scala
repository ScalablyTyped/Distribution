package typings.materialIconButton.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCIconButtonToggleEventDetail extends js.Object {
  
  var isOn: Boolean = js.native
}
object MDCIconButtonToggleEventDetail {
  
  @scala.inline
  def apply(isOn: Boolean): MDCIconButtonToggleEventDetail = {
    val __obj = js.Dynamic.literal(isOn = isOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDCIconButtonToggleEventDetail]
  }
  
  @scala.inline
  implicit class MDCIconButtonToggleEventDetailOps[Self <: MDCIconButtonToggleEventDetail] (val x: Self) extends AnyVal {
    
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
    def setIsOn(value: Boolean): Self = this.set("isOn", value.asInstanceOf[js.Any])
  }
}

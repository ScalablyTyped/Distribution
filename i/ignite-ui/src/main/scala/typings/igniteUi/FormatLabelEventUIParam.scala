package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatLabelEventUIParam extends js.Object {
  
  /**
    * Used to obtain the maximum value of the bullet graph scale.
    */
  var actualMaximumValue: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to obtain the minimum value of the bullet graph scale.
    */
  var actualMinimumValue: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to obtain the string value of the label.
    */
  var label: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to obtain reference to the bullet graph widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to obtain the value on the the bullet graph scale associated with the label.
    */
  var value: js.UndefOr[js.Any] = js.native
}
object FormatLabelEventUIParam {
  
  @scala.inline
  def apply(): FormatLabelEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatLabelEventUIParam]
  }
  
  @scala.inline
  implicit class FormatLabelEventUIParamOps[Self <: FormatLabelEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setActualMaximumValue(value: js.Any): Self = this.set("actualMaximumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActualMaximumValue: Self = this.set("actualMaximumValue", js.undefined)
    
    @scala.inline
    def setActualMinimumValue(value: js.Any): Self = this.set("actualMinimumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActualMinimumValue: Self = this.set("actualMinimumValue", js.undefined)
    
    @scala.inline
    def setLabel(value: js.Any): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}

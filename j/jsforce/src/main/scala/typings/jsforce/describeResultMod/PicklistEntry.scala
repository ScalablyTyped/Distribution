package typings.jsforce.describeResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PicklistEntry extends js.Object {
  
  var active: Boolean = js.native
  
  var defaultValue: Boolean = js.native
  
  var label: js.UndefOr[maybe[String]] = js.native
  
  var validFor: js.UndefOr[maybe[String]] = js.native
  
  var value: String = js.native
}
object PicklistEntry {
  
  @scala.inline
  def apply(active: Boolean, defaultValue: Boolean, value: String): PicklistEntry = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PicklistEntry]
  }
  
  @scala.inline
  implicit class PicklistEntryOps[Self <: PicklistEntry] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: Boolean): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: maybe[String]): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelNull: Self = this.set("label", null)
    
    @scala.inline
    def setValidFor(value: maybe[String]): Self = this.set("validFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidFor: Self = this.set("validFor", js.undefined)
    
    @scala.inline
    def setValidForNull: Self = this.set("validFor", null)
  }
}

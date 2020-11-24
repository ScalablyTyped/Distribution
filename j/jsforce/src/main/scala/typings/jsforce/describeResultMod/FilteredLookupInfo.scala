package typings.jsforce.describeResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilteredLookupInfo extends js.Object {
  
  var controllingFields: js.Array[String] = js.native
  
  var dependent: Boolean = js.native
  
  var optionalFilter: Boolean = js.native
}
object FilteredLookupInfo {
  
  @scala.inline
  def apply(controllingFields: js.Array[String], dependent: Boolean, optionalFilter: Boolean): FilteredLookupInfo = {
    val __obj = js.Dynamic.literal(controllingFields = controllingFields.asInstanceOf[js.Any], dependent = dependent.asInstanceOf[js.Any], optionalFilter = optionalFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilteredLookupInfo]
  }
  
  @scala.inline
  implicit class FilteredLookupInfoOps[Self <: FilteredLookupInfo] (val x: Self) extends AnyVal {
    
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
    def setControllingFieldsVarargs(value: String*): Self = this.set("controllingFields", js.Array(value :_*))
    
    @scala.inline
    def setControllingFields(value: js.Array[String]): Self = this.set("controllingFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependent(value: Boolean): Self = this.set("dependent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalFilter(value: Boolean): Self = this.set("optionalFilter", value.asInstanceOf[js.Any])
  }
}

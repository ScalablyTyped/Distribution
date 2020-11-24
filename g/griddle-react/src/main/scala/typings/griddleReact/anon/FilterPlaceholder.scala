package typings.griddleReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterPlaceholder extends js.Object {
  
  var filterPlaceholder: js.UndefOr[String] = js.native
  
  var next: js.UndefOr[String] = js.native
  
  var previous: js.UndefOr[String] = js.native
  
  var settingsToggle: js.UndefOr[String] = js.native
}
object FilterPlaceholder {
  
  @scala.inline
  def apply(): FilterPlaceholder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterPlaceholder]
  }
  
  @scala.inline
  implicit class FilterPlaceholderOps[Self <: FilterPlaceholder] (val x: Self) extends AnyVal {
    
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
    def setFilterPlaceholder(value: String): Self = this.set("filterPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterPlaceholder: Self = this.set("filterPlaceholder", js.undefined)
    
    @scala.inline
    def setNext(value: String): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    
    @scala.inline
    def setPrevious(value: String): Self = this.set("previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevious: Self = this.set("previous", js.undefined)
    
    @scala.inline
    def setSettingsToggle(value: String): Self = this.set("settingsToggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettingsToggle: Self = this.set("settingsToggle", js.undefined)
  }
}

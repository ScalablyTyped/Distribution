package typings.jqueryTypeahead.RunningCoder.Typeahead

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Selector extends js.Object {
  
  var backdrop: js.UndefOr[String] = js.native
  
  var button: js.UndefOr[String] = js.native
  
  var cancelButton: js.UndefOr[String] = js.native
  
  var container: js.UndefOr[String] = js.native
  
  var display: js.UndefOr[String] = js.native
  
  var dropdown: js.UndefOr[String] = js.native
  
  var dropdownItem: js.UndefOr[String] = js.native
  
  var empty: js.UndefOr[String] = js.native
  
  var filter: js.UndefOr[String] = js.native
  
  var filterButton: js.UndefOr[String] = js.native
  
  var group: js.UndefOr[String] = js.native
  
  var hint: js.UndefOr[String] = js.native
  
  var item: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var labelContainer: js.UndefOr[String] = js.native
  
  var list: js.UndefOr[String] = js.native
  
  var query: js.UndefOr[String] = js.native
  
  var result: js.UndefOr[String] = js.native
}
object Selector {
  
  @scala.inline
  def apply(): Selector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Selector]
  }
  
  @scala.inline
  implicit class SelectorOps[Self <: Selector] (val x: Self) extends AnyVal {
    
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
    def setBackdrop(value: String): Self = this.set("backdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackdrop: Self = this.set("backdrop", js.undefined)
    
    @scala.inline
    def setButton(value: String): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    
    @scala.inline
    def setCancelButton(value: String): Self = this.set("cancelButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelButton: Self = this.set("cancelButton", js.undefined)
    
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setDisplay(value: String): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setDropdown(value: String): Self = this.set("dropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdown: Self = this.set("dropdown", js.undefined)
    
    @scala.inline
    def setDropdownItem(value: String): Self = this.set("dropdownItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdownItem: Self = this.set("dropdownItem", js.undefined)
    
    @scala.inline
    def setEmpty(value: String): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFilterButton(value: String): Self = this.set("filterButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterButton: Self = this.set("filterButton", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setHint(value: String): Self = this.set("hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    
    @scala.inline
    def setItem(value: String): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelContainer(value: String): Self = this.set("labelContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelContainer: Self = this.set("labelContainer", js.undefined)
    
    @scala.inline
    def setList(value: String): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setResult(value: String): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
}

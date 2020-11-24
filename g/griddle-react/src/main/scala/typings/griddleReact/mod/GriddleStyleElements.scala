package typings.griddleReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GriddleStyleElements[T] extends js.Object {
  
  var Cell: js.UndefOr[T] = js.native
  
  var Filter: js.UndefOr[T] = js.native
  
  var Layout: js.UndefOr[T] = js.native
  
  var Loading: js.UndefOr[T] = js.native
  
  var NextButton: js.UndefOr[T] = js.native
  
  var NoResults: js.UndefOr[T] = js.native
  
  var PageDropdown: js.UndefOr[T] = js.native
  
  var Pagination: js.UndefOr[T] = js.native
  
  var PreviousButton: js.UndefOr[T] = js.native
  
  var Row: js.UndefOr[T] = js.native
  
  var RowDefinition: js.UndefOr[T] = js.native
  
  var Settings: js.UndefOr[T] = js.native
  
  var SettingsToggle: js.UndefOr[T] = js.native
  
  var Table: js.UndefOr[T] = js.native
  
  var TableBody: js.UndefOr[T] = js.native
  
  var TableHeading: js.UndefOr[T] = js.native
  
  var TableHeadingCell: js.UndefOr[T] = js.native
  
  var TableHeadingCellAscending: js.UndefOr[T] = js.native
  
  var TableHeadingCellDescending: js.UndefOr[T] = js.native
}
object GriddleStyleElements {
  
  @scala.inline
  def apply[T](): GriddleStyleElements[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleStyleElements[T]]
  }
  
  @scala.inline
  implicit class GriddleStyleElementsOps[Self <: GriddleStyleElements[_], T] (val x: Self with GriddleStyleElements[T]) extends AnyVal {
    
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
    def setCell(value: T): Self = this.set("Cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCell: Self = this.set("Cell", js.undefined)
    
    @scala.inline
    def setFilter(value: T): Self = this.set("Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("Filter", js.undefined)
    
    @scala.inline
    def setLayout(value: T): Self = this.set("Layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("Layout", js.undefined)
    
    @scala.inline
    def setLoading(value: T): Self = this.set("Loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("Loading", js.undefined)
    
    @scala.inline
    def setNextButton(value: T): Self = this.set("NextButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextButton: Self = this.set("NextButton", js.undefined)
    
    @scala.inline
    def setNoResults(value: T): Self = this.set("NoResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoResults: Self = this.set("NoResults", js.undefined)
    
    @scala.inline
    def setPageDropdown(value: T): Self = this.set("PageDropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageDropdown: Self = this.set("PageDropdown", js.undefined)
    
    @scala.inline
    def setPagination(value: T): Self = this.set("Pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagination: Self = this.set("Pagination", js.undefined)
    
    @scala.inline
    def setPreviousButton(value: T): Self = this.set("PreviousButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousButton: Self = this.set("PreviousButton", js.undefined)
    
    @scala.inline
    def setRow(value: T): Self = this.set("Row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRow: Self = this.set("Row", js.undefined)
    
    @scala.inline
    def setRowDefinition(value: T): Self = this.set("RowDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowDefinition: Self = this.set("RowDefinition", js.undefined)
    
    @scala.inline
    def setSettings(value: T): Self = this.set("Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("Settings", js.undefined)
    
    @scala.inline
    def setSettingsToggle(value: T): Self = this.set("SettingsToggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettingsToggle: Self = this.set("SettingsToggle", js.undefined)
    
    @scala.inline
    def setTable(value: T): Self = this.set("Table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("Table", js.undefined)
    
    @scala.inline
    def setTableBody(value: T): Self = this.set("TableBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableBody: Self = this.set("TableBody", js.undefined)
    
    @scala.inline
    def setTableHeading(value: T): Self = this.set("TableHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableHeading: Self = this.set("TableHeading", js.undefined)
    
    @scala.inline
    def setTableHeadingCell(value: T): Self = this.set("TableHeadingCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableHeadingCell: Self = this.set("TableHeadingCell", js.undefined)
    
    @scala.inline
    def setTableHeadingCellAscending(value: T): Self = this.set("TableHeadingCellAscending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableHeadingCellAscending: Self = this.set("TableHeadingCellAscending", js.undefined)
    
    @scala.inline
    def setTableHeadingCellDescending(value: T): Self = this.set("TableHeadingCellDescending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableHeadingCellDescending: Self = this.set("TableHeadingCellDescending", js.undefined)
  }
}

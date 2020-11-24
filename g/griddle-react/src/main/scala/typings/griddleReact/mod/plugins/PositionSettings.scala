package typings.griddleReact.mod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PositionSettings extends js.Object {
  
  // TODO: Unused?
  // The minimum column width
  var defaultColumnWidth: js.UndefOr[Double | String] = js.native
  
  // TODO: Unused?
  // Disable pointer events while scrolling to improve performance
  var disablePointerEvents: js.UndefOr[Boolean] = js.native
  
  // TODO: Unused?
  // Whether or not the header should be fixed
  var fixedHeader: js.UndefOr[Boolean] = js.native
  
  // The minimum row height
  var rowHeight: js.UndefOr[Double | String] = js.native
  
  // The height of the table
  var tableHeight: js.UndefOr[Double | String] = js.native
  
  // The width of the table
  var tableWidth: js.UndefOr[Double | String] = js.native
}
object PositionSettings {
  
  @scala.inline
  def apply(): PositionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionSettings]
  }
  
  @scala.inline
  implicit class PositionSettingsOps[Self <: PositionSettings] (val x: Self) extends AnyVal {
    
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
    def setDefaultColumnWidth(value: Double | String): Self = this.set("defaultColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultColumnWidth: Self = this.set("defaultColumnWidth", js.undefined)
    
    @scala.inline
    def setDisablePointerEvents(value: Boolean): Self = this.set("disablePointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablePointerEvents: Self = this.set("disablePointerEvents", js.undefined)
    
    @scala.inline
    def setFixedHeader(value: Boolean): Self = this.set("fixedHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedHeader: Self = this.set("fixedHeader", js.undefined)
    
    @scala.inline
    def setRowHeight(value: Double | String): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHeight: Self = this.set("rowHeight", js.undefined)
    
    @scala.inline
    def setTableHeight(value: Double | String): Self = this.set("tableHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableHeight: Self = this.set("tableHeight", js.undefined)
    
    @scala.inline
    def setTableWidth(value: Double | String): Self = this.set("tableWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableWidth: Self = this.set("tableWidth", js.undefined)
  }
}

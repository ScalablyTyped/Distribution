package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgTreeGridResizing
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Resize the column to the size of the longest currently visible cell value.
    *
    */
  var allowDoubleClickToResize: js.UndefOr[Boolean] = js.native
  
  /**
    * Event fired after the resizing has been executed and results are rendered
    */
  var columnResized: js.UndefOr[ColumnResizedEvent] = js.native
  
  /**
    * Event fired before a resizing operation is executed.
    */
  var columnResizing: js.UndefOr[ColumnResizingEvent] = js.native
  
  /**
    * Event fired(only when columnFixing is enabled) when trying to resize column in fixed area so total width of unfixed area to be less than minimalVisibleAreaWidth(option defined in columnFixing)
    */
  var columnResizingRefused: js.UndefOr[ColumnResizingRefusedEvent] = js.native
  
  /**
    * A list of column settings that specifies resizing options on a per column basis.
    *
    */
  var columnSettings: js.UndefOr[js.Array[IgGridResizingColumnSetting]] = js.native
  
  /**
    * Specifies whether the resizing should be deferred until the user finishes resizing or applied immediately.
    *
    */
  var deferredResizing: js.UndefOr[Boolean] = js.native
  
  /**
    * The width in pixels of the resizing handle which is position at the right side of each resizeable column header.
    *
    */
  var handleThreshold: js.UndefOr[Double] = js.native
  
  /**
    * This option is inherited from a parent widget and it's not applicable for the igTreeGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.native
}
object IgTreeGridResizing {
  
  @scala.inline
  def apply(): IgTreeGridResizing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridResizing]
  }
  
  @scala.inline
  implicit class IgTreeGridResizingOps[Self <: IgTreeGridResizing] (val x: Self) extends AnyVal {
    
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
    def setAllowDoubleClickToResize(value: Boolean): Self = this.set("allowDoubleClickToResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDoubleClickToResize: Self = this.set("allowDoubleClickToResize", js.undefined)
    
    @scala.inline
    def setColumnResized(value: (/* event */ Event, /* ui */ ColumnResizedEventUIParam) => Unit): Self = this.set("columnResized", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteColumnResized: Self = this.set("columnResized", js.undefined)
    
    @scala.inline
    def setColumnResizing(value: (/* event */ Event, /* ui */ ColumnResizingEventUIParam) => Unit): Self = this.set("columnResizing", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteColumnResizing: Self = this.set("columnResizing", js.undefined)
    
    @scala.inline
    def setColumnResizingRefused(value: (/* event */ Event, /* ui */ ColumnResizingRefusedEventUIParam) => Unit): Self = this.set("columnResizingRefused", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteColumnResizingRefused: Self = this.set("columnResizingRefused", js.undefined)
    
    @scala.inline
    def setColumnSettingsVarargs(value: IgGridResizingColumnSetting*): Self = this.set("columnSettings", js.Array(value :_*))
    
    @scala.inline
    def setColumnSettings(value: js.Array[IgGridResizingColumnSetting]): Self = this.set("columnSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnSettings: Self = this.set("columnSettings", js.undefined)
    
    @scala.inline
    def setDeferredResizing(value: Boolean): Self = this.set("deferredResizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferredResizing: Self = this.set("deferredResizing", js.undefined)
    
    @scala.inline
    def setHandleThreshold(value: Double): Self = this.set("handleThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleThreshold: Self = this.set("handleThreshold", js.undefined)
    
    @scala.inline
    def setInherit(value: Boolean): Self = this.set("inherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInherit: Self = this.set("inherit", js.undefined)
  }
}

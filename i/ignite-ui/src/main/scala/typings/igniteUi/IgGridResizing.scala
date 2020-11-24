package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridResizing
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
    * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.native
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.native
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
}
object IgGridResizing {
  
  @scala.inline
  def apply(): IgGridResizing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridResizing]
  }
  
  @scala.inline
  implicit class IgGridResizingOps[Self <: IgGridResizing] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
  }
}

package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridResizing
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Resize the column to the size of the longest currently visible cell value.
    *
    */
  var allowDoubleClickToResize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Event fired after the resizing has been executed and results are rendered
    */
  var columnResized: js.UndefOr[ColumnResizedEvent] = js.undefined
  
  /**
    * Event fired before a resizing operation is executed.
    */
  var columnResizing: js.UndefOr[ColumnResizingEvent] = js.undefined
  
  /**
    * Event fired(only when columnFixing is enabled) when trying to resize column in fixed area so total width of unfixed area to be less than minimalVisibleAreaWidth(option defined in columnFixing)
    */
  var columnResizingRefused: js.UndefOr[ColumnResizingRefusedEvent] = js.undefined
  
  /**
    * A list of column settings that specifies resizing options on a per column basis.
    *
    */
  var columnSettings: js.UndefOr[js.Array[IgGridResizingColumnSetting]] = js.undefined
  
  /**
    * Specifies whether the resizing should be deferred until the user finishes resizing or applied immediately.
    *
    */
  var deferredResizing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The width in pixels of the resizing handle which is position at the right side of each resizeable column header.
    *
    */
  var handleThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[Any] = js.undefined
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.undefined
}
object IgGridResizing {
  
  inline def apply(): IgGridResizing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridResizing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgGridResizing] (val x: Self) extends AnyVal {
    
    inline def setAllowDoubleClickToResize(value: Boolean): Self = StObject.set(x, "allowDoubleClickToResize", value.asInstanceOf[js.Any])
    
    inline def setAllowDoubleClickToResizeUndefined: Self = StObject.set(x, "allowDoubleClickToResize", js.undefined)
    
    inline def setColumnResized(value: (/* event */ Event, /* ui */ ColumnResizedEventUIParam) => Unit): Self = StObject.set(x, "columnResized", js.Any.fromFunction2(value))
    
    inline def setColumnResizedUndefined: Self = StObject.set(x, "columnResized", js.undefined)
    
    inline def setColumnResizing(value: (/* event */ Event, /* ui */ ColumnResizingEventUIParam) => Unit): Self = StObject.set(x, "columnResizing", js.Any.fromFunction2(value))
    
    inline def setColumnResizingRefused(value: (/* event */ Event, /* ui */ ColumnResizingRefusedEventUIParam) => Unit): Self = StObject.set(x, "columnResizingRefused", js.Any.fromFunction2(value))
    
    inline def setColumnResizingRefusedUndefined: Self = StObject.set(x, "columnResizingRefused", js.undefined)
    
    inline def setColumnResizingUndefined: Self = StObject.set(x, "columnResizing", js.undefined)
    
    inline def setColumnSettings(value: js.Array[IgGridResizingColumnSetting]): Self = StObject.set(x, "columnSettings", value.asInstanceOf[js.Any])
    
    inline def setColumnSettingsUndefined: Self = StObject.set(x, "columnSettings", js.undefined)
    
    inline def setColumnSettingsVarargs(value: IgGridResizingColumnSetting*): Self = StObject.set(x, "columnSettings", js.Array(value*))
    
    inline def setDeferredResizing(value: Boolean): Self = StObject.set(x, "deferredResizing", value.asInstanceOf[js.Any])
    
    inline def setDeferredResizingUndefined: Self = StObject.set(x, "deferredResizing", js.undefined)
    
    inline def setHandleThreshold(value: Double): Self = StObject.set(x, "handleThreshold", value.asInstanceOf[js.Any])
    
    inline def setHandleThresholdUndefined: Self = StObject.set(x, "handleThreshold", js.undefined)
    
    inline def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
    
    inline def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    inline def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
  }
}

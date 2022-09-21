package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgHtmlEditor
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Event fired after a toolbar item is clicked.
    */
  var actionExecuted: js.UndefOr[ActionExecutedEvent] = js.undefined
  
  /**
    * Event fired before a toolbar item is clicked.
    */
  var actionExecuting: js.UndefOr[ActionExecutingEvent] = js.undefined
  
  /**
    * Event is fired on keyboard copy action.
    */
  var copy: js.UndefOr[CopyEvent] = js.undefined
  
  /**
    * The html editor custom toolbars list.
    *
    */
  var customToolbars: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Event is fired on keyboard cut action.
    */
  var cut: js.UndefOr[CutEvent] = js.undefined
  
  /**
    * The height of the html editor. It can be set as a number in pixels, string (px) or percentage (%).
    *
    */
  var height: js.UndefOr[String | Double] = js.undefined
  
  /**
    * The name attribute of the html editor source view.
    *
    */
  var inputName: js.UndefOr[String] = js.undefined
  
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
    * Event is fired on keyboard paste action.
    */
  var paste: js.UndefOr[PasteEvent] = js.undefined
  
  /**
    * Event is fired on keyboard redo action.
    */
  var redo: js.UndefOr[RedoEvent] = js.undefined
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  
  /**
    * Event fired after the html editor widget has been rendered.
    */
  var rendered: js.UndefOr[RenderedEvent] = js.undefined
  
  /**
    * Event fired before the html editor widget is rendered.
    */
  var rendering: js.UndefOr[RenderingEvent] = js.undefined
  
  /**
    * Shows/hides the "Copy Paste" toolbar.
    *
    */
  var showCopyPasteToolbar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Shows/hides the "Formatting" toolbar.
    *
    */
  var showFormattingToolbar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Shows/hides the "Insert Object" toolbar.
    *
    */
  var showInsertObjectToolbar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Shows/hides the "Text" toolbar.
    *
    */
  var showTextToolbar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Event fired after a toolbar is collapsed.
    */
  var toolbarCollapsed: js.UndefOr[ToolbarCollapsedEvent] = js.undefined
  
  /**
    * Event fired before a toolbar is collapsed.
    */
  var toolbarCollapsing: js.UndefOr[ToolbarCollapsingEvent] = js.undefined
  
  /**
    * Event fired after a toolbar is expanded.
    */
  var toolbarExpanded: js.UndefOr[ToolbarExpandedEvent] = js.undefined
  
  /**
    * Event fired before a toolbar is expanded.
    */
  var toolbarExpanding: js.UndefOr[ToolbarExpandingEvent] = js.undefined
  
  /**
    * The html editor toolbars list.
    *
    */
  var toolbarSettings: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Event is fired on keyboard undo action.
    */
  var undo: js.UndefOr[UndoEvent] = js.undefined
  
  /**
    * Used to render inside the html editor as initial content
    *
    */
  var value: js.UndefOr[String] = js.undefined
  
  /**
    * The width of the html editor. It can be set as a number in pixels, string (px) or percentage (%).
    *
    */
  var width: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Event is fired after the workspace has been resized
    */
  var workspaceResized: js.UndefOr[WorkspaceResizedEvent] = js.undefined
}
object IgHtmlEditor {
  
  inline def apply(): IgHtmlEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgHtmlEditor]
  }
  
  extension [Self <: IgHtmlEditor](x: Self) {
    
    inline def setActionExecuted(value: (/* event */ Event, /* ui */ ActionExecutedEventUIParam) => Unit): Self = StObject.set(x, "actionExecuted", js.Any.fromFunction2(value))
    
    inline def setActionExecutedUndefined: Self = StObject.set(x, "actionExecuted", js.undefined)
    
    inline def setActionExecuting(value: (/* event */ Event, /* ui */ ActionExecutingEventUIParam) => Unit): Self = StObject.set(x, "actionExecuting", js.Any.fromFunction2(value))
    
    inline def setActionExecutingUndefined: Self = StObject.set(x, "actionExecuting", js.undefined)
    
    inline def setCopy(value: (/* event */ Event, /* ui */ CopyEventUIParam) => Unit): Self = StObject.set(x, "copy", js.Any.fromFunction2(value))
    
    inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    inline def setCustomToolbars(value: js.Array[Any]): Self = StObject.set(x, "customToolbars", value.asInstanceOf[js.Any])
    
    inline def setCustomToolbarsUndefined: Self = StObject.set(x, "customToolbars", js.undefined)
    
    inline def setCustomToolbarsVarargs(value: Any*): Self = StObject.set(x, "customToolbars", js.Array(value*))
    
    inline def setCut(value: (/* event */ Event, /* ui */ CutEventUIParam) => Unit): Self = StObject.set(x, "cut", js.Any.fromFunction2(value))
    
    inline def setCutUndefined: Self = StObject.set(x, "cut", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setInputName(value: String): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
    
    inline def setInputNameUndefined: Self = StObject.set(x, "inputName", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setPaste(value: (/* event */ Event, /* ui */ PasteEventUIParam) => Unit): Self = StObject.set(x, "paste", js.Any.fromFunction2(value))
    
    inline def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
    
    inline def setRedo(value: (/* event */ Event, /* ui */ RedoEventUIParam) => Unit): Self = StObject.set(x, "redo", js.Any.fromFunction2(value))
    
    inline def setRedoUndefined: Self = StObject.set(x, "redo", js.undefined)
    
    inline def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    inline def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    inline def setRendered(value: (/* event */ Event, /* ui */ RenderedEventUIParam) => Unit): Self = StObject.set(x, "rendered", js.Any.fromFunction2(value))
    
    inline def setRenderedUndefined: Self = StObject.set(x, "rendered", js.undefined)
    
    inline def setRendering(value: (/* event */ Event, /* ui */ RenderingEventUIParam) => Unit): Self = StObject.set(x, "rendering", js.Any.fromFunction2(value))
    
    inline def setRenderingUndefined: Self = StObject.set(x, "rendering", js.undefined)
    
    inline def setShowCopyPasteToolbar(value: Boolean): Self = StObject.set(x, "showCopyPasteToolbar", value.asInstanceOf[js.Any])
    
    inline def setShowCopyPasteToolbarUndefined: Self = StObject.set(x, "showCopyPasteToolbar", js.undefined)
    
    inline def setShowFormattingToolbar(value: Boolean): Self = StObject.set(x, "showFormattingToolbar", value.asInstanceOf[js.Any])
    
    inline def setShowFormattingToolbarUndefined: Self = StObject.set(x, "showFormattingToolbar", js.undefined)
    
    inline def setShowInsertObjectToolbar(value: Boolean): Self = StObject.set(x, "showInsertObjectToolbar", value.asInstanceOf[js.Any])
    
    inline def setShowInsertObjectToolbarUndefined: Self = StObject.set(x, "showInsertObjectToolbar", js.undefined)
    
    inline def setShowTextToolbar(value: Boolean): Self = StObject.set(x, "showTextToolbar", value.asInstanceOf[js.Any])
    
    inline def setShowTextToolbarUndefined: Self = StObject.set(x, "showTextToolbar", js.undefined)
    
    inline def setToolbarCollapsed(value: (/* event */ Event, /* ui */ ToolbarCollapsedEventUIParam) => Unit): Self = StObject.set(x, "toolbarCollapsed", js.Any.fromFunction2(value))
    
    inline def setToolbarCollapsedUndefined: Self = StObject.set(x, "toolbarCollapsed", js.undefined)
    
    inline def setToolbarCollapsing(value: (/* event */ Event, /* ui */ ToolbarCollapsingEventUIParam) => Unit): Self = StObject.set(x, "toolbarCollapsing", js.Any.fromFunction2(value))
    
    inline def setToolbarCollapsingUndefined: Self = StObject.set(x, "toolbarCollapsing", js.undefined)
    
    inline def setToolbarExpanded(value: (/* event */ Event, /* ui */ ToolbarExpandedEventUIParam) => Unit): Self = StObject.set(x, "toolbarExpanded", js.Any.fromFunction2(value))
    
    inline def setToolbarExpandedUndefined: Self = StObject.set(x, "toolbarExpanded", js.undefined)
    
    inline def setToolbarExpanding(value: (/* event */ Event, /* ui */ ToolbarExpandingEventUIParam) => Unit): Self = StObject.set(x, "toolbarExpanding", js.Any.fromFunction2(value))
    
    inline def setToolbarExpandingUndefined: Self = StObject.set(x, "toolbarExpanding", js.undefined)
    
    inline def setToolbarSettings(value: js.Array[Any]): Self = StObject.set(x, "toolbarSettings", value.asInstanceOf[js.Any])
    
    inline def setToolbarSettingsUndefined: Self = StObject.set(x, "toolbarSettings", js.undefined)
    
    inline def setToolbarSettingsVarargs(value: Any*): Self = StObject.set(x, "toolbarSettings", js.Array(value*))
    
    inline def setUndo(value: (/* event */ Event, /* ui */ UndoEventUIParam) => Unit): Self = StObject.set(x, "undo", js.Any.fromFunction2(value))
    
    inline def setUndoUndefined: Self = StObject.set(x, "undo", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWorkspaceResized(value: (/* event */ Event, /* ui */ WorkspaceResizedEventUIParam) => Unit): Self = StObject.set(x, "workspaceResized", js.Any.fromFunction2(value))
    
    inline def setWorkspaceResizedUndefined: Self = StObject.set(x, "workspaceResized", js.undefined)
  }
}

package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgHtmlEditor
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Event fired after a toolbar item is clicked.
    */
  var actionExecuted: js.UndefOr[ActionExecutedEvent] = js.native
  
  /**
    * Event fired before a toolbar item is clicked.
    */
  var actionExecuting: js.UndefOr[ActionExecutingEvent] = js.native
  
  /**
    * Event is fired on keyboard copy action.
    */
  var copy: js.UndefOr[CopyEvent] = js.native
  
  /**
    * The html editor custom toolbars list.
    *
    */
  var customToolbars: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Event is fired on keyboard cut action.
    */
  var cut: js.UndefOr[CutEvent] = js.native
  
  /**
    * The height of the html editor. It can be set as a number in pixels, string (px) or percentage (%).
    *
    */
  var height: js.UndefOr[String | Double] = js.native
  
  /**
    * The name attribute of the html editor source view.
    *
    */
  var inputName: js.UndefOr[String] = js.native
  
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
    * Event is fired on keyboard paste action.
    */
  var paste: js.UndefOr[PasteEvent] = js.native
  
  /**
    * Event is fired on keyboard redo action.
    */
  var redo: js.UndefOr[RedoEvent] = js.native
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  
  /**
    * Event fired after the html editor widget has been rendered.
    */
  var rendered: js.UndefOr[RenderedEvent] = js.native
  
  /**
    * Event fired before the html editor widget is rendered.
    */
  var rendering: js.UndefOr[RenderingEvent] = js.native
  
  /**
    * Shows/hides the "Copy Paste" toolbar.
    *
    */
  var showCopyPasteToolbar: js.UndefOr[Boolean] = js.native
  
  /**
    * Shows/hides the "Formatting" toolbar.
    *
    */
  var showFormattingToolbar: js.UndefOr[Boolean] = js.native
  
  /**
    * Shows/hides the "Insert Object" toolbar.
    *
    */
  var showInsertObjectToolbar: js.UndefOr[Boolean] = js.native
  
  /**
    * Shows/hides the "Text" toolbar.
    *
    */
  var showTextToolbar: js.UndefOr[Boolean] = js.native
  
  /**
    * Event fired after a toolbar is collapsed.
    */
  var toolbarCollapsed: js.UndefOr[ToolbarCollapsedEvent] = js.native
  
  /**
    * Event fired before a toolbar is collapsed.
    */
  var toolbarCollapsing: js.UndefOr[ToolbarCollapsingEvent] = js.native
  
  /**
    * Event fired after a toolbar is expanded.
    */
  var toolbarExpanded: js.UndefOr[ToolbarExpandedEvent] = js.native
  
  /**
    * Event fired before a toolbar is expanded.
    */
  var toolbarExpanding: js.UndefOr[ToolbarExpandingEvent] = js.native
  
  /**
    * The html editor toolbars list.
    *
    */
  var toolbarSettings: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Event is fired on keyboard undo action.
    */
  var undo: js.UndefOr[UndoEvent] = js.native
  
  /**
    * Used to render inside the html editor as initial content
    *
    */
  var value: js.UndefOr[String] = js.native
  
  /**
    * The width of the html editor. It can be set as a number in pixels, string (px) or percentage (%).
    *
    */
  var width: js.UndefOr[String | Double] = js.native
  
  /**
    * Event is fired after the workspace has been resized
    */
  var workspaceResized: js.UndefOr[WorkspaceResizedEvent] = js.native
}
object IgHtmlEditor {
  
  @scala.inline
  def apply(): IgHtmlEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgHtmlEditor]
  }
  
  @scala.inline
  implicit class IgHtmlEditorMutableBuilder[Self <: IgHtmlEditor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionExecuted(value: (/* event */ Event, /* ui */ ActionExecutedEventUIParam) => Unit): Self = StObject.set(x, "actionExecuted", js.Any.fromFunction2(value))
    
    @scala.inline
    def setActionExecutedUndefined: Self = StObject.set(x, "actionExecuted", js.undefined)
    
    @scala.inline
    def setActionExecuting(value: (/* event */ Event, /* ui */ ActionExecutingEventUIParam) => Unit): Self = StObject.set(x, "actionExecuting", js.Any.fromFunction2(value))
    
    @scala.inline
    def setActionExecutingUndefined: Self = StObject.set(x, "actionExecuting", js.undefined)
    
    @scala.inline
    def setCopy(value: (/* event */ Event, /* ui */ CopyEventUIParam) => Unit): Self = StObject.set(x, "copy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    @scala.inline
    def setCustomToolbars(value: js.Array[_]): Self = StObject.set(x, "customToolbars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomToolbarsUndefined: Self = StObject.set(x, "customToolbars", js.undefined)
    
    @scala.inline
    def setCustomToolbarsVarargs(value: js.Any*): Self = StObject.set(x, "customToolbars", js.Array(value :_*))
    
    @scala.inline
    def setCut(value: (/* event */ Event, /* ui */ CutEventUIParam) => Unit): Self = StObject.set(x, "cut", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCutUndefined: Self = StObject.set(x, "cut", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setInputName(value: String): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputNameUndefined: Self = StObject.set(x, "inputName", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setPaste(value: (/* event */ Event, /* ui */ PasteEventUIParam) => Unit): Self = StObject.set(x, "paste", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
    
    @scala.inline
    def setRedo(value: (/* event */ Event, /* ui */ RedoEventUIParam) => Unit): Self = StObject.set(x, "redo", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRedoUndefined: Self = StObject.set(x, "redo", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    @scala.inline
    def setRendered(value: (/* event */ Event, /* ui */ RenderedEventUIParam) => Unit): Self = StObject.set(x, "rendered", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderedUndefined: Self = StObject.set(x, "rendered", js.undefined)
    
    @scala.inline
    def setRendering(value: (/* event */ Event, /* ui */ RenderingEventUIParam) => Unit): Self = StObject.set(x, "rendering", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderingUndefined: Self = StObject.set(x, "rendering", js.undefined)
    
    @scala.inline
    def setShowCopyPasteToolbar(value: Boolean): Self = StObject.set(x, "showCopyPasteToolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCopyPasteToolbarUndefined: Self = StObject.set(x, "showCopyPasteToolbar", js.undefined)
    
    @scala.inline
    def setShowFormattingToolbar(value: Boolean): Self = StObject.set(x, "showFormattingToolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFormattingToolbarUndefined: Self = StObject.set(x, "showFormattingToolbar", js.undefined)
    
    @scala.inline
    def setShowInsertObjectToolbar(value: Boolean): Self = StObject.set(x, "showInsertObjectToolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowInsertObjectToolbarUndefined: Self = StObject.set(x, "showInsertObjectToolbar", js.undefined)
    
    @scala.inline
    def setShowTextToolbar(value: Boolean): Self = StObject.set(x, "showTextToolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTextToolbarUndefined: Self = StObject.set(x, "showTextToolbar", js.undefined)
    
    @scala.inline
    def setToolbarCollapsed(value: (/* event */ Event, /* ui */ ToolbarCollapsedEventUIParam) => Unit): Self = StObject.set(x, "toolbarCollapsed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToolbarCollapsedUndefined: Self = StObject.set(x, "toolbarCollapsed", js.undefined)
    
    @scala.inline
    def setToolbarCollapsing(value: (/* event */ Event, /* ui */ ToolbarCollapsingEventUIParam) => Unit): Self = StObject.set(x, "toolbarCollapsing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToolbarCollapsingUndefined: Self = StObject.set(x, "toolbarCollapsing", js.undefined)
    
    @scala.inline
    def setToolbarExpanded(value: (/* event */ Event, /* ui */ ToolbarExpandedEventUIParam) => Unit): Self = StObject.set(x, "toolbarExpanded", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToolbarExpandedUndefined: Self = StObject.set(x, "toolbarExpanded", js.undefined)
    
    @scala.inline
    def setToolbarExpanding(value: (/* event */ Event, /* ui */ ToolbarExpandingEventUIParam) => Unit): Self = StObject.set(x, "toolbarExpanding", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToolbarExpandingUndefined: Self = StObject.set(x, "toolbarExpanding", js.undefined)
    
    @scala.inline
    def setToolbarSettings(value: js.Array[_]): Self = StObject.set(x, "toolbarSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarSettingsUndefined: Self = StObject.set(x, "toolbarSettings", js.undefined)
    
    @scala.inline
    def setToolbarSettingsVarargs(value: js.Any*): Self = StObject.set(x, "toolbarSettings", js.Array(value :_*))
    
    @scala.inline
    def setUndo(value: (/* event */ Event, /* ui */ UndoEventUIParam) => Unit): Self = StObject.set(x, "undo", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUndoUndefined: Self = StObject.set(x, "undo", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWorkspaceResized(value: (/* event */ Event, /* ui */ WorkspaceResizedEventUIParam) => Unit): Self = StObject.set(x, "workspaceResized", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWorkspaceResizedUndefined: Self = StObject.set(x, "workspaceResized", js.undefined)
  }
}

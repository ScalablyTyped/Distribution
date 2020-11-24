package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
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
  implicit class IgHtmlEditorOps[Self <: IgHtmlEditor] (val x: Self) extends AnyVal {
    
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
    def setActionExecuted(value: (/* event */ Event, /* ui */ ActionExecutedEventUIParam) => Unit): Self = this.set("actionExecuted", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteActionExecuted: Self = this.set("actionExecuted", js.undefined)
    
    @scala.inline
    def setActionExecuting(value: (/* event */ Event, /* ui */ ActionExecutingEventUIParam) => Unit): Self = this.set("actionExecuting", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteActionExecuting: Self = this.set("actionExecuting", js.undefined)
    
    @scala.inline
    def setCopy(value: (/* event */ Event, /* ui */ CopyEventUIParam) => Unit): Self = this.set("copy", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCopy: Self = this.set("copy", js.undefined)
    
    @scala.inline
    def setCustomToolbarsVarargs(value: js.Any*): Self = this.set("customToolbars", js.Array(value :_*))
    
    @scala.inline
    def setCustomToolbars(value: js.Array[_]): Self = this.set("customToolbars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomToolbars: Self = this.set("customToolbars", js.undefined)
    
    @scala.inline
    def setCut(value: (/* event */ Event, /* ui */ CutEventUIParam) => Unit): Self = this.set("cut", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCut: Self = this.set("cut", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setInputName(value: String): Self = this.set("inputName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputName: Self = this.set("inputName", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setPaste(value: (/* event */ Event, /* ui */ PasteEventUIParam) => Unit): Self = this.set("paste", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePaste: Self = this.set("paste", js.undefined)
    
    @scala.inline
    def setRedo(value: (/* event */ Event, /* ui */ RedoEventUIParam) => Unit): Self = this.set("redo", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRedo: Self = this.set("redo", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    
    @scala.inline
    def setRendered(value: (/* event */ Event, /* ui */ RenderedEventUIParam) => Unit): Self = this.set("rendered", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRendered: Self = this.set("rendered", js.undefined)
    
    @scala.inline
    def setRendering(value: (/* event */ Event, /* ui */ RenderingEventUIParam) => Unit): Self = this.set("rendering", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRendering: Self = this.set("rendering", js.undefined)
    
    @scala.inline
    def setShowCopyPasteToolbar(value: Boolean): Self = this.set("showCopyPasteToolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCopyPasteToolbar: Self = this.set("showCopyPasteToolbar", js.undefined)
    
    @scala.inline
    def setShowFormattingToolbar(value: Boolean): Self = this.set("showFormattingToolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFormattingToolbar: Self = this.set("showFormattingToolbar", js.undefined)
    
    @scala.inline
    def setShowInsertObjectToolbar(value: Boolean): Self = this.set("showInsertObjectToolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowInsertObjectToolbar: Self = this.set("showInsertObjectToolbar", js.undefined)
    
    @scala.inline
    def setShowTextToolbar(value: Boolean): Self = this.set("showTextToolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTextToolbar: Self = this.set("showTextToolbar", js.undefined)
    
    @scala.inline
    def setToolbarCollapsed(value: (/* event */ Event, /* ui */ ToolbarCollapsedEventUIParam) => Unit): Self = this.set("toolbarCollapsed", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteToolbarCollapsed: Self = this.set("toolbarCollapsed", js.undefined)
    
    @scala.inline
    def setToolbarCollapsing(value: (/* event */ Event, /* ui */ ToolbarCollapsingEventUIParam) => Unit): Self = this.set("toolbarCollapsing", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteToolbarCollapsing: Self = this.set("toolbarCollapsing", js.undefined)
    
    @scala.inline
    def setToolbarExpanded(value: (/* event */ Event, /* ui */ ToolbarExpandedEventUIParam) => Unit): Self = this.set("toolbarExpanded", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteToolbarExpanded: Self = this.set("toolbarExpanded", js.undefined)
    
    @scala.inline
    def setToolbarExpanding(value: (/* event */ Event, /* ui */ ToolbarExpandingEventUIParam) => Unit): Self = this.set("toolbarExpanding", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteToolbarExpanding: Self = this.set("toolbarExpanding", js.undefined)
    
    @scala.inline
    def setToolbarSettingsVarargs(value: js.Any*): Self = this.set("toolbarSettings", js.Array(value :_*))
    
    @scala.inline
    def setToolbarSettings(value: js.Array[_]): Self = this.set("toolbarSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarSettings: Self = this.set("toolbarSettings", js.undefined)
    
    @scala.inline
    def setUndo(value: (/* event */ Event, /* ui */ UndoEventUIParam) => Unit): Self = this.set("undo", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUndo: Self = this.set("undo", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWorkspaceResized(value: (/* event */ Event, /* ui */ WorkspaceResizedEventUIParam) => Unit): Self = this.set("workspaceResized", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteWorkspaceResized: Self = this.set("workspaceResized", js.undefined)
  }
}

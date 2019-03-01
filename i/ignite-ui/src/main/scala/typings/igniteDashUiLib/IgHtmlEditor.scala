package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgHtmlEditor
  extends /**
	 * Option for igHtmlEditor
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
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
  var customToolbars: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Event is fired on keyboard cut action.
  	 */
  var cut: js.UndefOr[CutEvent] = js.undefined
  /**
  	 * The height of the html editor. It can be set as a number in pixels, string (px) or percentage (%).
  	 *
  	 */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * The name attribute of the html editor source view.
  	 *
  	 */
  var inputName: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
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
  var regional: js.UndefOr[java.lang.String | js.Object] = js.undefined
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
  var showCopyPasteToolbar: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Shows/hides the "Formatting" toolbar.
  	 *
  	 */
  var showFormattingToolbar: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Shows/hides the "Insert Object" toolbar.
  	 *
  	 */
  var showInsertObjectToolbar: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Shows/hides the "Text" toolbar.
  	 *
  	 */
  var showTextToolbar: js.UndefOr[scala.Boolean] = js.undefined
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
  var toolbarSettings: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Event is fired on keyboard undo action.
  	 */
  var undo: js.UndefOr[UndoEvent] = js.undefined
  /**
  	 * Used to render inside the html editor as initial content
  	 *
  	 */
  var value: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The width of the html editor. It can be set as a number in pixels, string (px) or percentage (%).
  	 *
  	 */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * Event is fired after the workspace has been resized
  	 */
  var workspaceResized: js.UndefOr[WorkspaceResizedEvent] = js.undefined
}

object IgHtmlEditor {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igHtmlEditor
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    actionExecuted: ActionExecutedEvent = null,
    actionExecuting: ActionExecutingEvent = null,
    copy: CopyEvent = null,
    customToolbars: js.Array[_] = null,
    cut: CutEvent = null,
    height: java.lang.String | scala.Double = null,
    inputName: java.lang.String = null,
    language: java.lang.String = null,
    locale: js.Any = null,
    paste: PasteEvent = null,
    redo: RedoEvent = null,
    regional: java.lang.String | js.Object = null,
    rendered: RenderedEvent = null,
    rendering: RenderingEvent = null,
    showCopyPasteToolbar: js.UndefOr[scala.Boolean] = js.undefined,
    showFormattingToolbar: js.UndefOr[scala.Boolean] = js.undefined,
    showInsertObjectToolbar: js.UndefOr[scala.Boolean] = js.undefined,
    showTextToolbar: js.UndefOr[scala.Boolean] = js.undefined,
    toolbarCollapsed: ToolbarCollapsedEvent = null,
    toolbarCollapsing: ToolbarCollapsingEvent = null,
    toolbarExpanded: ToolbarExpandedEvent = null,
    toolbarExpanding: ToolbarExpandingEvent = null,
    toolbarSettings: js.Array[_] = null,
    undo: UndoEvent = null,
    value: java.lang.String = null,
    width: java.lang.String | scala.Double = null,
    workspaceResized: WorkspaceResizedEvent = null
  ): IgHtmlEditor = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (actionExecuted != null) __obj.updateDynamic("actionExecuted")(actionExecuted)
    if (actionExecuting != null) __obj.updateDynamic("actionExecuting")(actionExecuting)
    if (copy != null) __obj.updateDynamic("copy")(copy)
    if (customToolbars != null) __obj.updateDynamic("customToolbars")(customToolbars)
    if (cut != null) __obj.updateDynamic("cut")(cut)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (inputName != null) __obj.updateDynamic("inputName")(inputName)
    if (language != null) __obj.updateDynamic("language")(language)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (paste != null) __obj.updateDynamic("paste")(paste)
    if (redo != null) __obj.updateDynamic("redo")(redo)
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (rendered != null) __obj.updateDynamic("rendered")(rendered)
    if (rendering != null) __obj.updateDynamic("rendering")(rendering)
    if (!js.isUndefined(showCopyPasteToolbar)) __obj.updateDynamic("showCopyPasteToolbar")(showCopyPasteToolbar)
    if (!js.isUndefined(showFormattingToolbar)) __obj.updateDynamic("showFormattingToolbar")(showFormattingToolbar)
    if (!js.isUndefined(showInsertObjectToolbar)) __obj.updateDynamic("showInsertObjectToolbar")(showInsertObjectToolbar)
    if (!js.isUndefined(showTextToolbar)) __obj.updateDynamic("showTextToolbar")(showTextToolbar)
    if (toolbarCollapsed != null) __obj.updateDynamic("toolbarCollapsed")(toolbarCollapsed)
    if (toolbarCollapsing != null) __obj.updateDynamic("toolbarCollapsing")(toolbarCollapsing)
    if (toolbarExpanded != null) __obj.updateDynamic("toolbarExpanded")(toolbarExpanded)
    if (toolbarExpanding != null) __obj.updateDynamic("toolbarExpanding")(toolbarExpanding)
    if (toolbarSettings != null) __obj.updateDynamic("toolbarSettings")(toolbarSettings)
    if (undo != null) __obj.updateDynamic("undo")(undo)
    if (value != null) __obj.updateDynamic("value")(value)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (workspaceResized != null) __obj.updateDynamic("workspaceResized")(workspaceResized)
    __obj.asInstanceOf[IgHtmlEditor]
  }
}


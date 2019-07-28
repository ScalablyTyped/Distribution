package typings.atJupyterlabCodeeditor.libWidgetMod

import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.IEditor
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.IModel
import typings.atJupyterlabCodeeditor.libWidgetMod.CodeEditorWrapperNs.IOptions
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.WidgetNs.ResizeMessage
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codeeditor/lib/widget", "CodeEditorWrapper")
@js.native
class CodeEditorWrapper protected () extends Widget {
  /**
    * Construct a new code editor widget.
    */
  def this(options: IOptions) = this()
  /**
    * Handle the `'p-dragenter'` event for the widget.
    */
  var _evtDragEnter: js.Any = js.native
  /**
    * Handle the `'p-dragleave'` event for the widget.
    */
  var _evtDragLeave: js.Any = js.native
  /**
    * Handle the `'p-dragover'` event for the widget.
    */
  var _evtDragOver: js.Any = js.native
  /**
    * Handle the `'p-drop'` event for the widget.
    */
  var _evtDrop: js.Any = js.native
  /**
    * Handle a change in model selections.
    */
  var _onSelectionsChanged: js.Any = js.native
  var _updateOnShow: js.Any = js.native
  /**
    * Get the editor wrapped by the widget.
    */
  val editor: IEditor = js.native
  /**
    * Get the model used by the widget.
    */
  val model: IModel = js.native
  /**
    * Handle the DOM events for the widget.
    *
    * @param event - The DOM event sent to the widget.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the notebook panel's node. It should
    * not be called directly by user code.
    */
  def handleEvent(event: Event): Unit = js.native
  /**
    * A message handler invoked on a `'resize'` message.
    */
  /* protected */ def onResize(msg: ResizeMessage): Unit = js.native
}


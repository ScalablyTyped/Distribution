package typings
package atJupyterlabCodeeditorLib.libWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codeeditor/lib/widget", "CodeEditorWrapper")
@js.native
class CodeEditorWrapper protected ()
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget {
  /**
    * Construct a new code editor widget.
    */
  def this(options: atJupyterlabCodeeditorLib.libWidgetMod.CodeEditorWrapperNs.IOptions) = this()
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
  val editor: atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.IEditor = js.native
  /**
    * Get the model used by the widget.
    */
  val model: atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.IModel = js.native
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
  def handleEvent(event: stdLib.Event): scala.Unit = js.native
  /**
    * A message handler invoked on a `'resize'` message.
    */
  /* protected */ def onResize(msg: atPhosphorWidgetsLib.atPhosphorWidgetsMod.WidgetNs.ResizeMessage): scala.Unit = js.native
}


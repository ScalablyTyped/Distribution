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
    * Handle a change in model selections.
    */
  var _onSelectionsChanged: js.Any = js.native
  /**
    * Get the editor wrapped by the widget.
    */
  val editor: atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.IEditor = js.native
  /**
    * Get the model used by the widget.
    */
  val model: atJupyterlabCodeeditorLib.libEditorMod.CodeEditorNs.IModel = js.native
  /**
    * A message handler invoked on a `'resize'` message.
    */
  /* protected */ def onResize(msg: atPhosphorWidgetsLib.atPhosphorWidgetsMod.WidgetNs.ResizeMessage): scala.Unit = js.native
}


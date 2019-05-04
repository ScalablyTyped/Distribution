package typings
package atJupyterlabCellsLib.libInputareaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/inputarea", "InputArea")
@js.native
class InputArea protected ()
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget {
  /**
    * Construct an input area widget.
    */
  def this(options: atJupyterlabCellsLib.libInputareaMod.InputAreaNs.IOptions) = this()
  var _editor: js.Any = js.native
  var _prompt: js.Any = js.native
  var _rendered: js.Any = js.native
  /**
    * The content factory used by the widget.
    */
  val contentFactory: atJupyterlabCellsLib.libInputareaMod.InputAreaNs.IContentFactory = js.native
  /**
    * Get the CodeEditor used by the cell.
    */
  val editor: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any = js.native
  /**
    * Get the CodeEditorWrapper used by the cell.
    */
  val editorWidget: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditorWrapper */ js.Any = js.native
  /**
    * The model used by the widget.
    */
  val model: atJupyterlabCellsLib.libModelMod.ICellModel = js.native
  /**
    * Get the prompt node used by the cell.
    */
  val promptNode: stdLib.HTMLElement = js.native
  /**
    * Render an input instead of the text editor.
    */
  def renderInput(widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget): scala.Unit = js.native
  /**
    * Set the prompt of the input area.
    */
  def setPrompt(value: java.lang.String): scala.Unit = js.native
  /**
    * Show the text editor.
    */
  def showEditor(): scala.Unit = js.native
}


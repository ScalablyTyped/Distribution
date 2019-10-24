package typings.atJupyterlabCells.libInputareaMod

import typings.atJupyterlabCells.libInputareaMod.InputArea.IContentFactory
import typings.atJupyterlabCells.libInputareaMod.InputArea.IOptions
import typings.atJupyterlabCells.libModelMod.ICellModel
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/inputarea", "InputArea")
@js.native
class InputArea_ protected () extends Widget {
  /**
    * Construct an input area widget.
    */
  def this(options: IOptions) = this()
  var _editor: js.Any = js.native
  var _prompt: js.Any = js.native
  var _rendered: js.Any = js.native
  /**
    * The content factory used by the widget.
    */
  val contentFactory: IContentFactory = js.native
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
  val model: ICellModel = js.native
  /**
    * Get the prompt node used by the cell.
    */
  val promptNode: HTMLElement = js.native
  /**
    * Render an input instead of the text editor.
    */
  def renderInput(widget: Widget): Unit = js.native
  /**
    * Set the prompt of the input area.
    */
  def setPrompt(value: String): Unit = js.native
  /**
    * Show the text editor.
    */
  def showEditor(): Unit = js.native
}


package typings
package atJupyterlabCellsLib.libWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/widget", "Cell")
@js.native
class Cell protected ()
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget {
  /**
    * Construct a new base cell widget.
    */
  def this(options: atJupyterlabCellsLib.libWidgetMod.CellNs.IOptions) = this()
  var _input: js.Any = js.native
  var _inputHidden: js.Any = js.native
  var _inputPlaceholder: js.Any = js.native
  var _inputWrapper: js.Any = js.native
  var _model: js.Any = js.native
  var _readOnly: js.Any = js.native
  /**
    * The content factory used by the widget.
    */
  val contentFactory: atJupyterlabCellsLib.libWidgetMod.CellNs.IContentFactory = js.native
  /**
    * Get the CodeEditor used by the cell.
    */
  val editor: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any = js.native
  /**
    * Get the CodeEditorWrapper used by the cell.
    */
  val editorWidget: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditorWrapper */ js.Any = js.native
  /**
    * Get the input area for the cell.
    */
  val inputArea: atJupyterlabCellsLib.libInputareaMod.InputArea = js.native
  /**
    * The view state of input being hidden.
    */
  var inputHidden: scala.Boolean = js.native
  /**
    * Get the model used by the cell.
    */
  val model: atJupyterlabCellsLib.libModelMod.ICellModel = js.native
  /**
    * Get the prompt node used by the cell.
    */
  val promptNode: stdLib.HTMLElement = js.native
  /**
    * The read only state of the cell.
    */
  var readOnly: scala.Boolean = js.native
  /**
    * A promise that resolves when the widget renders for the first time.
    */
  val ready: js.Promise[scala.Unit] = js.native
  /**
    * Handle the input being hidden.
    *
    * #### Notes
    * This is called by the `inputHidden` setter so that subclasses
    * can perform actions upon the input being hidden without accessing
    * private state.
    */
  /* protected */ def handleInputHidden(value: scala.Boolean): scala.Unit = js.native
  /**
    * Modify some state for initialization.
    *
    * Should be called at the end of the subclasses's constructor.
    */
  /* protected */ def initializeState(): scala.Unit = js.native
  /**
    * Set the prompt for the widget.
    */
  def setPrompt(value: java.lang.String): scala.Unit = js.native
}


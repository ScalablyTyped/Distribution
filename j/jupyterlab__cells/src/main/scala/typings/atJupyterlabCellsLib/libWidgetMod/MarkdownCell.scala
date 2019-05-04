package typings
package atJupyterlabCellsLib.libWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/widget", "MarkdownCell")
@js.native
class MarkdownCell protected () extends Cell {
  /**
    * Construct a Markdown cell widget.
    */
  def this(options: atJupyterlabCellsLib.libWidgetMod.MarkdownCellNs.IOptions) = this()
  /**
    * Handle the rendered state.
    */
  var _handleRendered: js.Any = js.native
  var _monitor: js.Any = js.native
  var _prevText: js.Any = js.native
  var _ready: js.Any = js.native
  var _rendered: js.Any = js.native
  var _renderer: js.Any = js.native
  var _rendermime: js.Any = js.native
  /**
    * Update the rendered input.
    */
  var _updateRenderedInput: js.Any = js.native
  /**
    * The model used by the widget.
    */
  @JSName("model")
  val model_MarkdownCell: atJupyterlabCellsLib.libModelMod.IMarkdownCellModel = js.native
  /**
    * Whether the cell is rendered.
    */
  var rendered: scala.Boolean = js.native
  /**
    * Render an input instead of the text editor.
    */
  /* protected */ def renderInput(widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget): scala.Unit = js.native
  /**
    * Show the text editor instead of rendered input.
    */
  /* protected */ def showEditor(): scala.Unit = js.native
}


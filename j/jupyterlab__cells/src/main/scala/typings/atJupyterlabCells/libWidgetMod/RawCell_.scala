package typings.atJupyterlabCells.libWidgetMod

import typings.atJupyterlabCells.libModelMod.IRawCellModel
import typings.atJupyterlabCells.libWidgetMod.Cell.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/widget", "RawCell")
@js.native
class RawCell_ protected () extends Cell {
  /**
    * Construct a raw cell widget.
    */
  def this(options: IOptions) = this()
  /**
    * The model used by the widget.
    */
  @JSName("model")
  val model_RawCell_ : IRawCellModel = js.native
}


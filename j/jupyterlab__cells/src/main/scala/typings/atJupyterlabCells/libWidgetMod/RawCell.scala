package typings.atJupyterlabCells.libWidgetMod

import typings.atJupyterlabCells.libModelMod.IRawCellModel
import typings.atJupyterlabCells.libWidgetMod.CellNs.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/widget", "RawCell")
@js.native
class RawCell protected () extends Cell {
  /**
    * Construct a raw cell widget.
    */
  def this(options: IOptions) = this()
  /**
    * The model used by the widget.
    */
  @JSName("model")
  val model_RawCell: IRawCellModel = js.native
}


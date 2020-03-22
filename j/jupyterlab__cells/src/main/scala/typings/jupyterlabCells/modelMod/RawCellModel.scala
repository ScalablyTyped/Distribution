package typings.jupyterlabCells.modelMod

import typings.jupyterlabCells.jupyterlabCellsStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/model", "RawCellModel")
@js.native
class RawCellModel () extends AttachmentsCellModel {
  /**
    * The type of the cell.
    */
  @JSName("type")
  def type_MRawCellModel(): raw = js.native
}


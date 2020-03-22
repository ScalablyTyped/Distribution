package typings.jupyterlabCells.modelMod

import typings.jupyterlabCells.jupyterlabCellsStrings.markdown
import typings.jupyterlabCells.modelMod.CellModel.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/model", "MarkdownCellModel")
@js.native
class MarkdownCellModel protected () extends AttachmentsCellModel {
  /**
    * Construct a markdown cell model from optional cell content.
    */
  def this(options: IOptions) = this()
  /**
    * The type of the cell.
    */
  @JSName("type")
  def type_MMarkdownCellModel(): markdown = js.native
}


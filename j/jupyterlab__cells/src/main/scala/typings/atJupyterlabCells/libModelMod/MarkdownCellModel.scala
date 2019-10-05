package typings.atJupyterlabCells.libModelMod

import typings.atJupyterlabCells.atJupyterlabCellsStrings.markdown
import typings.atJupyterlabCells.libModelMod.CellModel.IOptions
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
  val type_MarkdownCellModel: markdown = js.native
}


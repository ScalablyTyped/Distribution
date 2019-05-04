package typings
package atJupyterlabCellsLib.libModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/model", "MarkdownCellModel")
@js.native
class MarkdownCellModel protected () extends AttachmentsCellModel {
  /**
    * Construct a markdown cell model from optional cell content.
    */
  def this(options: atJupyterlabCellsLib.libModelMod.CellModelNs.IOptions) = this()
  /**
    * The type of the cell.
    */
  @JSName("type")
  val type_MarkdownCellModel: atJupyterlabCellsLib.atJupyterlabCellsLibStrings.markdown = js.native
}


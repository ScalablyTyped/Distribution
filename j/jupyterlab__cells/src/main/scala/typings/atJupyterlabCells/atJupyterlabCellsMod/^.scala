package typings.atJupyterlabCells.atJupyterlabCellsMod

import typings.atJupyterlabCells.libModelMod.ICellModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def isCodeCellModel(model: ICellModel): /* is @jupyterlab/cells.@jupyterlab/cells/lib/model.ICodeCellModel */ Boolean = js.native
  def isMarkdownCellModel(model: ICellModel): /* is @jupyterlab/cells.@jupyterlab/cells/lib/model.IMarkdownCellModel */ Boolean = js.native
  def isRawCellModel(model: ICellModel): /* is @jupyterlab/cells.@jupyterlab/cells/lib/model.IRawCellModel */ Boolean = js.native
}


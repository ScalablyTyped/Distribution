package typings.atJupyterlabConsole.libWidgetMod.CodeConsole

import typings.atJupyterlabCells.libModelMod.ICodeCellModel
import typings.atJupyterlabCells.libModelMod.IRawCellModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default implementation of an `IModelFactory`.
  */
@JSImport("@jupyterlab/console/lib/widget", "CodeConsole.ModelFactory")
@js.native
/**
  * Create a new cell model factory.
  */
class ModelFactory () extends js.Object {
  def this(options: IModelFactoryOptions) = this()
  /**
    * The factory for output area models.
    */
  val codeCellContentFactory: typings.atJupyterlabCells.libModelMod.CodeCellModel.IContentFactory = js.native
  /**
    * Create a new code cell.
    *
    * @param source - The data to use for the original source data.
    *
    * @returns A new code cell. If a source cell is provided, the
    *   new cell will be initialized with the data from the source.
    *   If the contentFactory is not provided, the instance
    *   `codeCellContentFactory` will be used.
    */
  def createCodeCell(options: typings.atJupyterlabCells.libModelMod.CodeCellModel.IOptions): ICodeCellModel = js.native
  /**
    * Create a new raw cell.
    *
    * @param source - The data to use for the original source data.
    *
    * @returns A new raw cell. If a source cell is provided, the
    *   new cell will be initialized with the data from the source.
    */
  def createRawCell(options: typings.atJupyterlabCells.libModelMod.CellModel.IOptions): IRawCellModel = js.native
}


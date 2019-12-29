package typings.atJupyterlabNotebook.libModelMod.NotebookModel

import typings.atJupyterlabCells.libModelMod.ICellModel
import typings.atJupyterlabCells.libModelMod.ICodeCellModel
import typings.atJupyterlabCells.libModelMod.IMarkdownCellModel
import typings.atJupyterlabCells.libModelMod.IRawCellModel
import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.CellType
import typings.atJupyterlabObservables.libModeldbMod.IModelDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default implementation of an `IContentFactory`.
  */
@JSImport("@jupyterlab/notebook/lib/model", "NotebookModel.ContentFactory")
@js.native
class ContentFactory_ protected () extends js.Object {
  /**
    * Create a new cell model factory.
    */
  def this(options: typings.atJupyterlabNotebook.libModelMod.NotebookModel.ContentFactory.IOptions) = this()
  /**
    * The factory for code cell content.
    */
  val codeCellContentFactory: typings.atJupyterlabCells.libModelMod.CodeCellModel.IContentFactory = js.native
  /**
    * The IModelDB in which to put the notebook data.
    */
  val modelDB: js.UndefOr[IModelDB] = js.native
  /**
    * Clone the content factory with a new IModelDB.
    */
  def clone(modelDB: IModelDB): ContentFactory = js.native
  /**
    * Create a new cell by cell type.
    *
    * @param type:  the type of the cell to create.
    *
    * @param options: the cell creation options.
    *
    * #### Notes
    * This method is intended to be a convenience method to programmaticaly
    * call the other cell creation methods in the factory.
    */
  def createCell(`type`: CellType, opts: typings.atJupyterlabCells.libModelMod.CellModel.IOptions): ICellModel = js.native
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
    * Create a new markdown cell.
    *
    * @param source - The data to use for the original source data.
    *
    * @returns A new markdown cell. If a source cell is provided, the
    *   new cell will be initialized with the data from the source.
    */
  def createMarkdownCell(options: typings.atJupyterlabCells.libModelMod.CellModel.IOptions): IMarkdownCellModel = js.native
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


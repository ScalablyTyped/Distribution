package typings.jupyterlabNotebook.modelMod.NotebookModel

import typings.jupyterlabCells.modelMod.ICellModel
import typings.jupyterlabCells.modelMod.ICodeCellModel
import typings.jupyterlabCells.modelMod.IMarkdownCellModel
import typings.jupyterlabCells.modelMod.IRawCellModel
import typings.jupyterlabNbformat.mod.CellType
import typings.jupyterlabObservables.modeldbMod.IModelDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The default implementation of an `IContentFactory`.
  */
@JSImport("@jupyterlab/notebook/lib/model", "NotebookModel.ContentFactory")
@js.native
class ContentFactory_ protected () extends js.Object {
  /**
    * Create a new cell model factory.
    */
  def this(options: typings.jupyterlabNotebook.modelMod.NotebookModel.ContentFactory.IOptions) = this()
  
  /**
    * Clone the content factory with a new IModelDB.
    */
  def clone(modelDB: IModelDB): ContentFactory = js.native
  
  /**
    * The factory for code cell content.
    */
  val codeCellContentFactory: typings.jupyterlabCells.modelMod.CodeCellModel.IContentFactory = js.native
  
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
  def createCell(`type`: CellType, opts: typings.jupyterlabCells.modelMod.CellModel.IOptions): ICellModel = js.native
  
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
  def createCodeCell(options: typings.jupyterlabCells.modelMod.CodeCellModel.IOptions): ICodeCellModel = js.native
  
  /**
    * Create a new markdown cell.
    *
    * @param source - The data to use for the original source data.
    *
    * @returns A new markdown cell. If a source cell is provided, the
    *   new cell will be initialized with the data from the source.
    */
  def createMarkdownCell(options: typings.jupyterlabCells.modelMod.CellModel.IOptions): IMarkdownCellModel = js.native
  
  /**
    * Create a new raw cell.
    *
    * @param source - The data to use for the original source data.
    *
    * @returns A new raw cell. If a source cell is provided, the
    *   new cell will be initialized with the data from the source.
    */
  def createRawCell(options: typings.jupyterlabCells.modelMod.CellModel.IOptions): IRawCellModel = js.native
  
  /**
    * The IModelDB in which to put the notebook data.
    */
  val modelDB: js.UndefOr[IModelDB] = js.native
}

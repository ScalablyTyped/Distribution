package typings.jupyterlabConsole.widgetMod.CodeConsole

import typings.jupyterlabCells.modelMod.ICodeCellModel
import typings.jupyterlabCells.modelMod.IRawCellModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  val codeCellContentFactory: typings.jupyterlabCells.modelMod.CodeCellModel.IContentFactory = js.native
  
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
    * Create a new raw cell.
    *
    * @param source - The data to use for the original source data.
    *
    * @returns A new raw cell. If a source cell is provided, the
    *   new cell will be initialized with the data from the source.
    */
  def createRawCell(options: typings.jupyterlabCells.modelMod.CellModel.IOptions): IRawCellModel = js.native
}

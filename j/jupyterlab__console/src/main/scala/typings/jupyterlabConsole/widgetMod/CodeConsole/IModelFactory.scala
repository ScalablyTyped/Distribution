package typings.jupyterlabConsole.widgetMod.CodeConsole

import typings.jupyterlabCells.modelMod.ICodeCellModel
import typings.jupyterlabCells.modelMod.IRawCellModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A model factory for a console widget.
  */
trait IModelFactory extends js.Object {
  /**
    * The factory for code cell content.
    */
  val codeCellContentFactory: typings.jupyterlabCells.modelMod.CodeCellModel.IContentFactory
  /**
    * Create a new code cell.
    *
    * @param options - The options used to create the cell.
    *
    * @returns A new code cell. If a source cell is provided, the
    *   new cell will be initialized with the data from the source.
    */
  def createCodeCell(options: typings.jupyterlabCells.modelMod.CodeCellModel.IOptions): ICodeCellModel
  /**
    * Create a new raw cell.
    *
    * @param options - The options used to create the cell.
    *
    * @returns A new raw cell. If a source cell is provided, the
    *   new cell will be initialized with the data from the source.
    */
  def createRawCell(options: typings.jupyterlabCells.modelMod.CellModel.IOptions): IRawCellModel
}

object IModelFactory {
  @scala.inline
  def apply(
    codeCellContentFactory: typings.jupyterlabCells.modelMod.CodeCellModel.IContentFactory,
    createCodeCell: typings.jupyterlabCells.modelMod.CodeCellModel.IOptions => ICodeCellModel,
    createRawCell: typings.jupyterlabCells.modelMod.CellModel.IOptions => IRawCellModel
  ): IModelFactory = {
    val __obj = js.Dynamic.literal(codeCellContentFactory = codeCellContentFactory.asInstanceOf[js.Any], createCodeCell = js.Any.fromFunction1(createCodeCell), createRawCell = js.Any.fromFunction1(createRawCell))
  
    __obj.asInstanceOf[IModelFactory]
  }
}


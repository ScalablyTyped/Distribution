package typings.atJupyterlabConsole.libWidgetMod.CodeConsole

import typings.atJupyterlabCells.libModelMod.ICodeCellModel
import typings.atJupyterlabCells.libModelMod.IRawCellModel
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
  val codeCellContentFactory: typings.atJupyterlabCells.libModelMod.CodeCellModel.IContentFactory
  /**
    * Create a new code cell.
    *
    * @param options - The options used to create the cell.
    *
    * @returns A new code cell. If a source cell is provided, the
    *   new cell will be initialized with the data from the source.
    */
  def createCodeCell(options: typings.atJupyterlabCells.libModelMod.CodeCellModel.IOptions): ICodeCellModel
  /**
    * Create a new raw cell.
    *
    * @param options - The options used to create the cell.
    *
    * @returns A new raw cell. If a source cell is provided, the
    *   new cell will be initialized with the data from the source.
    */
  def createRawCell(options: typings.atJupyterlabCells.libModelMod.CellModel.IOptions): IRawCellModel
}

object IModelFactory {
  @scala.inline
  def apply(
    codeCellContentFactory: typings.atJupyterlabCells.libModelMod.CodeCellModel.IContentFactory,
    createCodeCell: typings.atJupyterlabCells.libModelMod.CodeCellModel.IOptions => ICodeCellModel,
    createRawCell: typings.atJupyterlabCells.libModelMod.CellModel.IOptions => IRawCellModel
  ): IModelFactory = {
    val __obj = js.Dynamic.literal(codeCellContentFactory = codeCellContentFactory.asInstanceOf[js.Any], createCodeCell = js.Any.fromFunction1(createCodeCell), createRawCell = js.Any.fromFunction1(createRawCell))
  
    __obj.asInstanceOf[IModelFactory]
  }
}


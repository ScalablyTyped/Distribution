package typings.atJupyterlabConsole.libForeignMod.ForeignHandler

import typings.atJupyterlabCells.atJupyterlabCellsMod.CodeCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A receiver of newly created foreign cells.
  */
trait IReceiver extends js.Object {
  /**
    * Add a newly created cell.
    */
  def addCell(cell: CodeCell, msgId: String): Unit
  /**
    * Create a cell.
    */
  def createCodeCell(): CodeCell
  /**
    * Get a cell associated with a message id.
    */
  def getCell(msgId: String): CodeCell
  /**
    * Trigger a rendering update on the receiver.
    */
  def update(): Unit
}

object IReceiver {
  @scala.inline
  def apply(
    addCell: (CodeCell, String) => Unit,
    createCodeCell: () => CodeCell,
    getCell: String => CodeCell,
    update: () => Unit
  ): IReceiver = {
    val __obj = js.Dynamic.literal(addCell = js.Any.fromFunction2(addCell), createCodeCell = js.Any.fromFunction0(createCodeCell), getCell = js.Any.fromFunction1(getCell), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[IReceiver]
  }
}


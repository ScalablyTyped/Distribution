package typings
package atJupyterlabConsoleLib.libForeignMod.ForeignHandlerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A receiver of newly created foreign cells.
  */
trait IReceiver extends js.Object {
  /**
    * Add a newly created foreign cell.
    */
  def addCell(cell: atJupyterlabCellsLib.atJupyterlabCellsMod.Cell): scala.Unit
  /**
    * Trigger a rendering update on the receiver.
    */
  def update(): scala.Unit
}

object IReceiver {
  @scala.inline
  def apply(addCell: atJupyterlabCellsLib.atJupyterlabCellsMod.Cell => scala.Unit, update: () => scala.Unit): IReceiver = {
    val __obj = js.Dynamic.literal(addCell = js.Any.fromFunction1(addCell), update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[IReceiver]
  }
}


package typings.jupyterlabConsole.foreignMod.ForeignHandler

import typings.jupyterlabCells.mod.CodeCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A receiver of newly created foreign cells.
  */
@js.native
trait IReceiver extends js.Object {
  
  /**
    * Add a newly created cell.
    */
  def addCell(cell: CodeCell, msgId: String): Unit = js.native
  
  /**
    * Create a cell.
    */
  def createCodeCell(): CodeCell = js.native
  
  /**
    * Get a cell associated with a message id.
    */
  def getCell(msgId: String): js.UndefOr[CodeCell] = js.native
  
  /**
    * Trigger a rendering update on the receiver.
    */
  def update(): Unit = js.native
}
object IReceiver {
  
  @scala.inline
  def apply(
    addCell: (CodeCell, String) => Unit,
    createCodeCell: () => CodeCell,
    getCell: String => js.UndefOr[CodeCell],
    update: () => Unit
  ): IReceiver = {
    val __obj = js.Dynamic.literal(addCell = js.Any.fromFunction2(addCell), createCodeCell = js.Any.fromFunction0(createCodeCell), getCell = js.Any.fromFunction1(getCell), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[IReceiver]
  }
  
  @scala.inline
  implicit class IReceiverOps[Self <: IReceiver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddCell(value: (CodeCell, String) => Unit): Self = this.set("addCell", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateCodeCell(value: () => CodeCell): Self = this.set("createCodeCell", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCell(value: String => js.UndefOr[CodeCell]): Self = this.set("getCell", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
  }
}

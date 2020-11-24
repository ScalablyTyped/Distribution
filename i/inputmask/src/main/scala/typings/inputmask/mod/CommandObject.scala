package typings.inputmask.mod

import typings.inputmask.anon.Start
import typings.inputmask.inputmaskBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandObject extends js.Object {
  
  /**
    * Character to insert.
    */
  var c: js.UndefOr[String] = js.native
  
  /**
    * Position of the caret.
    */
  var caret: js.UndefOr[Double] = js.native
  
  /**
    * Position(s) to add.
    */
  var insert: js.UndefOr[InsertPosition | js.Array[InsertPosition]] = js.native
  
  /**
    * Position to insert.
    */
  var pos: js.UndefOr[Double] = js.native
  
  /**
    * * `true` => refresh validPositions from the complete buffer .
    * * `{ start: , end: }` => refresh from start to end.
    */
  var refreshFromBuffer: js.UndefOr[`true` | Start] = js.native
  
  /**
    * Position(s) to remove.
    */
  var remove: js.UndefOr[Double | js.Array[Double]] = js.native
}
object CommandObject {
  
  @scala.inline
  def apply(): CommandObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandObject]
  }
  
  @scala.inline
  implicit class CommandObjectOps[Self <: CommandObject] (val x: Self) extends AnyVal {
    
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
    def setC(value: String): Self = this.set("c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteC: Self = this.set("c", js.undefined)
    
    @scala.inline
    def setCaret(value: Double): Self = this.set("caret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaret: Self = this.set("caret", js.undefined)
    
    @scala.inline
    def setInsertVarargs(value: InsertPosition*): Self = this.set("insert", js.Array(value :_*))
    
    @scala.inline
    def setInsert(value: InsertPosition | js.Array[InsertPosition]): Self = this.set("insert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsert: Self = this.set("insert", js.undefined)
    
    @scala.inline
    def setPos(value: Double): Self = this.set("pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePos: Self = this.set("pos", js.undefined)
    
    @scala.inline
    def setRefreshFromBuffer(value: `true` | Start): Self = this.set("refreshFromBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshFromBuffer: Self = this.set("refreshFromBuffer", js.undefined)
    
    @scala.inline
    def setRemoveVarargs(value: Double*): Self = this.set("remove", js.Array(value :_*))
    
    @scala.inline
    def setRemove(value: Double | js.Array[Double]): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
  }
}

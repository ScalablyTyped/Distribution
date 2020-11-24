package typings.jestSnapshot.stateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveStatus extends js.Object {
  
  var deleted: Boolean = js.native
  
  var saved: Boolean = js.native
}
object SaveStatus {
  
  @scala.inline
  def apply(deleted: Boolean, saved: Boolean): SaveStatus = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], saved = saved.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveStatus]
  }
  
  @scala.inline
  implicit class SaveStatusOps[Self <: SaveStatus] (val x: Self) extends AnyVal {
    
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
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaved(value: Boolean): Self = this.set("saved", value.asInstanceOf[js.Any])
  }
}

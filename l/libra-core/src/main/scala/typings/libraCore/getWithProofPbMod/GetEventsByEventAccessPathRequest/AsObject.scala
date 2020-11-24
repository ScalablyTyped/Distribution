package typings.libraCore.getWithProofPbMod.GetEventsByEventAccessPathRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var accessPath: js.UndefOr[typings.libraCore.accessPathPbMod.AccessPath.AsObject] = js.native
  
  var ascending: Boolean = js.native
  
  var limit: String = js.native
  
  var startEventSeqNum: String = js.native
}
object AsObject {
  
  @scala.inline
  def apply(ascending: Boolean, limit: String, startEventSeqNum: String): AsObject = {
    val __obj = js.Dynamic.literal(ascending = ascending.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], startEventSeqNum = startEventSeqNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    
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
    def setAscending(value: Boolean): Self = this.set("ascending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: String): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartEventSeqNum(value: String): Self = this.set("startEventSeqNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPath(value: typings.libraCore.accessPathPbMod.AccessPath.AsObject): Self = this.set("accessPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessPath: Self = this.set("accessPath", js.undefined)
  }
}

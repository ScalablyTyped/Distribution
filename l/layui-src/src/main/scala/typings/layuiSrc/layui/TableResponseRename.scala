package typings.layuiSrc.layui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableResponseRename extends js.Object {
  
  var countName: String = js.native
  
  var dataName: String = js.native
  
  var msgName: String = js.native
  
  var statusCode: Double = js.native
  
  var statusName: String = js.native
}
object TableResponseRename {
  
  @scala.inline
  def apply(countName: String, dataName: String, msgName: String, statusCode: Double, statusName: String): TableResponseRename = {
    val __obj = js.Dynamic.literal(countName = countName.asInstanceOf[js.Any], dataName = dataName.asInstanceOf[js.Any], msgName = msgName.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusName = statusName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableResponseRename]
  }
  
  @scala.inline
  implicit class TableResponseRenameOps[Self <: TableResponseRename] (val x: Self) extends AnyVal {
    
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
    def setCountName(value: String): Self = this.set("countName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataName(value: String): Self = this.set("dataName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsgName(value: String): Self = this.set("msgName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusName(value: String): Self = this.set("statusName", value.asInstanceOf[js.Any])
  }
}

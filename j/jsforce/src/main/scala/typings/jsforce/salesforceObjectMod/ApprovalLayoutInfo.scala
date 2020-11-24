package typings.jsforce.salesforceObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApprovalLayoutInfo extends js.Object {
  
  var approvalLayouts: js.Array[js.Object] = js.native
}
object ApprovalLayoutInfo {
  
  @scala.inline
  def apply(approvalLayouts: js.Array[js.Object]): ApprovalLayoutInfo = {
    val __obj = js.Dynamic.literal(approvalLayouts = approvalLayouts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApprovalLayoutInfo]
  }
  
  @scala.inline
  implicit class ApprovalLayoutInfoOps[Self <: ApprovalLayoutInfo] (val x: Self) extends AnyVal {
    
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
    def setApprovalLayoutsVarargs(value: js.Object*): Self = this.set("approvalLayouts", js.Array(value :_*))
    
    @scala.inline
    def setApprovalLayouts(value: js.Array[js.Object]): Self = this.set("approvalLayouts", value.asInstanceOf[js.Any])
  }
}

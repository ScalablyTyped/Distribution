package typings.jsforce.quickActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuickActionDescribeInfo extends js.Object {
  
  /** Object type used for the action */
  var contextSobjectType: String = js.native
  
  /** Layout sections that comprise an action */
  var layout: js.Object = js.native
  
  /** Field name in the target object which refers parent(context) object record ID */
  var targetParentField: String = js.native
  
  /** Record type of the targeted record */
  var targetRecordTypeId: String = js.native
  
  /** Object type of the action to target */
  var targetSobjectType: String = js.native
}
object QuickActionDescribeInfo {
  
  @scala.inline
  def apply(
    contextSobjectType: String,
    layout: js.Object,
    targetParentField: String,
    targetRecordTypeId: String,
    targetSobjectType: String
  ): QuickActionDescribeInfo = {
    val __obj = js.Dynamic.literal(contextSobjectType = contextSobjectType.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], targetParentField = targetParentField.asInstanceOf[js.Any], targetRecordTypeId = targetRecordTypeId.asInstanceOf[js.Any], targetSobjectType = targetSobjectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickActionDescribeInfo]
  }
  
  @scala.inline
  implicit class QuickActionDescribeInfoOps[Self <: QuickActionDescribeInfo] (val x: Self) extends AnyVal {
    
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
    def setContextSobjectType(value: String): Self = this.set("contextSobjectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: js.Object): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetParentField(value: String): Self = this.set("targetParentField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetRecordTypeId(value: String): Self = this.set("targetRecordTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSobjectType(value: String): Self = this.set("targetSobjectType", value.asInstanceOf[js.Any])
  }
}

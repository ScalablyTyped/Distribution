package typings.jsforce.quickDashActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuickActionDescribeInfo extends js.Object {
  /** Object type used for the action */
  var contextSobjectType: String
  /** Layout sections that comprise an action */
  var layout: js.Object
  /** Field name in the target object which refers parent(context) object record ID */
  var targetParentField: String
  /** Record type of the targeted record */
  var targetRecordTypeId: String
  /** Object type of the action to target */
  var targetSobjectType: String
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
    val __obj = js.Dynamic.literal(contextSobjectType = contextSobjectType, layout = layout, targetParentField = targetParentField, targetRecordTypeId = targetRecordTypeId, targetSobjectType = targetSobjectType)
  
    __obj.asInstanceOf[QuickActionDescribeInfo]
  }
}


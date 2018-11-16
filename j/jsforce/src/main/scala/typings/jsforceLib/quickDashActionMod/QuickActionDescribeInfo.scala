package typings
package jsforceLib.quickDashActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QuickActionDescribeInfo extends js.Object {
  /** Object type used for the action */
  var contextSobjectType: java.lang.String
  /** Layout sections that comprise an action */
  var layout: js.Object
  /** Field name in the target object which refers parent(context) object record ID */
  var targetParentField: java.lang.String
  /** Record type of the targeted record */
  var targetRecordTypeId: java.lang.String
  /** Object type of the action to target */
  var targetSobjectType: java.lang.String
}


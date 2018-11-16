package typings
package jsforceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackClearApprovalLayoutInfo extends js.Object {
  /** Returns a value from the cache if it exists, otherwise calls SObject.approvalLayouts */
  def apply(): jsforceLib.salesforceDashObjectMod.ApprovalLayoutInfo = js.native
  /** Returns a value from the cache if it exists, otherwise calls SObject.approvalLayouts */
  def apply(callback: jsforceLib.connectionMod.Callback[jsforceLib.salesforceDashObjectMod.ApprovalLayoutInfo]): jsforceLib.salesforceDashObjectMod.ApprovalLayoutInfo = js.native
  def clear(): scala.Unit = js.native
}


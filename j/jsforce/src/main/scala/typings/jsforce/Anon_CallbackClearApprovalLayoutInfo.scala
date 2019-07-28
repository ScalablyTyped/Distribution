package typings.jsforce

import typings.jsforce.connectionMod.Callback
import typings.jsforce.salesforceDashObjectMod.ApprovalLayoutInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackClearApprovalLayoutInfo extends js.Object {
  /** Returns a value from the cache if it exists, otherwise calls SObject.approvalLayouts */
  def apply(): ApprovalLayoutInfo = js.native
  def apply(callback: Callback[ApprovalLayoutInfo]): ApprovalLayoutInfo = js.native
  def clear(): Unit = js.native
}


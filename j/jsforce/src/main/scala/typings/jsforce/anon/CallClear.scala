package typings.jsforce.anon

import typings.jsforce.connectionMod.Callback
import typings.jsforce.salesforceObjectMod.ApprovalLayoutInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallClear extends js.Object {
  
  /** Returns a value from the cache if it exists, otherwise calls SObject.approvalLayouts */
  def apply(): ApprovalLayoutInfo = js.native
  def apply(callback: Callback[ApprovalLayoutInfo]): ApprovalLayoutInfo = js.native
  
  def clear(): Unit = js.native
}

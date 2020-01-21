package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One delta entry for Binding. Each individual change (only one member in
  * each entry) to a binding will be a separate entry.
  */
@js.native
trait SchemaBindingDelta extends js.Object {
  /**
    * The action that was performed on a Binding. Required
    */
  var action: js.UndefOr[String] = js.native
  /**
    * Unimplemented. The condition that is associated with this binding. This
    * field is logged only for Cloud Audit Logging.
    */
  var condition: js.UndefOr[SchemaExpr] = js.native
  /**
    * A single identity requesting access for a Cloud Platform resource.
    * Follows the same format of Binding.members. Required
    */
  var member: js.UndefOr[String] = js.native
  /**
    * Role that is assigned to `members`. For example, `roles/viewer`,
    * `roles/editor`, or `roles/owner`. Required
    */
  var role: js.UndefOr[String] = js.native
}

object SchemaBindingDelta {
  @scala.inline
  def apply(action: String = null, condition: SchemaExpr = null, member: String = null, role: String = null): SchemaBindingDelta = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (member != null) __obj.updateDynamic("member")(member.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBindingDelta]
  }
}


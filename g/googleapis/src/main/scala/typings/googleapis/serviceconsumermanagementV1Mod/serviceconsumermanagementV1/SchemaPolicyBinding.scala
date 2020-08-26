package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Translates to IAM Policy bindings (without auditing at this level)
  */
@js.native
trait SchemaPolicyBinding extends js.Object {
  /**
    * Uses the same format as in IAM policy. `member` must include both a
    * prefix and ID. For example, `user:{emailId}`, `serviceAccount:{emailId}`,
    * `group:{emailId}`.
    */
  var members: js.UndefOr[js.Array[String]] = js.native
  /**
    * Role. (https://cloud.google.com/iam/docs/understanding-roles) For
    * example, `roles/viewer`, `roles/editor`, or `roles/owner`.
    */
  var role: js.UndefOr[String] = js.native
}

object SchemaPolicyBinding {
  @scala.inline
  def apply(): SchemaPolicyBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicyBinding]
  }
  @scala.inline
  implicit class SchemaPolicyBindingOps[Self <: SchemaPolicyBinding] (val x: Self) extends AnyVal {
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
    def setMembersVarargs(value: String*): Self = this.set("members", js.Array(value :_*))
    @scala.inline
    def setMembers(value: js.Array[String]): Self = this.set("members", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMembers: Self = this.set("members", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
  
}


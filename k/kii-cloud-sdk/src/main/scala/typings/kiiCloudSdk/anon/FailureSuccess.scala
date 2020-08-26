package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiAppAdminContext
import typings.kiiCloudSdk.KiiCloud.KiiGroup
import typings.kiiCloudSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailureSuccess extends js.Object {
  def failure(
    theGroup: KiiGroup,
    anErrorString: String,
    addMembersArray: js.Array[KiiUser],
    removeMembersArray: js.Array[KiiUser]
  ): js.Any = js.native
  def success(adminContext: KiiAppAdminContext): js.Any = js.native
}

object FailureSuccess {
  @scala.inline
  def apply(
    failure: (KiiGroup, String, js.Array[KiiUser], js.Array[KiiUser]) => js.Any,
    success: KiiAppAdminContext => js.Any
  ): FailureSuccess = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction4(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[FailureSuccess]
  }
  @scala.inline
  implicit class FailureSuccessOps[Self <: FailureSuccess] (val x: Self) extends AnyVal {
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
    def setFailure(value: (KiiGroup, String, js.Array[KiiUser], js.Array[KiiUser]) => js.Any): Self = this.set("failure", js.Any.fromFunction4(value))
    @scala.inline
    def setSuccess(value: KiiAppAdminContext => js.Any): Self = this.set("success", js.Any.fromFunction1(value))
  }
  
}


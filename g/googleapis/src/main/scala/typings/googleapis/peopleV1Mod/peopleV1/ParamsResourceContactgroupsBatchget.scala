package typings.googleapis.peopleV1Mod.peopleV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceContactgroupsBatchget extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Specifies the maximum number of members to return for each group.
    */
  var maxMembers: js.UndefOr[Double] = js.native
  /**
    * The resource names of the contact groups to get.
    */
  var resourceNames: js.UndefOr[js.Array[String]] = js.native
}

object ParamsResourceContactgroupsBatchget {
  @scala.inline
  def apply(): ParamsResourceContactgroupsBatchget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceContactgroupsBatchget]
  }
  @scala.inline
  implicit class ParamsResourceContactgroupsBatchgetOps[Self <: ParamsResourceContactgroupsBatchget] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setMaxMembers(value: Double): Self = this.set("maxMembers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxMembers: Self = this.set("maxMembers", js.undefined)
    @scala.inline
    def setResourceNamesVarargs(value: String*): Self = this.set("resourceNames", js.Array(value :_*))
    @scala.inline
    def setResourceNames(value: js.Array[String]): Self = this.set("resourceNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceNames: Self = this.set("resourceNames", js.undefined)
  }
  
}


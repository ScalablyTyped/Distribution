package typings.googleapis.storageV1beta2Mod.storageV1beta2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceBucketaccesscontrolsDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Name of a bucket.
    */
  var bucket: js.UndefOr[String] = js.native
  /**
    * The entity holding the permission. Can be user-userId, user-emailAddress,
    * group-groupId, group-emailAddress, allUsers, or allAuthenticatedUsers.
    */
  var entity: js.UndefOr[String] = js.native
}

object ParamsResourceBucketaccesscontrolsDelete {
  @scala.inline
  def apply(): ParamsResourceBucketaccesscontrolsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBucketaccesscontrolsDelete]
  }
  @scala.inline
  implicit class ParamsResourceBucketaccesscontrolsDeleteOps[Self <: ParamsResourceBucketaccesscontrolsDelete] (val x: Self) extends AnyVal {
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
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    @scala.inline
    def setEntity(value: String): Self = this.set("entity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntity: Self = this.set("entity", js.undefined)
  }
  
}


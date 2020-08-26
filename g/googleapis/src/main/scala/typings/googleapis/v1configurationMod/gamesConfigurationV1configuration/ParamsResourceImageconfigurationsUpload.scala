package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.anon.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceImageconfigurationsUpload extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Selects which image in a resource for this method.
    */
  var imageType: js.UndefOr[String] = js.native
  /**
    * Media metadata
    */
  var media: js.UndefOr[Body] = js.native
  /**
    * The ID of the resource used by this method.
    */
  var resourceId: js.UndefOr[String] = js.native
}

object ParamsResourceImageconfigurationsUpload {
  @scala.inline
  def apply(): ParamsResourceImageconfigurationsUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceImageconfigurationsUpload]
  }
  @scala.inline
  implicit class ParamsResourceImageconfigurationsUploadOps[Self <: ParamsResourceImageconfigurationsUpload] (val x: Self) extends AnyVal {
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
    def setImageType(value: String): Self = this.set("imageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageType: Self = this.set("imageType", js.undefined)
    @scala.inline
    def setMedia(value: Body): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    @scala.inline
    def setResourceId(value: String): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
  }
  
}


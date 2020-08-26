package typings.googleapis.driveV2Mod.driveV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.anon.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceRealtimeUpdate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The revision of the model to diff the uploaded model against. If set, the
    * uploaded model is diffed against the provided revision and those
    * differences are merged with any changes made to the model after the
    * provided revision. If not set, the uploaded model replaces the current
    * model on the server.
    */
  var baseRevision: js.UndefOr[String] = js.native
  /**
    * The ID of the file that the Realtime API data model is associated with.
    */
  var fileId: js.UndefOr[String] = js.native
  /**
    * Media metadata
    */
  var media: js.UndefOr[Body] = js.native
}

object ParamsResourceRealtimeUpdate {
  @scala.inline
  def apply(): ParamsResourceRealtimeUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRealtimeUpdate]
  }
  @scala.inline
  implicit class ParamsResourceRealtimeUpdateOps[Self <: ParamsResourceRealtimeUpdate] (val x: Self) extends AnyVal {
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
    def setBaseRevision(value: String): Self = this.set("baseRevision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseRevision: Self = this.set("baseRevision", js.undefined)
    @scala.inline
    def setFileId(value: String): Self = this.set("fileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileId: Self = this.set("fileId", js.undefined)
    @scala.inline
    def setMedia(value: Body): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
  }
  
}


package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceVideosRate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The id parameter specifies the YouTube video ID of the video that is
    * being rated or having its rating removed.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Specifies the rating to record.
    */
  var rating: js.UndefOr[String] = js.native
}

object ParamsResourceVideosRate {
  @scala.inline
  def apply(): ParamsResourceVideosRate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVideosRate]
  }
  @scala.inline
  implicit class ParamsResourceVideosRateOps[Self <: ParamsResourceVideosRate] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setRating(value: String): Self = this.set("rating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRating: Self = this.set("rating", js.undefined)
  }
  
}


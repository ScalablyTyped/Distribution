package typings.googleapis.urlshortenerV1Mod.urlshortenerV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceUrlList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Additional information to return.
    */
  var projection: js.UndefOr[String] = js.native
  /**
    * Token for requesting successive pages of results.
    */
  var `start-token`: js.UndefOr[String] = js.native
}

object ParamsResourceUrlList {
  @scala.inline
  def apply(): ParamsResourceUrlList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUrlList]
  }
  @scala.inline
  implicit class ParamsResourceUrlListOps[Self <: ParamsResourceUrlList] (val x: Self) extends AnyVal {
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
    def setProjection(value: String): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def `setStart-token`(value: String): Self = this.set("start-token", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStart-token`: Self = this.set("start-token", js.undefined)
  }
  
}


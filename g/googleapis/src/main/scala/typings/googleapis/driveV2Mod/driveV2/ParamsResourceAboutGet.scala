package typings.googleapis.driveV2Mod.driveV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAboutGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Whether to count changes outside the My Drive hierarchy. When set to
    * false, changes to files such as those in the Application Data folder or
    * shared files which have not been added to My Drive will be omitted from
    * the maxChangeIdCount.
    */
  var includeSubscribed: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of remaining change IDs to count
    */
  var maxChangeIdCount: js.UndefOr[String] = js.native
  /**
    * Change ID to start counting from when calculating number of remaining
    * change IDs
    */
  var startChangeId: js.UndefOr[String] = js.native
}

object ParamsResourceAboutGet {
  @scala.inline
  def apply(): ParamsResourceAboutGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAboutGet]
  }
  @scala.inline
  implicit class ParamsResourceAboutGetOps[Self <: ParamsResourceAboutGet] (val x: Self) extends AnyVal {
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
    def setIncludeSubscribed(value: Boolean): Self = this.set("includeSubscribed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeSubscribed: Self = this.set("includeSubscribed", js.undefined)
    @scala.inline
    def setMaxChangeIdCount(value: String): Self = this.set("maxChangeIdCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxChangeIdCount: Self = this.set("maxChangeIdCount", js.undefined)
    @scala.inline
    def setStartChangeId(value: String): Self = this.set("startChangeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartChangeId: Self = this.set("startChangeId", js.undefined)
  }
  
}


package typings.googleapis.gmailV1Mod.gmailV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceUsersDraftsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Include drafts from SPAM and TRASH in the results.
    */
  var includeSpamTrash: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of drafts to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Page token to retrieve a specific page of results in the list.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Only return draft messages matching the specified query. Supports the
    * same query format as the Gmail search box. For example,
    * "from:someuser@example.com rfc822msgid: is:unread".
    */
  var q: js.UndefOr[String] = js.native
  /**
    * The user's email address. The special value me can be used to indicate
    * the authenticated user.
    */
  var userId: js.UndefOr[String] = js.native
}

object ParamsResourceUsersDraftsList {
  @scala.inline
  def apply(): ParamsResourceUsersDraftsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersDraftsList]
  }
  @scala.inline
  implicit class ParamsResourceUsersDraftsListOps[Self <: ParamsResourceUsersDraftsList] (val x: Self) extends AnyVal {
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
    def setIncludeSpamTrash(value: Boolean): Self = this.set("includeSpamTrash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeSpamTrash: Self = this.set("includeSpamTrash", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
  
}


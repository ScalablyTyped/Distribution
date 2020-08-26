package typings.googleapis.gmailV1Mod.gmailV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceUsersMessagesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Include messages from SPAM and TRASH in the results.
    */
  var includeSpamTrash: js.UndefOr[Boolean] = js.native
  /**
    * Only return messages with labels that match all of the specified label
    * IDs.
    */
  var labelIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Maximum number of messages to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Page token to retrieve a specific page of results in the list.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Only return messages matching the specified query. Supports the same
    * query format as the Gmail search box. For example,
    * "from:someuser@example.com rfc822msgid:<somemsgid@example.com>
    * is:unread". Parameter cannot be used when accessing the api using the
    * gmail.metadata scope.
    */
  var q: js.UndefOr[String] = js.native
  /**
    * The user's email address. The special value me can be used to indicate
    * the authenticated user.
    */
  var userId: js.UndefOr[String] = js.native
}

object ParamsResourceUsersMessagesList {
  @scala.inline
  def apply(): ParamsResourceUsersMessagesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersMessagesList]
  }
  @scala.inline
  implicit class ParamsResourceUsersMessagesListOps[Self <: ParamsResourceUsersMessagesList] (val x: Self) extends AnyVal {
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
    def setLabelIdsVarargs(value: String*): Self = this.set("labelIds", js.Array(value :_*))
    @scala.inline
    def setLabelIds(value: js.Array[String]): Self = this.set("labelIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelIds: Self = this.set("labelIds", js.undefined)
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


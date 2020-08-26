package typings.googleapis.v32Mod.dfareportingV32

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceChangelogsList extends StandardParameters {
  /**
    * Select only change logs with the specified action.
    */
  var action: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Select only change logs with these IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only change logs whose change time is before the specified
    * maxChangeTime.The time should be formatted as an RFC3339 date/time
    * string. For example, for 10:54 PM on July 18th, 2015, in the America/New
    * York time zone, the format is "2015-07-18T22:54:00-04:00". In other
    * words, the year, month, day, the letter T, the hour (24-hour clock
    * system), minute, second, and then the time zone offset.
    */
  var maxChangeTime: js.UndefOr[String] = js.native
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Select only change logs whose change time is before the specified
    * minChangeTime.The time should be formatted as an RFC3339 date/time
    * string. For example, for 10:54 PM on July 18th, 2015, in the America/New
    * York time zone, the format is "2015-07-18T22:54:00-04:00". In other
    * words, the year, month, day, the letter T, the hour (24-hour clock
    * system), minute, second, and then the time zone offset.
    */
  var minChangeTime: js.UndefOr[String] = js.native
  /**
    * Select only change logs with these object IDs.
    */
  var objectIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Select only change logs with the specified object type.
    */
  var objectType: js.UndefOr[String] = js.native
  /**
    * Value of the nextPageToken from the previous result page.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.native
  /**
    * Select only change logs whose object ID, user name, old or new values
    * match the search string.
    */
  var searchString: js.UndefOr[String] = js.native
  /**
    * Select only change logs with these user profile IDs.
    */
  var userProfileIds: js.UndefOr[js.Array[String]] = js.native
}

object ParamsResourceChangelogsList {
  @scala.inline
  def apply(): ParamsResourceChangelogsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceChangelogsList]
  }
  @scala.inline
  implicit class ParamsResourceChangelogsListOps[Self <: ParamsResourceChangelogsList] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setIdsVarargs(value: String*): Self = this.set("ids", js.Array(value :_*))
    @scala.inline
    def setIds(value: js.Array[String]): Self = this.set("ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
    @scala.inline
    def setMaxChangeTime(value: String): Self = this.set("maxChangeTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxChangeTime: Self = this.set("maxChangeTime", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setMinChangeTime(value: String): Self = this.set("minChangeTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinChangeTime: Self = this.set("minChangeTime", js.undefined)
    @scala.inline
    def setObjectIdsVarargs(value: String*): Self = this.set("objectIds", js.Array(value :_*))
    @scala.inline
    def setObjectIds(value: js.Array[String]): Self = this.set("objectIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectIds: Self = this.set("objectIds", js.undefined)
    @scala.inline
    def setObjectType(value: String): Self = this.set("objectType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectType: Self = this.set("objectType", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setProfileId(value: String): Self = this.set("profileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileId: Self = this.set("profileId", js.undefined)
    @scala.inline
    def setSearchString(value: String): Self = this.set("searchString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchString: Self = this.set("searchString", js.undefined)
    @scala.inline
    def setUserProfileIdsVarargs(value: String*): Self = this.set("userProfileIds", js.Array(value :_*))
    @scala.inline
    def setUserProfileIds(value: js.Array[String]): Self = this.set("userProfileIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserProfileIds: Self = this.set("userProfileIds", js.undefined)
  }
  
}


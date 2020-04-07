package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesHistoryList extends StandardParameters {
  /**
    * Only include resource versions that were current at some point during the
    * time period specified in the date time value. The date parameter format
    * is yyyy-mm-ddThh:mm:ss[Z|(+|-)hh:mm] Clients may specify any of the
    * following: An entire year: `_at=2019` An entire month: `_at=2019-01` A
    * specific day: `_at=2019-01-20` A specific second:
    * `_at=2018-12-31T23:59:58Z`
    */
  var at: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of search results on a page.
    */
  var count: js.UndefOr[Double] = js.native
  /**
    * The name of the resource to retrieve.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Used to retrieve the first, previous, next, or last page of resource
    * versions when using pagination. Value should be set to the value of the
    * `link.url` field returned in the response to the previous request, where
    * `link.relation` is "first", "previous", "next" or "last". Omit `page` if
    * no previous request has been made.
    */
  var page: js.UndefOr[String] = js.native
  /**
    * Only include resource versions that were created at or after the given
    * instant in time. The instant in time uses the format
    * YYYY-MM-DDThh:mm:ss.sss+zz:zz (for example 2015-02-07T13:28:17.239+02:00
    * or 2017-01-01T00:00:00Z). The time must be specified to the second and
    * include a time zone.
    */
  var since: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesHistoryList {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    at: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    callback: String = null,
    count: Int | Double = null,
    fields: String = null,
    key: String = null,
    name: String = null,
    oauth_token: String = null,
    page: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    since: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesHistoryList = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesHistoryList]
  }
}


package typings.googleapis.peopleV1Mod.peopleV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePeopleConnectionsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The number of connections to include in the response. Valid values are
    * between 1 and 2000, inclusive. Defaults to 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The token of the page to be returned.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * **Required.** A field mask to restrict which fields on each person are
    * returned. Multiple fields can be specified by separating them with
    * commas. Valid values are:  * addresses * ageRanges * biographies *
    * birthdays * braggingRights * coverPhotos * emailAddresses * events *
    * genders * imClients * interests * locales * memberships * metadata *
    * names * nicknames * occupations * organizations * phoneNumbers * photos *
    * relations * relationshipInterests * relationshipStatuses * residences *
    * sipAddresses * skills * taglines * urls * userDefined
    */
  var personFields: js.UndefOr[String] = js.native
  /**
    * **Required.** Comma-separated list of person fields to be included in the
    * response. Each path should start with `person.`: for example,
    * `person.names` or `person.photos`.
    */
  @JSName("requestMask.includeField")
  var requestMaskDotincludeField: js.UndefOr[String] = js.native
  /**
    * Whether the response should include a sync token, which can be used to
    * get all changes since the last request. For subsequent sync requests use
    * the `sync_token` param instead. Initial sync requests that specify
    * `request_sync_token` have an additional rate limit.
    */
  var requestSyncToken: js.UndefOr[Boolean] = js.native
  /**
    * The resource name to return connections for. Only `people/me` is valid.
    */
  var resourceName: js.UndefOr[String] = js.native
  /**
    * The order in which the connections should be sorted. Defaults to
    * `LAST_MODIFIED_ASCENDING`.
    */
  var sortOrder: js.UndefOr[String] = js.native
  /**
    * A sync token returned by a previous call to `people.connections.list`.
    * Only resources changed since the sync token was created will be returned.
    * Sync requests that specify `sync_token` have an additional rate limit.
    */
  var syncToken: js.UndefOr[String] = js.native
}

object ParamsResourcePeopleConnectionsList {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    callback: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    personFields: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    requestMaskDotincludeField: String = null,
    requestSyncToken: js.UndefOr[Boolean] = js.undefined,
    resourceName: String = null,
    sortOrder: String = null,
    syncToken: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): ParamsResourcePeopleConnectionsList = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (personFields != null) __obj.updateDynamic("personFields")(personFields.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (requestMaskDotincludeField != null) __obj.updateDynamic("requestMask.includeField")(requestMaskDotincludeField.asInstanceOf[js.Any])
    if (!js.isUndefined(requestSyncToken)) __obj.updateDynamic("requestSyncToken")(requestSyncToken.asInstanceOf[js.Any])
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (syncToken != null) __obj.updateDynamic("syncToken")(syncToken.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourcePeopleConnectionsList]
  }
}


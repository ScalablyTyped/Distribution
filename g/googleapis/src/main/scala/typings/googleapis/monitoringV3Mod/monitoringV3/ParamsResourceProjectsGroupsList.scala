package typings.googleapis.monitoringV3Mod.monitoringV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsGroupsList extends StandardParameters {
  /**
    * A group name: "projects/{project_id_or_number}/groups/{group_id}".
    * Returns groups that are ancestors of the specified group. The groups are
    * returned in order, starting with the immediate parent and ending with the
    * most distant ancestor. If the specified group has no immediate parent,
    * the results are empty.
    */
  var ancestorsOfGroup: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A group name: "projects/{project_id_or_number}/groups/{group_id}".
    * Returns groups whose parentName field contains the group name. If no
    * groups have this parent, the results are empty.
    */
  var childrenOfGroup: js.UndefOr[String] = js.native
  /**
    * A group name: "projects/{project_id_or_number}/groups/{group_id}".
    * Returns the descendants of the specified group. This is a superset of the
    * results returned by the childrenOfGroup filter, and includes
    * children-of-children, and so forth.
    */
  var descendantsOfGroup: js.UndefOr[String] = js.native
  /**
    * The project whose groups are to be listed. The format is
    * "projects/{project_id_or_number}".
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A positive number that is the maximum number of results to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * If this field is not empty then it must contain the nextPageToken value
    * returned by a previous call to this method. Using this field causes the
    * method to return additional results from the previous method call.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsGroupsList {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    ancestorsOfGroup: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    callback: String = null,
    childrenOfGroup: String = null,
    descendantsOfGroup: String = null,
    fields: String = null,
    key: String = null,
    name: String = null,
    oauth_token: String = null,
    pageSize: js.UndefOr[Double] = js.undefined,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): ParamsResourceProjectsGroupsList = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (ancestorsOfGroup != null) __obj.updateDynamic("ancestorsOfGroup")(ancestorsOfGroup.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (childrenOfGroup != null) __obj.updateDynamic("childrenOfGroup")(childrenOfGroup.asInstanceOf[js.Any])
    if (descendantsOfGroup != null) __obj.updateDynamic("descendantsOfGroup")(descendantsOfGroup.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceProjectsGroupsList]
  }
}


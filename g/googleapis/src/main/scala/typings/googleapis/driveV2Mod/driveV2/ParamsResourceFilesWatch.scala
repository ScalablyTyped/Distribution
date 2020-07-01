package typings.googleapis.driveV2Mod.driveV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceFilesWatch extends StandardParameters {
  /**
    * Whether the user is acknowledging the risk of downloading known malware
    * or other abusive files.
    */
  var acknowledgeAbuse: js.UndefOr[Boolean] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The ID for the file in question.
    */
  var fileId: js.UndefOr[String] = js.native
  /**
    * This parameter is deprecated and has no function.
    */
  var projection: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaChannel] = js.native
  /**
    * Specifies the Revision ID that should be downloaded. Ignored unless
    * alt=media is specified.
    */
  var revisionId: js.UndefOr[String] = js.native
  /**
    * Whether the requesting application supports Team Drives.
    */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated: Use files.update with modifiedDateBehavior=noChange,
    * updateViewedDate=true and an empty request body.
    */
  var updateViewedDate: js.UndefOr[Boolean] = js.native
}

object ParamsResourceFilesWatch {
  @scala.inline
  def apply(
    acknowledgeAbuse: js.UndefOr[Boolean] = js.undefined,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    fields: String = null,
    fileId: String = null,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    projection: String = null,
    quotaUser: String = null,
    requestBody: SchemaChannel = null,
    revisionId: String = null,
    supportsTeamDrives: js.UndefOr[Boolean] = js.undefined,
    updateViewedDate: js.UndefOr[Boolean] = js.undefined,
    userIp: String = null
  ): ParamsResourceFilesWatch = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acknowledgeAbuse)) __obj.updateDynamic("acknowledgeAbuse")(acknowledgeAbuse.get.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (fileId != null) __obj.updateDynamic("fileId")(fileId.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsTeamDrives)) __obj.updateDynamic("supportsTeamDrives")(supportsTeamDrives.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updateViewedDate)) __obj.updateDynamic("updateViewedDate")(updateViewedDate.get.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceFilesWatch]
  }
}


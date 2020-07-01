package typings.googleapis.driveV2Mod.driveV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceFilesCopy extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Whether to convert this file to the corresponding Google Docs format.
    */
  var convert: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the file to copy.
    */
  var fileId: js.UndefOr[String] = js.native
  /**
    * Whether to attempt OCR on .jpg, .png, .gif, or .pdf uploads.
    */
  var ocr: js.UndefOr[Boolean] = js.native
  /**
    * If ocr is true, hints at the language to use. Valid values are BCP 47
    * codes.
    */
  var ocrLanguage: js.UndefOr[String] = js.native
  /**
    * Whether to pin the head revision of the new copy. A file can have a
    * maximum of 200 pinned revisions.
    */
  var pinned: js.UndefOr[Boolean] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaFile] = js.native
  /**
    * Whether the requesting application supports Team Drives.
    */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.native
  /**
    * The language of the timed text.
    */
  var timedTextLanguage: js.UndefOr[String] = js.native
  /**
    * The timed text track name.
    */
  var timedTextTrackName: js.UndefOr[String] = js.native
  /**
    * The visibility of the new file. This parameter is only relevant when the
    * source is not a native Google Doc and convert=false.
    */
  var visibility: js.UndefOr[String] = js.native
}

object ParamsResourceFilesCopy {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    convert: js.UndefOr[Boolean] = js.undefined,
    fields: String = null,
    fileId: String = null,
    key: String = null,
    oauth_token: String = null,
    ocr: js.UndefOr[Boolean] = js.undefined,
    ocrLanguage: String = null,
    pinned: js.UndefOr[Boolean] = js.undefined,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    requestBody: SchemaFile = null,
    supportsTeamDrives: js.UndefOr[Boolean] = js.undefined,
    timedTextLanguage: String = null,
    timedTextTrackName: String = null,
    userIp: String = null,
    visibility: String = null
  ): ParamsResourceFilesCopy = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (!js.isUndefined(convert)) __obj.updateDynamic("convert")(convert.get.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (fileId != null) __obj.updateDynamic("fileId")(fileId.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(ocr)) __obj.updateDynamic("ocr")(ocr.get.asInstanceOf[js.Any])
    if (ocrLanguage != null) __obj.updateDynamic("ocrLanguage")(ocrLanguage.asInstanceOf[js.Any])
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned.get.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsTeamDrives)) __obj.updateDynamic("supportsTeamDrives")(supportsTeamDrives.get.asInstanceOf[js.Any])
    if (timedTextLanguage != null) __obj.updateDynamic("timedTextLanguage")(timedTextLanguage.asInstanceOf[js.Any])
    if (timedTextTrackName != null) __obj.updateDynamic("timedTextTrackName")(timedTextTrackName.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceFilesCopy]
  }
}


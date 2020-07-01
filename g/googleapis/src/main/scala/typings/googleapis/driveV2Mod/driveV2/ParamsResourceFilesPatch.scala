package typings.googleapis.driveV2Mod.driveV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceFilesPatch extends StandardParameters {
  /**
    * Comma-separated list of parent IDs to add.
    */
  var addParents: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * This parameter is deprecated and has no function.
    */
  var convert: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the file to update.
    */
  var fileId: js.UndefOr[String] = js.native
  /**
    * Determines the behavior in which modifiedDate is updated. This overrides
    * setModifiedDate.
    */
  var modifiedDateBehavior: js.UndefOr[String] = js.native
  /**
    * Whether a blob upload should create a new revision. If false, the blob
    * data in the current head revision is replaced. If true or not set, a new
    * blob is created as head revision, and previous unpinned revisions are
    * preserved for a short period of time. Pinned revisions are stored
    * indefinitely, using additional storage quota, up to a maximum of 200
    * revisions. For details on how revisions are retained, see the Drive Help
    * Center.
    */
  var newRevision: js.UndefOr[Boolean] = js.native
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
    * Whether to pin the new revision. A file can have a maximum of 200 pinned
    * revisions.
    */
  var pinned: js.UndefOr[Boolean] = js.native
  /**
    * Comma-separated list of parent IDs to remove.
    */
  var removeParents: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaFile] = js.native
  /**
    * Whether to set the modified date using the value supplied in the request
    * body. Setting this field to true is equivalent to
    * modifiedDateBehavior=fromBodyOrNow, and false is equivalent to
    * modifiedDateBehavior=now. To prevent any changes to the modified date set
    * modifiedDateBehavior=noChange.
    */
  var setModifiedDate: js.UndefOr[Boolean] = js.native
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
    * Whether to update the view date after successfully updating the file.
    */
  var updateViewedDate: js.UndefOr[Boolean] = js.native
  /**
    * Whether to use the content as indexable text.
    */
  var useContentAsIndexableText: js.UndefOr[Boolean] = js.native
}

object ParamsResourceFilesPatch {
  @scala.inline
  def apply(
    addParents: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    convert: js.UndefOr[Boolean] = js.undefined,
    fields: String = null,
    fileId: String = null,
    key: String = null,
    modifiedDateBehavior: String = null,
    newRevision: js.UndefOr[Boolean] = js.undefined,
    oauth_token: String = null,
    ocr: js.UndefOr[Boolean] = js.undefined,
    ocrLanguage: String = null,
    pinned: js.UndefOr[Boolean] = js.undefined,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    removeParents: String = null,
    requestBody: SchemaFile = null,
    setModifiedDate: js.UndefOr[Boolean] = js.undefined,
    supportsTeamDrives: js.UndefOr[Boolean] = js.undefined,
    timedTextLanguage: String = null,
    timedTextTrackName: String = null,
    updateViewedDate: js.UndefOr[Boolean] = js.undefined,
    useContentAsIndexableText: js.UndefOr[Boolean] = js.undefined,
    userIp: String = null
  ): ParamsResourceFilesPatch = {
    val __obj = js.Dynamic.literal()
    if (addParents != null) __obj.updateDynamic("addParents")(addParents.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (!js.isUndefined(convert)) __obj.updateDynamic("convert")(convert.get.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (fileId != null) __obj.updateDynamic("fileId")(fileId.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (modifiedDateBehavior != null) __obj.updateDynamic("modifiedDateBehavior")(modifiedDateBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(newRevision)) __obj.updateDynamic("newRevision")(newRevision.get.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(ocr)) __obj.updateDynamic("ocr")(ocr.get.asInstanceOf[js.Any])
    if (ocrLanguage != null) __obj.updateDynamic("ocrLanguage")(ocrLanguage.asInstanceOf[js.Any])
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned.get.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (removeParents != null) __obj.updateDynamic("removeParents")(removeParents.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (!js.isUndefined(setModifiedDate)) __obj.updateDynamic("setModifiedDate")(setModifiedDate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsTeamDrives)) __obj.updateDynamic("supportsTeamDrives")(supportsTeamDrives.get.asInstanceOf[js.Any])
    if (timedTextLanguage != null) __obj.updateDynamic("timedTextLanguage")(timedTextLanguage.asInstanceOf[js.Any])
    if (timedTextTrackName != null) __obj.updateDynamic("timedTextTrackName")(timedTextTrackName.asInstanceOf[js.Any])
    if (!js.isUndefined(updateViewedDate)) __obj.updateDynamic("updateViewedDate")(updateViewedDate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useContentAsIndexableText)) __obj.updateDynamic("useContentAsIndexableText")(useContentAsIndexableText.get.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceFilesPatch]
  }
}


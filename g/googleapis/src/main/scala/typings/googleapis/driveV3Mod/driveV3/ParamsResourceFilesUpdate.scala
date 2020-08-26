package typings.googleapis.driveV3Mod.driveV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.anon.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceFilesUpdate extends StandardParameters {
  /**
    * A comma-separated list of parent IDs to add.
    */
  var addParents: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The ID of the file.
    */
  var fileId: js.UndefOr[String] = js.native
  /**
    * Whether to set the 'keepForever' field in the new head revision. This is
    * only applicable to files with binary content in Drive.
    */
  var keepRevisionForever: js.UndefOr[Boolean] = js.native
  /**
    * Media metadata
    */
  var media: js.UndefOr[Body] = js.native
  /**
    * A language hint for OCR processing during image import (ISO 639-1 code).
    */
  var ocrLanguage: js.UndefOr[String] = js.native
  /**
    * A comma-separated list of parent IDs to remove.
    */
  var removeParents: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaFile] = js.native
  /**
    * Whether the requesting application supports Team Drives.
    */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.native
  /**
    * Whether to use the uploaded content as indexable text.
    */
  var useContentAsIndexableText: js.UndefOr[Boolean] = js.native
}

object ParamsResourceFilesUpdate {
  @scala.inline
  def apply(): ParamsResourceFilesUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFilesUpdate]
  }
  @scala.inline
  implicit class ParamsResourceFilesUpdateOps[Self <: ParamsResourceFilesUpdate] (val x: Self) extends AnyVal {
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
    def setAddParents(value: String): Self = this.set("addParents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddParents: Self = this.set("addParents", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setFileId(value: String): Self = this.set("fileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileId: Self = this.set("fileId", js.undefined)
    @scala.inline
    def setKeepRevisionForever(value: Boolean): Self = this.set("keepRevisionForever", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepRevisionForever: Self = this.set("keepRevisionForever", js.undefined)
    @scala.inline
    def setMedia(value: Body): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    @scala.inline
    def setOcrLanguage(value: String): Self = this.set("ocrLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOcrLanguage: Self = this.set("ocrLanguage", js.undefined)
    @scala.inline
    def setRemoveParents(value: String): Self = this.set("removeParents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveParents: Self = this.set("removeParents", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaFile): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    @scala.inline
    def setSupportsTeamDrives(value: Boolean): Self = this.set("supportsTeamDrives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsTeamDrives: Self = this.set("supportsTeamDrives", js.undefined)
    @scala.inline
    def setUseContentAsIndexableText(value: Boolean): Self = this.set("useContentAsIndexableText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseContentAsIndexableText: Self = this.set("useContentAsIndexableText", js.undefined)
  }
  
}


package typings.googleapis.driveV2Mod.driveV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.anon.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceFilesInsert extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Whether to convert this file to the corresponding Google Docs format.
    */
  var convert: js.UndefOr[Boolean] = js.native
  /**
    * Media metadata
    */
  var media: js.UndefOr[Body] = js.native
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
    * Whether to pin the head revision of the uploaded file. A file can have a
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
    * Whether to use the content as indexable text.
    */
  var useContentAsIndexableText: js.UndefOr[Boolean] = js.native
  /**
    * The visibility of the new file. This parameter is only relevant when
    * convert=false.
    */
  var visibility: js.UndefOr[String] = js.native
}

object ParamsResourceFilesInsert {
  @scala.inline
  def apply(): ParamsResourceFilesInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFilesInsert]
  }
  @scala.inline
  implicit class ParamsResourceFilesInsertOps[Self <: ParamsResourceFilesInsert] (val x: Self) extends AnyVal {
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
    def setConvert(value: Boolean): Self = this.set("convert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConvert: Self = this.set("convert", js.undefined)
    @scala.inline
    def setMedia(value: Body): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    @scala.inline
    def setOcr(value: Boolean): Self = this.set("ocr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOcr: Self = this.set("ocr", js.undefined)
    @scala.inline
    def setOcrLanguage(value: String): Self = this.set("ocrLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOcrLanguage: Self = this.set("ocrLanguage", js.undefined)
    @scala.inline
    def setPinned(value: Boolean): Self = this.set("pinned", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinned: Self = this.set("pinned", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaFile): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    @scala.inline
    def setSupportsTeamDrives(value: Boolean): Self = this.set("supportsTeamDrives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsTeamDrives: Self = this.set("supportsTeamDrives", js.undefined)
    @scala.inline
    def setTimedTextLanguage(value: String): Self = this.set("timedTextLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimedTextLanguage: Self = this.set("timedTextLanguage", js.undefined)
    @scala.inline
    def setTimedTextTrackName(value: String): Self = this.set("timedTextTrackName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimedTextTrackName: Self = this.set("timedTextTrackName", js.undefined)
    @scala.inline
    def setUseContentAsIndexableText(value: Boolean): Self = this.set("useContentAsIndexableText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseContentAsIndexableText: Self = this.set("useContentAsIndexableText", js.undefined)
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
  
}


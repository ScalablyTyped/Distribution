package typings.googleapis.driveV2Mod.driveV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): ParamsResourceFilesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFilesPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceFilesPatchOps[Self <: ParamsResourceFilesPatch] (val x: Self) extends AnyVal {
    
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
    def setConvert(value: Boolean): Self = this.set("convert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvert: Self = this.set("convert", js.undefined)
    
    @scala.inline
    def setFileId(value: String): Self = this.set("fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileId: Self = this.set("fileId", js.undefined)
    
    @scala.inline
    def setModifiedDateBehavior(value: String): Self = this.set("modifiedDateBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedDateBehavior: Self = this.set("modifiedDateBehavior", js.undefined)
    
    @scala.inline
    def setNewRevision(value: Boolean): Self = this.set("newRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewRevision: Self = this.set("newRevision", js.undefined)
    
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
    def setRemoveParents(value: String): Self = this.set("removeParents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveParents: Self = this.set("removeParents", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaFile): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    
    @scala.inline
    def setSetModifiedDate(value: Boolean): Self = this.set("setModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetModifiedDate: Self = this.set("setModifiedDate", js.undefined)
    
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
    def setUpdateViewedDate(value: Boolean): Self = this.set("updateViewedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateViewedDate: Self = this.set("updateViewedDate", js.undefined)
    
    @scala.inline
    def setUseContentAsIndexableText(value: Boolean): Self = this.set("useContentAsIndexableText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseContentAsIndexableText: Self = this.set("useContentAsIndexableText", js.undefined)
  }
}

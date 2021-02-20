package typings.googleapis.driveV2Mod.driveV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
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
  implicit class ParamsResourceFilesPatchMutableBuilder[Self <: ParamsResourceFilesPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddParents(value: String): Self = StObject.set(x, "addParents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddParentsUndefined: Self = StObject.set(x, "addParents", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setConvert(value: Boolean): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
    
    @scala.inline
    def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    @scala.inline
    def setModifiedDateBehavior(value: String): Self = StObject.set(x, "modifiedDateBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedDateBehaviorUndefined: Self = StObject.set(x, "modifiedDateBehavior", js.undefined)
    
    @scala.inline
    def setNewRevision(value: Boolean): Self = StObject.set(x, "newRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewRevisionUndefined: Self = StObject.set(x, "newRevision", js.undefined)
    
    @scala.inline
    def setOcr(value: Boolean): Self = StObject.set(x, "ocr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOcrLanguage(value: String): Self = StObject.set(x, "ocrLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOcrLanguageUndefined: Self = StObject.set(x, "ocrLanguage", js.undefined)
    
    @scala.inline
    def setOcrUndefined: Self = StObject.set(x, "ocr", js.undefined)
    
    @scala.inline
    def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
    @scala.inline
    def setRemoveParents(value: String): Self = StObject.set(x, "removeParents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveParentsUndefined: Self = StObject.set(x, "removeParents", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaFile): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setSetModifiedDate(value: Boolean): Self = StObject.set(x, "setModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetModifiedDateUndefined: Self = StObject.set(x, "setModifiedDate", js.undefined)
    
    @scala.inline
    def setSupportsTeamDrives(value: Boolean): Self = StObject.set(x, "supportsTeamDrives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsTeamDrivesUndefined: Self = StObject.set(x, "supportsTeamDrives", js.undefined)
    
    @scala.inline
    def setTimedTextLanguage(value: String): Self = StObject.set(x, "timedTextLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimedTextLanguageUndefined: Self = StObject.set(x, "timedTextLanguage", js.undefined)
    
    @scala.inline
    def setTimedTextTrackName(value: String): Self = StObject.set(x, "timedTextTrackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimedTextTrackNameUndefined: Self = StObject.set(x, "timedTextTrackName", js.undefined)
    
    @scala.inline
    def setUpdateViewedDate(value: Boolean): Self = StObject.set(x, "updateViewedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateViewedDateUndefined: Self = StObject.set(x, "updateViewedDate", js.undefined)
    
    @scala.inline
    def setUseContentAsIndexableText(value: Boolean): Self = StObject.set(x, "useContentAsIndexableText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseContentAsIndexableTextUndefined: Self = StObject.set(x, "useContentAsIndexableText", js.undefined)
  }
}

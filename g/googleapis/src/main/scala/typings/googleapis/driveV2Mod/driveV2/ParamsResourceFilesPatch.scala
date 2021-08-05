package typings.googleapis.driveV2Mod.driveV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFilesPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Comma-separated list of parent IDs to add.
    */
  var addParents: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * This parameter is deprecated and has no function.
    */
  var convert: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the file to update.
    */
  var fileId: js.UndefOr[String] = js.undefined
  
  /**
    * Determines the behavior in which modifiedDate is updated. This overrides
    * setModifiedDate.
    */
  var modifiedDateBehavior: js.UndefOr[String] = js.undefined
  
  /**
    * Whether a blob upload should create a new revision. If false, the blob
    * data in the current head revision is replaced. If true or not set, a new
    * blob is created as head revision, and previous unpinned revisions are
    * preserved for a short period of time. Pinned revisions are stored
    * indefinitely, using additional storage quota, up to a maximum of 200
    * revisions. For details on how revisions are retained, see the Drive Help
    * Center.
    */
  var newRevision: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to attempt OCR on .jpg, .png, .gif, or .pdf uploads.
    */
  var ocr: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If ocr is true, hints at the language to use. Valid values are BCP 47
    * codes.
    */
  var ocrLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to pin the new revision. A file can have a maximum of 200 pinned
    * revisions.
    */
  var pinned: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Comma-separated list of parent IDs to remove.
    */
  var removeParents: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaFile] = js.undefined
  
  /**
    * Whether to set the modified date using the value supplied in the request
    * body. Setting this field to true is equivalent to
    * modifiedDateBehavior=fromBodyOrNow, and false is equivalent to
    * modifiedDateBehavior=now. To prevent any changes to the modified date set
    * modifiedDateBehavior=noChange.
    */
  var setModifiedDate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the requesting application supports Team Drives.
    */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The language of the timed text.
    */
  var timedTextLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * The timed text track name.
    */
  var timedTextTrackName: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to update the view date after successfully updating the file.
    */
  var updateViewedDate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to use the content as indexable text.
    */
  var useContentAsIndexableText: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceFilesPatch {
  
  inline def apply(): ParamsResourceFilesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFilesPatch]
  }
  
  extension [Self <: ParamsResourceFilesPatch](x: Self) {
    
    inline def setAddParents(value: String): Self = StObject.set(x, "addParents", value.asInstanceOf[js.Any])
    
    inline def setAddParentsUndefined: Self = StObject.set(x, "addParents", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setConvert(value: Boolean): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
    
    inline def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
    
    inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    inline def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    inline def setModifiedDateBehavior(value: String): Self = StObject.set(x, "modifiedDateBehavior", value.asInstanceOf[js.Any])
    
    inline def setModifiedDateBehaviorUndefined: Self = StObject.set(x, "modifiedDateBehavior", js.undefined)
    
    inline def setNewRevision(value: Boolean): Self = StObject.set(x, "newRevision", value.asInstanceOf[js.Any])
    
    inline def setNewRevisionUndefined: Self = StObject.set(x, "newRevision", js.undefined)
    
    inline def setOcr(value: Boolean): Self = StObject.set(x, "ocr", value.asInstanceOf[js.Any])
    
    inline def setOcrLanguage(value: String): Self = StObject.set(x, "ocrLanguage", value.asInstanceOf[js.Any])
    
    inline def setOcrLanguageUndefined: Self = StObject.set(x, "ocrLanguage", js.undefined)
    
    inline def setOcrUndefined: Self = StObject.set(x, "ocr", js.undefined)
    
    inline def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
    inline def setRemoveParents(value: String): Self = StObject.set(x, "removeParents", value.asInstanceOf[js.Any])
    
    inline def setRemoveParentsUndefined: Self = StObject.set(x, "removeParents", js.undefined)
    
    inline def setRequestBody(value: SchemaFile): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSetModifiedDate(value: Boolean): Self = StObject.set(x, "setModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setSetModifiedDateUndefined: Self = StObject.set(x, "setModifiedDate", js.undefined)
    
    inline def setSupportsTeamDrives(value: Boolean): Self = StObject.set(x, "supportsTeamDrives", value.asInstanceOf[js.Any])
    
    inline def setSupportsTeamDrivesUndefined: Self = StObject.set(x, "supportsTeamDrives", js.undefined)
    
    inline def setTimedTextLanguage(value: String): Self = StObject.set(x, "timedTextLanguage", value.asInstanceOf[js.Any])
    
    inline def setTimedTextLanguageUndefined: Self = StObject.set(x, "timedTextLanguage", js.undefined)
    
    inline def setTimedTextTrackName(value: String): Self = StObject.set(x, "timedTextTrackName", value.asInstanceOf[js.Any])
    
    inline def setTimedTextTrackNameUndefined: Self = StObject.set(x, "timedTextTrackName", js.undefined)
    
    inline def setUpdateViewedDate(value: Boolean): Self = StObject.set(x, "updateViewedDate", value.asInstanceOf[js.Any])
    
    inline def setUpdateViewedDateUndefined: Self = StObject.set(x, "updateViewedDate", js.undefined)
    
    inline def setUseContentAsIndexableText(value: Boolean): Self = StObject.set(x, "useContentAsIndexableText", value.asInstanceOf[js.Any])
    
    inline def setUseContentAsIndexableTextUndefined: Self = StObject.set(x, "useContentAsIndexableText", js.undefined)
  }
}

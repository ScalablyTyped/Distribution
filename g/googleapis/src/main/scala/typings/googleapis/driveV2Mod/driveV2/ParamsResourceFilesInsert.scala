package typings.googleapis.driveV2Mod.driveV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ParamsResourceFilesInsertMutableBuilder[Self <: ParamsResourceFilesInsert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setConvert(value: Boolean): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
    
    @scala.inline
    def setMedia(value: Body): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
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
    def setRequestBody(value: SchemaFile): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
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
    def setUseContentAsIndexableText(value: Boolean): Self = StObject.set(x, "useContentAsIndexableText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseContentAsIndexableTextUndefined: Self = StObject.set(x, "useContentAsIndexableText", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}

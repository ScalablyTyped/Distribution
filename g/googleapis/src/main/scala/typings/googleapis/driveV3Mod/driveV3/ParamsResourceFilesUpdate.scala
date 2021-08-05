package typings.googleapis.driveV3Mod.driveV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFilesUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * A comma-separated list of parent IDs to add.
    */
  var addParents: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The ID of the file.
    */
  var fileId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to set the 'keepForever' field in the new head revision. This is
    * only applicable to files with binary content in Drive.
    */
  var keepRevisionForever: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Media metadata
    */
  var media: js.UndefOr[Body] = js.undefined
  
  /**
    * A language hint for OCR processing during image import (ISO 639-1 code).
    */
  var ocrLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * A comma-separated list of parent IDs to remove.
    */
  var removeParents: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaFile] = js.undefined
  
  /**
    * Whether the requesting application supports Team Drives.
    */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to use the uploaded content as indexable text.
    */
  var useContentAsIndexableText: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceFilesUpdate {
  
  inline def apply(): ParamsResourceFilesUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFilesUpdate]
  }
  
  extension [Self <: ParamsResourceFilesUpdate](x: Self) {
    
    inline def setAddParents(value: String): Self = StObject.set(x, "addParents", value.asInstanceOf[js.Any])
    
    inline def setAddParentsUndefined: Self = StObject.set(x, "addParents", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    inline def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    inline def setKeepRevisionForever(value: Boolean): Self = StObject.set(x, "keepRevisionForever", value.asInstanceOf[js.Any])
    
    inline def setKeepRevisionForeverUndefined: Self = StObject.set(x, "keepRevisionForever", js.undefined)
    
    inline def setMedia(value: Body): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setOcrLanguage(value: String): Self = StObject.set(x, "ocrLanguage", value.asInstanceOf[js.Any])
    
    inline def setOcrLanguageUndefined: Self = StObject.set(x, "ocrLanguage", js.undefined)
    
    inline def setRemoveParents(value: String): Self = StObject.set(x, "removeParents", value.asInstanceOf[js.Any])
    
    inline def setRemoveParentsUndefined: Self = StObject.set(x, "removeParents", js.undefined)
    
    inline def setRequestBody(value: SchemaFile): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSupportsTeamDrives(value: Boolean): Self = StObject.set(x, "supportsTeamDrives", value.asInstanceOf[js.Any])
    
    inline def setSupportsTeamDrivesUndefined: Self = StObject.set(x, "supportsTeamDrives", js.undefined)
    
    inline def setUseContentAsIndexableText(value: Boolean): Self = StObject.set(x, "useContentAsIndexableText", value.asInstanceOf[js.Any])
    
    inline def setUseContentAsIndexableTextUndefined: Self = StObject.set(x, "useContentAsIndexableText", js.undefined)
  }
}

package typings.googleapis.driveV3Mod.driveV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFilesCopy
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The ID of the file.
    */
  var fileId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to ignore the domain's default visibility settings for the
    * created file. Domain administrators can choose to make all uploaded files
    * visible to the domain by default; this parameter bypasses that behavior
    * for the request. Permissions are still inherited from parent folders.
    */
  var ignoreDefaultVisibility: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to set the 'keepForever' field in the new head revision. This is
    * only applicable to files with binary content in Drive.
    */
  var keepRevisionForever: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A language hint for OCR processing during image import (ISO 639-1 code).
    */
  var ocrLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaFile] = js.undefined
  
  /**
    * Whether the requesting application supports Team Drives.
    */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceFilesCopy {
  
  inline def apply(): ParamsResourceFilesCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFilesCopy]
  }
  
  extension [Self <: ParamsResourceFilesCopy](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    inline def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    inline def setIgnoreDefaultVisibility(value: Boolean): Self = StObject.set(x, "ignoreDefaultVisibility", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDefaultVisibilityUndefined: Self = StObject.set(x, "ignoreDefaultVisibility", js.undefined)
    
    inline def setKeepRevisionForever(value: Boolean): Self = StObject.set(x, "keepRevisionForever", value.asInstanceOf[js.Any])
    
    inline def setKeepRevisionForeverUndefined: Self = StObject.set(x, "keepRevisionForever", js.undefined)
    
    inline def setOcrLanguage(value: String): Self = StObject.set(x, "ocrLanguage", value.asInstanceOf[js.Any])
    
    inline def setOcrLanguageUndefined: Self = StObject.set(x, "ocrLanguage", js.undefined)
    
    inline def setRequestBody(value: SchemaFile): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSupportsTeamDrives(value: Boolean): Self = StObject.set(x, "supportsTeamDrives", value.asInstanceOf[js.Any])
    
    inline def setSupportsTeamDrivesUndefined: Self = StObject.set(x, "supportsTeamDrives", js.undefined)
  }
}

package typings.googleapis.v2Mod.androidpublisherV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEditsDeobfuscationfilesUpload
  extends StObject
     with StandardParameters {
  
  /**
    * The version code of the APK whose deobfuscation file is being uploaded.
    */
  var apkVersionCode: js.UndefOr[Double] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    *
    */
  var deobfuscationFileType: js.UndefOr[String] = js.undefined
  
  /**
    * Unique identifier for this edit.
    */
  var editId: js.UndefOr[String] = js.undefined
  
  /**
    * Media metadata
    */
  var media: js.UndefOr[Body] = js.undefined
  
  /**
    * Unique identifier of the Android app for which the deobfuscatiuon files
    * are being uploaded; for example, "com.spiffygame".
    */
  var packageName: js.UndefOr[String] = js.undefined
}
object ParamsResourceEditsDeobfuscationfilesUpload {
  
  inline def apply(): ParamsResourceEditsDeobfuscationfilesUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEditsDeobfuscationfilesUpload]
  }
  
  extension [Self <: ParamsResourceEditsDeobfuscationfilesUpload](x: Self) {
    
    inline def setApkVersionCode(value: Double): Self = StObject.set(x, "apkVersionCode", value.asInstanceOf[js.Any])
    
    inline def setApkVersionCodeUndefined: Self = StObject.set(x, "apkVersionCode", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setDeobfuscationFileType(value: String): Self = StObject.set(x, "deobfuscationFileType", value.asInstanceOf[js.Any])
    
    inline def setDeobfuscationFileTypeUndefined: Self = StObject.set(x, "deobfuscationFileType", js.undefined)
    
    inline def setEditId(value: String): Self = StObject.set(x, "editId", value.asInstanceOf[js.Any])
    
    inline def setEditIdUndefined: Self = StObject.set(x, "editId", js.undefined)
    
    inline def setMedia(value: Body): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}

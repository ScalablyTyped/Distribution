package typings.googleapis.v2Mod.androidpublisherV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEditsImagesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Unique identifier for this edit.
    */
  var editId: js.UndefOr[String] = js.undefined
  
  /**
    * Unique identifier an image within the set of images attached to this
    * edit.
    */
  var imageId: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var imageType: js.UndefOr[String] = js.undefined
  
  /**
    * The language code (a BCP-47 language tag) of the localized listing whose
    * images are to read or modified. For example, to select Austrian German,
    * pass "de-AT".
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * Unique identifier for the Android app that is being updated; for example,
    * "com.spiffygame".
    */
  var packageName: js.UndefOr[String] = js.undefined
}
object ParamsResourceEditsImagesDelete {
  
  inline def apply(): ParamsResourceEditsImagesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEditsImagesDelete]
  }
  
  extension [Self <: ParamsResourceEditsImagesDelete](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setEditId(value: String): Self = StObject.set(x, "editId", value.asInstanceOf[js.Any])
    
    inline def setEditIdUndefined: Self = StObject.set(x, "editId", js.undefined)
    
    inline def setImageId(value: String): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "imageId", js.undefined)
    
    inline def setImageType(value: String): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
    
    inline def setImageTypeUndefined: Self = StObject.set(x, "imageType", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}

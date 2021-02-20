package typings.googleapis.v2Mod.androidpublisherV2

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
trait ParamsResourceEditsBundlesUpload extends StandardParameters {
  
  /**
    * Must be set to true if the bundle installation may trigger a warning on
    * user devices (for example, if installation size may be over a threshold,
    * typically 100 MB).
    */
  var ackBundleInstallationWarning: js.UndefOr[Boolean] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Unique identifier for this edit.
    */
  var editId: js.UndefOr[String] = js.native
  
  /**
    * Media metadata
    */
  var media: js.UndefOr[Body] = js.native
  
  /**
    * Unique identifier for the Android app that is being updated; for example,
    * "com.spiffygame".
    */
  var packageName: js.UndefOr[String] = js.native
}
object ParamsResourceEditsBundlesUpload {
  
  @scala.inline
  def apply(): ParamsResourceEditsBundlesUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEditsBundlesUpload]
  }
  
  @scala.inline
  implicit class ParamsResourceEditsBundlesUploadMutableBuilder[Self <: ParamsResourceEditsBundlesUpload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAckBundleInstallationWarning(value: Boolean): Self = StObject.set(x, "ackBundleInstallationWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAckBundleInstallationWarningUndefined: Self = StObject.set(x, "ackBundleInstallationWarning", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setEditId(value: String): Self = StObject.set(x, "editId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditIdUndefined: Self = StObject.set(x, "editId", js.undefined)
    
    @scala.inline
    def setMedia(value: Body): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}

package typings.googleapis.v3Mod.analyticsV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementUploadsUploaddata
  extends StObject
     with StandardParameters {
  
  /**
    * Account Id associated with the upload.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Custom data source Id to which the data being uploaded belongs.
    */
  var customDataSourceId: js.UndefOr[String] = js.undefined
  
  /**
    * Media metadata
    */
  var media: js.UndefOr[Body] = js.undefined
  
  /**
    * Web property UA-string associated with the upload.
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementUploadsUploaddata {
  
  @scala.inline
  def apply(): ParamsResourceManagementUploadsUploaddata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementUploadsUploaddata]
  }
  
  @scala.inline
  implicit class ParamsResourceManagementUploadsUploaddataMutableBuilder[Self <: ParamsResourceManagementUploadsUploaddata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCustomDataSourceId(value: String): Self = StObject.set(x, "customDataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDataSourceIdUndefined: Self = StObject.set(x, "customDataSourceId", js.undefined)
    
    @scala.inline
    def setMedia(value: Body): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}

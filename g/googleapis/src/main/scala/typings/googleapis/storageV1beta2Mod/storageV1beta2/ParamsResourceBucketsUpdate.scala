package typings.googleapis.storageV1beta2Mod.storageV1beta2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBucketsUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Name of a bucket.
    */
  var bucket: js.UndefOr[String] = js.undefined
  
  /**
    * Makes the return of the bucket metadata conditional on whether the
    * bucket's current metageneration matches the given value.
    */
  var ifMetagenerationMatch: js.UndefOr[String] = js.undefined
  
  /**
    * Makes the return of the bucket metadata conditional on whether the
    * bucket's current metageneration does not match the given value.
    */
  var ifMetagenerationNotMatch: js.UndefOr[String] = js.undefined
  
  /**
    * Set of properties to return. Defaults to full.
    */
  var projection: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBucket] = js.undefined
}
object ParamsResourceBucketsUpdate {
  
  @scala.inline
  def apply(): ParamsResourceBucketsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBucketsUpdate]
  }
  
  @scala.inline
  implicit class ParamsResourceBucketsUpdateMutableBuilder[Self <: ParamsResourceBucketsUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    @scala.inline
    def setIfMetagenerationMatch(value: String): Self = StObject.set(x, "ifMetagenerationMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfMetagenerationMatchUndefined: Self = StObject.set(x, "ifMetagenerationMatch", js.undefined)
    
    @scala.inline
    def setIfMetagenerationNotMatch(value: String): Self = StObject.set(x, "ifMetagenerationNotMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfMetagenerationNotMatchUndefined: Self = StObject.set(x, "ifMetagenerationNotMatch", js.undefined)
    
    @scala.inline
    def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaBucket): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}

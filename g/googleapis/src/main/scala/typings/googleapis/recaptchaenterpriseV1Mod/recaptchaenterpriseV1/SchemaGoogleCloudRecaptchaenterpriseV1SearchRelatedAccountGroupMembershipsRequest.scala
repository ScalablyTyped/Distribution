package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsRequest extends StObject {
  
  /**
    * Optional. The unique stable hashed user identifier we should search connections to. The identifier should correspond to a `hashed_account_id` provided in a previous `CreateAssessment` or `AnnotateAssessment` call.
    */
  var hashedAccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The maximum number of groups to return. The service might return fewer than this value. If unspecified, at most 50 groups are returned. The maximum value is 1000; values above 1000 are coerced to 1000.
    */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. A page token, received from a previous `SearchRelatedAccountGroupMemberships` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `SearchRelatedAccountGroupMemberships` must match the call that provided the page token.
    */
  var pageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsRequest {
  
  inline def apply(): SchemaGoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsRequest]
  }
  
  extension [Self <: SchemaGoogleCloudRecaptchaenterpriseV1SearchRelatedAccountGroupMembershipsRequest](x: Self) {
    
    inline def setHashedAccountId(value: String): Self = StObject.set(x, "hashedAccountId", value.asInstanceOf[js.Any])
    
    inline def setHashedAccountIdNull: Self = StObject.set(x, "hashedAccountId", null)
    
    inline def setHashedAccountIdUndefined: Self = StObject.set(x, "hashedAccountId", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeNull: Self = StObject.set(x, "pageSize", null)
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}

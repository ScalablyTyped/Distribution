package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupMembershipsResponse extends StObject {
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The memberships listed by the query.
    */
  var relatedAccountGroupMemberships: js.UndefOr[js.Array[SchemaGoogleCloudRecaptchaenterpriseV1RelatedAccountGroupMembership]] = js.undefined
}
object SchemaGoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupMembershipsResponse {
  
  inline def apply(): SchemaGoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupMembershipsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupMembershipsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupMembershipsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRelatedAccountGroupMemberships(value: js.Array[SchemaGoogleCloudRecaptchaenterpriseV1RelatedAccountGroupMembership]): Self = StObject.set(x, "relatedAccountGroupMemberships", value.asInstanceOf[js.Any])
    
    inline def setRelatedAccountGroupMembershipsUndefined: Self = StObject.set(x, "relatedAccountGroupMemberships", js.undefined)
    
    inline def setRelatedAccountGroupMembershipsVarargs(value: SchemaGoogleCloudRecaptchaenterpriseV1RelatedAccountGroupMembership*): Self = StObject.set(x, "relatedAccountGroupMemberships", js.Array(value*))
  }
}

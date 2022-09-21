package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse extends StObject {
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The groups of related accounts listed by the query.
    */
  var relatedAccountGroups: js.UndefOr[js.Array[SchemaGoogleCloudRecaptchaenterpriseV1RelatedAccountGroup]] = js.undefined
}
object SchemaGoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse {
  
  inline def apply(): SchemaGoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRecaptchaenterpriseV1ListRelatedAccountGroupsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRelatedAccountGroups(value: js.Array[SchemaGoogleCloudRecaptchaenterpriseV1RelatedAccountGroup]): Self = StObject.set(x, "relatedAccountGroups", value.asInstanceOf[js.Any])
    
    inline def setRelatedAccountGroupsUndefined: Self = StObject.set(x, "relatedAccountGroups", js.undefined)
    
    inline def setRelatedAccountGroupsVarargs(value: SchemaGoogleCloudRecaptchaenterpriseV1RelatedAccountGroup*): Self = StObject.set(x, "relatedAccountGroups", js.Array(value*))
  }
}

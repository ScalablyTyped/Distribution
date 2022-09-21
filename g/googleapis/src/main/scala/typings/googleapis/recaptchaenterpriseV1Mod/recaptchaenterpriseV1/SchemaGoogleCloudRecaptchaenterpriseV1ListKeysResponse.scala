package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecaptchaenterpriseV1ListKeysResponse extends StObject {
  
  /**
    * Key details.
    */
  var keys: js.UndefOr[js.Array[SchemaGoogleCloudRecaptchaenterpriseV1Key]] = js.undefined
  
  /**
    * Token to retrieve the next page of results. It is set to empty if no keys remain in results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRecaptchaenterpriseV1ListKeysResponse {
  
  inline def apply(): SchemaGoogleCloudRecaptchaenterpriseV1ListKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecaptchaenterpriseV1ListKeysResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRecaptchaenterpriseV1ListKeysResponse](x: Self) {
    
    inline def setKeys(value: js.Array[SchemaGoogleCloudRecaptchaenterpriseV1Key]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: SchemaGoogleCloudRecaptchaenterpriseV1Key*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}

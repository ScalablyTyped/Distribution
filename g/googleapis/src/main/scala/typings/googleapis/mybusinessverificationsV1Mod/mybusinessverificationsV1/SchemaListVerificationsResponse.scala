package typings.googleapis.mybusinessverificationsV1Mod.mybusinessverificationsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListVerificationsResponse extends StObject {
  
  /**
    * If the number of verifications exceeded the requested page size, this field will be populated with a token to fetch the next page of verification on a subsequent call. If there are no more attributes, this field will not be present in the response.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of the verifications.
    */
  var verifications: js.UndefOr[js.Array[SchemaVerification]] = js.undefined
}
object SchemaListVerificationsResponse {
  
  inline def apply(): SchemaListVerificationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListVerificationsResponse]
  }
  
  extension [Self <: SchemaListVerificationsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setVerifications(value: js.Array[SchemaVerification]): Self = StObject.set(x, "verifications", value.asInstanceOf[js.Any])
    
    inline def setVerificationsUndefined: Self = StObject.set(x, "verifications", js.undefined)
    
    inline def setVerificationsVarargs(value: SchemaVerification*): Self = StObject.set(x, "verifications", js.Array(value*))
  }
}

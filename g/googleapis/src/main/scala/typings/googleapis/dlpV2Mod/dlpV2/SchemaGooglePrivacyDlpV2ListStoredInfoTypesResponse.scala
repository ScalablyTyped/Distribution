package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse extends StObject {
  
  /**
    * If the next page is available then the next page token to be used in following ListStoredInfoTypes request.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
    */
  var storedInfoTypes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2StoredInfoType]] = js.undefined
}
object SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse {
  
  inline def apply(): SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setStoredInfoTypes(value: js.Array[SchemaGooglePrivacyDlpV2StoredInfoType]): Self = StObject.set(x, "storedInfoTypes", value.asInstanceOf[js.Any])
    
    inline def setStoredInfoTypesUndefined: Self = StObject.set(x, "storedInfoTypes", js.undefined)
    
    inline def setStoredInfoTypesVarargs(value: SchemaGooglePrivacyDlpV2StoredInfoType*): Self = StObject.set(x, "storedInfoTypes", js.Array(value*))
  }
}

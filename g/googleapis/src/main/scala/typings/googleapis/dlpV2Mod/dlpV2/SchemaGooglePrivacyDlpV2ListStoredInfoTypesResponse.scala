package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for ListStoredInfoTypes.
  */
trait SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse extends StObject {
  
  /**
    * If the next page is available then the next page token to be used in
    * following ListStoredInfoTypes request.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
    */
  var storedInfoTypes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2StoredInfoType]] = js.undefined
}
object SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponseMutableBuilder[Self <: SchemaGooglePrivacyDlpV2ListStoredInfoTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setStoredInfoTypes(value: js.Array[SchemaGooglePrivacyDlpV2StoredInfoType]): Self = StObject.set(x, "storedInfoTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoredInfoTypesUndefined: Self = StObject.set(x, "storedInfoTypes", js.undefined)
    
    @scala.inline
    def setStoredInfoTypesVarargs(value: SchemaGooglePrivacyDlpV2StoredInfoType*): Self = StObject.set(x, "storedInfoTypes", js.Array(value :_*))
  }
}

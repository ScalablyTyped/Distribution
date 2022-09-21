package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListConsentArtifactsResponse extends StObject {
  
  /**
    * The returned Consent artifacts. The maximum number of artifacts returned is determined by the value of page_size in the ListConsentArtifactsRequest.
    */
  var consentArtifacts: js.UndefOr[js.Array[SchemaConsentArtifact]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListConsentArtifactsResponse {
  
  inline def apply(): SchemaListConsentArtifactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListConsentArtifactsResponse]
  }
  
  extension [Self <: SchemaListConsentArtifactsResponse](x: Self) {
    
    inline def setConsentArtifacts(value: js.Array[SchemaConsentArtifact]): Self = StObject.set(x, "consentArtifacts", value.asInstanceOf[js.Any])
    
    inline def setConsentArtifactsUndefined: Self = StObject.set(x, "consentArtifacts", js.undefined)
    
    inline def setConsentArtifactsVarargs(value: SchemaConsentArtifact*): Self = StObject.set(x, "consentArtifacts", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}

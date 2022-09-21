package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListConsentRevisionsResponse extends StObject {
  
  /**
    * The returned Consent revisions. The maximum number of revisions returned is determined by the value of `page_size` in the ListConsentRevisionsRequest.
    */
  var consents: js.UndefOr[js.Array[SchemaConsent]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListConsentRevisionsResponse {
  
  inline def apply(): SchemaListConsentRevisionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListConsentRevisionsResponse]
  }
  
  extension [Self <: SchemaListConsentRevisionsResponse](x: Self) {
    
    inline def setConsents(value: js.Array[SchemaConsent]): Self = StObject.set(x, "consents", value.asInstanceOf[js.Any])
    
    inline def setConsentsUndefined: Self = StObject.set(x, "consents", js.undefined)
    
    inline def setConsentsVarargs(value: SchemaConsent*): Self = StObject.set(x, "consents", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}

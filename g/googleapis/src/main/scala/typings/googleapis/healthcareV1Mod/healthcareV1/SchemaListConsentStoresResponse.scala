package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListConsentStoresResponse extends StObject {
  
  /**
    * The returned consent stores. The maximum number of stores returned is determined by the value of page_size in the ListConsentStoresRequest.
    */
  var consentStores: js.UndefOr[js.Array[SchemaConsentStore]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListConsentStoresResponse {
  
  inline def apply(): SchemaListConsentStoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListConsentStoresResponse]
  }
  
  extension [Self <: SchemaListConsentStoresResponse](x: Self) {
    
    inline def setConsentStores(value: js.Array[SchemaConsentStore]): Self = StObject.set(x, "consentStores", value.asInstanceOf[js.Any])
    
    inline def setConsentStoresUndefined: Self = StObject.set(x, "consentStores", js.undefined)
    
    inline def setConsentStoresVarargs(value: SchemaConsentStore*): Self = StObject.set(x, "consentStores", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}

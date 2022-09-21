package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLinkedAdUnitsResponse extends StObject {
  
  /** The ad units returned in the list response. */
  var adUnits: js.UndefOr[js.Array[AdUnit]] = js.undefined
  
  /** Continuation token used to page through ad units. To retrieve the next page of the results, set the next request's "page_token" value to this. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListLinkedAdUnitsResponse {
  
  inline def apply(): ListLinkedAdUnitsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLinkedAdUnitsResponse]
  }
  
  extension [Self <: ListLinkedAdUnitsResponse](x: Self) {
    
    inline def setAdUnits(value: js.Array[AdUnit]): Self = StObject.set(x, "adUnits", value.asInstanceOf[js.Any])
    
    inline def setAdUnitsUndefined: Self = StObject.set(x, "adUnits", js.undefined)
    
    inline def setAdUnitsVarargs(value: AdUnit*): Self = StObject.set(x, "adUnits", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}

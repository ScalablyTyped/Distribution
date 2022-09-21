package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAdUnitsResponse extends StObject {
  
  /** The resulting ad units for the requested account. */
  var adUnits: js.UndefOr[js.Array[AdUnit]] = js.undefined
  
  /** If not empty, indicates that there may be more ad units for the request; this value should be passed in a new `ListAdUnitsRequest`. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListAdUnitsResponse {
  
  inline def apply(): ListAdUnitsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAdUnitsResponse]
  }
  
  extension [Self <: ListAdUnitsResponse](x: Self) {
    
    inline def setAdUnits(value: js.Array[AdUnit]): Self = StObject.set(x, "adUnits", value.asInstanceOf[js.Any])
    
    inline def setAdUnitsUndefined: Self = StObject.set(x, "adUnits", js.undefined)
    
    inline def setAdUnitsVarargs(value: AdUnit*): Self = StObject.set(x, "adUnits", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}

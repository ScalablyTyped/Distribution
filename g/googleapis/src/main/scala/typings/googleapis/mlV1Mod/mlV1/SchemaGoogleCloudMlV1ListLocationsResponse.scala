package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1ListLocationsResponse extends StObject {
  
  /**
    * Locations where at least one type of CMLE capability is available.
    */
  var locations: js.UndefOr[js.Array[SchemaGoogleCloudMlV1Location]] = js.undefined
  
  /**
    * Optional. Pass this token as the `page_token` field of the request for a
    * subsequent call.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudMlV1ListLocationsResponse {
  
  inline def apply(): SchemaGoogleCloudMlV1ListLocationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1ListLocationsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1ListLocationsResponse](x: Self) {
    
    inline def setLocations(value: js.Array[SchemaGoogleCloudMlV1Location]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: SchemaGoogleCloudMlV1Location*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}

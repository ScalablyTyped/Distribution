package typings.googleapis.tpuV1alpha1Mod.tpuV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response message for Locations.ListLocations.
  */
trait SchemaListLocationsResponse extends StObject {
  
  /**
    * A list of locations that matches the specified filter in the request.
    */
  var locations: js.UndefOr[js.Array[SchemaLocation]] = js.undefined
  
  /**
    * The standard List next-page token.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListLocationsResponse {
  
  inline def apply(): SchemaListLocationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListLocationsResponse]
  }
  
  extension [Self <: SchemaListLocationsResponse](x: Self) {
    
    inline def setLocations(value: js.Array[SchemaLocation]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: SchemaLocation*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}

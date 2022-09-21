package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSearchGoogleLocationsResponse extends StObject {
  
  /**
    * A collection of GoogleLocations that are potential matches to the specified request, listed in order from most to least accuracy.
    */
  var googleLocations: js.UndefOr[js.Array[SchemaGoogleLocation]] = js.undefined
}
object SchemaSearchGoogleLocationsResponse {
  
  inline def apply(): SchemaSearchGoogleLocationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchGoogleLocationsResponse]
  }
  
  extension [Self <: SchemaSearchGoogleLocationsResponse](x: Self) {
    
    inline def setGoogleLocations(value: js.Array[SchemaGoogleLocation]): Self = StObject.set(x, "googleLocations", value.asInstanceOf[js.Any])
    
    inline def setGoogleLocationsUndefined: Self = StObject.set(x, "googleLocations", js.undefined)
    
    inline def setGoogleLocationsVarargs(value: SchemaGoogleLocation*): Self = StObject.set(x, "googleLocations", js.Array(value*))
  }
}

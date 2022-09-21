package typings.googleapis.playablelocationsV3Mod.playablelocationsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocationList extends StObject {
  
  /**
    * A list of playable locations for this game object type.
    */
  var locations: js.UndefOr[js.Array[SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocation]] = js.undefined
}
object SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocationList {
  
  inline def apply(): SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocationList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocationList]
  }
  
  extension [Self <: SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocationList](x: Self) {
    
    inline def setLocations(value: js.Array[SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocation]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocation*): Self = StObject.set(x, "locations", js.Array(value*))
  }
}

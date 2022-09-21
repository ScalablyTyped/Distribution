package typings.googleapis.playablelocationsV3Mod.playablelocationsV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse extends StObject {
  
  /**
    * Each PlayableLocation object corresponds to a game_object_type specified in the request.
    */
  var locationsPerGameObjectType: js.UndefOr[
    StringDictionary[SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocationList] | Null
  ] = js.undefined
  
  /**
    * Required. Specifies the "time-to-live" for the set of playable locations. You can use this value to determine how long to cache the set of playable locations. After this length of time, your back-end game server should issue a new SamplePlayableLocations request to get a fresh set of playable locations (because for example, they might have been removed, a park might have closed for the day, a business might have closed permanently).
    */
  var ttl: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse {
  
  inline def apply(): SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse]
  }
  
  extension [Self <: SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse](x: Self) {
    
    inline def setLocationsPerGameObjectType(value: StringDictionary[SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocationList]): Self = StObject.set(x, "locationsPerGameObjectType", value.asInstanceOf[js.Any])
    
    inline def setLocationsPerGameObjectTypeNull: Self = StObject.set(x, "locationsPerGameObjectType", null)
    
    inline def setLocationsPerGameObjectTypeUndefined: Self = StObject.set(x, "locationsPerGameObjectType", js.undefined)
    
    inline def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlNull: Self = StObject.set(x, "ttl", null)
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}

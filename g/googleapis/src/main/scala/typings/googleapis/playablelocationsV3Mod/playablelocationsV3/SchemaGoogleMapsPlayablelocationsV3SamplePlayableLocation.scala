package typings.googleapis.playablelocationsV3Mod.playablelocationsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocation extends StObject {
  
  /**
    * Required. The latitude and longitude associated with the center of the playable location. By default, the set of playable locations returned from SamplePlayableLocations use center-point coordinates.
    */
  var centerPoint: js.UndefOr[SchemaGoogleTypeLatLng] = js.undefined
  
  /**
    * Required. The name of this playable location.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A [place ID] (https://developers.google.com/places/place-id)
    */
  var placeId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A [plus code] (http://openlocationcode.com)
    */
  var plusCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The playable location's coordinates, snapped to the sidewalk of the nearest road, if a nearby road exists.
    */
  var snappedPoint: js.UndefOr[SchemaGoogleTypeLatLng] = js.undefined
  
  /**
    * A collection of [Playable Location Types](/maps/documentation/gaming/tt/types) for this playable location. The first type in the collection is the primary type. Type information might not be available for all playable locations.
    */
  var types: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocation {
  
  inline def apply(): SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocation]
  }
  
  extension [Self <: SchemaGoogleMapsPlayablelocationsV3SamplePlayableLocation](x: Self) {
    
    inline def setCenterPoint(value: SchemaGoogleTypeLatLng): Self = StObject.set(x, "centerPoint", value.asInstanceOf[js.Any])
    
    inline def setCenterPointUndefined: Self = StObject.set(x, "centerPoint", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    inline def setPlaceIdNull: Self = StObject.set(x, "placeId", null)
    
    inline def setPlaceIdUndefined: Self = StObject.set(x, "placeId", js.undefined)
    
    inline def setPlusCode(value: String): Self = StObject.set(x, "plusCode", value.asInstanceOf[js.Any])
    
    inline def setPlusCodeNull: Self = StObject.set(x, "plusCode", null)
    
    inline def setPlusCodeUndefined: Self = StObject.set(x, "plusCode", js.undefined)
    
    inline def setSnappedPoint(value: SchemaGoogleTypeLatLng): Self = StObject.set(x, "snappedPoint", value.asInstanceOf[js.Any])
    
    inline def setSnappedPointUndefined: Self = StObject.set(x, "snappedPoint", js.undefined)
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesNull: Self = StObject.set(x, "types", null)
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
  }
}

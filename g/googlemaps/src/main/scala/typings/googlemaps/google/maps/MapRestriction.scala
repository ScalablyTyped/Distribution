package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A restriction that can be applied to the Map. The map's viewport will not
  * exceed these restrictions.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#MapRestriction Maps JavaScript API}
  */
trait MapRestriction extends StObject {
  
  /**
    * When set, a user can only pan and zoom inside the given bounds.
    * Bounds can restrict both longitude and latitude, or can restrict
    * latitude only. For latitude-only bounds use west and east longitudes
    * of -180 and 180, respectively.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#MapRestriction.latLngBounds Maps JavaScript API}
    */
  var latLngBounds: LatLngBounds | LatLngBoundsLiteral
  
  /**
    * By default bounds are relaxed, meaning that a user can zoom out
    * until the entire bounded area is in view. Bounds can be made more
    * restrictive by setting the strictBounds flag to true. This reduces
    * how far a user can zoom out, ensuring that everything outside of the
    * restricted bounds stays hidden.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#MapRestriction.strictBounds Maps JavaScript API}
    */
  var strictBounds: js.UndefOr[Boolean] = js.undefined
}
object MapRestriction {
  
  inline def apply(latLngBounds: LatLngBounds | LatLngBoundsLiteral): MapRestriction = {
    val __obj = js.Dynamic.literal(latLngBounds = latLngBounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapRestriction]
  }
  
  extension [Self <: MapRestriction](x: Self) {
    
    inline def setLatLngBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "latLngBounds", value.asInstanceOf[js.Any])
    
    inline def setStrictBounds(value: Boolean): Self = StObject.set(x, "strictBounds", value.asInstanceOf[js.Any])
    
    inline def setStrictBoundsUndefined: Self = StObject.set(x, "strictBounds", js.undefined)
  }
}

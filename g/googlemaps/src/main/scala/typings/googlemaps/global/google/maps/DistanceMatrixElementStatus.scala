package typings.googlemaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The element-level status about a particular origin-destination pairing returned by the
  * {@link DistanceMatrixService} upon completion of a distance matrix request.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixElementStatus Maps JavaScript API}
  */
@JSGlobal("google.maps.DistanceMatrixElementStatus")
@js.native
object DistanceMatrixElementStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.googlemaps.google.maps.DistanceMatrixElementStatus & String] = js.native
  
  /* "NOT_FOUND" */ val NOT_FOUND: typings.googlemaps.google.maps.DistanceMatrixElementStatus.NOT_FOUND & String = js.native
  
  /* "OK" */ val OK: typings.googlemaps.google.maps.DistanceMatrixElementStatus.OK & String = js.native
  
  /* "ZERO_RESULTS" */ val ZERO_RESULTS: typings.googlemaps.google.maps.DistanceMatrixElementStatus.ZERO_RESULTS & String = js.native
}

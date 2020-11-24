package typings.googlemaps.global.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The top-level status about the request in general returned by the {@link DistanceMatrixService} upon completion
  * of a distance matrix request. Specify these by value, or by using the constant's name.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixStatus Maps JavaScript API}
  */
@JSGlobal("google.maps.DistanceMatrixStatus")
@js.native
object DistanceMatrixStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.googlemaps.google.maps.DistanceMatrixStatus with String] = js.native
  
  /* "INVALID_REQUEST" */ val INVALID_REQUEST: typings.googlemaps.google.maps.DistanceMatrixStatus.INVALID_REQUEST with String = js.native
  
  /* "MAX_DIMENSIONS_EXCEEDED" */ val MAX_DIMENSIONS_EXCEEDED: typings.googlemaps.google.maps.DistanceMatrixStatus.MAX_DIMENSIONS_EXCEEDED with String = js.native
  
  /* "MAX_ELEMENTS_EXCEEDED" */ val MAX_ELEMENTS_EXCEEDED: typings.googlemaps.google.maps.DistanceMatrixStatus.MAX_ELEMENTS_EXCEEDED with String = js.native
  
  /* "OK" */ val OK: typings.googlemaps.google.maps.DistanceMatrixStatus.OK with String = js.native
  
  /* "OVER_QUERY_LIMIT" */ val OVER_QUERY_LIMIT: typings.googlemaps.google.maps.DistanceMatrixStatus.OVER_QUERY_LIMIT with String = js.native
  
  /* "REQUEST_DENIED" */ val REQUEST_DENIED: typings.googlemaps.google.maps.DistanceMatrixStatus.REQUEST_DENIED with String = js.native
  
  /* "UNKNOWN_ERROR" */ val UNKNOWN_ERROR: typings.googlemaps.google.maps.DistanceMatrixStatus.UNKNOWN_ERROR with String = js.native
}

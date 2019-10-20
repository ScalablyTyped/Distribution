package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GeocoderLocationType extends js.Object

@JSGlobal("google.maps.GeocoderLocationType")
@js.native
object GeocoderLocationType extends js.Object {
  @js.native
  sealed trait APPROXIMATE extends GeocoderLocationType
  
  @js.native
  sealed trait GEOMETRIC_CENTER extends GeocoderLocationType
  
  @js.native
  sealed trait RANGE_INTERPOLATED extends GeocoderLocationType
  
  @js.native
  sealed trait ROOFTOP extends GeocoderLocationType
  
  /* "APPROXIMATE" */ val APPROXIMATE: typings.googlemaps.google.maps.GeocoderLocationType.APPROXIMATE with String = js.native
  /* "GEOMETRIC_CENTER" */ val GEOMETRIC_CENTER: typings.googlemaps.google.maps.GeocoderLocationType.GEOMETRIC_CENTER with String = js.native
  /* "RANGE_INTERPOLATED" */ val RANGE_INTERPOLATED: typings.googlemaps.google.maps.GeocoderLocationType.RANGE_INTERPOLATED with String = js.native
  /* "ROOFTOP" */ val ROOFTOP: typings.googlemaps.google.maps.GeocoderLocationType.ROOFTOP with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[GeocoderLocationType with String] = js.native
}


package typings.googlemaps.googleNs.mapsNs

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
  
  /* 0 */ val APPROXIMATE: typings.googlemaps.googleNs.mapsNs.GeocoderLocationType.APPROXIMATE with Double = js.native
  /* 1 */ val GEOMETRIC_CENTER: typings.googlemaps.googleNs.mapsNs.GeocoderLocationType.GEOMETRIC_CENTER with Double = js.native
  /* 2 */ val RANGE_INTERPOLATED: typings.googlemaps.googleNs.mapsNs.GeocoderLocationType.RANGE_INTERPOLATED with Double = js.native
  /* 3 */ val ROOFTOP: typings.googlemaps.googleNs.mapsNs.GeocoderLocationType.ROOFTOP with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeocoderLocationType with Double] = js.native
}


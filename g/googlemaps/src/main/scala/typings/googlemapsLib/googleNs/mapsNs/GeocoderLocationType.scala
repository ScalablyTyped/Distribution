package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GeocoderLocationType extends js.Object

@JSGlobal("google.maps.GeocoderLocationType")
@js.native
object GeocoderLocationType extends js.Object {
  @js.native
  sealed trait APPROXIMATE
    extends googlemapsLib.googleNs.mapsNs.GeocoderLocationType
  
  @js.native
  sealed trait GEOMETRIC_CENTER
    extends googlemapsLib.googleNs.mapsNs.GeocoderLocationType
  
  @js.native
  sealed trait RANGE_INTERPOLATED
    extends googlemapsLib.googleNs.mapsNs.GeocoderLocationType
  
  @js.native
  sealed trait ROOFTOP
    extends googlemapsLib.googleNs.mapsNs.GeocoderLocationType
  
  /* 0 */ val APPROXIMATE: APPROXIMATE with scala.Double = js.native
  /* 1 */ val GEOMETRIC_CENTER: GEOMETRIC_CENTER with scala.Double = js.native
  /* 2 */ val RANGE_INTERPOLATED: RANGE_INTERPOLATED with scala.Double = js.native
  /* 3 */ val ROOFTOP: ROOFTOP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googlemapsLib.googleNs.mapsNs.GeocoderLocationType with scala.Double] = js.native
}


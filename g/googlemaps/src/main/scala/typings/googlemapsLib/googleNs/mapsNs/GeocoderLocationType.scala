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
  
  val APPROXIMATE: APPROXIMATE with java.lang.String = js.native
  val GEOMETRIC_CENTER: GEOMETRIC_CENTER with java.lang.String = js.native
  val RANGE_INTERPOLATED: RANGE_INTERPOLATED with java.lang.String = js.native
  val ROOFTOP: ROOFTOP with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[googlemapsLib.googleNs.mapsNs.GeocoderLocationType with java.lang.String] = js.native
}


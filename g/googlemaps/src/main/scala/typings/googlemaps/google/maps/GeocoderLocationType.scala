package typings.googlemaps.google.maps

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[GeocoderLocationType with String] = js.native
  /* "APPROXIMATE" */ @js.native
  object APPROXIMATE extends TopLevel[APPROXIMATE with String]
  
  /* "GEOMETRIC_CENTER" */ @js.native
  object GEOMETRIC_CENTER extends TopLevel[GEOMETRIC_CENTER with String]
  
  /* "RANGE_INTERPOLATED" */ @js.native
  object RANGE_INTERPOLATED extends TopLevel[RANGE_INTERPOLATED with String]
  
  /* "ROOFTOP" */ @js.native
  object ROOFTOP extends TopLevel[ROOFTOP with String]
  
}


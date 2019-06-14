package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ZoomControlStyle extends js.Object

@JSGlobal("google.maps.ZoomControlStyle")
@js.native
object ZoomControlStyle extends js.Object {
  @js.native
  sealed trait DEFAULT
    extends googlemapsLib.googleNs.mapsNs.ZoomControlStyle
  
  @js.native
  sealed trait LARGE
    extends googlemapsLib.googleNs.mapsNs.ZoomControlStyle
  
  @js.native
  sealed trait SMALL
    extends googlemapsLib.googleNs.mapsNs.ZoomControlStyle
  
  /* 0 */ val DEFAULT: DEFAULT with scala.Double = js.native
  /* 1 */ val LARGE: LARGE with scala.Double = js.native
  /* 2 */ val SMALL: SMALL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googlemapsLib.googleNs.mapsNs.ZoomControlStyle with scala.Double] = js.native
}


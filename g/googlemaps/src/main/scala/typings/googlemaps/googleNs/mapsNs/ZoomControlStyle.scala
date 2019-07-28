package typings.googlemaps.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ZoomControlStyle extends js.Object

@JSGlobal("google.maps.ZoomControlStyle")
@js.native
object ZoomControlStyle extends js.Object {
  @js.native
  sealed trait DEFAULT extends ZoomControlStyle
  
  @js.native
  sealed trait LARGE extends ZoomControlStyle
  
  @js.native
  sealed trait SMALL extends ZoomControlStyle
  
  /* 0 */ val DEFAULT: typings.googlemaps.googleNs.mapsNs.ZoomControlStyle.DEFAULT with Double = js.native
  /* 1 */ val LARGE: typings.googlemaps.googleNs.mapsNs.ZoomControlStyle.LARGE with Double = js.native
  /* 2 */ val SMALL: typings.googlemaps.googleNs.mapsNs.ZoomControlStyle.SMALL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ZoomControlStyle with Double] = js.native
}


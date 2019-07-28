package typings.googlemaps.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScaleControlStyle extends js.Object

@JSGlobal("google.maps.ScaleControlStyle")
@js.native
object ScaleControlStyle extends js.Object {
  @js.native
  sealed trait DEFAULT extends ScaleControlStyle
  
  /* 0 */ val DEFAULT: typings.googlemaps.googleNs.mapsNs.ScaleControlStyle.DEFAULT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScaleControlStyle with Double] = js.native
}


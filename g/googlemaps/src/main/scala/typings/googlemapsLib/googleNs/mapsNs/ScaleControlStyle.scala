package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScaleControlStyle extends js.Object

@JSGlobal("google.maps.ScaleControlStyle")
@js.native
object ScaleControlStyle extends js.Object {
  @js.native
  sealed trait DEFAULT
    extends googlemapsLib.googleNs.mapsNs.ScaleControlStyle
  
  /* 0 */ val DEFAULT: DEFAULT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googlemapsLib.googleNs.mapsNs.ScaleControlStyle with scala.Double] = js.native
}


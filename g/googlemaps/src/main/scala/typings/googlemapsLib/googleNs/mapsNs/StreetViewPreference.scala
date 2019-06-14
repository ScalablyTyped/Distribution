package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StreetViewPreference extends js.Object

@JSGlobal("google.maps.StreetViewPreference")
@js.native
object StreetViewPreference extends js.Object {
  @js.native
  sealed trait BEST
    extends googlemapsLib.googleNs.mapsNs.StreetViewPreference
  
  @js.native
  sealed trait NEAREST
    extends googlemapsLib.googleNs.mapsNs.StreetViewPreference
  
  /* 0 */ val BEST: BEST with scala.Double = js.native
  /* 1 */ val NEAREST: NEAREST with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googlemapsLib.googleNs.mapsNs.StreetViewPreference with scala.Double] = js.native
}


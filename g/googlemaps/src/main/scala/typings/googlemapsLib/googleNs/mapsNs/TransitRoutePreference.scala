package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransitRoutePreference extends js.Object

@JSGlobal("google.maps.TransitRoutePreference")
@js.native
object TransitRoutePreference extends js.Object {
  @js.native
  sealed trait FEWER_TRANSFERS
    extends googlemapsLib.googleNs.mapsNs.TransitRoutePreference
  
  @js.native
  sealed trait LESS_WALKING
    extends googlemapsLib.googleNs.mapsNs.TransitRoutePreference
  
  /* 0 */ val FEWER_TRANSFERS: FEWER_TRANSFERS with scala.Double = js.native
  /* 1 */ val LESS_WALKING: LESS_WALKING with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googlemapsLib.googleNs.mapsNs.TransitRoutePreference with scala.Double] = js.native
}


package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransitRoutePreference extends js.Object

@JSGlobal("google.maps.TransitRoutePreference")
@js.native
object TransitRoutePreference extends js.Object {
  @js.native
  sealed trait FEWER_TRANSFERS extends TransitRoutePreference
  
  @js.native
  sealed trait LESS_WALKING extends TransitRoutePreference
  
  /* "FEWER_TRANSFERS" */ val FEWER_TRANSFERS: typings.googlemaps.google.maps.TransitRoutePreference.FEWER_TRANSFERS with String = js.native
  /* "LESS_WALKING" */ val LESS_WALKING: typings.googlemaps.google.maps.TransitRoutePreference.LESS_WALKING with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TransitRoutePreference with String] = js.native
}


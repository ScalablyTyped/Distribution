package typings.googlemaps.google.maps

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TransitRoutePreference with String] = js.native
  /* "FEWER_TRANSFERS" */ @js.native
  object FEWER_TRANSFERS extends TopLevel[FEWER_TRANSFERS with String]
  
  /* "LESS_WALKING" */ @js.native
  object LESS_WALKING extends TopLevel[LESS_WALKING with String]
  
}


package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StreetViewPreference extends js.Object

@JSGlobal("google.maps.StreetViewPreference")
@js.native
object StreetViewPreference extends js.Object {
  @js.native
  sealed trait BEST extends StreetViewPreference
  
  @js.native
  sealed trait NEAREST extends StreetViewPreference
  
  /* 0 */ val BEST: typings.googlemaps.google.maps.StreetViewPreference.BEST with Double = js.native
  /* 1 */ val NEAREST: typings.googlemaps.google.maps.StreetViewPreference.NEAREST with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StreetViewPreference with Double] = js.native
}


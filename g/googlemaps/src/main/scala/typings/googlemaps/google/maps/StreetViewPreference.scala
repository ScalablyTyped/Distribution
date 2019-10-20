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
  
  /* "best" */ val BEST: typings.googlemaps.google.maps.StreetViewPreference.BEST with String = js.native
  /* "nearest" */ val NEAREST: typings.googlemaps.google.maps.StreetViewPreference.NEAREST with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StreetViewPreference with String] = js.native
}


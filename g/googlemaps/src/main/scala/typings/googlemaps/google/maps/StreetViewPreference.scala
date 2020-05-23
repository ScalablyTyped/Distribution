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
  
}


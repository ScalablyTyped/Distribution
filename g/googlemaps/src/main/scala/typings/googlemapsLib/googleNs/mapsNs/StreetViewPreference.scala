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
  
  val BEST: BEST with java.lang.String = js.native
  val NEAREST: NEAREST with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[googlemapsLib.googleNs.mapsNs.StreetViewPreference with java.lang.String] = js.native
}


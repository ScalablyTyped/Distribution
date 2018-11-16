package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StreetViewSource extends js.Object

@JSGlobal("google.maps.StreetViewSource")
@js.native
object StreetViewSource extends js.Object {
  @js.native
  sealed trait DEFAULT
    extends googlemapsLib.googleNs.mapsNs.StreetViewSource
  
  @js.native
  sealed trait OUTDOOR
    extends googlemapsLib.googleNs.mapsNs.StreetViewSource
  
  val DEFAULT: DEFAULT with java.lang.String = js.native
  val OUTDOOR: OUTDOOR with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[googlemapsLib.googleNs.mapsNs.StreetViewSource with java.lang.String] = js.native
}


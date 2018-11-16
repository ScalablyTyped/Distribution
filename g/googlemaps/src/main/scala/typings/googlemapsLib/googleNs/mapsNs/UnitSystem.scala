package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UnitSystem extends js.Object

@JSGlobal("google.maps.UnitSystem")
@js.native
object UnitSystem extends js.Object {
  @js.native
  sealed trait IMPERIAL
    extends googlemapsLib.googleNs.mapsNs.UnitSystem
  
  @js.native
  sealed trait METRIC
    extends googlemapsLib.googleNs.mapsNs.UnitSystem
  
  val IMPERIAL: IMPERIAL with java.lang.String = js.native
  val METRIC: METRIC with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[googlemapsLib.googleNs.mapsNs.UnitSystem with java.lang.String] = js.native
}


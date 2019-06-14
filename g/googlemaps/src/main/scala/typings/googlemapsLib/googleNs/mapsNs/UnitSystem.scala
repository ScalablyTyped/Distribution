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
  
  /* 0 */ val IMPERIAL: IMPERIAL with scala.Double = js.native
  /* 1 */ val METRIC: METRIC with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googlemapsLib.googleNs.mapsNs.UnitSystem with scala.Double] = js.native
}


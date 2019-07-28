package typings.googlemaps.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UnitSystem extends js.Object

@JSGlobal("google.maps.UnitSystem")
@js.native
object UnitSystem extends js.Object {
  @js.native
  sealed trait IMPERIAL extends UnitSystem
  
  @js.native
  sealed trait METRIC extends UnitSystem
  
  /* 0 */ val IMPERIAL: typings.googlemaps.googleNs.mapsNs.UnitSystem.IMPERIAL with Double = js.native
  /* 1 */ val METRIC: typings.googlemaps.googleNs.mapsNs.UnitSystem.METRIC with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnitSystem with Double] = js.native
}


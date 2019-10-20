package typings.googlemaps.google.maps

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
  
  /* 1 */ val IMPERIAL: typings.googlemaps.google.maps.UnitSystem.IMPERIAL with Double = js.native
  /* 0 */ val METRIC: typings.googlemaps.google.maps.UnitSystem.METRIC with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnitSystem with Double] = js.native
}


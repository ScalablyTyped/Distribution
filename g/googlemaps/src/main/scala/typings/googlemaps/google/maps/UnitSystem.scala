package typings.googlemaps.google.maps

import org.scalablytyped.runtime.TopLevel
import typings.googlemaps.google.maps.UnitSystem.IMPERIAL
import typings.googlemaps.google.maps.UnitSystem.METRIC
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnitSystem with Double] = js.native
  /* 1 */ @js.native
  object IMPERIAL extends TopLevel[IMPERIAL with Double]
  
  /* 0 */ @js.native
  object METRIC extends TopLevel[METRIC with Double]
  
}


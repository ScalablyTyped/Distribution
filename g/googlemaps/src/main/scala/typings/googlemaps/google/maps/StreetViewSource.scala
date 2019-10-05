package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StreetViewSource extends js.Object

@JSGlobal("google.maps.StreetViewSource")
@js.native
object StreetViewSource extends js.Object {
  @js.native
  sealed trait DEFAULT extends StreetViewSource
  
  @js.native
  sealed trait OUTDOOR extends StreetViewSource
  
  /* 0 */ val DEFAULT: typings.googlemaps.google.maps.StreetViewSource.DEFAULT with Double = js.native
  /* 1 */ val OUTDOOR: typings.googlemaps.google.maps.StreetViewSource.OUTDOOR with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StreetViewSource with Double] = js.native
}


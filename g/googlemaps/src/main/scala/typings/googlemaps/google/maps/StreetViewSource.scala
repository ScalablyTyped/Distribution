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
  
  /* "default" */ val DEFAULT: typings.googlemaps.google.maps.StreetViewSource.DEFAULT with String = js.native
  /* "outdoor" */ val OUTDOOR: typings.googlemaps.google.maps.StreetViewSource.OUTDOOR with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StreetViewSource with String] = js.native
}


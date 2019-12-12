package typings.googlemaps.google.maps

import org.scalablytyped.runtime.TopLevel
import typings.googlemaps.google.maps.StreetViewSource.DEFAULT
import typings.googlemaps.google.maps.StreetViewSource.OUTDOOR
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StreetViewSource with String] = js.native
  /* "default" */ @js.native
  object DEFAULT extends TopLevel[DEFAULT with String]
  
  /* "outdoor" */ @js.native
  object OUTDOOR extends TopLevel[OUTDOOR with String]
  
}


package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MapTypeControlStyle extends js.Object

@JSGlobal("google.maps.MapTypeControlStyle")
@js.native
object MapTypeControlStyle extends js.Object {
  @js.native
  sealed trait DEFAULT extends MapTypeControlStyle
  
  @js.native
  sealed trait DROPDOWN_MENU extends MapTypeControlStyle
  
  @js.native
  sealed trait HORIZONTAL_BAR extends MapTypeControlStyle
  
  /* 0 */ val DEFAULT: typings.googlemaps.google.maps.MapTypeControlStyle.DEFAULT with Double = js.native
  /* 1 */ val DROPDOWN_MENU: typings.googlemaps.google.maps.MapTypeControlStyle.DROPDOWN_MENU with Double = js.native
  /* 2 */ val HORIZONTAL_BAR: typings.googlemaps.google.maps.MapTypeControlStyle.HORIZONTAL_BAR with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MapTypeControlStyle with Double] = js.native
}


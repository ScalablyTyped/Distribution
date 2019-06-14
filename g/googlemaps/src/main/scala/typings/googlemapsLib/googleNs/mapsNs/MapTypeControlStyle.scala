package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MapTypeControlStyle extends js.Object

@JSGlobal("google.maps.MapTypeControlStyle")
@js.native
object MapTypeControlStyle extends js.Object {
  @js.native
  sealed trait DEFAULT
    extends googlemapsLib.googleNs.mapsNs.MapTypeControlStyle
  
  @js.native
  sealed trait DROPDOWN_MENU
    extends googlemapsLib.googleNs.mapsNs.MapTypeControlStyle
  
  @js.native
  sealed trait HORIZONTAL_BAR
    extends googlemapsLib.googleNs.mapsNs.MapTypeControlStyle
  
  /* 0 */ val DEFAULT: DEFAULT with scala.Double = js.native
  /* 1 */ val DROPDOWN_MENU: DROPDOWN_MENU with scala.Double = js.native
  /* 2 */ val HORIZONTAL_BAR: HORIZONTAL_BAR with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googlemapsLib.googleNs.mapsNs.MapTypeControlStyle with scala.Double] = js.native
}


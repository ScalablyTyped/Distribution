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
  
  val DEFAULT: DEFAULT with java.lang.String = js.native
  val DROPDOWN_MENU: DROPDOWN_MENU with java.lang.String = js.native
  val HORIZONTAL_BAR: HORIZONTAL_BAR with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[googlemapsLib.googleNs.mapsNs.MapTypeControlStyle with java.lang.String] = js.native
}


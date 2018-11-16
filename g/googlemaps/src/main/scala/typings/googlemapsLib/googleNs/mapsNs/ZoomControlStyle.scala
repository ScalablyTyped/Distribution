package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ZoomControlStyle extends js.Object

@JSGlobal("google.maps.ZoomControlStyle")
@js.native
object ZoomControlStyle extends js.Object {
  @js.native
  sealed trait DEFAULT
    extends googlemapsLib.googleNs.mapsNs.ZoomControlStyle
  
  @js.native
  sealed trait LARGE
    extends googlemapsLib.googleNs.mapsNs.ZoomControlStyle
  
  @js.native
  sealed trait SMALL
    extends googlemapsLib.googleNs.mapsNs.ZoomControlStyle
  
  val DEFAULT: DEFAULT with java.lang.String = js.native
  val LARGE: LARGE with java.lang.String = js.native
  val SMALL: SMALL with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[googlemapsLib.googleNs.mapsNs.ZoomControlStyle with java.lang.String] = js.native
}


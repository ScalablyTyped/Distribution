package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScaleControlStyle extends js.Object

@JSGlobal("google.maps.ScaleControlStyle")
@js.native
object ScaleControlStyle extends js.Object {
  @js.native
  sealed trait DEFAULT
    extends googlemapsLib.googleNs.mapsNs.ScaleControlStyle
  
  val DEFAULT: DEFAULT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[googlemapsLib.googleNs.mapsNs.ScaleControlStyle with java.lang.String] = js.native
}


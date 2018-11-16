package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Animation extends js.Object

@JSGlobal("google.maps.Animation")
@js.native
object Animation extends js.Object {
  @js.native
  sealed trait BOUNCE
    extends googlemapsLib.googleNs.mapsNs.Animation
  
  @js.native
  sealed trait DROP
    extends googlemapsLib.googleNs.mapsNs.Animation
  
  val BOUNCE: BOUNCE with java.lang.String = js.native
  val DROP: DROP with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[googlemapsLib.googleNs.mapsNs.Animation with java.lang.String] = js.native
}


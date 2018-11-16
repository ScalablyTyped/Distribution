package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SymbolPath extends js.Object

@JSGlobal("google.maps.SymbolPath")
@js.native
object SymbolPath extends js.Object {
  /** A backward-pointing closed arrow. */
  @js.native
  sealed trait BACKWARD_CLOSED_ARROW
    extends googlemapsLib.googleNs.mapsNs.SymbolPath
  
  /** A backward-pointing open arrow. */
  @js.native
  sealed trait BACKWARD_OPEN_ARROW
    extends googlemapsLib.googleNs.mapsNs.SymbolPath
  
  /** A circle. */
  @js.native
  sealed trait CIRCLE
    extends googlemapsLib.googleNs.mapsNs.SymbolPath
  
  /** A forward-pointing closed arrow. */
  @js.native
  sealed trait FORWARD_CLOSED_ARROW
    extends googlemapsLib.googleNs.mapsNs.SymbolPath
  
  /** A forward-pointing open arrow. */
  @js.native
  sealed trait FORWARD_OPEN_ARROW
    extends googlemapsLib.googleNs.mapsNs.SymbolPath
  
  val BACKWARD_CLOSED_ARROW: BACKWARD_CLOSED_ARROW with java.lang.String = js.native
  val BACKWARD_OPEN_ARROW: BACKWARD_OPEN_ARROW with java.lang.String = js.native
  val CIRCLE: CIRCLE with java.lang.String = js.native
  val FORWARD_CLOSED_ARROW: FORWARD_CLOSED_ARROW with java.lang.String = js.native
  val FORWARD_OPEN_ARROW: FORWARD_OPEN_ARROW with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[googlemapsLib.googleNs.mapsNs.SymbolPath with java.lang.String] = js.native
}


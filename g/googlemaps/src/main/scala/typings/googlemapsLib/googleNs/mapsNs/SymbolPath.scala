package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SymbolPath extends js.Object

/**
  * Built-in symbol paths.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#SymbolPath Maps JavaScript API}
  */
@JSGlobal("google.maps.SymbolPath")
@js.native
object SymbolPath extends js.Object {
  /**
    * A backward-pointing closed arrow.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#SymbolPath.BACKWARD_CLOSED_ARROW Maps JavaScript API}
    */
  @js.native
  sealed trait BACKWARD_CLOSED_ARROW
    extends googlemapsLib.googleNs.mapsNs.SymbolPath
  
  /**
    * A backward-pointing open arrow.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#SymbolPath.BACKWARD_OPEN_ARROW Maps JavaScript API}
    */
  @js.native
  sealed trait BACKWARD_OPEN_ARROW
    extends googlemapsLib.googleNs.mapsNs.SymbolPath
  
  /**
    * A circle.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#SymbolPath.CIRCLE Maps JavaScript API}
    */
  @js.native
  sealed trait CIRCLE
    extends googlemapsLib.googleNs.mapsNs.SymbolPath
  
  /**
    * A forward-pointing closed arrow.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#SymbolPath.FORWARD_CLOSED_ARROW Maps JavaScript API}
    */
  @js.native
  sealed trait FORWARD_CLOSED_ARROW
    extends googlemapsLib.googleNs.mapsNs.SymbolPath
  
  /**
    * A forward-pointing open arrow.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#SymbolPath.FORWARD_OPEN_ARROW Maps JavaScript API}
    */
  @js.native
  sealed trait FORWARD_OPEN_ARROW
    extends googlemapsLib.googleNs.mapsNs.SymbolPath
  
  /* 3 */ val BACKWARD_CLOSED_ARROW: BACKWARD_CLOSED_ARROW with scala.Double = js.native
  /* 4 */ val BACKWARD_OPEN_ARROW: BACKWARD_OPEN_ARROW with scala.Double = js.native
  /* 0 */ val CIRCLE: CIRCLE with scala.Double = js.native
  /* 1 */ val FORWARD_CLOSED_ARROW: FORWARD_CLOSED_ARROW with scala.Double = js.native
  /* 2 */ val FORWARD_OPEN_ARROW: FORWARD_OPEN_ARROW with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googlemapsLib.googleNs.mapsNs.SymbolPath with scala.Double] = js.native
}


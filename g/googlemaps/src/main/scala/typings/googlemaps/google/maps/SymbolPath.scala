package typings.googlemaps.google.maps

import org.scalablytyped.runtime.TopLevel
import typings.googlemaps.google.maps.SymbolPath.BACKWARD_CLOSED_ARROW
import typings.googlemaps.google.maps.SymbolPath.BACKWARD_OPEN_ARROW
import typings.googlemaps.google.maps.SymbolPath.CIRCLE
import typings.googlemaps.google.maps.SymbolPath.FORWARD_CLOSED_ARROW
import typings.googlemaps.google.maps.SymbolPath.FORWARD_OPEN_ARROW
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
  sealed trait BACKWARD_CLOSED_ARROW extends SymbolPath
  
  /**
    * A backward-pointing open arrow.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#SymbolPath.BACKWARD_OPEN_ARROW Maps JavaScript API}
    */
  @js.native
  sealed trait BACKWARD_OPEN_ARROW extends SymbolPath
  
  /**
    * A circle.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#SymbolPath.CIRCLE Maps JavaScript API}
    */
  @js.native
  sealed trait CIRCLE extends SymbolPath
  
  /**
    * A forward-pointing closed arrow.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#SymbolPath.FORWARD_CLOSED_ARROW Maps JavaScript API}
    */
  @js.native
  sealed trait FORWARD_CLOSED_ARROW extends SymbolPath
  
  /**
    * A forward-pointing open arrow.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#SymbolPath.FORWARD_OPEN_ARROW Maps JavaScript API}
    */
  @js.native
  sealed trait FORWARD_OPEN_ARROW extends SymbolPath
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SymbolPath with Double] = js.native
  /* 3 */ @js.native
  object BACKWARD_CLOSED_ARROW extends TopLevel[BACKWARD_CLOSED_ARROW with Double]
  
  /* 4 */ @js.native
  object BACKWARD_OPEN_ARROW extends TopLevel[BACKWARD_OPEN_ARROW with Double]
  
  /* 0 */ @js.native
  object CIRCLE extends TopLevel[CIRCLE with Double]
  
  /* 1 */ @js.native
  object FORWARD_CLOSED_ARROW extends TopLevel[FORWARD_CLOSED_ARROW with Double]
  
  /* 2 */ @js.native
  object FORWARD_OPEN_ARROW extends TopLevel[FORWARD_OPEN_ARROW with Double]
  
}


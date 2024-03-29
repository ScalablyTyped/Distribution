package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SymbolPath extends StObject
/**
  * Built-in symbol paths.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#SymbolPath Maps JavaScript API}
  */
@JSGlobal("google.maps.SymbolPath")
@js.native
object SymbolPath extends StObject {
  
  /**
    * A backward-pointing closed arrow.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#SymbolPath.BACKWARD_CLOSED_ARROW Maps JavaScript API}
    */
  @js.native
  sealed trait BACKWARD_CLOSED_ARROW
    extends StObject
       with SymbolPath
  
  /**
    * A backward-pointing open arrow.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#SymbolPath.BACKWARD_OPEN_ARROW Maps JavaScript API}
    */
  @js.native
  sealed trait BACKWARD_OPEN_ARROW
    extends StObject
       with SymbolPath
  
  /**
    * A circle.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#SymbolPath.CIRCLE Maps JavaScript API}
    */
  @js.native
  sealed trait CIRCLE
    extends StObject
       with SymbolPath
  
  /**
    * A forward-pointing closed arrow.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#SymbolPath.FORWARD_CLOSED_ARROW Maps JavaScript API}
    */
  @js.native
  sealed trait FORWARD_CLOSED_ARROW
    extends StObject
       with SymbolPath
  
  /**
    * A forward-pointing open arrow.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#SymbolPath.FORWARD_OPEN_ARROW Maps JavaScript API}
    */
  @js.native
  sealed trait FORWARD_OPEN_ARROW
    extends StObject
       with SymbolPath
}

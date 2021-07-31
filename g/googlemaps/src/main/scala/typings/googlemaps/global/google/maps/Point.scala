package typings.googlemaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Point Maps JavaScript API}
  */
@JSGlobal("google.maps.Point")
@js.native
class Point protected ()
  extends StObject
     with typings.googlemaps.google.maps.Point {
  /**
    * A point on a two-dimensional plane.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Point.constructor Maps JavaScript API}
    */
  def this(x: Double, y: Double) = this()
  
  /**
    * Compares two Points
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Point.equals Maps JavaScript API}
    */
  /* CompleteClass */
  override def equals(other: typings.googlemaps.google.maps.Point): Boolean = js.native
  
  /**
    * The X coordinate
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Point.x Maps JavaScript API}
    */
  /* CompleteClass */
  var x: Double = js.native
  
  /**
    * The Y coordinate
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Point.y Maps JavaScript API}
    */
  /* CompleteClass */
  var y: Double = js.native
}

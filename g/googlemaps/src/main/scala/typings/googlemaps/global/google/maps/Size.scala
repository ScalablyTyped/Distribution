package typings.googlemaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Size Maps JavaScript API}
  */
@JSGlobal("google.maps.Size")
@js.native
class Size protected ()
  extends StObject
     with typings.googlemaps.google.maps.Size {
  /**
    * Two-dimensional size.
    * @param width the distance on the x-axis
    * @param height the distance on the y-axis
    * @param widthUnit
    * @param heightUnit
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Size.constructor Maps JavaScript API}
    */
  def this(width: Double, height: Double) = this()
  def this(width: Double, height: Double, widthUnit: String) = this()
  def this(width: Double, height: Double, widthUnit: String, heightUnit: String) = this()
  def this(width: Double, height: Double, widthUnit: Unit, heightUnit: String) = this()
  
  /**
    * Compares two Sizes.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Size.equals Maps JavaScript API}
    */
  /* CompleteClass */
  override def equals(other: typings.googlemaps.google.maps.Size): Boolean = js.native
  
  /**
    * The height along the y-axis, in pixels.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Size.height Maps JavaScript API}
    */
  /* CompleteClass */
  var height: Double = js.native
  
  /**
    * The width along the x-axis, in pixels.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Size.width Maps JavaScript API}
    */
  /* CompleteClass */
  var width: Double = js.native
}

package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Point Maps JavaScript API}
  */
@js.native
trait Point extends StObject {
  
  /**
    * Compares two Points
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Point.equals Maps JavaScript API}
    */
  def equals(other: Point): Boolean = js.native
  
  /**
    * The X coordinate
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Point.x Maps JavaScript API}
    */
  var x: Double = js.native
  
  /**
    * The Y coordinate
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Point.y Maps JavaScript API}
    */
  var y: Double = js.native
}
object Point {
  
  @scala.inline
  def apply(equals_ : Point => Boolean, x: Double, y: Double): Point = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[Point]
  }
  
  @scala.inline
  implicit class PointMutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEquals_(value: Point => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}

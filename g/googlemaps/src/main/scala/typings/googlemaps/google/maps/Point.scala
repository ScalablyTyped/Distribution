package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/coordinates#Point Maps JavaScript API}
  */
@js.native
trait Point extends js.Object {
  
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
  def apply(equals: Point => Boolean, x: Double, y: Double): Point = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
  
  @scala.inline
  implicit class PointOps[Self <: Point] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEquals(value: Point => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}

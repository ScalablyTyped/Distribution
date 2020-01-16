package typings.lazyDashBrush.lazyDashBrushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lazy-brush", "LazyPoint")
@js.native
class LazyPoint () extends Point {
  /**
    * Check if this point is the same as another point
    */
  def equalsTo(point: Coordinates): Boolean = js.native
  /**
    * Calculate the angle to another point
    */
  def getAngleTo(point: Coordinates): Double = js.native
  /**
    * Get the difference for x and y axis to another point
    */
  def getDifferenceTo(point: Coordinates): Point = js.native
  /**
    * Calculate distance to another point
    */
  def getDistanceTo(point: Coordinates): Double = js.native
  /**
    * Move the point to another position using an angle and distance
    */
  def moveByAngle(angle: Double, distance: Double): Unit = js.native
  /**
    * Return a simple object with x and y properties
    */
  def toObject(): Coordinates = js.native
  /**
    * Update the x and y values
    */
  def update(coordinates: Coordinates): Unit = js.native
}


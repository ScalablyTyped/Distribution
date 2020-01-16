package typings.lazyDashBrush.lazyDashBrushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lazy-brush", "LazyBrush")
@js.native
class LazyBrush () extends js.Object {
  def this(options: Options) = this()
  var _hasMoved: Boolean = js.native
  var _isEnabled: Boolean = js.native
  var angle: Double = js.native
  var brush: LazyPoint = js.native
  var distance: Double = js.native
  var pointer: LazyPoint = js.native
  var radius: Double = js.native
  /**
    * Return if the previous update has moved the brush
    */
  def brushHasMoved(): Boolean = js.native
  /**
    * Disable lazy brush calculations
    */
  def disable(): Unit = js.native
  /**
    * Enable lazy brush calculations
    */
  def enable(): Unit = js.native
  /**
    * Return the angle between pointer and brush
    */
  def getAngle(): Double = js.native
  /**
    * Return the brush as a LazyPoint
    */
  def getBrush(): LazyPoint = js.native
  /**
    * Return the brush coordinates as a simple object
    */
  def getBrushCoordinates(): Coordinates = js.native
  /**
    * Return the distance between pointer and brush
    */
  def getDistance(): Double = js.native
  /**
    * Return the pointer as a LazyPoint
    */
  def getPointer(): LazyPoint = js.native
  /**
    * Return the pointer coordinates as a simple object
    */
  def getPointerCoordinates(): Coordinates = js.native
  /**
    * Return the current radius
    */
  def getRadius(): Double = js.native
  def isEnabled(): Boolean = js.native
  /**
    * Update the radius
    */
  def setRadius(radius: Double): Unit = js.native
  /**
    * Updates the pointer coordinates and calculates the new brush point
    */
  def update(coordinates: Coordinates): Boolean = js.native
  def update(coordinates: Coordinates, options: UpdateOptions): Boolean = js.native
}


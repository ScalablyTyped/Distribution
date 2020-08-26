package typings.heremaps.H.math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class defines a rectangle in 2-dimensional geometric space. It is used to represent the area in projected space.
  */
@js.native
trait Rect extends js.Object {
  /**
    * Method checks if provided coordinates lie within rectangle.
    * @param x {number} - x-coordinate to check
    * @param y {number} - y-coordinate to check
    * @returns {boolean} - returns true if coordinates lie within rectangle, if parameters are isNaN returns false
    */
  def containsXY(x: Double, y: Double): Boolean = js.native
  /**
    * To get the rectangle's bottom-right vertex
    * @returns {H.math.Point}
    */
  def getBottomRight(): Point = js.native
  /**
    * To get the rectangle's top-left vertex
    * @returns {H.math.Point}
    */
  def getTopLeft(): Point = js.native
  /**
    * To set all values of the rectangle's edges
    * @param left {number} - The rectangle's left edge x value
    * @param top {number} - The rectangle's top edge y value
    * @param right {number} - The rectangle's right edge x value
    * @param bottom {number} - The rectangle's bottom edge y value
    */
  def set(left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
}

object Rect {
  @scala.inline
  def apply(
    containsXY: (Double, Double) => Boolean,
    getBottomRight: () => Point,
    getTopLeft: () => Point,
    set: (Double, Double, Double, Double) => Unit
  ): Rect = {
    val __obj = js.Dynamic.literal(containsXY = js.Any.fromFunction2(containsXY), getBottomRight = js.Any.fromFunction0(getBottomRight), getTopLeft = js.Any.fromFunction0(getTopLeft), set = js.Any.fromFunction4(set))
    __obj.asInstanceOf[Rect]
  }
  @scala.inline
  implicit class RectOps[Self <: Rect] (val x: Self) extends AnyVal {
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
    def setContainsXY(value: (Double, Double) => Boolean): Self = this.set("containsXY", js.Any.fromFunction2(value))
    @scala.inline
    def setGetBottomRight(value: () => Point): Self = this.set("getBottomRight", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTopLeft(value: () => Point): Self = this.set("getTopLeft", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: (Double, Double, Double, Double) => Unit): Self = this.set("set", js.Any.fromFunction4(value))
  }
  
}


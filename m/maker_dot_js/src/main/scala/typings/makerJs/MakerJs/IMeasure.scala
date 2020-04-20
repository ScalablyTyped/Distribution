package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A measurement of extents, the high and low points.
  */
trait IMeasure extends js.Object {
  /**
    * The point containing both the highest x and y values of the rectangle containing the item being measured.
    */
  var high: IPoint
  /**
    * The point containing both the lowest x and y values of the rectangle containing the item being measured.
    */
  var low: IPoint
}

object IMeasure {
  @scala.inline
  def apply(high: IPoint, low: IPoint): IMeasure = {
    val __obj = js.Dynamic.literal(high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMeasure]
  }
}


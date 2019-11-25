package typings.makerDotJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A measurement of extents, with a center point.
  */
trait IMeasureWithCenter extends IMeasure {
  /**
    * The center point of the rectangle containing the item being measured.
    */
  var center: IPoint
}

object IMeasureWithCenter {
  @scala.inline
  def apply(center: IPoint, high: IPoint, low: IPoint): IMeasureWithCenter = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMeasureWithCenter]
  }
}


package typings.makerDotJs.MakerJsNs

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
    val __obj = js.Dynamic.literal(center = center, high = high, low = low)
  
    __obj.asInstanceOf[IMeasureWithCenter]
  }
}


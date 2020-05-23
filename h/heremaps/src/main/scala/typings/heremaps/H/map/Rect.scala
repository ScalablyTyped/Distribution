package typings.heremaps.H.map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Polygon with a rectangular shape.
  */
@js.native
trait Rect extends Polygon {
  /**
    * To set the bounds of this rectangle.
    * @param bounds {H.geo.Rect}
    */
  def setBoundingBox(bounds: typings.heremaps.H.geo.Rect): Unit = js.native
}


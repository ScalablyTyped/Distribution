package typings.heremaps.H.map

import typings.heremaps.H.map.Spatial.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Polygon with a rectangular shape.
  */
@JSGlobal("H.map.Rect")
@js.native
class Rect protected () extends Polygon {
  /**
    * Constructor
    * @param bounds {H.geo.Rect} - The geographical bounding box for this rectangle
    * @param opt_options {H.map.Spatial.Options=}
    */
  def this(bounds: typings.heremaps.H.geo.Rect) = this()
  def this(bounds: typings.heremaps.H.geo.Rect, opt_options: Options) = this()
  /**
    * To set the bounds of this rectangle.
    * @param bounds {H.geo.Rect}
    */
  def setBounds(bounds: typings.heremaps.H.geo.Rect): Unit = js.native
}


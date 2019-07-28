package typings.heremaps.HNs.mapNs

import typings.heremaps.HNs.mapNs.SpatialNs.Options
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
  def this(bounds: typings.heremaps.HNs.geoNs.Rect) = this()
  def this(bounds: typings.heremaps.HNs.geoNs.Rect, opt_options: Options) = this()
  /**
    * To set the bounds of this rectangle.
    * @param bounds {H.geo.Rect}
    */
  def setBounds(bounds: typings.heremaps.HNs.geoNs.Rect): Unit = js.native
}


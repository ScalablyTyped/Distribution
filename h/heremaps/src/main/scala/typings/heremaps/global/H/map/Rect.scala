package typings.heremaps.global.H.map

import typings.heremaps.H.map.Spatial.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Polygon with a rectangular shape.
  */
@JSGlobal("H.map.Rect")
@js.native
class Rect protected ()
  extends typings.heremaps.H.map.Rect {
  /**
    * Constructor
    * @param boundingBox {H.geo.Rect} - The geographical bounding box for this rectangle
    * @param opt_options {H.map.Spatial.Options=}
    */
  def this(boundingBox: typings.heremaps.H.geo.Rect) = this()
  def this(boundingBox: typings.heremaps.H.geo.Rect, opt_options: Options) = this()
}


package typings
package heremapsLib.HNs.mapNs

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
  def this(bounds: heremapsLib.HNs.geoNs.Rect) = this()
  /**
             * Constructor
             * @param bounds {H.geo.Rect} - The geographical bounding box for this rectangle
             * @param opt_options {H.map.Spatial.Options=}
             */
  def this(bounds: heremapsLib.HNs.geoNs.Rect, opt_options: heremapsLib.HNs.mapNs.SpatialNs.Options) = this()
  /**
             * To set the bounds of this rectangle.
             * @param bounds {H.geo.Rect}
             */
  def setBounds(bounds: heremapsLib.HNs.geoNs.Rect): scala.Unit = js.native
}


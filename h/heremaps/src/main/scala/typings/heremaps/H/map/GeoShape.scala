package typings.heremaps.H.map

import typings.heremaps.H.map.Spatial.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents a spatial shape in geographic space. It is defined by a path containing the vertices of the shape (lat, lng, alt values).
  */
@JSGlobal("H.map.GeoShape")
@js.native
class GeoShape protected () extends Spatial {
  /**
    * Constructor
    * @param isClosed {boolean} - Indicates whether this geographical shape is closed (a polygon)
    * @param options {H.map.Spatial.Options} - The options to apply
    */
  def this(isClosed: Boolean, options: Options) = this()
  /**
    * This method returns the bounding rectangle for this object. The rectangle is the smallest rectangle which encloses all points of the spatial object.
    * @returns {H.geo.Rect}
    */
  def getBoundingBox(): typings.heremaps.H.geo.Rect = js.native
}


package typings
package heremapsLib.HNs.mapNs

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
    * @param strip {H.geo.Strip} - The strip describing the shape of the spatial object
    * @param options {H.map.Spatial.Options} - The options to apply
    */
  def this(isClosed: scala.Boolean, strip: heremapsLib.HNs.geoNs.Strip, options: heremapsLib.HNs.mapNs.SpatialNs.Options) = this()
  /**
    * This method returns the bounding rectangle for this object. The rectangle is the smallest rectangle which encloses all points of the spatial object.
    * @returns {H.geo.Rect}
    */
  def getBounds(): heremapsLib.HNs.geoNs.Rect = js.native
  /**
    * This method returns the strip which represents the shape of the spatial object.
    * @returns {H.geo.Strip} - the strip
    */
  def getStrip(): heremapsLib.HNs.geoNs.Strip = js.native
  /**
    * This method sets the geo-information for the spatial object
    * @param strip {?H.geo.Strip} - The strip which represents the shape of the spatial object.
    * @returns {H.map.GeoShape} - the Spatial instance itself
    */
  def setStrip(strip: heremapsLib.HNs.geoNs.Strip): GeoShape = js.native
}


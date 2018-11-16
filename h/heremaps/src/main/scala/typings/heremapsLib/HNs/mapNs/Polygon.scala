package typings
package heremapsLib.HNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * This class represents a polygon in geo-space. It is defined by a strip containing the vertices of a geo shape object (lat, lng, alt values) and a pen to use when rendering the polyline.
         * Polygon represents a closed plane defined by the list of verticies, projected on the map display. List of vericies which define the polygon are is a list of geo coordinates encapsulated
         * by the strip object H.geo.Strip
         */
@JSGlobal("H.map.Polygon")
@js.native
class Polygon protected () extends GeoShape {
  /**
             * Constructor
             * @param strip {H.geo.Strip} - the strip describing this polygon's vertices
             * @param opt_options {H.map.Spatial.Options=} - optional initialization parameters
             */
  def this(strip: heremapsLib.HNs.geoNs.Strip) = this()
  /**
             * Constructor
             * @param strip {H.geo.Strip} - the strip describing this polygon's vertices
             * @param opt_options {H.map.Spatial.Options=} - optional initialization parameters
             */
  def this(strip: heremapsLib.HNs.geoNs.Strip, opt_options: heremapsLib.HNs.mapNs.SpatialNs.Options) = this()
  /**
             * See H.map.Polygon#setNorthPoleCovering
             * @returns {boolean}
             */
  def getNorthPoleCovering(): scala.Boolean = js.native
  /**
             * To set the indicator whether this polygon covers the north pole. It's needed for Polygons whose strip is defined as lines arround the world on longitude axis (for example a circle whose
             * center is one of the poles). In this case a additional information is needed to know if the southern or northern part of the world should be covered by the poygon.
             * @param flag {boolean} - A value of true means it covers the north pole, false means south pole
             * @returns {H.map.Polygon} - the Polygon instance itself
             */
  def setNorthPoleCovering(flag: scala.Boolean): Polygon = js.native
}


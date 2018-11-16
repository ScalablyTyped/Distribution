package typings
package mapsjsLib.mapsjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapsjs", "geometry")
@js.native
object geometryNs extends js.Object {
  /**
  	  * A polyline object which is a closed path geometry with one or more paths.
        * @class polygon
        */
  @js.native
  class polygon protected ()
    extends mapsjsLib.mapsjsMod.geometry {
    def this(geom: mapsjsLib.mapsjsMod.geometry) = this()
    /**
    		 * Calculates area of a ring in a polygon by index according 
    		 * to the actual area. If no index is provided, uses the last ring
    		 * in the polygon's ring collection.
    		 * @param {number} [idx] Index of the ring for which to compute the area.
    		 * @returns {number} Area in square meters of the ring.
    		 */
    def getActualArea(): scala.Double = js.native
    /**
    		 * Calculates area of a ring in a polygon by index according 
    		 * to the actual area. If no index is provided, uses the last ring
    		 * in the polygon's ring collection.
    		 * @param {number} [idx] Index of the ring for which to compute the area.
    		 * @returns {number} Area in square meters of the ring.
    		 */
    def getActualArea(idx: scala.Double): scala.Double = js.native
    /**
    		 * Calculates perimeter of a ring in a polygon by index according 
    		 * to actual distance. If no index is provided, uses the last ring
    		 * in the polygon's ring collection.
    		 * @param {number} [idx] Index of the ring for which to compute the perimeter.
    		 * @returns {number} Length in meters of the perimeter of the ring.
    		 */
    def getActualPerimeter(): scala.Double = js.native
    /**
    		 * Calculates perimeter of a ring in a polygon by index according 
    		 * to actual distance. If no index is provided, uses the last ring
    		 * in the polygon's ring collection.
    		 * @param {number} [idx] Index of the ring for which to compute the perimeter.
    		 * @returns {number} Length in meters of the perimeter of the ring.
    		 */
    def getActualPerimeter(idx: scala.Double): scala.Double = js.native
    /**
    		 * Gets the underlying geometry of the polygon.
    		 * @returns {geometry} The polygon's underlying geometry object.
    		 */
    def getGeometry(): mapsjsLib.mapsjsMod.geometry = js.native
    /**
    		 * Calculates area of a ring in a polygon by index according 
    		 * to projected map cooordinates. If no index is provided, uses
    		 * the last ring in the polygon's ring collection.
    		 * @param {number} [idx] Index of the ring for which to compute the area.
    		 * @returns {number} Area in square projected units of the ring.
    		 */
    def getProjectedArea(idx: scala.Double): scala.Double = js.native
    /**
    		 * Calculates perimeter of a ring in a polygon by index according 
    		 * to projected map cooordinates. If no index is provided, uses
    		 * the last ring in the polygon's ring collection.
    		 * @param {number} [idx] Index of the ring for which to compute the perimeter.
    		 * @returns {number} Length in projected units of the distance of the ring.
    		 */
    def getProjectedPerimeter(idx: scala.Double): scala.Double = js.native
    /**
    		 * Gets a ring from this polygon's set collection by index, or, 
    		 * if no index is provided, gets the last ring.
    		 * @param {number} [idx] Index of the ring to return.
    		 * @returns {number[]} A ring as an array of points in the form [xn,yn].
    		 */
    def getRing(idx: scala.Double): js.Array[scala.Double] = js.native
    /**
    		 * Gets number of rings in this polygon.
    		 * @returns {number} Number of rings.
    		 */
    def getRingCount(): scala.Double = js.native
    /**
    		 * Determines whether this polygon intersects a given geometry.
    		 * @param {geometry} geom Geometry to test against.
    		 * @returns {boolean} Result of the intersection test.
    		 */
    def intersects(geom: mapsjsLib.mapsjsMod.geometry): scala.Boolean = js.native
    /**
    		 * Determines whether this polyline overlaps a given geometry.
    		 * @param {geometry} geom Geometry to test against.
    		 * @returns {boolean} Result of the intersection test.
    		 */
    def overlaps(poly: polygon): scala.Boolean = js.native
    /**
    		 * Gets the last ring in the polygon's ring collection and removes it 
    		 * from the collection.
    		 * @returns {number} Ring removed as an array of points in the form [xn,yn].
    		 */
    def popRing(): js.Array[scala.Double] = js.native
    /**
    		 * Adds a new ring to this polygon's ring collection.
    		 * @param {number[]} s Ring to add as an array of points in the form [xn,yn].
    		 */
    def pushRing(s: js.Array[scala.Double]): scala.Unit = js.native
    /**
    		 * Convert this polygon into an array of OGC compliant polygons where
    		 * the first set is a ring and all subsequent contained sets are holes.
    		 * @returns {polygon[]} An array of OGC polygons.
    		 */
    def toMultiPolygon(): js.Array[polygon] = js.native
  }
  
  /**
  	 * A polyline object which is an open path geometry with one or more paths.
       * @class polyline
       */
  @js.native
  class polyline protected ()
    extends mapsjsLib.mapsjsMod.geometry {
    def this(geom: mapsjsLib.mapsjsMod.geometry) = this()
    /**
    		 * Calculates distance of a line in a polyline by index according 
    		 * to actual distance. If no index is provided, uses the last line 
    		 * in the polyline's set collection.
    		 * @param {number} [idx] Index of the line for which to compute the distance.
    		 * @returns {number} Distance in meters of the line.
    		 */
    def getActualDistance(): scala.Double = js.native
    /**
    		 * Calculates distance of a line in a polyline by index according 
    		 * to actual distance. If no index is provided, uses the last line 
    		 * in the polyline's set collection.
    		 * @param {number} [idx] Index of the line for which to compute the distance.
    		 * @returns {number} Distance in meters of the line.
    		 */
    def getActualDistance(idx: scala.Double): scala.Double = js.native
    /**
    		 * Gets the underlying geometry of the polyline.
    		 * @returns {geometry} The polyline's underlying geometry object.
    		 */
    def getGeometry(): mapsjsLib.mapsjsMod.geometry = js.native
    /**
    		 * Gets a line from this polyline's liune collection by index, or, 
    		 * if no index is provided, gets the last line.
    		 * @param {number} [idx] Index of the line to return.
    		 * @returns {number[]} A line as an array of points in the form [xn,yn].
    		 */
    def getLine(idx: scala.Double): js.Array[scala.Double] = js.native
    /**
    		 * Gets number of lines in this polyline.
    		 * @returns {number} Number of lines.
    		 */
    def getLineCount(): scala.Double = js.native
    /**
    		 * Calculates distance of a line in a polyline by index according 
    		 * to projected map cooordinates. If no index is provided, uses
    		 * the last line in the polyline's set collection.
    		 * @param {number} [idx] Index of the line for which to compute the distance.
    		 * @returns {number} Length in projected units of the distance of the line.
    		 */
    def getProjectedDistance(idx: scala.Double): scala.Double = js.native
    /**
    		 * Determines whether this polyline intersects a given geometry.
    		 * @param {geometry} geom Geometry to test against.
    		 * @returns {boolean} Result of the intersection test.
    		 */
    def intersects(geom: mapsjsLib.mapsjsMod.geometry): scala.Boolean = js.native
    /**
    		 * Gets the last line in the polyline's set collection and removes it 
    		 * from the collection.
    		 * @returns {number} Line removed as an array of points in the form [xn,yn].
    		 */
    def popLine(): js.Array[scala.Double] = js.native
    /**
    		 * Adds a new line to this polyline's line collection.
    		 * @param {number[]} s Line to add as an array of points in the form [xn,yn].
    		 */
    def pushLine(s: js.Array[scala.Double]): scala.Unit = js.native
  }
  
}


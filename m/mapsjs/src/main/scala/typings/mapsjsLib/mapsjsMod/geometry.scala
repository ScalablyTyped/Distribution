package typings
package mapsjsLib.mapsjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapsjs", "geometry")
@js.native
class geometry () extends js.Object {
  def this(isPath: scala.Boolean) = this()
  def this(isPath: scala.Boolean, isClosed: scala.Boolean) = this()
  /**
  	 * Adds point to the last set in geometry's set collection. If the
  	 * geometry is empty, a new set is added to the geometry first.
  	 * @param {point} pt The point to add.
  	 * @returns {object} Object of the form {setIdx, idx} where setIdx is
  	 * the 0-based index of the set the point was added to and idx is the
  	 * 0-based index of the point in its set.
  	 */
  def addPointToLastSet(pt: point): mapsjsLib.Anon_SetIdx = js.native
  /**
  	 * Tests whether this geometry contains a given point/
  	 * @param {point} pt The reference point.
  	 * @returns {boolean} Result of the containment test.
  	 */
  def contains(pt: point): scala.Boolean = js.native
  /**
  	 * Creates a new polygon or polyline form the geometry according to
  	 * whether the geometry is closed.
  	 * @returns {any} A new polyline or polygon geometry.
  	 */
  def factoryPoly(): js.Any = js.native
  /**
  	 * Finds point along boundary of geometry nearest to the given point
  	 * @param {point} pt Reference point.
  	 * @param {boolean} [close] Flag to indicate whether this geometry
  	 * should be treated as a closed geometry.
  	 * @returns {object} An object of the form {setIdx, ptIdx, pt, distance}
  	 * where setIdx is the index of the set the point is in, ptIdx is the
  	 * index of the point in the set, pt is the point object, and distance
  	 * is the distance of the point to the reference point in map units.
  	 */
  def findNearestSegment(pt: point): mapsjsLib.Anon_PtIdx = js.native
  def findNearestSegment(pt: point, close: scala.Boolean): mapsjsLib.Anon_PtIdx = js.native
  /**
  	 * Finds the point in this geometry nearest to the given point.
  	 * @param {point} pt Reference point.
  	 * @returns {object} An object of the form {setIdx, ptIdx, pt, distance}
  	 * where setIdx is the index of the set the point is in, ptIdx is the
  	 * index of the point in the set, pt is the point object, and distance
  	 * is the distance of the point to the reference point in map units.
  	 */
  def findNearestVertex(pt: point): mapsjsLib.Anon_PtIdx = js.native
  /**
  	 * Iterates every vertex in the geometry and passes to the supplied 
  	 * callback. Return true from in the callback will break the iteration.
  	 * @param {function} action Callback with the signature action(setIdx, idx, x, y, set).
  	 */
  def foreachVertex(
    action: js.Function5[
      /* setIdx */ scala.Double, 
      /* idx */ scala.Double, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* s */ js.Array[scala.Double], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
  	 * Returns the geometry's bounding box as an envelope.
  	 * @returns {envelope} The bounding box of the geometry as an envelope.
  	 */
  def getBounds(): envelope = js.native
  /**
  	 * Checks whether or not this geometry is closed.
  	 * @returns {boolean} Result of the closed check.
  	 */
  def getIsClosed(): scala.Boolean = js.native
  /**
  	 * Checks whether or not this geometry is closed.
  	 * @returns {boolean} Result of the path check.
  	 */
  def getIsPath(): scala.Boolean = js.native
  /** 
  	 * Finds coordinates in map units of the midpoint of this geometry. If
  	 * this geometry is an open path, the midpoint is the midpoint of the
  	 * path. If this geometry is a closed path, the midpoint is the centroid
  	 * of the polygon. If a set index is not provided, finds the labeling
  	 * point for the last set in this geometry's set collection.
  	 * @param {number} [idx] Index of set for which to find the labeling point.
  	 * @returns {point} Midpoint of this geometry.
  	 */
  def getLabelingPoint(): point = js.native
  def getLabelingPoint(idx: scala.Double): point = js.native
  /**
  	 * Gets a set from this geometry's set collection by index, or, if no 
  	 * index is provided, gets the last set. Note: for polygons, first set
  	 * is primary ring and subsequent ones are holes.
  	 * @param {number} [idx] Index of the set to return.
  	 * @returns {number[]} A set as an array of points in the form [xn,yn].
  	 */
  def getSet(idx: scala.Double): js.Array[scala.Double] = js.native
  /**
  	 * Gets the number of sets in this geometry.
  	 * @returns {number} Number of sets.
  	 */
  def getSetCount(): scala.Double = js.native
  /**
  	 * Tests the validity of this geometry. An open path geometry is valid
  	 * if it has at least one set with at least two points. A closed 
  	 * geometry is valid if it has at least one set with at least three
  	 * points. A point (non-path) geometry is always valid.
  	 * @returns {geometry} valid geometry is true, otherwise false.
  	 */
  def isValid(): scala.Boolean = js.native
  /**
  	 * Gets the last set in the geometry's set collection and removes it 
  	 * from the collection.
  	 * @returns {number} Set removed as an array of points in the form [xn,yn].
  	 */
  def popSet(): js.Array[scala.Double] = js.native
  /**
  	 * Adds a new set to this geometry's collection of sets.
  	 * @param {number[]} s Set to add as an array of points in the form [xn,yn].
  	 */
  def pushSet(s: js.Array[scala.Double]): scala.Unit = js.native
  /**
  	 * Creates SVG path data from this geometry if it is a path.
  	 * @returns {string} String of the SVG path or null the geometry is not a path.
  	 */
  def toSvgPathData(): java.lang.String = js.native
  def toWkt(): java.lang.String = js.native
}


package typings.mapsjs.mod

import typings.mapsjs.anon.Distance
import typings.mapsjs.anon.Idx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapsjs", "geometry")
@js.native
class geometry () extends StObject {
  def this(isPath: Boolean) = this()
  def this(isPath: js.UndefOr[scala.Nothing], isClosed: Boolean) = this()
  def this(isPath: Boolean, isClosed: Boolean) = this()
  
  /**
    * Adds point to the last set in geometry's set collection. If the
    * geometry is empty, a new set is added to the geometry first.
    * @param {point} pt The point to add.
    * @returns {object} Object of the form {setIdx, idx} where setIdx is
    * the 0-based index of the set the point was added to and idx is the
    * 0-based index of the point in its set.
    */
  def addPointToLastSet(pt: point): Idx = js.native
  
  /**
    * Tests whether this geometry contains a given point/
    * @param {point} pt The reference point.
    * @returns {boolean} Result of the containment test.
    */
  def contains(pt: point): Boolean = js.native
  
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
  def findNearestSegment(pt: point): Distance = js.native
  def findNearestSegment(pt: point, close: Boolean): Distance = js.native
  
  /**
    * Finds the point in this geometry nearest to the given point.
    * @param {point} pt Reference point.
    * @returns {object} An object of the form {setIdx, ptIdx, pt, distance}
    * where setIdx is the index of the set the point is in, ptIdx is the
    * index of the point in the set, pt is the point object, and distance
    * is the distance of the point to the reference point in map units.
    */
  def findNearestVertex(pt: point): Distance = js.native
  
  /**
    * Iterates every vertex in the geometry and passes to the supplied 
    * callback. Return true from in the callback will break the iteration.
    * @param {function} action Callback with the signature action(setIdx, idx, x, y, set).
    */
  def foreachVertex(
    action: js.Function5[
      /* setIdx */ Double, 
      /* idx */ Double, 
      /* x */ Double, 
      /* y */ Double, 
      /* s */ js.Array[Double], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Returns the geometry's bounding box as an envelope.
    * @returns {envelope} The bounding box of the geometry as an envelope.
    */
  def getBounds(): envelope = js.native
  
  /**
    * Checks whether or not this geometry is closed.
    * @returns {boolean} Result of the closed check.
    */
  def getIsClosed(): Boolean = js.native
  
  /**
    * Checks whether or not this geometry is closed.
    * @returns {boolean} Result of the path check.
    */
  def getIsPath(): Boolean = js.native
  
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
  def getLabelingPoint(idx: Double): point = js.native
  
  /**
    * Gets a set from this geometry's set collection by index, or, if no 
    * index is provided, gets the last set. Note: for polygons, first set
    * is primary ring and subsequent ones are holes.
    * @param {number} [idx] Index of the set to return.
    * @returns {number[]} A set as an array of points in the form [xn,yn].
    */
  def getSet(idx: Double): js.Array[Double] = js.native
  
  /**
    * Gets the number of sets in this geometry.
    * @returns {number} Number of sets.
    */
  def getSetCount(): Double = js.native
  
  /**
    * Tests the validity of this geometry. An open path geometry is valid
    * if it has at least one set with at least two points. A closed 
    * geometry is valid if it has at least one set with at least three
    * points. A point (non-path) geometry is always valid.
    * @returns {geometry} valid geometry is true, otherwise false.
    */
  def isValid(): Boolean = js.native
  
  /**
    * Gets the last set in the geometry's set collection and removes it 
    * from the collection.
    * @returns {number} Set removed as an array of points in the form [xn,yn].
    */
  def popSet(): js.Array[Double] = js.native
  
  /**
    * Adds a new set to this geometry's collection of sets.
    * @param {number[]} s Set to add as an array of points in the form [xn,yn].
    */
  def pushSet(s: js.Array[Double]): Unit = js.native
  
  /**
    * Creates SVG path data from this geometry if it is a path.
    * @returns {string} String of the SVG path or null the geometry is not a path.
    */
  def toSvgPathData(): String = js.native
  
  def toWkt(): String = js.native
}
object geometry {
  
  /**
    * A polyline object which is a closed path geometry with one or more paths.
    * @class polygon
    */
  @JSImport("mapsjs", "geometry.polygon")
  @js.native
  class polygon protected () extends geometry {
    def this(geom: geometry) = this()
    
    /**
      * Calculates area of a ring in a polygon by index according 
      * to the actual area. If no index is provided, uses the last ring
      * in the polygon's ring collection.
      * @param {number} [idx] Index of the ring for which to compute the area.
      * @returns {number} Area in square meters of the ring.
      */
    def getActualArea(): Double = js.native
    def getActualArea(idx: Double): Double = js.native
    
    /**
      * Calculates perimeter of a ring in a polygon by index according 
      * to actual distance. If no index is provided, uses the last ring
      * in the polygon's ring collection.
      * @param {number} [idx] Index of the ring for which to compute the perimeter.
      * @returns {number} Length in meters of the perimeter of the ring.
      */
    def getActualPerimeter(): Double = js.native
    def getActualPerimeter(idx: Double): Double = js.native
    
    /**
      * Gets the underlying geometry of the polygon.
      * @returns {geometry} The polygon's underlying geometry object.
      */
    def getGeometry(): geometry = js.native
    
    /**
      * Calculates area of a ring in a polygon by index according 
      * to projected map cooordinates. If no index is provided, uses
      * the last ring in the polygon's ring collection.
      * @param {number} [idx] Index of the ring for which to compute the area.
      * @returns {number} Area in square projected units of the ring.
      */
    def getProjectedArea(idx: Double): Double = js.native
    
    /**
      * Calculates perimeter of a ring in a polygon by index according 
      * to projected map cooordinates. If no index is provided, uses
      * the last ring in the polygon's ring collection.
      * @param {number} [idx] Index of the ring for which to compute the perimeter.
      * @returns {number} Length in projected units of the distance of the ring.
      */
    def getProjectedPerimeter(idx: Double): Double = js.native
    
    /**
      * Gets a ring from this polygon's set collection by index, or, 
      * if no index is provided, gets the last ring.
      * @param {number} [idx] Index of the ring to return.
      * @returns {number[]} A ring as an array of points in the form [xn,yn].
      */
    def getRing(idx: Double): js.Array[Double] = js.native
    
    /**
      * Gets number of rings in this polygon.
      * @returns {number} Number of rings.
      */
    def getRingCount(): Double = js.native
    
    /**
      * Determines whether this polygon intersects a given geometry.
      * @param {geometry} geom Geometry to test against.
      * @returns {boolean} Result of the intersection test.
      */
    def intersects(geom: geometry): Boolean = js.native
    
    /**
      * Determines whether this polyline overlaps a given geometry.
      * @param {geometry} geom Geometry to test against.
      * @returns {boolean} Result of the intersection test.
      */
    def overlaps(poly: polygon): Boolean = js.native
    
    /**
      * Gets the last ring in the polygon's ring collection and removes it 
      * from the collection.
      * @returns {number} Ring removed as an array of points in the form [xn,yn].
      */
    def popRing(): js.Array[Double] = js.native
    
    /**
      * Adds a new ring to this polygon's ring collection.
      * @param {number[]} s Ring to add as an array of points in the form [xn,yn].
      */
    def pushRing(s: js.Array[Double]): Unit = js.native
    
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
  @JSImport("mapsjs", "geometry.polyline")
  @js.native
  class polyline protected () extends geometry {
    def this(geom: geometry) = this()
    
    /**
      * Calculates distance of a line in a polyline by index according 
      * to actual distance. If no index is provided, uses the last line 
      * in the polyline's set collection.
      * @param {number} [idx] Index of the line for which to compute the distance.
      * @returns {number} Distance in meters of the line.
      */
    def getActualDistance(): Double = js.native
    def getActualDistance(idx: Double): Double = js.native
    
    /**
      * Gets the underlying geometry of the polyline.
      * @returns {geometry} The polyline's underlying geometry object.
      */
    def getGeometry(): geometry = js.native
    
    /**
      * Gets a line from this polyline's liune collection by index, or, 
      * if no index is provided, gets the last line.
      * @param {number} [idx] Index of the line to return.
      * @returns {number[]} A line as an array of points in the form [xn,yn].
      */
    def getLine(idx: Double): js.Array[Double] = js.native
    
    /**
      * Gets number of lines in this polyline.
      * @returns {number} Number of lines.
      */
    def getLineCount(): Double = js.native
    
    /**
      * Calculates distance of a line in a polyline by index according 
      * to projected map cooordinates. If no index is provided, uses
      * the last line in the polyline's set collection.
      * @param {number} [idx] Index of the line for which to compute the distance.
      * @returns {number} Length in projected units of the distance of the line.
      */
    def getProjectedDistance(idx: Double): Double = js.native
    
    /**
      * Determines whether this polyline intersects a given geometry.
      * @param {geometry} geom Geometry to test against.
      * @returns {boolean} Result of the intersection test.
      */
    def intersects(geom: geometry): Boolean = js.native
    
    /**
      * Gets the last line in the polyline's set collection and removes it 
      * from the collection.
      * @returns {number} Line removed as an array of points in the form [xn,yn].
      */
    def popLine(): js.Array[Double] = js.native
    
    /**
      * Adds a new line to this polyline's line collection.
      * @param {number[]} s Line to add as an array of points in the form [xn,yn].
      */
    def pushLine(s: js.Array[Double]): Unit = js.native
  }
}

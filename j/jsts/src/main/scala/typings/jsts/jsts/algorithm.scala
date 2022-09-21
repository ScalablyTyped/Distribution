package typings.jsts.jsts

import typings.jsts.jsts.geom.Coordinate
import typings.jsts.jsts.geom.Geometry
import typings.jsts.jsts.geom.PrecisionModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object algorithm {
  
  trait BoundaryNodeRule extends StObject
  
  trait ConvexHull extends StObject {
    
    /**
      * Returns a Geometry that represents the convex hull of the input geometry.
      * The returned geometry contains the minimal number of points needed
      * to represent the convex hull. In particular,
      * no more than two consecutive points will be collinear.
      *
      * @returns if the convex hull contains 3 or more points, a Polygon;
      * 2 points, a LineString; 1 point, a Point; 0 points, an empty GeometryCollection.
      */
    def getConvexHull(): Geometry
  }
  object ConvexHull {
    
    inline def apply(getConvexHull: () => Geometry): ConvexHull = {
      val __obj = js.Dynamic.literal(getConvexHull = js.Any.fromFunction0(getConvexHull))
      __obj.asInstanceOf[ConvexHull]
    }
    
    extension [Self <: ConvexHull](x: Self) {
      
      inline def setGetConvexHull(value: () => Geometry): Self = StObject.set(x, "getConvexHull", js.Any.fromFunction0(value))
    }
  }
  
  trait InteriorPointArea extends StObject {
    
    /**
      * Gets the computed interior point.
      *
      * @returns the coordinate of an interior point or null if the input geometry is empty
      */
    def getInteriorPoint(): Coordinate | Null
  }
  object InteriorPointArea {
    
    inline def apply(getInteriorPoint: () => Coordinate | Null): InteriorPointArea = {
      val __obj = js.Dynamic.literal(getInteriorPoint = js.Any.fromFunction0(getInteriorPoint))
      __obj.asInstanceOf[InteriorPointArea]
    }
    
    extension [Self <: InteriorPointArea](x: Self) {
      
      inline def setGetInteriorPoint(value: () => Coordinate | Null): Self = StObject.set(x, "getInteriorPoint", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait LineIntersector extends StObject {
    
    /**
      * Computes the intersection of the lines p1-p2 and p3-p4.
      * This function computes both the boolean value of the hasIntersection test
      * and the (approximate) value of the intersection point itself (if there is one).
      */
    def computeIntersection(p1: Coordinate, p2: Coordinate, p3: Coordinate, p4: Coordinate): Unit = js.native
    
    /**
      * Computes the "edge distance" of an intersection point
      * along the specified input line segment.
      *
      * @param {int} segmentIndex is 0 or 1
      * @param {int} intIndex is 0 or 1
      *
      * @returns {double} the edge distance of the intersection point
      */
    def getEdgeDistance(segmentIndex: Double, intIndex: Double): Double = js.native
    
    /**
      * Gets an endpoint of an input segment.
      * @param {int} segmentIndex the index of the input segment (0 or 1)
      * @param {int} ptIndex  the index of the endpoint (0 or 1)
      * @returns the specified endpoint
      */
    def getEndpoint(segmentIndex: Double, ptIndex: Double): Coordinate = js.native
    
    /**
      * Computes the index (order) of the intIndex'th intersection point
      * in the direction of a specified input line segment
      *
      * @param {int} segmentIndex is 0 or 1
      * @param {int} intIndex is 0 or 1
      *
      * @returns {int} the index of the intersection point along the input segment (0 or 1)
      */
    def getIndexAlongSegment(segmentIndex: Double, intIndex: Double): Double = js.native
    
    /**
      *
      * @param {int} intIndex is 0 or 1
      * @returns the intIndex'th intersection point
      */
    def getIntersection(intIndex: Double): Coordinate = js.native
    
    /**
      * Computes the intIndex'th intersection point in the direction
      * of a specified input line segment
      *
      * @param {int} segmentIndex is 0 or 1
      * @param {int} intIndex is 0 or 1
      *
      * @returns the intIndex'th intersection point in the direction
      * of the specified input line segment
      */
    def getIntersectionAlongSegment(segmentIndex: Double, intIndex: Double): Coordinate = js.native
    
    /**
      * Returns the number of intersection points found. This will be either 0, 1 or 2.
      * @returns {int} the number of intersection points found (0, 1, or 2)
      */
    def getIntersectionNum(): Double = js.native
    
    /**
      * Tests whether the input geometries intersect.
      *
      * @returns true if the input geometries intersect
      */
    def hasIntersection(): Boolean = js.native
    
    /**
      * Tests whether either intersection point is an interior point of one of the input segments.
      *
      * @returns true if either intersection point is in the interior of one of the input segments
      */
    def isInteriorIntersection(): Boolean = js.native
    /**
      * Tests whether either intersection point is an interior point of the specified input segment.
      * @param {int} inputLineIndex
      *
      * @returns true if either intersection point is in the interior of the input segment
      */
    def isInteriorIntersection(inputLineIndex: Double): Boolean = js.native
    
    /**
      * Test whether a point is a intersection point of two line segments.
      * Note that if the intersection is a line segment, this method only tests
      * for equality with the endpoints of the intersection segment.
      * It does not return true if the input point is internal to the intersection segment.
      *
      * @returns true if the input point is one of the intersection points.
      */
    def isIntersection(pt: Coordinate): Boolean = js.native
    
    /**
      *  Tests whether an intersection is proper.
      * The intersection between two line segments is considered proper if they intersect
      * in a single point in the interior of both segments
      * (e.g. the intersection is a single point and is not equal to any of the endpoints).
      * The intersection between a point and a line segment is considered proper if
      * the point lies in the interior of the segment (e.g. is not equal to either of the endpoints).
      *
      * @returns true if the intersection is proper
      */
    def isProper(): Boolean = js.native
    
    /**
      * Force computed intersection to be rounded to a given precision model.
      * No getter is provided, because the precision model is not required to be specified.
      */
    def setPrecisionModel(precisionModel: PrecisionModel): Unit = js.native
  }
  
  trait Orientation extends StObject
  
  @js.native
  trait RobustLineIntersector
    extends StObject
       with LineIntersector {
    
    /**
      * Compute the intersection of a point p and the line p1-p2.
      * This function computes the boolean value of the hasIntersection test.
      * The actual value of the intersection (if there is one) is equal to the value of p.
      */
    def computeIntersection(p: Coordinate, p1: Coordinate, p2: Coordinate): Unit = js.native
  }
  
  object locate {
    
    /**
      * An interface for classes which determine the Location of points in a Geometry.
      */
    trait PointOnGeometryLocator extends StObject {
      
      /**
        * Determines the Location of a point in the Geometry.
        *
        * @param p the point to test
        *
        * @returns {int} the location of the point in the geometry
        */
      def locate(p: Coordinate): Double
    }
    object PointOnGeometryLocator {
      
      inline def apply(locate: Coordinate => Double): PointOnGeometryLocator = {
        val __obj = js.Dynamic.literal(locate = js.Any.fromFunction1(locate))
        __obj.asInstanceOf[PointOnGeometryLocator]
      }
      
      extension [Self <: PointOnGeometryLocator](x: Self) {
        
        inline def setLocate(value: Coordinate => Double): Self = StObject.set(x, "locate", js.Any.fromFunction1(value))
      }
    }
    
    trait SimplePointInAreaLocator
      extends StObject
         with PointOnGeometryLocator
    object SimplePointInAreaLocator {
      
      inline def apply(locate: Coordinate => Double): SimplePointInAreaLocator = {
        val __obj = js.Dynamic.literal(locate = js.Any.fromFunction1(locate))
        __obj.asInstanceOf[SimplePointInAreaLocator]
      }
    }
  }
}

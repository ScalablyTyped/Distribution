package typings.jsts.global.jsts

import typings.jsts.jsts.geom.Coordinate
import typings.jsts.jsts.geom.Geometry
import typings.jsts.jsts.geom.GeometryFactory
import typings.jsts.jsts.geom.Point
import typings.jsts.jsts.geom.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object algorithm {
  
  @JSGlobal("jsts.algorithm.BoundaryNodeRule")
  @js.native
  open class BoundaryNodeRule ()
    extends StObject
       with typings.jsts.jsts.algorithm.BoundaryNodeRule
  
  @JSGlobal("jsts.algorithm.ConvexHull")
  @js.native
  open class ConvexHull protected ()
    extends StObject
       with typings.jsts.jsts.algorithm.ConvexHull {
    /**
      * Create a new convex hull construction for the input Geometry.
      */
    def this(geometry: Geometry) = this()
    /**
      * Create a new convex hull construction for the input Coordinate array.
      */
    def this(pts: js.Array[Coordinate], geomFactory: GeometryFactory) = this()
    
    /**
      * Returns a Geometry that represents the convex hull of the input geometry.
      * The returned geometry contains the minimal number of points needed
      * to represent the convex hull. In particular,
      * no more than two consecutive points will be collinear.
      *
      * @returns if the convex hull contains 3 or more points, a Polygon;
      * 2 points, a LineString; 1 point, a Point; 0 points, an empty GeometryCollection.
      */
    /* CompleteClass */
    override def getConvexHull(): Geometry = js.native
  }
  
  @JSGlobal("jsts.algorithm.InteriorPointArea")
  @js.native
  open class InteriorPointArea protected ()
    extends StObject
       with typings.jsts.jsts.algorithm.InteriorPointArea {
    /**
      * Creates a new interior point finder for an areal geometry.
      */
    def this(g: Geometry) = this()
    
    /**
      * Gets the computed interior point.
      *
      * @returns the coordinate of an interior point or null if the input geometry is empty
      */
    /* CompleteClass */
    override def getInteriorPoint(): Coordinate | Null = js.native
  }
  /* static members */
  object InteriorPointArea {
    
    @JSGlobal("jsts.algorithm.InteriorPointArea")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Computes an interior point for the polygonal components of a Geometry.
      *
      * @param geom the geometry to compute
      * @returns the computed interior point, or null if the geometry has no polygonal components
      */
    inline def getInteriorPoint(geom: Geometry): Coordinate | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getInteriorPoint")(geom.asInstanceOf[js.Any]).asInstanceOf[Coordinate | Null]
  }
  
  @JSGlobal("jsts.algorithm.LineIntersector")
  @js.native
  /**
    * @constructor
    */
  open class LineIntersector ()
    extends StObject
       with typings.jsts.jsts.algorithm.LineIntersector
  /* static members */
  object LineIntersector {
    
    @JSGlobal("jsts.algorithm.LineIntersector")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @type {int}
      */
    @JSGlobal("jsts.algorithm.LineIntersector.COLLINEAR")
    @js.native
    def COLLINEAR: Double = js.native
    inline def COLLINEAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLLINEAR")(x.asInstanceOf[js.Any])
    
    /**
      * Indicates that line segments intersect in a line segment
      *
      * @type {int}
      */
    @JSGlobal("jsts.algorithm.LineIntersector.COLLINEAR_INTERSECTION")
    @js.native
    def COLLINEAR_INTERSECTION: Double = js.native
    inline def COLLINEAR_INTERSECTION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLLINEAR_INTERSECTION")(x.asInstanceOf[js.Any])
    
    /**
      * These are deprecated, due to ambiguous naming
      *
      * @type {int}
      */
    @JSGlobal("jsts.algorithm.LineIntersector.DONT_INTERSECT")
    @js.native
    def DONT_INTERSECT: Double = js.native
    inline def DONT_INTERSECT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DONT_INTERSECT")(x.asInstanceOf[js.Any])
    
    /**
      * @type {int}
      */
    @JSGlobal("jsts.algorithm.LineIntersector.DO_INTERSECT")
    @js.native
    def DO_INTERSECT: Double = js.native
    inline def DO_INTERSECT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DO_INTERSECT")(x.asInstanceOf[js.Any])
    
    /**
      * Indicates that line segments do not intersect
      *
      * @type {int}
      */
    @JSGlobal("jsts.algorithm.LineIntersector.NO_INTERSECTION")
    @js.native
    def NO_INTERSECTION: Double = js.native
    inline def NO_INTERSECTION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_INTERSECTION")(x.asInstanceOf[js.Any])
    
    /**
      * Indicates that line segments intersect in a single point
      *
      * @type {int}
      */
    @JSGlobal("jsts.algorithm.LineIntersector.POINT_INTERSECTION")
    @js.native
    def POINT_INTERSECTION: Double = js.native
    inline def POINT_INTERSECTION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POINT_INTERSECTION")(x.asInstanceOf[js.Any])
    
    /**
      * Computes the "edge distance" of an intersection point p along a segment.
      * The edge distance is a metric of the point along the edge.
      * The metric used is a robust and easy to compute metric function.
      * It is not equivalent to the usual Euclidean metric.
      * It relies on the fact that either the x or the y ordinates of the points
      * in the edge are unique, depending on whether the edge is longer
      * in the horizontal or vertical direction.
      *
      * NOTE: This function may produce incorrect distances for inputs
      * where p is not precisely on p1-p2
      * (E.g. p = (139,9) p1 = (139,10), p2 = (280,1) produces distance 0.0, which is incorrect.
      * My hypothesis is that the function is safe to use for points which are
      * the result of rounding points which lie on the line,
      * but not safe to use for truncated points.
      */
    inline def computeEdgeDistance(p: Coordinate, p0: Coordinate, p1: Coordinate): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeEdgeDistance")(p.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * This function is non-robust, since it may compute the square of large numbers.
      * Currently not sure how to improve this.
      */
    inline def nonRobustComputeEdgeDistance(p: Coordinate, p1: Coordinate, p2: Coordinate): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("nonRobustComputeEdgeDistance")(p.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @JSGlobal("jsts.algorithm.Orientation")
  @js.native
  open class Orientation ()
    extends StObject
       with typings.jsts.jsts.algorithm.Orientation
  /* static members */
  object Orientation {
    
    @JSGlobal("jsts.algorithm.Orientation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("jsts.algorithm.Orientation.CLOCKWISE")
    @js.native
    def CLOCKWISE: Double = js.native
    inline def CLOCKWISE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOCKWISE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jsts.algorithm.Orientation.COLLINEAR")
    @js.native
    def COLLINEAR: Double = js.native
    inline def COLLINEAR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLLINEAR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jsts.algorithm.Orientation.COUNTERCLOCKWISE")
    @js.native
    def COUNTERCLOCKWISE: Double = js.native
    inline def COUNTERCLOCKWISE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COUNTERCLOCKWISE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jsts.algorithm.Orientation.LEFT")
    @js.native
    def LEFT: Double = js.native
    inline def LEFT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEFT")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jsts.algorithm.Orientation.RIGHT")
    @js.native
    def RIGHT: Double = js.native
    inline def RIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jsts.algorithm.Orientation.STRAIGHT")
    @js.native
    def STRAIGHT: Double = js.native
    inline def STRAIGHT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRAIGHT")(x.asInstanceOf[js.Any])
    
    inline def index(p1: Point, p2: Point, q: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("index")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def isCCW(ring: js.Array[Coordinate]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCCW")(ring.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSGlobal("jsts.algorithm.RobustLineIntersector")
  @js.native
  /**
    * @constructor
    */
  open class RobustLineIntersector ()
    extends StObject
       with typings.jsts.jsts.algorithm.RobustLineIntersector
  
  object locate {
    
    @JSGlobal("jsts.algorithm.locate.SimplePointInAreaLocator")
    @js.native
    open class SimplePointInAreaLocator protected ()
      extends StObject
         with typings.jsts.jsts.algorithm.locate.SimplePointInAreaLocator {
      /**
        * Create an instance of a point-in-area locator, using the provided areal geometry.
        */
      def this(geom: Geometry) = this()
      
      /**
        * Determines the Location of a point in the Geometry.
        *
        * @param p the point to test
        *
        * @returns {int} the location of the point in the geometry
        */
      /* CompleteClass */
      override def locate(p: Coordinate): Double = js.native
    }
    /* static members */
    object SimplePointInAreaLocator {
      
      @JSGlobal("jsts.algorithm.locate.SimplePointInAreaLocator")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Determines whether a point lies in a Polygon. If the point lies on the polygon boundary it is considered to be inside.
        *
        * @param p {Coordinate} the point to test
        * @param poly {Polygon} the geometry to test
        *
        * @returns {boolean} true if the point lies in or on the polygon
        */
      inline def containsPointInPolygon(p: Coordinate, poly: Polygon): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsPointInPolygon")(p.asInstanceOf[js.Any], poly.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      /**
        * Determines whether a point is contained in a Geometry, or lies on its boundary.
        * This is a convenience method for Location.EXTERIOR != locate(p, geom)
        */
      inline def isContained(p: Coordinate, geom: Geometry): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContained")(p.asInstanceOf[js.Any], geom.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      /**
        * Determines the Location of a point in an areal Geometry. The return value is one of:
        * Location.INTERIOR if the point is in the geometry interior
        * Location.BOUNDARY if the point lies exactly on the boundary
        * Location.EXTERIOR if the point is outside the geometry
        *
        * @returns {int} the Location of the point in the geometry
        */
      inline def locate(p: Coordinate, geom: Geometry): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("locate")(p.asInstanceOf[js.Any], geom.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      /**
        * Determines the Location of a point in a Polygon. The return value is one of:
        * - Location.INTERIOR if the point is in the geometry interior
        * - Location.BOUNDARY if the point lies exactly on the boundary
        * - Location.EXTERIOR if the point is outside the geometry
        * This method is provided for backwards compatibility only. Use locate(Coordinate, Geometry) instead.
        *
        * @param p {Coordinate} the point to test
        * @param poly {Polygon} the geometry to test
        *
        * @returns {int} the Location of the point in the polygon
        */
      inline def locatePointInPolygon(p: Coordinate, poly: Polygon): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("locatePointInPolygon")(p.asInstanceOf[js.Any], poly.asInstanceOf[js.Any])).asInstanceOf[Double]
    }
  }
}

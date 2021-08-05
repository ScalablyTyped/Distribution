package typings.makerJs.global.MakerJs

import typings.makerJs.MakerJs.IMeasure
import typings.makerJs.MakerJs.IMeasureMap
import typings.makerJs.MakerJs.IMeasureWithCenter
import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IPath
import typings.makerJs.MakerJs.IPathArc
import typings.makerJs.MakerJs.IPathBezierSeed
import typings.makerJs.MakerJs.IPathLine
import typings.makerJs.MakerJs.IPoint
import typings.makerJs.MakerJs.ISlope
import typings.makerJs.MakerJs.measure.IBoundingHex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object measure {
  
  @JSGlobal("MakerJs.measure")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A list of maps of measurements.
    *
    * @param modelToMeasure The model to measure.
    * @param atlas Optional atlas to save measurements.
    * @returns object with low and high points.
    */
  @JSGlobal("MakerJs.measure.Atlas")
  @js.native
  class Atlas protected ()
    extends StObject
       with typings.makerJs.MakerJs.measure.Atlas {
    /**
      * Constructor.
      * @param modelContext The model to measure.
      */
    def this(modelContext: IModel) = this()
    
    /* CompleteClass */
    override def measureModels(): Unit = js.native
    
    /* CompleteClass */
    var modelContext: IModel = js.native
    
    /**
      * Map of model measurements, mapped by routeKey.
      */
    /* CompleteClass */
    var modelMap: IMeasureMap = js.native
    
    /**
      * Flag that models have been measured.
      */
    /* CompleteClass */
    var modelsMeasured: Boolean = js.native
    
    /**
      * Map of path measurements, mapped by routeKey.
      */
    /* CompleteClass */
    var pathMap: IMeasureMap = js.native
  }
  
  /**
    * Measures the minimum bounding hexagon surrounding a model. The hexagon is oriented such that the right and left sides are vertical, and the top and bottom are pointed.
    *
    * @param modelToMeasure The model to measure.
    * @returns IBoundingHex object which is a hexagon model, with an additional radius property.
    */
  inline def boundingHexagon(modelToMeasure: IModel): IBoundingHex = ^.asInstanceOf[js.Dynamic].applyDynamic("boundingHexagon")(modelToMeasure.asInstanceOf[js.Any]).asInstanceOf[IBoundingHex]
  
  /**
    * Increase a measurement by an additional measurement.
    *
    * @param baseMeasure The measurement to increase.
    * @param addMeasure The additional measurement.
    * @param addOffset Optional offset point of the additional measurement.
    * @returns The increased original measurement (for cascading).
    */
  inline def increase(baseMeasure: IMeasure, addMeasure: IMeasure): IMeasure = (^.asInstanceOf[js.Dynamic].applyDynamic("increase")(baseMeasure.asInstanceOf[js.Any], addMeasure.asInstanceOf[js.Any])).asInstanceOf[IMeasure]
  
  /**
    * Find out if two angles are equal.
    *
    * @param angleA First angle.
    * @param angleB Second angle.
    * @returns true if angles are the same, false if they are not
    */
  inline def isAngleEqual(angleA: Double, angleB: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAngleEqual")(angleA.asInstanceOf[js.Any], angleB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isAngleEqual(angleA: Double, angleB: Double, accuracy: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAngleEqual")(angleA.asInstanceOf[js.Any], angleB.asInstanceOf[js.Any], accuracy.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Check for arc being concave or convex towards a given point.
    *
    * @param arc The arc to test.
    * @param towardsPoint The point to test.
    * @returns Boolean true if arc is concave towards point.
    */
  inline def isArcConcaveTowardsPoint(arc: IPathArc, towardsPoint: IPoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArcConcaveTowardsPoint")(arc.asInstanceOf[js.Any], towardsPoint.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Check for arc overlapping another arc.
    *
    * @param arcA The arc to test.
    * @param arcB The arc to check for overlap.
    * @param excludeTangents Boolean to exclude exact endpoints and only look for deep overlaps.
    * @returns Boolean true if arcA is overlapped with arcB.
    */
  inline def isArcOverlapping(arcA: IPathArc, arcB: IPathArc, excludeTangents: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArcOverlapping")(arcA.asInstanceOf[js.Any], arcB.asInstanceOf[js.Any], excludeTangents.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Check if a given number is between two given limits.
    *
    * @param valueInQuestion The number to test.
    * @param limitA First limit.
    * @param limitB Second limit.
    * @param exclusive Flag to exclude equaling the limits.
    * @returns Boolean true if value is between (or equal to) the limits.
    */
  inline def isBetween(valueInQuestion: Double, limitA: Double, limitB: Double, exclusive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBetween")(valueInQuestion.asInstanceOf[js.Any], limitA.asInstanceOf[js.Any], limitB.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Check if a given angle is between an arc's start and end angles.
    *
    * @param angleInQuestion The angle to test.
    * @param arc Arc to test against.
    * @param exclusive Flag to exclude equaling the start or end angles.
    * @returns Boolean true if angle is between (or equal to) the arc's start and end angles.
    */
  inline def isBetweenArcAngles(angleInQuestion: Double, arc: IPathArc, exclusive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBetweenArcAngles")(angleInQuestion.asInstanceOf[js.Any], arc.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Check if a given point is between a line's end points.
    *
    * @param pointInQuestion The point to test.
    * @param line Line to test against.
    * @param exclusive Flag to exclude equaling the origin or end points.
    * @returns Boolean true if point is between (or equal to) the line's origin and end points.
    */
  inline def isBetweenPoints(pointInQuestion: IPoint, line: IPathLine, exclusive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBetweenPoints")(pointInQuestion.asInstanceOf[js.Any], line.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Check if a given bezier seed is simply a line.
    *
    * @param seed The bezier seed to test.
    * @returns Boolean true if bezier seed has control points on the line slope and between the line endpoints.
    */
  inline def isBezierSeedLinear(seed: IPathBezierSeed): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBezierSeedLinear")(seed.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Check for line overlapping another line.
    *
    * @param lineA The line to test.
    * @param lineB The line to check for overlap.
    * @param excludeTangents Boolean to exclude exact endpoints and only look for deep overlaps.
    * @returns Boolean true if lineA is overlapped with lineB.
    */
  inline def isLineOverlapping(lineA: IPathLine, lineB: IPathLine, excludeTangents: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLineOverlapping")(lineA.asInstanceOf[js.Any], lineB.asInstanceOf[js.Any], excludeTangents.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Check for measurement overlapping another measurement.
    *
    * @param measureA The measurement to test.
    * @param measureB The measurement to check for overlap.
    * @returns Boolean true if measureA is overlapped with measureB.
    */
  inline def isMeasurementOverlapping(measureA: IMeasure, measureB: IMeasure): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMeasurementOverlapping")(measureA.asInstanceOf[js.Any], measureB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Find out if two paths are equal.
    *
    * @param pathA First path.
    * @param pathB Second path.
    * @returns true if paths are the same, false if they are not
    */
  inline def isPathEqual(pathA: IPath, pathB: IPath): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPathEqual")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPathEqual(pathA: IPath, pathB: IPath, withinPointDistance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPathEqual")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any], withinPointDistance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPathEqual(pathA: IPath, pathB: IPath, withinPointDistance: Double, pathAOffset: Unit, pathBOffset: IPoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPathEqual")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any], withinPointDistance.asInstanceOf[js.Any], pathAOffset.asInstanceOf[js.Any], pathBOffset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPathEqual(pathA: IPath, pathB: IPath, withinPointDistance: Double, pathAOffset: IPoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPathEqual")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any], withinPointDistance.asInstanceOf[js.Any], pathAOffset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPathEqual(pathA: IPath, pathB: IPath, withinPointDistance: Double, pathAOffset: IPoint, pathBOffset: IPoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPathEqual")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any], withinPointDistance.asInstanceOf[js.Any], pathAOffset.asInstanceOf[js.Any], pathBOffset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPathEqual(pathA: IPath, pathB: IPath, withinPointDistance: Unit, pathAOffset: Unit, pathBOffset: IPoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPathEqual")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any], withinPointDistance.asInstanceOf[js.Any], pathAOffset.asInstanceOf[js.Any], pathBOffset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPathEqual(pathA: IPath, pathB: IPath, withinPointDistance: Unit, pathAOffset: IPoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPathEqual")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any], withinPointDistance.asInstanceOf[js.Any], pathAOffset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPathEqual(pathA: IPath, pathB: IPath, withinPointDistance: Unit, pathAOffset: IPoint, pathBOffset: IPoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPathEqual")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any], withinPointDistance.asInstanceOf[js.Any], pathAOffset.asInstanceOf[js.Any], pathBOffset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Find out if two points are equal.
    *
    * @param a First point.
    * @param b Second point.
    * @returns true if points are the same, false if they are not
    */
  inline def isPointEqual(a: IPoint, b: IPoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPointEqual(a: IPoint, b: IPoint, withinDistance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], withinDistance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Find out if point is on a slope.
    *
    * @param p Point to check.
    * @param b Slope.
    * @returns true if point is on the slope
    */
  inline def isPointOnSlope(p: IPoint, slope: ISlope): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointOnSlope")(p.asInstanceOf[js.Any], slope.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isPointOnSlope(p: IPoint, slope: ISlope, withinDistance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointOnSlope")(p.asInstanceOf[js.Any], slope.asInstanceOf[js.Any], withinDistance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Check for slope equality.
    *
    * @param slopeA The ISlope to test.
    * @param slopeB The ISlope to check for equality.
    * @returns Boolean true if slopes are equal.
    */
  inline def isSlopeEqual(slopeA: ISlope, slopeB: ISlope): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSlopeEqual")(slopeA.asInstanceOf[js.Any], slopeB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Gets the slope of a line.
    */
  inline def lineSlope(line: IPathLine): ISlope = ^.asInstanceOf[js.Dynamic].applyDynamic("lineSlope")(line.asInstanceOf[js.Any]).asInstanceOf[ISlope]
  
  /**
    * Measures the smallest rectangle which contains a model.
    *
    * @param modelToMeasure The model to measure.
    * @param atlas Optional atlas to save measurements.
    * @returns object with low and high points.
    */
  inline def modelExtents(modelToMeasure: IModel): IMeasureWithCenter = ^.asInstanceOf[js.Dynamic].applyDynamic("modelExtents")(modelToMeasure.asInstanceOf[js.Any]).asInstanceOf[IMeasureWithCenter]
  inline def modelExtents(modelToMeasure: IModel, atlas: typings.makerJs.MakerJs.measure.Atlas): IMeasureWithCenter = (^.asInstanceOf[js.Dynamic].applyDynamic("modelExtents")(modelToMeasure.asInstanceOf[js.Any], atlas.asInstanceOf[js.Any])).asInstanceOf[IMeasureWithCenter]
  
  /**
    * Calculates the smallest rectangle which contains a path.
    *
    * @param pathToMeasure The path to measure.
    * @returns object with low and high points.
    */
  inline def pathExtents(pathToMeasure: IPath): IMeasure = ^.asInstanceOf[js.Dynamic].applyDynamic("pathExtents")(pathToMeasure.asInstanceOf[js.Any]).asInstanceOf[IMeasure]
  inline def pathExtents(pathToMeasure: IPath, addOffset: IPoint): IMeasure = (^.asInstanceOf[js.Dynamic].applyDynamic("pathExtents")(pathToMeasure.asInstanceOf[js.Any], addOffset.asInstanceOf[js.Any])).asInstanceOf[IMeasure]
  
  /**
    * Measures the length of a path.
    *
    * @param pathToMeasure The path to measure.
    * @returns Length of the path.
    */
  inline def pathLength(pathToMeasure: IPath): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pathLength")(pathToMeasure.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Calculates the distance between two points.
    *
    * @param a First point.
    * @param b Second point.
    * @returns Distance between points.
    */
  inline def pointDistance(a: IPoint, b: IPoint): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pointDistance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
}

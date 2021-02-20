package typings.makerJs.global.MakerJs

import typings.makerJs.MakerJs.IMeasure
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object measure {
  
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
    extends typings.makerJs.MakerJs.measure.Atlas {
    /**
      * Constructor.
      * @param modelContext The model to measure.
      */
    def this(modelContext: IModel) = this()
  }
  
  /**
    * Measures the minimum bounding hexagon surrounding a model. The hexagon is oriented such that the right and left sides are vertical, and the top and bottom are pointed.
    *
    * @param modelToMeasure The model to measure.
    * @returns IBoundingHex object which is a hexagon model, with an additional radius property.
    */
  @JSGlobal("MakerJs.measure.boundingHexagon")
  @js.native
  def boundingHexagon(modelToMeasure: IModel): IBoundingHex = js.native
  
  /**
    * Increase a measurement by an additional measurement.
    *
    * @param baseMeasure The measurement to increase.
    * @param addMeasure The additional measurement.
    * @param addOffset Optional offset point of the additional measurement.
    * @returns The increased original measurement (for cascading).
    */
  @JSGlobal("MakerJs.measure.increase")
  @js.native
  def increase(baseMeasure: IMeasure, addMeasure: IMeasure): IMeasure = js.native
  
  /**
    * Find out if two angles are equal.
    *
    * @param angleA First angle.
    * @param angleB Second angle.
    * @returns true if angles are the same, false if they are not
    */
  @JSGlobal("MakerJs.measure.isAngleEqual")
  @js.native
  def isAngleEqual(angleA: Double, angleB: Double): Boolean = js.native
  @JSGlobal("MakerJs.measure.isAngleEqual")
  @js.native
  def isAngleEqual(angleA: Double, angleB: Double, accuracy: Double): Boolean = js.native
  
  /**
    * Check for arc being concave or convex towards a given point.
    *
    * @param arc The arc to test.
    * @param towardsPoint The point to test.
    * @returns Boolean true if arc is concave towards point.
    */
  @JSGlobal("MakerJs.measure.isArcConcaveTowardsPoint")
  @js.native
  def isArcConcaveTowardsPoint(arc: IPathArc, towardsPoint: IPoint): Boolean = js.native
  
  /**
    * Check for arc overlapping another arc.
    *
    * @param arcA The arc to test.
    * @param arcB The arc to check for overlap.
    * @param excludeTangents Boolean to exclude exact endpoints and only look for deep overlaps.
    * @returns Boolean true if arcA is overlapped with arcB.
    */
  @JSGlobal("MakerJs.measure.isArcOverlapping")
  @js.native
  def isArcOverlapping(arcA: IPathArc, arcB: IPathArc, excludeTangents: Boolean): Boolean = js.native
  
  /**
    * Check if a given number is between two given limits.
    *
    * @param valueInQuestion The number to test.
    * @param limitA First limit.
    * @param limitB Second limit.
    * @param exclusive Flag to exclude equaling the limits.
    * @returns Boolean true if value is between (or equal to) the limits.
    */
  @JSGlobal("MakerJs.measure.isBetween")
  @js.native
  def isBetween(valueInQuestion: Double, limitA: Double, limitB: Double, exclusive: Boolean): Boolean = js.native
  
  /**
    * Check if a given angle is between an arc's start and end angles.
    *
    * @param angleInQuestion The angle to test.
    * @param arc Arc to test against.
    * @param exclusive Flag to exclude equaling the start or end angles.
    * @returns Boolean true if angle is between (or equal to) the arc's start and end angles.
    */
  @JSGlobal("MakerJs.measure.isBetweenArcAngles")
  @js.native
  def isBetweenArcAngles(angleInQuestion: Double, arc: IPathArc, exclusive: Boolean): Boolean = js.native
  
  /**
    * Check if a given point is between a line's end points.
    *
    * @param pointInQuestion The point to test.
    * @param line Line to test against.
    * @param exclusive Flag to exclude equaling the origin or end points.
    * @returns Boolean true if point is between (or equal to) the line's origin and end points.
    */
  @JSGlobal("MakerJs.measure.isBetweenPoints")
  @js.native
  def isBetweenPoints(pointInQuestion: IPoint, line: IPathLine, exclusive: Boolean): Boolean = js.native
  
  /**
    * Check if a given bezier seed is simply a line.
    *
    * @param seed The bezier seed to test.
    * @returns Boolean true if bezier seed has control points on the line slope and between the line endpoints.
    */
  @JSGlobal("MakerJs.measure.isBezierSeedLinear")
  @js.native
  def isBezierSeedLinear(seed: IPathBezierSeed): Boolean = js.native
  
  /**
    * Check for line overlapping another line.
    *
    * @param lineA The line to test.
    * @param lineB The line to check for overlap.
    * @param excludeTangents Boolean to exclude exact endpoints and only look for deep overlaps.
    * @returns Boolean true if lineA is overlapped with lineB.
    */
  @JSGlobal("MakerJs.measure.isLineOverlapping")
  @js.native
  def isLineOverlapping(lineA: IPathLine, lineB: IPathLine, excludeTangents: Boolean): Boolean = js.native
  
  /**
    * Check for measurement overlapping another measurement.
    *
    * @param measureA The measurement to test.
    * @param measureB The measurement to check for overlap.
    * @returns Boolean true if measureA is overlapped with measureB.
    */
  @JSGlobal("MakerJs.measure.isMeasurementOverlapping")
  @js.native
  def isMeasurementOverlapping(measureA: IMeasure, measureB: IMeasure): Boolean = js.native
  
  /**
    * Find out if two paths are equal.
    *
    * @param pathA First path.
    * @param pathB Second path.
    * @returns true if paths are the same, false if they are not
    */
  @JSGlobal("MakerJs.measure.isPathEqual")
  @js.native
  def isPathEqual(pathA: IPath, pathB: IPath): Boolean = js.native
  @JSGlobal("MakerJs.measure.isPathEqual")
  @js.native
  def isPathEqual(
    pathA: IPath,
    pathB: IPath,
    withinPointDistance: js.UndefOr[scala.Nothing],
    pathAOffset: js.UndefOr[scala.Nothing],
    pathBOffset: IPoint
  ): Boolean = js.native
  @JSGlobal("MakerJs.measure.isPathEqual")
  @js.native
  def isPathEqual(pathA: IPath, pathB: IPath, withinPointDistance: js.UndefOr[scala.Nothing], pathAOffset: IPoint): Boolean = js.native
  @JSGlobal("MakerJs.measure.isPathEqual")
  @js.native
  def isPathEqual(
    pathA: IPath,
    pathB: IPath,
    withinPointDistance: js.UndefOr[scala.Nothing],
    pathAOffset: IPoint,
    pathBOffset: IPoint
  ): Boolean = js.native
  @JSGlobal("MakerJs.measure.isPathEqual")
  @js.native
  def isPathEqual(pathA: IPath, pathB: IPath, withinPointDistance: Double): Boolean = js.native
  @JSGlobal("MakerJs.measure.isPathEqual")
  @js.native
  def isPathEqual(
    pathA: IPath,
    pathB: IPath,
    withinPointDistance: Double,
    pathAOffset: js.UndefOr[scala.Nothing],
    pathBOffset: IPoint
  ): Boolean = js.native
  @JSGlobal("MakerJs.measure.isPathEqual")
  @js.native
  def isPathEqual(pathA: IPath, pathB: IPath, withinPointDistance: Double, pathAOffset: IPoint): Boolean = js.native
  @JSGlobal("MakerJs.measure.isPathEqual")
  @js.native
  def isPathEqual(pathA: IPath, pathB: IPath, withinPointDistance: Double, pathAOffset: IPoint, pathBOffset: IPoint): Boolean = js.native
  
  /**
    * Find out if two points are equal.
    *
    * @param a First point.
    * @param b Second point.
    * @returns true if points are the same, false if they are not
    */
  @JSGlobal("MakerJs.measure.isPointEqual")
  @js.native
  def isPointEqual(a: IPoint, b: IPoint): Boolean = js.native
  @JSGlobal("MakerJs.measure.isPointEqual")
  @js.native
  def isPointEqual(a: IPoint, b: IPoint, withinDistance: Double): Boolean = js.native
  
  /**
    * Find out if point is on a slope.
    *
    * @param p Point to check.
    * @param b Slope.
    * @returns true if point is on the slope
    */
  @JSGlobal("MakerJs.measure.isPointOnSlope")
  @js.native
  def isPointOnSlope(p: IPoint, slope: ISlope): Boolean = js.native
  @JSGlobal("MakerJs.measure.isPointOnSlope")
  @js.native
  def isPointOnSlope(p: IPoint, slope: ISlope, withinDistance: Double): Boolean = js.native
  
  /**
    * Check for slope equality.
    *
    * @param slopeA The ISlope to test.
    * @param slopeB The ISlope to check for equality.
    * @returns Boolean true if slopes are equal.
    */
  @JSGlobal("MakerJs.measure.isSlopeEqual")
  @js.native
  def isSlopeEqual(slopeA: ISlope, slopeB: ISlope): Boolean = js.native
  
  /**
    * Gets the slope of a line.
    */
  @JSGlobal("MakerJs.measure.lineSlope")
  @js.native
  def lineSlope(line: IPathLine): ISlope = js.native
  
  /**
    * Measures the smallest rectangle which contains a model.
    *
    * @param modelToMeasure The model to measure.
    * @param atlas Optional atlas to save measurements.
    * @returns object with low and high points.
    */
  @JSGlobal("MakerJs.measure.modelExtents")
  @js.native
  def modelExtents(modelToMeasure: IModel): IMeasureWithCenter = js.native
  @JSGlobal("MakerJs.measure.modelExtents")
  @js.native
  def modelExtents(modelToMeasure: IModel, atlas: typings.makerJs.MakerJs.measure.Atlas): IMeasureWithCenter = js.native
  
  /**
    * Calculates the smallest rectangle which contains a path.
    *
    * @param pathToMeasure The path to measure.
    * @returns object with low and high points.
    */
  @JSGlobal("MakerJs.measure.pathExtents")
  @js.native
  def pathExtents(pathToMeasure: IPath): IMeasure = js.native
  @JSGlobal("MakerJs.measure.pathExtents")
  @js.native
  def pathExtents(pathToMeasure: IPath, addOffset: IPoint): IMeasure = js.native
  
  /**
    * Measures the length of a path.
    *
    * @param pathToMeasure The path to measure.
    * @returns Length of the path.
    */
  @JSGlobal("MakerJs.measure.pathLength")
  @js.native
  def pathLength(pathToMeasure: IPath): Double = js.native
  
  /**
    * Calculates the distance between two points.
    *
    * @param a First point.
    * @param b Second point.
    * @returns Distance between points.
    */
  @JSGlobal("MakerJs.measure.pointDistance")
  @js.native
  def pointDistance(a: IPoint, b: IPoint): Double = js.native
}

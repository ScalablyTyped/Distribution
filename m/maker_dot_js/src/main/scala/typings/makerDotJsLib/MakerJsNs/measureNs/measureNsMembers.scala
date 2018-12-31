package typings
package makerDotJsLib.MakerJsNs.measureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.measure")
@js.native
object measureNsMembers extends js.Object {
  /**
    * Measures the minimum bounding hexagon surrounding a model. The hexagon is oriented such that the right and left sides are vertical, and the top and bottom are pointed.
    *
    * @param modelToMeasure The model to measure.
    * @returns IBoundingHex object which is a hexagon model, with an additional radius property.
    */
  def boundingHexagon(modelToMeasure: makerDotJsLib.MakerJsNs.IModel): IBoundingHex = js.native
  /**
    * Increase a measurement by an additional measurement.
    *
    * @param baseMeasure The measurement to increase.
    * @param addMeasure The additional measurement.
    * @param addOffset Optional offset point of the additional measurement.
    * @returns The increased original measurement (for cascading).
    */
  def increase(baseMeasure: makerDotJsLib.MakerJsNs.IMeasure, addMeasure: makerDotJsLib.MakerJsNs.IMeasure): makerDotJsLib.MakerJsNs.IMeasure = js.native
  /**
    * Find out if two angles are equal.
    *
    * @param angleA First angle.
    * @param angleB Second angle.
    * @returns true if angles are the same, false if they are not
    */
  def isAngleEqual(angleA: scala.Double, angleB: scala.Double): scala.Boolean = js.native
  def isAngleEqual(angleA: scala.Double, angleB: scala.Double, accuracy: scala.Double): scala.Boolean = js.native
  /**
    * Check for arc being concave or convex towards a given point.
    *
    * @param arc The arc to test.
    * @param towardsPoint The point to test.
    * @returns Boolean true if arc is concave towards point.
    */
  def isArcConcaveTowardsPoint(arc: makerDotJsLib.MakerJsNs.IPathArc, towardsPoint: makerDotJsLib.MakerJsNs.IPoint): scala.Boolean = js.native
  /**
    * Check for arc overlapping another arc.
    *
    * @param arcA The arc to test.
    * @param arcB The arc to check for overlap.
    * @param excludeTangents Boolean to exclude exact endpoints and only look for deep overlaps.
    * @returns Boolean true if arcA is overlapped with arcB.
    */
  def isArcOverlapping(
    arcA: makerDotJsLib.MakerJsNs.IPathArc,
    arcB: makerDotJsLib.MakerJsNs.IPathArc,
    excludeTangents: scala.Boolean
  ): scala.Boolean = js.native
  /**
    * Check if a given number is between two given limits.
    *
    * @param valueInQuestion The number to test.
    * @param limitA First limit.
    * @param limitB Second limit.
    * @param exclusive Flag to exclude equaling the limits.
    * @returns Boolean true if value is between (or equal to) the limits.
    */
  def isBetween(
    valueInQuestion: scala.Double,
    limitA: scala.Double,
    limitB: scala.Double,
    exclusive: scala.Boolean
  ): scala.Boolean = js.native
  /**
    * Check if a given angle is between an arc's start and end angles.
    *
    * @param angleInQuestion The angle to test.
    * @param arc Arc to test against.
    * @param exclusive Flag to exclude equaling the start or end angles.
    * @returns Boolean true if angle is between (or equal to) the arc's start and end angles.
    */
  def isBetweenArcAngles(angleInQuestion: scala.Double, arc: makerDotJsLib.MakerJsNs.IPathArc, exclusive: scala.Boolean): scala.Boolean = js.native
  /**
    * Check if a given point is between a line's end points.
    *
    * @param pointInQuestion The point to test.
    * @param line Line to test against.
    * @param exclusive Flag to exclude equaling the origin or end points.
    * @returns Boolean true if point is between (or equal to) the line's origin and end points.
    */
  def isBetweenPoints(
    pointInQuestion: makerDotJsLib.MakerJsNs.IPoint,
    line: makerDotJsLib.MakerJsNs.IPathLine,
    exclusive: scala.Boolean
  ): scala.Boolean = js.native
  /**
    * Check if a given bezier seed is simply a line.
    *
    * @param seed The bezier seed to test.
    * @returns Boolean true if bezier seed has control points on the line slope and between the line endpoints.
    */
  def isBezierSeedLinear(seed: makerDotJsLib.MakerJsNs.IPathBezierSeed): scala.Boolean = js.native
  /**
    * Check for line overlapping another line.
    *
    * @param lineA The line to test.
    * @param lineB The line to check for overlap.
    * @param excludeTangents Boolean to exclude exact endpoints and only look for deep overlaps.
    * @returns Boolean true if lineA is overlapped with lineB.
    */
  def isLineOverlapping(
    lineA: makerDotJsLib.MakerJsNs.IPathLine,
    lineB: makerDotJsLib.MakerJsNs.IPathLine,
    excludeTangents: scala.Boolean
  ): scala.Boolean = js.native
  /**
    * Check for measurement overlapping another measurement.
    *
    * @param measureA The measurement to test.
    * @param measureB The measurement to check for overlap.
    * @returns Boolean true if measureA is overlapped with measureB.
    */
  def isMeasurementOverlapping(measureA: makerDotJsLib.MakerJsNs.IMeasure, measureB: makerDotJsLib.MakerJsNs.IMeasure): scala.Boolean = js.native
  /**
    * Find out if two paths are equal.
    *
    * @param pathA First path.
    * @param pathB Second path.
    * @returns true if paths are the same, false if they are not
    */
  def isPathEqual(pathA: makerDotJsLib.MakerJsNs.IPath, pathB: makerDotJsLib.MakerJsNs.IPath): scala.Boolean = js.native
  def isPathEqual(
    pathA: makerDotJsLib.MakerJsNs.IPath,
    pathB: makerDotJsLib.MakerJsNs.IPath,
    withinPointDistance: scala.Double
  ): scala.Boolean = js.native
  def isPathEqual(
    pathA: makerDotJsLib.MakerJsNs.IPath,
    pathB: makerDotJsLib.MakerJsNs.IPath,
    withinPointDistance: scala.Double,
    pathAOffset: makerDotJsLib.MakerJsNs.IPoint
  ): scala.Boolean = js.native
  def isPathEqual(
    pathA: makerDotJsLib.MakerJsNs.IPath,
    pathB: makerDotJsLib.MakerJsNs.IPath,
    withinPointDistance: scala.Double,
    pathAOffset: makerDotJsLib.MakerJsNs.IPoint,
    pathBOffset: makerDotJsLib.MakerJsNs.IPoint
  ): scala.Boolean = js.native
  /**
    * Find out if two points are equal.
    *
    * @param a First point.
    * @param b Second point.
    * @returns true if points are the same, false if they are not
    */
  def isPointEqual(a: makerDotJsLib.MakerJsNs.IPoint, b: makerDotJsLib.MakerJsNs.IPoint): scala.Boolean = js.native
  def isPointEqual(a: makerDotJsLib.MakerJsNs.IPoint, b: makerDotJsLib.MakerJsNs.IPoint, withinDistance: scala.Double): scala.Boolean = js.native
  /**
    * Find out if point is on a slope.
    *
    * @param p Point to check.
    * @param b Slope.
    * @returns true if point is on the slope
    */
  def isPointOnSlope(p: makerDotJsLib.MakerJsNs.IPoint, slope: makerDotJsLib.MakerJsNs.ISlope): scala.Boolean = js.native
  def isPointOnSlope(
    p: makerDotJsLib.MakerJsNs.IPoint,
    slope: makerDotJsLib.MakerJsNs.ISlope,
    withinDistance: scala.Double
  ): scala.Boolean = js.native
  /**
    * Check for slope equality.
    *
    * @param slopeA The ISlope to test.
    * @param slopeB The ISlope to check for equality.
    * @returns Boolean true if slopes are equal.
    */
  def isSlopeEqual(slopeA: makerDotJsLib.MakerJsNs.ISlope, slopeB: makerDotJsLib.MakerJsNs.ISlope): scala.Boolean = js.native
  /**
    * Gets the slope of a line.
    */
  def lineSlope(line: makerDotJsLib.MakerJsNs.IPathLine): makerDotJsLib.MakerJsNs.ISlope = js.native
  /**
    * Measures the smallest rectangle which contains a model.
    *
    * @param modelToMeasure The model to measure.
    * @param atlas Optional atlas to save measurements.
    * @returns object with low and high points.
    */
  def modelExtents(modelToMeasure: makerDotJsLib.MakerJsNs.IModel): makerDotJsLib.MakerJsNs.IMeasureWithCenter = js.native
  def modelExtents(modelToMeasure: makerDotJsLib.MakerJsNs.IModel, atlas: Atlas): makerDotJsLib.MakerJsNs.IMeasureWithCenter = js.native
  /**
    * Calculates the smallest rectangle which contains a path.
    *
    * @param pathToMeasure The path to measure.
    * @returns object with low and high points.
    */
  def pathExtents(pathToMeasure: makerDotJsLib.MakerJsNs.IPath): makerDotJsLib.MakerJsNs.IMeasure = js.native
  def pathExtents(pathToMeasure: makerDotJsLib.MakerJsNs.IPath, addOffset: makerDotJsLib.MakerJsNs.IPoint): makerDotJsLib.MakerJsNs.IMeasure = js.native
  /**
    * Measures the length of a path.
    *
    * @param pathToMeasure The path to measure.
    * @returns Length of the path.
    */
  def pathLength(pathToMeasure: makerDotJsLib.MakerJsNs.IPath): scala.Double = js.native
  /**
    * Calculates the distance between two points.
    *
    * @param a First point.
    * @param b Second point.
    * @returns Distance between points.
    */
  def pointDistance(a: makerDotJsLib.MakerJsNs.IPoint, b: makerDotJsLib.MakerJsNs.IPoint): scala.Double = js.native
}


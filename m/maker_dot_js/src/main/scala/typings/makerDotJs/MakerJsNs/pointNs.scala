package typings.makerDotJs.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.point")
@js.native
object pointNs extends js.Object {
  /**
    * Add two points together and return the result as a new point object.
    *
    * @param a First point.
    * @param b Second point.
    * @param subtract Optional boolean to subtract instead of add.
    * @returns A new point object.
    */
  def add(a: IPoint, b: IPoint): IPoint = js.native
  def add(a: IPoint, b: IPoint, subtract: Boolean): IPoint = js.native
  /**
    * Get the average of two points.
    *
    * @param a First point.
    * @param b Second point.
    * @returns New point object which is the average of a and b.
    */
  def average(a: IPoint, b: IPoint): IPoint = js.native
  /**
    * Clone a point into a new point.
    *
    * @param pointToClone The point to clone.
    * @returns A new point with same values as the original.
    */
  def clone(pointToClone: IPoint): IPoint = js.native
  /**
    * From an array of points, find the closest point to a given reference point.
    *
    * @param referencePoint The reference point.
    * @param pointOptions Array of points to choose from.
    * @returns The first closest point from the pointOptions.
    */
  def closest(referencePoint: IPoint, pointOptions: js.Array[IPoint]): IPoint = js.native
  /**
    * Distort a point's coordinates.
    *
    * @param pointToDistort The point to distort.
    * @param scaleX The amount of x scaling.
    * @param scaleY The amount of y scaling.
    * @returns A new point.
    */
  def distort(pointToDistort: IPoint, scaleX: Double, scaleY: Double): IPoint = js.native
  /**
    * Get a point on a circle or arc path, at a given angle.
    * @param angleInDegrees The angle at which you want to find the point, in degrees.
    * @param circle A circle or arc.
    * @returns A new point object.
    */
  def fromAngleOnCircle(angleInDegrees: Double, circle: IPathCircle): IPoint = js.native
  /**
    * Get the two end points of an arc path.
    *
    * @param arc The arc path object.
    * @returns Array with 2 elements: [0] is the point object corresponding to the start angle, [1] is the point object corresponding to the end angle.
    */
  def fromArc(arc: IPathArc): js.Array[IPoint] = js.native
  /**
    * Get the two end points of a path.
    *
    * @param pathContext The path object.
    * @returns Array with 2 elements: [0] is the point object corresponding to the origin, [1] is the point object corresponding to the end.
    */
  def fromPathEnds(pathContext: IPath): js.Array[IPoint] = js.native
  def fromPathEnds(pathContext: IPath, pathOffset: IPoint): js.Array[IPoint] = js.native
  /**
    * Get a point from its polar coordinates.
    *
    * @param angleInRadians The angle of the polar coordinate, in radians.
    * @param radius The radius of the polar coordinate.
    * @returns A new point object.
    */
  def fromPolar(angleInRadians: Double, radius: Double): IPoint = js.native
  /**
    * Calculates the intersection of slopes of two lines.
    *
    * @param lineA First line to use for slope.
    * @param lineB Second line to use for slope.
    * @param options Optional IPathIntersectionOptions.
    * @returns point of intersection of the two slopes, or null if the slopes did not intersect.
    */
  def fromSlopeIntersection(lineA: IPathLine, lineB: IPathLine): IPoint = js.native
  def fromSlopeIntersection(lineA: IPathLine, lineB: IPathLine, options: IPathIntersectionBaseOptions): IPoint = js.native
  /**
    * Get the middle point of a path.
    *
    * @param pathContext The path object.
    * @param ratio Optional ratio (between 0 and 1) of point along the path. Default is .5 for middle.
    * @returns Point on the path, in the middle of the path.
    */
  def middle(pathContext: IPath): IPoint = js.native
  def middle(pathContext: IPath, ratio: Double): IPoint = js.native
  /**
    * Create a clone of a point, mirrored on either or both x and y axes.
    *
    * @param pointToMirror The point to mirror.
    * @param mirrorX Boolean to mirror on the x axis.
    * @param mirrorY Boolean to mirror on the y axis.
    * @returns Mirrored point.
    */
  def mirror(pointToMirror: IPoint, mirrorX: Boolean, mirrorY: Boolean): IPoint = js.native
  /**
    * Rotate a point.
    *
    * @param pointToRotate The point to rotate.
    * @param angleInDegrees The amount of rotation, in degrees.
    * @param rotationOrigin The center point of rotation.
    * @returns A new point.
    */
  def rotate(pointToRotate: IPoint, angleInDegrees: Double): IPoint = js.native
  def rotate(pointToRotate: IPoint, angleInDegrees: Double, rotationOrigin: IPoint): IPoint = js.native
  /**
    * Round the values of a point.
    *
    * @param pointContext The point to serialize.
    * @param accuracy Optional exemplar number of decimal places.
    * @returns A new point with the values rounded.
    */
  def rounded(pointContext: IPoint): IPoint = js.native
  def rounded(pointContext: IPoint, accuracy: Double): IPoint = js.native
  /**
    * Scale a point's coordinates.
    *
    * @param pointToScale The point to scale.
    * @param scaleValue The amount of scaling.
    * @returns A new point.
    */
  def scale(pointToScale: IPoint, scaleValue: Double): IPoint = js.native
  /**
    * Subtract a point from another point, and return the result as a new point. Shortcut to Add(a, b, subtract = true).
    *
    * @param a First point.
    * @param b Second point.
    * @returns A new point object.
    */
  def subtract(a: IPoint, b: IPoint): IPoint = js.native
  /**
    * A point at 0,0 coordinates.
    * NOTE: It is important to call this as a method, with the empty parentheses.
    *
    * @returns A new point.
    */
  def zero(): IPoint = js.native
}


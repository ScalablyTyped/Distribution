package typings.makerJs.global.MakerJs

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IPath
import typings.makerJs.MakerJs.IPathArc
import typings.makerJs.MakerJs.IPathIntersection
import typings.makerJs.MakerJs.IPathIntersectionOptions
import typings.makerJs.MakerJs.IPathLine
import typings.makerJs.MakerJs.IPoint
import typings.makerJs.MakerJs.IPointMatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MakerJs.path")
@js.native
object path extends js.Object {
  
  /**
    * Breaks a path in two. The supplied path will end at the supplied pointOfBreak,
    * a new path is returned which begins at the pointOfBreak and ends at the supplied path's initial end point.
    * For Circle, the original path will be converted in place to an Arc, and null is returned.
    *
    * @param pathToBreak The path to break.
    * @param pointOfBreak The point at which to break the path.
    * @returns A new path of the same type, when path type is line or arc. Returns null for circle.
    */
  def breakAtPoint(pathToBreak: IPath, pointOfBreak: IPoint): IPath = js.native
  
  /**
    * Center a path at [0, 0].
    *
    * @param pathToCenter The path to center.
    */
  def center(pathToCenter: IPath): IPath = js.native
  
  /**
    * Create a clone of a path. This is faster than cloneObject.
    *
    * @param pathToClone The path to clone.
    * @returns Cloned path.
    */
  def clone(pathToClone: IPath): IPath = js.native
  
  /**
    * Connect 2 lines at their slope intersection point.
    *
    * @param lineA First line to converge.
    * @param lineB Second line to converge.
    * @param useOriginA Optional flag to converge the origin point of lineA instead of the end point.
    * @param useOriginB Optional flag to converge the origin point of lineB instead of the end point.
    */
  def converge(lineA: IPathLine, lineB: IPathLine): IPoint = js.native
  def converge(lineA: IPathLine, lineB: IPathLine, useOriginA: js.UndefOr[scala.Nothing], useOriginB: Boolean): IPoint = js.native
  def converge(lineA: IPathLine, lineB: IPathLine, useOriginA: Boolean): IPoint = js.native
  def converge(lineA: IPathLine, lineB: IPathLine, useOriginA: Boolean, useOriginB: Boolean): IPoint = js.native
  
  /**
    * Distort a path - scale x and y individually.
    *
    * @param pathToDistort The path to distort.
    * @param scaleX The amount of x scaling.
    * @param scaleY The amount of y scaling.
    * @returns A new IModel (for circles and arcs) or IPath (for lines and bezier seeds).
    */
  def distort(pathToDistort: IPath, scaleX: Double, scaleY: Double): IModel | IPath = js.native
  
  /**
    * Adds a round corner to the outside angle between 2 lines. The lines must meet at one point.
    *
    * @param lineA First line to fillet, which will be modified to fit the fillet.
    * @param lineB Second line to fillet, which will be modified to fit the fillet.
    * @returns Arc path object of the new fillet.
    */
  def dogbone(lineA: IPathLine, lineB: IPathLine, filletRadius: Double): IPathArc = js.native
  def dogbone(lineA: IPathLine, lineB: IPathLine, filletRadius: Double, options: IPointMatchOptions): IPathArc = js.native
  
  /**
    * Expand path by creating a model which surrounds it.
    *
    * @param pathToExpand Path to expand.
    * @param expansion Distance to expand.
    * @param isolateCaps Optional flag to put the end caps into a separate model named "caps".
    * @returns Model which surrounds the path.
    */
  def expand(pathToExpand: IPath, expansion: Double): IModel = js.native
  def expand(pathToExpand: IPath, expansion: Double, isolateCaps: Boolean): IModel = js.native
  
  /**
    * Adds a round corner to the inside angle between 2 paths. The paths must meet at one point.
    *
    * @param pathA First path to fillet, which will be modified to fit the fillet.
    * @param pathB Second path to fillet, which will be modified to fit the fillet.
    * @param filletRadius Radius of the fillet.
    * @param options Optional IPointMatchOptions object to specify pointMatchingDistance.
    * @returns Arc path object of the new fillet.
    */
  def fillet(pathA: IPath, pathB: IPath, filletRadius: Double): IPathArc = js.native
  def fillet(pathA: IPath, pathB: IPath, filletRadius: Double, options: IPointMatchOptions): IPathArc = js.native
  
  /**
    * Find the point(s) where 2 paths intersect.
    *
    * @param path1 First path to find intersection.
    * @param path2 Second path to find intersection.
    * @param options Optional IPathIntersectionOptions.
    * @returns IPathIntersection object, with points(s) of intersection (and angles, when a path is an arc or circle); or null if the paths did not intersect.
    */
  def intersection(path1: IPath, path2: IPath): IPathIntersection = js.native
  def intersection(path1: IPath, path2: IPath, options: IPathIntersectionOptions): IPathIntersection = js.native
  
  /**
    * Create a clone of a path, mirrored on either or both x and y axes.
    *
    * @param pathToMirror The path to mirror.
    * @param mirrorX Boolean to mirror on the x axis.
    * @param mirrorY Boolean to mirror on the y axis.
    * @returns Mirrored path.
    */
  def mirror(pathToMirror: IPath, mirrorX: Boolean, mirrorY: Boolean): IPath = js.native
  
  /**
    * Move a path to an absolute point.
    *
    * @param pathToMove The path to move.
    * @param origin The new origin for the path.
    * @returns The original path (for cascading).
    */
  def move(pathToMove: IPath, origin: IPoint): IPath = js.native
  
  /**
    * Move a path's origin by a relative amount.
    *
    * @param pathToMove The path to move.
    * @param delta The x & y adjustments as a point object.
    * @param subtract Optional boolean to subtract instead of add.
    * @returns The original path (for cascading).
    */
  def moveRelative(pathToMove: IPath, delta: IPoint): IPath = js.native
  def moveRelative(pathToMove: IPath, delta: IPoint, subtract: Boolean): IPath = js.native
  
  /**
    * Move some paths relatively during a task execution, then unmove them.
    *
    * @param pathsToMove The paths to move.
    * @param deltas The x & y adjustments as a point object array.
    * @param task The function to call while the paths are temporarily moved.
    */
  def moveTemporary(pathsToMove: js.Array[IPath], deltas: js.Array[IPoint], task: js.Function): Unit = js.native
  
  /**
    * Rotate a path.
    *
    * @param pathToRotate The path to rotate.
    * @param angleInDegrees The amount of rotation, in degrees.
    * @param rotationOrigin The center point of rotation.
    * @returns The original path (for cascading).
    */
  def rotate(pathToRotate: IPath, angleInDegrees: Double): IPath = js.native
  def rotate(pathToRotate: IPath, angleInDegrees: Double, rotationOrigin: IPoint): IPath = js.native
  
  /**
    * Scale a path.
    *
    * @param pathToScale The path to scale.
    * @param scaleValue The amount of scaling.
    * @returns The original path (for cascading).
    */
  def scale(pathToScale: IPath, scaleValue: Double): IPath = js.native
  
  /**
    * Represent an arc using straight lines.
    *
    * @param arc Arc to straighten.
    * @param bevel Optional flag to bevel the angle to prevent it from being too sharp.
    * @param prefix Optional string prefix to apply to path ids.
    * @param close Optional flag to make a closed geometry by connecting the endpoints.
    * @returns Model of straight lines with same endpoints as the arc.
    */
  def straighten(arc: IPathArc): IModel = js.native
  def straighten(arc: IPathArc, bevel: js.UndefOr[scala.Nothing], prefix: js.UndefOr[scala.Nothing], close: Boolean): IModel = js.native
  def straighten(arc: IPathArc, bevel: js.UndefOr[scala.Nothing], prefix: String): IModel = js.native
  def straighten(arc: IPathArc, bevel: js.UndefOr[scala.Nothing], prefix: String, close: Boolean): IModel = js.native
  def straighten(arc: IPathArc, bevel: Boolean): IModel = js.native
  def straighten(arc: IPathArc, bevel: Boolean, prefix: js.UndefOr[scala.Nothing], close: Boolean): IModel = js.native
  def straighten(arc: IPathArc, bevel: Boolean, prefix: String): IModel = js.native
  def straighten(arc: IPathArc, bevel: Boolean, prefix: String, close: Boolean): IModel = js.native
  
  /**
    * Get key points (a minimal a number of points) along a path.
    *
    * @param pathContext Path to get points from.
    * @param maxArcFacet Optional maximum length between points on an arc or circle.
    * @returns Array of points which are on the path.
    */
  def toKeyPoints(pathContext: IPath): js.Array[IPoint] = js.native
  def toKeyPoints(pathContext: IPath, maxArcFacet: Double): js.Array[IPoint] = js.native
  
  /**
    * Get points along a path.
    *
    * @param pathContext Path to get points from.
    * @param numberOfPoints Number of points to divide the path.
    * @returns Array of points which are on the path spread at a uniform interval.
    */
  def toPoints(pathContext: IPath, numberOfPoints: Double): js.Array[IPoint] = js.native
  
  /**
    * Move a path so its bounding box begins at [0, 0].
    *
    * @param pathToZero The path to zero.
    */
  def zero(pathToZero: IPath): IPath = js.native
}

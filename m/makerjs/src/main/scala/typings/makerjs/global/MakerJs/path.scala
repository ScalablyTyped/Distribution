package typings.makerjs.global.MakerJs

import typings.makerjs.MakerJs.IModel
import typings.makerjs.MakerJs.IPath
import typings.makerjs.MakerJs.IPathArc
import typings.makerjs.MakerJs.IPathIntersection
import typings.makerjs.MakerJs.IPathIntersectionOptions
import typings.makerjs.MakerJs.IPathLine
import typings.makerjs.MakerJs.IPoint
import typings.makerjs.MakerJs.IPointMatchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object path {
  
  @JSGlobal("MakerJs.path")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Add a path to a model. This is basically equivalent to:
    * ```
    * parentModel.paths[pathId] = childPath;
    * ```
    * with additional checks to make it safe for cascading.
    *
    * @param childPath The path to add.
    * @param parentModel The model to add to.
    * @param pathId The id of the path.
    * @param overwrite Optional flag to overwrite any path referenced by pathId. Default is false, which will create an id similar to pathId.
    * @returns The original path (for cascading).
    */
  inline def addTo(childPath: IPath, parentModel: IModel, pathId: String): IPath = (^.asInstanceOf[js.Dynamic].applyDynamic("addTo")(childPath.asInstanceOf[js.Any], parentModel.asInstanceOf[js.Any], pathId.asInstanceOf[js.Any])).asInstanceOf[IPath]
  inline def addTo(childPath: IPath, parentModel: IModel, pathId: String, overwrite: Boolean): IPath = (^.asInstanceOf[js.Dynamic].applyDynamic("addTo")(childPath.asInstanceOf[js.Any], parentModel.asInstanceOf[js.Any], pathId.asInstanceOf[js.Any], overwrite.asInstanceOf[js.Any])).asInstanceOf[IPath]
  
  /**
    * Alter a path by lengthening or shortening it.
    *
    * @param pathToAlter Path to alter.
    * @param distance Numeric amount of length to add or remove from the path. Use a positive number to lengthen, negative to shorten. When shortening: this function will not alter the path and will return null if the resulting path length is less than or equal to zero.
    * @param useOrigin Optional flag to alter from the origin instead of the end of the path.
    * @returns The original path (for cascading), or null if the path could not be altered.
    */
  inline def alterLength(pathToAlter: IPath, distance: Double): IPath = (^.asInstanceOf[js.Dynamic].applyDynamic("alterLength")(pathToAlter.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[IPath]
  inline def alterLength(pathToAlter: IPath, distance: Double, useOrigin: Boolean): IPath = (^.asInstanceOf[js.Dynamic].applyDynamic("alterLength")(pathToAlter.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], useOrigin.asInstanceOf[js.Any])).asInstanceOf[IPath]
  
  /**
    * Breaks a path in two. The supplied path will end at the supplied pointOfBreak,
    * a new path is returned which begins at the pointOfBreak and ends at the supplied path's initial end point.
    * For Circle, the original path will be converted in place to an Arc, and null is returned.
    *
    * @param pathToBreak The path to break.
    * @param pointOfBreak The point at which to break the path.
    * @returns A new path of the same type, when path type is line or arc. Returns null for circle.
    */
  inline def breakAtPoint(pathToBreak: IPath, pointOfBreak: IPoint): IPath = (^.asInstanceOf[js.Dynamic].applyDynamic("breakAtPoint")(pathToBreak.asInstanceOf[js.Any], pointOfBreak.asInstanceOf[js.Any])).asInstanceOf[IPath]
  
  /**
    * Center a path at [0, 0].
    *
    * @param pathToCenter The path to center.
    * @returns The original path (for cascading).
    */
  inline def center(pathToCenter: IPath): IPath = ^.asInstanceOf[js.Dynamic].applyDynamic("center")(pathToCenter.asInstanceOf[js.Any]).asInstanceOf[IPath]
  
  /**
    * Create a clone of a path. This is faster than cloneObject.
    *
    * @param pathToClone The path to clone.
    * @param offset Optional point to move path a relative distance.
    * @returns Cloned path.
    */
  inline def clone_(pathToClone: IPath): IPath = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(pathToClone.asInstanceOf[js.Any]).asInstanceOf[IPath]
  inline def clone_(pathToClone: IPath, offset: IPoint): IPath = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(pathToClone.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[IPath]
  
  /**
    * Connect 2 lines at their slope intersection point.
    *
    * @param lineA First line to converge.
    * @param lineB Second line to converge.
    * @param useOriginA Optional flag to converge the origin point of lineA instead of the end point.
    * @param useOriginB Optional flag to converge the origin point of lineB instead of the end point.
    * @returns point of convergence.
    */
  inline def converge(lineA: IPathLine, lineB: IPathLine): IPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("converge")(lineA.asInstanceOf[js.Any], lineB.asInstanceOf[js.Any])).asInstanceOf[IPoint]
  inline def converge(lineA: IPathLine, lineB: IPathLine, useOriginA: Boolean): IPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("converge")(lineA.asInstanceOf[js.Any], lineB.asInstanceOf[js.Any], useOriginA.asInstanceOf[js.Any])).asInstanceOf[IPoint]
  inline def converge(lineA: IPathLine, lineB: IPathLine, useOriginA: Boolean, useOriginB: Boolean): IPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("converge")(lineA.asInstanceOf[js.Any], lineB.asInstanceOf[js.Any], useOriginA.asInstanceOf[js.Any], useOriginB.asInstanceOf[js.Any])).asInstanceOf[IPoint]
  inline def converge(lineA: IPathLine, lineB: IPathLine, useOriginA: Unit, useOriginB: Boolean): IPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("converge")(lineA.asInstanceOf[js.Any], lineB.asInstanceOf[js.Any], useOriginA.asInstanceOf[js.Any], useOriginB.asInstanceOf[js.Any])).asInstanceOf[IPoint]
  
  /**
    * Copy the schema properties of one path to another.
    *
    * @param srcPath The source path to copy property values from.
    * @param destPath The destination path to copy property values to.
    * @returns The source path.
    */
  inline def copyProps(srcPath: IPath, destPath: IPath): IPath = (^.asInstanceOf[js.Dynamic].applyDynamic("copyProps")(srcPath.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any])).asInstanceOf[IPath]
  
  /**
    * Distort a path - scale x and y individually.
    *
    * @param pathToDistort The path to distort.
    * @param scaleX The amount of x scaling.
    * @param scaleY The amount of y scaling.
    * @returns A new IModel (for circles and arcs) or IPath (for lines and bezier seeds).
    */
  inline def distort(pathToDistort: IPath, scaleX: Double, scaleY: Double): IModel | IPath = (^.asInstanceOf[js.Dynamic].applyDynamic("distort")(pathToDistort.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any])).asInstanceOf[IModel | IPath]
  
  /**
    * Adds a round corner to the outside angle between 2 lines. The lines must meet at one point.
    *
    * @param lineA First line to fillet, which will be modified to fit the fillet.
    * @param lineB Second line to fillet, which will be modified to fit the fillet.
    * @returns Arc path object of the new fillet.
    */
  inline def dogbone(lineA: IPathLine, lineB: IPathLine, filletRadius: Double): IPathArc = (^.asInstanceOf[js.Dynamic].applyDynamic("dogbone")(lineA.asInstanceOf[js.Any], lineB.asInstanceOf[js.Any], filletRadius.asInstanceOf[js.Any])).asInstanceOf[IPathArc]
  inline def dogbone(lineA: IPathLine, lineB: IPathLine, filletRadius: Double, options: IPointMatchOptions): IPathArc = (^.asInstanceOf[js.Dynamic].applyDynamic("dogbone")(lineA.asInstanceOf[js.Any], lineB.asInstanceOf[js.Any], filletRadius.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPathArc]
  
  /**
    * Expand path by creating a model which surrounds it.
    *
    * @param pathToExpand Path to expand.
    * @param expansion Distance to expand.
    * @param isolateCaps Optional flag to put the end caps into a separate model named "caps".
    * @returns Model which surrounds the path.
    */
  inline def expand(pathToExpand: IPath, expansion: Double): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(pathToExpand.asInstanceOf[js.Any], expansion.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def expand(pathToExpand: IPath, expansion: Double, isolateCaps: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(pathToExpand.asInstanceOf[js.Any], expansion.asInstanceOf[js.Any], isolateCaps.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Adds a round corner to the inside angle between 2 paths. The paths must meet at one point.
    *
    * @param pathA First path to fillet, which will be modified to fit the fillet.
    * @param pathB Second path to fillet, which will be modified to fit the fillet.
    * @param filletRadius Radius of the fillet.
    * @param options Optional IPointMatchOptions object to specify pointMatchingDistance.
    * @returns Arc path object of the new fillet.
    */
  inline def fillet(pathA: IPath, pathB: IPath, filletRadius: Double): IPathArc = (^.asInstanceOf[js.Dynamic].applyDynamic("fillet")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any], filletRadius.asInstanceOf[js.Any])).asInstanceOf[IPathArc]
  inline def fillet(pathA: IPath, pathB: IPath, filletRadius: Double, options: IPointMatchOptions): IPathArc = (^.asInstanceOf[js.Dynamic].applyDynamic("fillet")(pathA.asInstanceOf[js.Any], pathB.asInstanceOf[js.Any], filletRadius.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPathArc]
  
  /**
    * Find the point(s) where 2 paths intersect.
    *
    * @param path1 First path to find intersection.
    * @param path2 Second path to find intersection.
    * @param options Optional IPathIntersectionOptions.
    * @returns IPathIntersection object, with points(s) of intersection (and angles, when a path is an arc or circle); or null if the paths did not intersect.
    */
  inline def intersection(path1: IPath, path2: IPath): IPathIntersection = (^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(path1.asInstanceOf[js.Any], path2.asInstanceOf[js.Any])).asInstanceOf[IPathIntersection]
  inline def intersection(path1: IPath, path2: IPath, options: IPathIntersectionOptions): IPathIntersection = (^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(path1.asInstanceOf[js.Any], path2.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPathIntersection]
  
  /**
    * Set the layer of a path. This is equivalent to:
    * ```
    * pathContext.layer = layer;
    * ```
    *
    * @param pathContext The path to set the layer.
    * @param layer The layer name.
    * @returns The original path (for cascading).
    */
  inline def layer(pathContext: IPath, layer: String): IPath = (^.asInstanceOf[js.Dynamic].applyDynamic("layer")(pathContext.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[IPath]
  
  /**
    * Create a clone of a path, mirrored on either or both x and y axes.
    *
    * @param pathToMirror The path to mirror.
    * @param mirrorX Boolean to mirror on the x axis.
    * @param mirrorY Boolean to mirror on the y axis.
    * @returns Mirrored path.
    */
  inline def mirror(pathToMirror: IPath, mirrorX: Boolean, mirrorY: Boolean): IPath = (^.asInstanceOf[js.Dynamic].applyDynamic("mirror")(pathToMirror.asInstanceOf[js.Any], mirrorX.asInstanceOf[js.Any], mirrorY.asInstanceOf[js.Any])).asInstanceOf[IPath]
  
  /**
    * Move a path to an absolute point.
    *
    * @param pathToMove The path to move.
    * @param origin The new origin for the path.
    * @returns The original path (for cascading).
    */
  inline def move(pathToMove: IPath, origin: IPoint): IPath = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(pathToMove.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[IPath]
  
  /**
    * Move a path's origin by a relative amount.
    *
    * @param pathToMove The path to move.
    * @param delta The x & y adjustments as a point object.
    * @param subtract Optional boolean to subtract instead of add.
    * @returns The original path (for cascading).
    */
  inline def moveRelative(pathToMove: IPath, delta: IPoint): IPath = (^.asInstanceOf[js.Dynamic].applyDynamic("moveRelative")(pathToMove.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[IPath]
  inline def moveRelative(pathToMove: IPath, delta: IPoint, subtract: Boolean): IPath = (^.asInstanceOf[js.Dynamic].applyDynamic("moveRelative")(pathToMove.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], subtract.asInstanceOf[js.Any])).asInstanceOf[IPath]
  
  /**
    * Move some paths relatively during a task execution, then unmove them.
    *
    * @param pathsToMove The paths to move.
    * @param deltas The x & y adjustments as a point object array.
    * @param task The function to call while the paths are temporarily moved.
    */
  inline def moveTemporary(pathsToMove: js.Array[IPath], deltas: js.Array[IPoint], task: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("moveTemporary")(pathsToMove.asInstanceOf[js.Any], deltas.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Rotate a path.
    *
    * @param pathToRotate The path to rotate.
    * @param angleInDegrees The amount of rotation, in degrees.
    * @param rotationOrigin The center point of rotation.
    * @returns The original path (for cascading).
    */
  inline def rotate(pathToRotate: IPath, angleInDegrees: Double): IPath = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(pathToRotate.asInstanceOf[js.Any], angleInDegrees.asInstanceOf[js.Any])).asInstanceOf[IPath]
  inline def rotate(pathToRotate: IPath, angleInDegrees: Double, rotationOrigin: IPoint): IPath = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(pathToRotate.asInstanceOf[js.Any], angleInDegrees.asInstanceOf[js.Any], rotationOrigin.asInstanceOf[js.Any])).asInstanceOf[IPath]
  
  /**
    * Scale a path.
    *
    * @param pathToScale The path to scale.
    * @param scaleValue The amount of scaling.
    * @returns The original path (for cascading).
    */
  inline def scale(pathToScale: IPath, scaleValue: Double): IPath = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(pathToScale.asInstanceOf[js.Any], scaleValue.asInstanceOf[js.Any])).asInstanceOf[IPath]
  
  /**
    * Represent an arc using straight lines.
    *
    * @param arc Arc to straighten.
    * @param bevel Optional flag to bevel the angle to prevent it from being too sharp.
    * @param prefix Optional string prefix to apply to path ids.
    * @param close Optional flag to make a closed geometry by connecting the endpoints.
    * @returns Model of straight lines with same endpoints as the arc.
    */
  inline def straighten(arc: IPathArc): IModel = ^.asInstanceOf[js.Dynamic].applyDynamic("straighten")(arc.asInstanceOf[js.Any]).asInstanceOf[IModel]
  inline def straighten(arc: IPathArc, bevel: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("straighten")(arc.asInstanceOf[js.Any], bevel.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def straighten(arc: IPathArc, bevel: Boolean, prefix: String): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("straighten")(arc.asInstanceOf[js.Any], bevel.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def straighten(arc: IPathArc, bevel: Boolean, prefix: String, close: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("straighten")(arc.asInstanceOf[js.Any], bevel.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], close.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def straighten(arc: IPathArc, bevel: Boolean, prefix: Unit, close: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("straighten")(arc.asInstanceOf[js.Any], bevel.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], close.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def straighten(arc: IPathArc, bevel: Unit, prefix: String): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("straighten")(arc.asInstanceOf[js.Any], bevel.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def straighten(arc: IPathArc, bevel: Unit, prefix: String, close: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("straighten")(arc.asInstanceOf[js.Any], bevel.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], close.asInstanceOf[js.Any])).asInstanceOf[IModel]
  inline def straighten(arc: IPathArc, bevel: Unit, prefix: Unit, close: Boolean): IModel = (^.asInstanceOf[js.Dynamic].applyDynamic("straighten")(arc.asInstanceOf[js.Any], bevel.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], close.asInstanceOf[js.Any])).asInstanceOf[IModel]
  
  /**
    * Get key points (a minimal a number of points) along a path.
    *
    * @param pathContext Path to get points from.
    * @param maxArcFacet Optional maximum length between points on an arc or circle.
    * @returns Array of points which are on the path.
    */
  inline def toKeyPoints(pathContext: IPath): js.Array[IPoint] = ^.asInstanceOf[js.Dynamic].applyDynamic("toKeyPoints")(pathContext.asInstanceOf[js.Any]).asInstanceOf[js.Array[IPoint]]
  inline def toKeyPoints(pathContext: IPath, maxArcFacet: Double): js.Array[IPoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("toKeyPoints")(pathContext.asInstanceOf[js.Any], maxArcFacet.asInstanceOf[js.Any])).asInstanceOf[js.Array[IPoint]]
  
  /**
    * Get points along a path.
    *
    * @param pathContext Path to get points from.
    * @param numberOfPoints Number of points to divide the path.
    * @returns Array of points which are on the path spread at a uniform interval.
    */
  inline def toPoints(pathContext: IPath, numberOfPoints: Double): js.Array[IPoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPoints")(pathContext.asInstanceOf[js.Any], numberOfPoints.asInstanceOf[js.Any])).asInstanceOf[js.Array[IPoint]]
  
  /**
    * Move a path so its bounding box begins at [0, 0].
    *
    * @param pathToZero The path to zero.
    * @returns The original path (for cascading).
    */
  inline def zero(pathToZero: IPath): IPath = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")(pathToZero.asInstanceOf[js.Any]).asInstanceOf[IPath]
}

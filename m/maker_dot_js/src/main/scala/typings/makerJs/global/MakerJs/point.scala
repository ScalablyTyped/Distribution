package typings.makerJs.global.MakerJs

import typings.makerJs.MakerJs.IPath
import typings.makerJs.MakerJs.IPathArc
import typings.makerJs.MakerJs.IPathCircle
import typings.makerJs.MakerJs.IPathIntersectionBaseOptions
import typings.makerJs.MakerJs.IPathLine
import typings.makerJs.MakerJs.IPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object point {
  
  @JSGlobal("MakerJs.point")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Add two points together and return the result as a new point object.
    *
    * @param a First point.
    * @param b Second point.
    * @param subtract Optional boolean to subtract instead of add.
    * @returns A new point object.
    */
  inline def add(a: IPoint, b: IPoint): IPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[IPoint]
  inline def add(a: IPoint, b: IPoint, subtract: Boolean): IPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], subtract.asInstanceOf[js.Any])).asInstanceOf[IPoint]
  
  /**
    * Get the average of two points.
    *
    * @param a First point.
    * @param b Second point.
    * @returns New point object which is the average of a and b.
    */
  inline def average(a: IPoint, b: IPoint): IPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("average")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[IPoint]
  
  /**
    * Clone a point into a new point.
    *
    * @param pointToClone The point to clone.
    * @returns A new point with same values as the original.
    */
  inline def clone_(pointToClone: IPoint): IPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(pointToClone.asInstanceOf[js.Any]).asInstanceOf[IPoint]
  
  /**
    * From an array of points, find the closest point to a given reference point.
    *
    * @param referencePoint The reference point.
    * @param pointOptions Array of points to choose from.
    * @returns The first closest point from the pointOptions.
    */
  inline def closest(referencePoint: IPoint, pointOptions: js.Array[IPoint]): IPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("closest")(referencePoint.asInstanceOf[js.Any], pointOptions.asInstanceOf[js.Any])).asInstanceOf[IPoint]
  
  /**
    * Distort a point's coordinates.
    *
    * @param pointToDistort The point to distort.
    * @param scaleX The amount of x scaling.
    * @param scaleY The amount of y scaling.
    * @returns A new point.
    */
  inline def distort(pointToDistort: IPoint, scaleX: Double, scaleY: Double): IPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("distort")(pointToDistort.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any])).asInstanceOf[IPoint]
  
  /**
    * Get a point on a circle or arc path, at a given angle.
    * @param angleInDegrees The angle at which you want to find the point, in degrees.
    * @param circle A circle or arc.
    * @returns A new point object.
    */
  inline def fromAngleOnCircle(angleInDegrees: Double, circle: IPathCircle): IPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAngleOnCircle")(angleInDegrees.asInstanceOf[js.Any], circle.asInstanceOf[js.Any])).asInstanceOf[IPoint]
  
  /**
    * Get the two end points of an arc path.
    *
    * @param arc The arc path object.
    * @returns Array with 2 elements: [0] is the point object corresponding to the start angle, [1] is the point object corresponding to the end angle.
    */
  inline def fromArc(arc: IPathArc): js.Array[IPoint] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArc")(arc.asInstanceOf[js.Any]).asInstanceOf[js.Array[IPoint]]
  
  /**
    * Get the two end points of a path.
    *
    * @param pathContext The path object.
    * @returns Array with 2 elements: [0] is the point object corresponding to the origin, [1] is the point object corresponding to the end.
    */
  inline def fromPathEnds(pathContext: IPath): js.Array[IPoint] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPathEnds")(pathContext.asInstanceOf[js.Any]).asInstanceOf[js.Array[IPoint]]
  inline def fromPathEnds(pathContext: IPath, pathOffset: IPoint): js.Array[IPoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPathEnds")(pathContext.asInstanceOf[js.Any], pathOffset.asInstanceOf[js.Any])).asInstanceOf[js.Array[IPoint]]
  
  /**
    * Get a point from its polar coordinates.
    *
    * @param angleInRadians The angle of the polar coordinate, in radians.
    * @param radius The radius of the polar coordinate.
    * @returns A new point object.
    */
  inline def fromPolar(angleInRadians: Double, radius: Double): IPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPolar")(angleInRadians.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[IPoint]
  
  /**
    * Calculates the intersection of slopes of two lines.
    *
    * @param lineA First line to use for slope.
    * @param lineB Second line to use for slope.
    * @param options Optional IPathIntersectionOptions.
    * @returns point of intersection of the two slopes, or null if the slopes did not intersect.
    */
  inline def fromSlopeIntersection(lineA: IPathLine, lineB: IPathLine): IPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSlopeIntersection")(lineA.asInstanceOf[js.Any], lineB.asInstanceOf[js.Any])).asInstanceOf[IPoint]
  inline def fromSlopeIntersection(lineA: IPathLine, lineB: IPathLine, options: IPathIntersectionBaseOptions): IPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSlopeIntersection")(lineA.asInstanceOf[js.Any], lineB.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPoint]
  
  /**
    * Get the middle point of a path.
    *
    * @param pathContext The path object.
    * @param ratio Optional ratio (between 0 and 1) of point along the path. Default is .5 for middle.
    * @returns Point on the path, in the middle of the path.
    */
  inline def middle(pathContext: IPath): IPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("middle")(pathContext.asInstanceOf[js.Any]).asInstanceOf[IPoint]
  inline def middle(pathContext: IPath, ratio: Double): IPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("middle")(pathContext.asInstanceOf[js.Any], ratio.asInstanceOf[js.Any])).asInstanceOf[IPoint]
  
  /**
    * Create a clone of a point, mirrored on either or both x and y axes.
    *
    * @param pointToMirror The point to mirror.
    * @param mirrorX Boolean to mirror on the x axis.
    * @param mirrorY Boolean to mirror on the y axis.
    * @returns Mirrored point.
    */
  inline def mirror(pointToMirror: IPoint, mirrorX: Boolean, mirrorY: Boolean): IPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("mirror")(pointToMirror.asInstanceOf[js.Any], mirrorX.asInstanceOf[js.Any], mirrorY.asInstanceOf[js.Any])).asInstanceOf[IPoint]
  
  /**
    * Rotate a point.
    *
    * @param pointToRotate The point to rotate.
    * @param angleInDegrees The amount of rotation, in degrees.
    * @param rotationOrigin The center point of rotation.
    * @returns A new point.
    */
  inline def rotate(pointToRotate: IPoint, angleInDegrees: Double): IPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(pointToRotate.asInstanceOf[js.Any], angleInDegrees.asInstanceOf[js.Any])).asInstanceOf[IPoint]
  inline def rotate(pointToRotate: IPoint, angleInDegrees: Double, rotationOrigin: IPoint): IPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(pointToRotate.asInstanceOf[js.Any], angleInDegrees.asInstanceOf[js.Any], rotationOrigin.asInstanceOf[js.Any])).asInstanceOf[IPoint]
  
  /**
    * Round the values of a point.
    *
    * @param pointContext The point to serialize.
    * @param accuracy Optional exemplar number of decimal places.
    * @returns A new point with the values rounded.
    */
  inline def rounded(pointContext: IPoint): IPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("rounded")(pointContext.asInstanceOf[js.Any]).asInstanceOf[IPoint]
  inline def rounded(pointContext: IPoint, accuracy: Double): IPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("rounded")(pointContext.asInstanceOf[js.Any], accuracy.asInstanceOf[js.Any])).asInstanceOf[IPoint]
  
  /**
    * Scale a point's coordinates.
    *
    * @param pointToScale The point to scale.
    * @param scaleValue The amount of scaling.
    * @returns A new point.
    */
  inline def scale(pointToScale: IPoint, scaleValue: Double): IPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(pointToScale.asInstanceOf[js.Any], scaleValue.asInstanceOf[js.Any])).asInstanceOf[IPoint]
  
  /**
    * Subtract a point from another point, and return the result as a new point. Shortcut to Add(a, b, subtract = true).
    *
    * @param a First point.
    * @param b Second point.
    * @returns A new point object.
    */
  inline def subtract(a: IPoint, b: IPoint): IPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[IPoint]
  
  /**
    * A point at 0,0 coordinates.
    * NOTE: It is important to call this as a method, with the empty parentheses.
    *
    * @returns A new point.
    */
  inline def zero(): IPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[IPoint]
}

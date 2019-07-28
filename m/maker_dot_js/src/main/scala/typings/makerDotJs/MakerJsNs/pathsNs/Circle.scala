package typings.makerDotJs.MakerJsNs.pathsNs

import typings.makerDotJs.MakerJsNs.IPathCircle
import typings.makerDotJs.MakerJsNs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class for circle path.
  */
@JSGlobal("MakerJs.paths.Circle")
@js.native
class Circle protected () extends IPathCircle {
  /**
    * Class for circle path, created from radius. Origin will be [0, 0].
    *
    * Example:
    * ```
    * var c = new makerjs.paths.Circle(7);
    * ```
    *
    * @param radius The radius of the circle.
    */
  def this(radius: Double) = this()
  /**
    * Class for circle path, created from origin point and radius.
    *
    * Example:
    * ```
    * var c = new makerjs.paths.Circle([10, 10], 7);
    * ```
    *
    * @param origin The center point of the circle.
    * @param radius The radius of the circle.
    */
  def this(origin: IPoint, radius: Double) = this()
  /**
    * Class for circle path, created from 2 points.
    *
    * Example:
    * ```
    * var c = new makerjs.paths.Circle([5, 15], [25, 15]);
    * ```
    *
    * @param pointA First point on the circle.
    * @param pointB Second point on the circle.
    */
  def this(pointA: IPoint, pointB: IPoint) = this()
  /**
    * Class for circle path, created from 3 points.
    *
    * Example:
    * ```
    * var c = new makerjs.paths.Circle([0, 0], [0, 10], [20, 0]);
    * ```
    *
    * @param pointA First point on the circle.
    * @param pointB Second point on the circle.
    * @param pointC Third point on the circle.
    */
  def this(pointA: IPoint, pointB: IPoint, pointC: IPoint) = this()
  /**
    * The main point of reference for this path.
    */
  /* CompleteClass */
  override var origin: IPoint = js.native
  /**
    * The radius of the circle.
    */
  /* CompleteClass */
  override var radius: Double = js.native
  /**
    * The type of the path, e.g. "line", "circle", or "arc". These strings are enumerated in pathType.
    */
  /* CompleteClass */
  override var `type`: String = js.native
}


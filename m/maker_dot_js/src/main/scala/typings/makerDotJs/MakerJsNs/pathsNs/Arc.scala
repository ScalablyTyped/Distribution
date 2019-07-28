package typings.makerDotJs.MakerJsNs.pathsNs

import typings.makerDotJs.MakerJsNs.IPathArc
import typings.makerDotJs.MakerJsNs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class for arc path.
  */
@JSGlobal("MakerJs.paths.Arc")
@js.native
class Arc protected () extends IPathArc {
  /**
    * Class for arc path, created from 2 points and optional boolean flag indicating clockwise.
    *
    * @param pointA First end point of the arc.
    * @param pointB Second end point of the arc.
    * @param clockwise Boolean flag to indicate clockwise direction.
    */
  def this(pointA: IPoint, pointB: IPoint) = this()
  def this(pointA: IPoint, pointB: IPoint, clockwise: Boolean) = this()
  /**
    * Class for arc path, created from 3 points.
    *
    * @param pointA First end point of the arc.
    * @param pointB Middle point on the arc.
    * @param pointC Second end point of the arc.
    */
  def this(pointA: IPoint, pointB: IPoint, pointC: IPoint) = this()
  /**
    * Class for arc path, created from origin point, radius, start angle, and end angle.
    *
    * @param origin The center point of the arc.
    * @param radius The radius of the arc.
    * @param startAngle The start angle of the arc.
    * @param endAngle The end angle of the arc.
    */
  def this(origin: IPoint, radius: Double, startAngle: Double, endAngle: Double) = this()
  /**
    * Class for arc path, created from 2 points, radius, large Arc flag, and clockwise flag.
    *
    * @param pointA First end point of the arc.
    * @param pointB Second end point of the arc.
    * @param radius The radius of the arc.
    * @param largeArc Boolean flag to indicate clockwise direction.
    * @param clockwise Boolean flag to indicate clockwise direction.
    */
  def this(pointA: IPoint, pointB: IPoint, radius: Double, largeArc: Boolean, clockwise: Boolean) = this()
  /**
    * The angle (in degrees) to end drawing the arc, in polar (counter-clockwise) direction. May be less than start angle if it past 360.
    */
  /* CompleteClass */
  override var endAngle: Double = js.native
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
    * The angle (in degrees) to begin drawing the arc, in polar (counter-clockwise) direction.
    */
  /* CompleteClass */
  override var startAngle: Double = js.native
  /**
    * The type of the path, e.g. "line", "circle", or "arc". These strings are enumerated in pathType.
    */
  /* CompleteClass */
  override var `type`: String = js.native
}


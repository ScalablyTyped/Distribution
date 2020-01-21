package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.angle")
@js.native
object angle extends js.Object {
  /**
    * Mirror an angle on either or both x and y axes.
    *
    * @param angleInDegrees The angle to mirror.
    * @param mirrorX Boolean to mirror on the x axis.
    * @param mirrorY Boolean to mirror on the y axis.
    * @returns Mirrored angle.
    */
  def mirror(angleInDegrees: Double, mirrorX: Boolean, mirrorY: Boolean): Double = js.native
  /**
    * Ensures an angle is not greater than 360
    *
    * @param angleInDegrees Angle in degrees.
    * @retiurns Same polar angle but not greater than 360 degrees.
    */
  def noRevolutions(angleInDegrees: Double): Double = js.native
  /**
    * Get an arc's end angle, ensured to be greater than its start angle.
    *
    * @param arc An arc path object.
    * @returns End angle of arc.
    */
  def ofArcEnd(arc: IPathArc): Double = js.native
  /**
    * Get the angle in the middle of an arc's start and end angles.
    *
    * @param arc An arc path object.
    * @param ratio Optional number between 0 and 1 specifying percentage between start and end angles. Default is .5
    * @returns Middle angle of arc.
    */
  def ofArcMiddle(arc: IPathArc): Double = js.native
  def ofArcMiddle(arc: IPathArc, ratio: Double): Double = js.native
  /**
    * Total angle of an arc between its start and end angles.
    *
    * @param arc The arc to measure.
    * @returns Angle of arc.
    */
  def ofArcSpan(arc: IPathArc): Double = js.native
  /**
    * Angle of a line path.
    *
    * @param line The line path to find the angle of.
    * @returns Angle of the line path, in degrees.
    */
  def ofLineInDegrees(line: IPathLine): Double = js.native
  /**
    * Angle of a line through a point, in degrees.
    *
    * @param pointToFindAngle The point to find the angle.
    * @param origin Point of origin of the angle.
    * @returns Angle of the line throught the point, in degrees.
    */
  def ofPointInDegrees(origin: IPoint, pointToFindAngle: IPoint): Double = js.native
  /**
    * Angle of a line through a point, in radians.
    *
    * @param pointToFindAngle The point to find the angle.
    * @param origin Point of origin of the angle.
    * @returns Angle of the line throught the point, in radians.
    */
  def ofPointInRadians(origin: IPoint, pointToFindAngle: IPoint): Double = js.native
  /**
    * Convert an angle from radians to degrees.
    *
    * @param angleInRadians Angle in radians.
    * @returns Angle in degrees.
    */
  def toDegrees(angleInRadians: Double): Double = js.native
  /**
    * Convert an angle from degrees to radians.
    *
    * @param angleInDegrees Angle in degrees.
    * @returns Angle in radians.
    */
  def toRadians(angleInDegrees: Double): Double = js.native
}


package typings.makerjs.global.MakerJs

import typings.makerjs.MakerJs.IChainLink
import typings.makerjs.MakerJs.IPathArc
import typings.makerjs.MakerJs.IPathLine
import typings.makerjs.MakerJs.IPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angle {
  
  @JSGlobal("MakerJs.angle")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Mirror an angle on either or both x and y axes.
    *
    * @param angleInDegrees The angle to mirror.
    * @param mirrorX Boolean to mirror on the x axis.
    * @param mirrorY Boolean to mirror on the y axis.
    * @returns Mirrored angle.
    */
  inline def mirror(angleInDegrees: Double, mirrorX: Boolean, mirrorY: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mirror")(angleInDegrees.asInstanceOf[js.Any], mirrorX.asInstanceOf[js.Any], mirrorY.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Ensures an angle is not greater than 360
    *
    * @param angleInDegrees Angle in degrees.
    * @returns Same polar angle but not greater than 360 degrees.
    */
  inline def noRevolutions(angleInDegrees: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("noRevolutions")(angleInDegrees.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Get an arc's end angle, ensured to be greater than its start angle.
    *
    * @param arc An arc path object.
    * @returns End angle of arc.
    */
  inline def ofArcEnd(arc: IPathArc): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ofArcEnd")(arc.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Get the angle in the middle of an arc's start and end angles.
    *
    * @param arc An arc path object.
    * @param ratio Optional number between 0 and 1 specifying percentage between start and end angles. Default is .5
    * @returns Middle angle of arc.
    */
  inline def ofArcMiddle(arc: IPathArc): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ofArcMiddle")(arc.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def ofArcMiddle(arc: IPathArc, ratio: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ofArcMiddle")(arc.asInstanceOf[js.Any], ratio.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Total angle of an arc between its start and end angles.
    *
    * @param arc The arc to measure.
    * @returns Angle of arc.
    */
  inline def ofArcSpan(arc: IPathArc): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ofArcSpan")(arc.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Get the angle of a joint between 2 chain links.
    *
    * @param linkA First chain link.
    * @param linkB Second chain link.
    * @returns Angle between chain links.
    */
  inline def ofChainLinkJoint(linkA: IChainLink, linkB: IChainLink): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ofChainLinkJoint")(linkA.asInstanceOf[js.Any], linkB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Angle of a line path.
    *
    * @param line The line path to find the angle of.
    * @returns Angle of the line path, in degrees.
    */
  inline def ofLineInDegrees(line: IPathLine): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ofLineInDegrees")(line.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Angle of a line through a point, in degrees.
    *
    * @param pointToFindAngle The point to find the angle.
    * @param origin Point of origin of the angle.
    * @returns Angle of the line throught the point, in degrees.
    */
  inline def ofPointInDegrees(origin: IPoint, pointToFindAngle: IPoint): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ofPointInDegrees")(origin.asInstanceOf[js.Any], pointToFindAngle.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Angle of a line through a point, in radians.
    *
    * @param pointToFindAngle The point to find the angle.
    * @param origin Point of origin of the angle.
    * @returns Angle of the line throught the point, in radians.
    */
  inline def ofPointInRadians(origin: IPoint, pointToFindAngle: IPoint): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ofPointInRadians")(origin.asInstanceOf[js.Any], pointToFindAngle.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Convert an angle from radians to degrees.
    *
    * @param angleInRadians Angle in radians.
    * @returns Angle in degrees.
    */
  inline def toDegrees(angleInRadians: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toDegrees")(angleInRadians.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Convert an angle from degrees to radians.
    *
    * @param angleInDegrees Angle in degrees.
    * @returns Angle in radians.
    */
  inline def toRadians(angleInDegrees: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toRadians")(angleInDegrees.asInstanceOf[js.Any]).asInstanceOf[Double]
}

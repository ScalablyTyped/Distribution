package typings.makerJs.global.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object solvers {
  
  @JSGlobal("MakerJs.solvers")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Solves for the length of a side of a triangle when you know length of one side and 2 angles.
    *
    * @param oppositeAngleInDegrees Angle which is opposite of the side you are trying to find.
    * @param lengthOfSideBetweenAngles Length of one side of the triangle which is between the provided angles.
    * @param otherAngleInDegrees An other angle of the triangle.
    * @returns Length of the side of the triangle which is opposite of the first angle parameter.
    */
  inline def solveTriangleASA(oppositeAngleInDegrees: Double, lengthOfSideBetweenAngles: Double, otherAngleInDegrees: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("solveTriangleASA")(oppositeAngleInDegrees.asInstanceOf[js.Any], lengthOfSideBetweenAngles.asInstanceOf[js.Any], otherAngleInDegrees.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Solves for the angle of a triangle when you know lengths of 3 sides.
    *
    * @param lengthA Length of side of triangle, opposite of the angle you are trying to find.
    * @param lengthB Length of any other side of the triangle.
    * @param lengthC Length of the remaining side of the triangle.
    * @returns Angle opposite of the side represented by the first parameter.
    */
  inline def solveTriangleSSS(lengthA: Double, lengthB: Double, lengthC: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("solveTriangleSSS")(lengthA.asInstanceOf[js.Any], lengthB.asInstanceOf[js.Any], lengthC.asInstanceOf[js.Any])).asInstanceOf[Double]
}

package typings.atIonicCore

import typings.atIonicCore.distTypesUtilsAnimationCubicDashBezierMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/animation/cubic-bezier", JSImport.Namespace)
@js.native
object distTypesUtilsAnimationCubicDashBezierMod extends js.Object {
  @js.native
  class Point protected () extends js.Object {
    def this(x: Double, y: Double) = this()
    var x: Double = js.native
    var y: Double = js.native
  }
  
  def getTimeGivenProgression(p0: Point, p1: Point, p2: Point, p3: Point, progression: Double): Double = js.native
}


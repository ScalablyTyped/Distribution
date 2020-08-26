package typings.imageQ

import typings.imageQ.abstractDistanceCalculatorMod.AbstractDistanceCalculator
import typings.imageQ.pointContainerMod.PointContainer
import typings.imageQ.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("image-q/dist/utils/palette", JSImport.Namespace)
@js.native
object utilsPaletteMod extends js.Object {
  @js.native
  class Palette () extends js.Object {
    var _i32idx: js.Any = js.native
    val _pointArray: js.Any = js.native
    val _pointContainer: js.Any = js.native
    /* private */ def _nearestPointFromCache(key: js.Any): js.Any = js.native
    def add(color: Point): Unit = js.native
    def getNearestColor(colorDistanceCalculator: AbstractDistanceCalculator, color: Point): Point = js.native
    /* private */ def getNearestIndex(colorDistanceCalculator: js.Any, point: js.Any): js.Any = js.native
    def getPointContainer(): PointContainer = js.native
    def has(color: Point): Boolean = js.native
    def sort(): Unit = js.native
  }
  
  def hueGroup(hue: Double, segmentsNumber: Double): Double = js.native
}


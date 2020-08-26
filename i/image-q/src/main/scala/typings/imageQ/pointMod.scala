package typings.imageQ

import typings.imageQ.anon.A
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("image-q/dist/utils/point", JSImport.Namespace)
@js.native
object pointMod extends js.Object {
  @js.native
  class Point () extends js.Object {
    var Lab: A = js.native
    var a: Double = js.native
    var b: Double = js.native
    var g: Double = js.native
    var r: Double = js.native
    var rgba: js.Array[Double] = js.native
    var uint32: Double = js.native
    /* private */ def _loadQuadruplet(): js.Any = js.native
    /* private */ def _loadRGBA(): js.Any = js.native
    /* private */ def _loadUINT32(): js.Any = js.native
    def from(point: Point): Unit = js.native
    def getLuminosity(useAlphaChannel: Boolean): Double = js.native
  }
  
  /* static members */
  @js.native
  object Point extends js.Object {
    def createByQuadruplet(quadruplet: js.Array[Double]): Point = js.native
    def createByRGBA(red: Double, green: Double, blue: Double, alpha: Double): Point = js.native
    def createByUint32(uint32: Double): Point = js.native
  }
  
}


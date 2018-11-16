package typings
package jsqrcodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GridSampler")
@js.native
object GridSampler extends js.Object {
  def checkAndNudgePoints(image: stdLib.Uint8Array, points: js.Array[scala.Double]): scala.Unit = js.native
  def sampleGrid3(image: stdLib.Uint8Array, dimension: scala.Double, transform: jsqrcodeLib.PerspectiveTransform): jsqrcodeLib.BitMatrix = js.native
  def sampleGridx(
    image: stdLib.Uint8Array,
    dimension: scala.Double,
    p1ToX: scala.Double,
    p1ToY: scala.Double,
    p2ToX: scala.Double,
    p2ToY: scala.Double,
    p3ToX: scala.Double,
    p3ToY: scala.Double,
    p4ToX: scala.Double,
    p4ToY: scala.Double,
    p1FromX: scala.Double,
    p1FromY: scala.Double,
    p2FromX: scala.Double,
    p2FromY: scala.Double,
    p3FromX: scala.Double,
    p3FromY: scala.Double,
    p4FromX: scala.Double,
    p4FromY: scala.Double
  ): jsqrcodeLib.BitMatrix = js.native
}


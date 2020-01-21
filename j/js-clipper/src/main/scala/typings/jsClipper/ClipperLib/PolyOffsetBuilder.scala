package typings.jsClipper.ClipperLib

import typings.jsClipper.AnonValue
import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ClipperLib.PolyOffsetBuilder")
@js.native
class PolyOffsetBuilder protected () extends js.Object {
  def this(
    pts: Polygons,
    solution: AnonValue,
    delta: Double,
    jointype: JoinType,
    MiterLimit: Double,
    AutoFix: Boolean
  ) = this()
  var botPt: PolyOffsetBuilder = js.native
  var currentPoly: Polygon = js.native
  var delta: Double = js.native
  var m_R: Double = js.native
  var m_i: Double = js.native
  var m_j: Double = js.native
  var m_k: Double = js.native
  var normals: ArrayLike[IntPoint] = js.native
  var pts: Polygons = js.native
  def AddPoint(pt: IntPoint): Unit = js.native
  def DoMiter(): Unit = js.native
  def DoRound(): Unit = js.native
  def DoSquare(mul: Double): Unit = js.native
  def UpdateBotPt(pt: IntPoint): Boolean = js.native
}


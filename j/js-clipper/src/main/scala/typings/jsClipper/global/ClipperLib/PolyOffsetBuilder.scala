package typings.jsClipper.global.ClipperLib

import typings.jsClipper.anon.Value
import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ClipperLib.PolyOffsetBuilder")
@js.native
class PolyOffsetBuilder protected ()
  extends typings.jsClipper.ClipperLib.PolyOffsetBuilder {
  def this(
    pts: typings.jsClipper.ClipperLib.Polygons,
    solution: Value,
    delta: Double,
    jointype: typings.jsClipper.ClipperLib.JoinType,
    MiterLimit: Double,
    AutoFix: Boolean
  ) = this()
  /* CompleteClass */
  override var botPt: typings.jsClipper.ClipperLib.PolyOffsetBuilder = js.native
  /* CompleteClass */
  override var currentPoly: typings.jsClipper.ClipperLib.Polygon = js.native
  /* CompleteClass */
  override var delta: Double = js.native
  /* CompleteClass */
  override var m_R: Double = js.native
  /* CompleteClass */
  override var m_i: Double = js.native
  /* CompleteClass */
  override var m_j: Double = js.native
  /* CompleteClass */
  override var m_k: Double = js.native
  /* CompleteClass */
  override var normals: ArrayLike[typings.jsClipper.ClipperLib.IntPoint] = js.native
  /* CompleteClass */
  override var pts: typings.jsClipper.ClipperLib.Polygons = js.native
  /* CompleteClass */
  override def AddPoint(pt: typings.jsClipper.ClipperLib.IntPoint): Unit = js.native
  /* CompleteClass */
  override def DoMiter(): Unit = js.native
  /* CompleteClass */
  override def DoRound(): Unit = js.native
  /* CompleteClass */
  override def DoSquare(mul: Double): Unit = js.native
  /* CompleteClass */
  override def UpdateBotPt(pt: typings.jsClipper.ClipperLib.IntPoint): Boolean = js.native
}


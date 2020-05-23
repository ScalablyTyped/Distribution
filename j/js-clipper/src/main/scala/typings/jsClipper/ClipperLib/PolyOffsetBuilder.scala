package typings.jsClipper.ClipperLib

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolyOffsetBuilder extends js.Object {
  var botPt: PolyOffsetBuilder
  var currentPoly: Polygon
  var delta: Double
  var m_R: Double
  var m_i: Double
  var m_j: Double
  var m_k: Double
  var normals: ArrayLike[IntPoint]
  var pts: Polygons
  def AddPoint(pt: IntPoint): Unit
  def DoMiter(): Unit
  def DoRound(): Unit
  def DoSquare(mul: Double): Unit
  def UpdateBotPt(pt: IntPoint): Boolean
}

object PolyOffsetBuilder {
  @scala.inline
  def apply(
    AddPoint: IntPoint => Unit,
    DoMiter: () => Unit,
    DoRound: () => Unit,
    DoSquare: Double => Unit,
    UpdateBotPt: IntPoint => Boolean,
    botPt: PolyOffsetBuilder,
    currentPoly: Polygon,
    delta: Double,
    m_R: Double,
    m_i: Double,
    m_j: Double,
    m_k: Double,
    normals: ArrayLike[IntPoint],
    pts: Polygons
  ): PolyOffsetBuilder = {
    val __obj = js.Dynamic.literal(AddPoint = js.Any.fromFunction1(AddPoint), DoMiter = js.Any.fromFunction0(DoMiter), DoRound = js.Any.fromFunction0(DoRound), DoSquare = js.Any.fromFunction1(DoSquare), UpdateBotPt = js.Any.fromFunction1(UpdateBotPt), botPt = botPt.asInstanceOf[js.Any], currentPoly = currentPoly.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], m_R = m_R.asInstanceOf[js.Any], m_i = m_i.asInstanceOf[js.Any], m_j = m_j.asInstanceOf[js.Any], m_k = m_k.asInstanceOf[js.Any], normals = normals.asInstanceOf[js.Any], pts = pts.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyOffsetBuilder]
  }
}


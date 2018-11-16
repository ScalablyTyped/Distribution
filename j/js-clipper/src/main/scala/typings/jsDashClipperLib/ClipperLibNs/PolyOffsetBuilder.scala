package typings
package jsDashClipperLib.ClipperLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ClipperLib.PolyOffsetBuilder")
@js.native
class PolyOffsetBuilder protected () extends js.Object {
  def this(pts: Polygons, solution: jsDashClipperLib.Anon_Value, delta: scala.Double, jointype: JoinType, MiterLimit: scala.Double, AutoFix: scala.Boolean) = this()
  var botPt: PolyOffsetBuilder = js.native
  var currentPoly: Polygon = js.native
  var delta: scala.Double = js.native
  var m_R: scala.Double = js.native
  var m_i: scala.Double = js.native
  var m_j: scala.Double = js.native
  var m_k: scala.Double = js.native
  var normals: stdLib.ArrayLike[IntPoint] = js.native
  var pts: Polygons = js.native
  def AddPoint(pt: IntPoint): scala.Unit = js.native
  def DoMiter(): scala.Unit = js.native
  def DoRound(): scala.Unit = js.native
  def DoSquare(mul: scala.Double): scala.Unit = js.native
  def UpdateBotPt(pt: IntPoint): scala.Boolean = js.native
}


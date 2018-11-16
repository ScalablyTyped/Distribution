package typings
package jsDashClipperLib.ClipperLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ClipperLib.ClipperBase")
@js.native
class ClipperBase () extends js.Object {
  var hiRange: scala.Double = js.native
  var horizontal: scala.Double = js.native
  var loRange: scala.Double = js.native
  var m_CurrentLM: LocalMinima = js.native
  var m_MinimaList: LocalMinima = js.native
  var m_UseFullRange: scala.Boolean = js.native
  var m_edges: stdLib.ArrayLike[stdLib.ArrayLike[TEdge]] = js.native
  def AddBoundsToLML(e: TEdge): TEdge = js.native
  def AddPolygon(pg: stdLib.ArrayLike[IntPoint], polyType: PolyType, multiple: scala.Boolean): scala.Boolean | java.lang.String = js.native
  def AddPolygons(ppg: stdLib.ArrayLike[stdLib.ArrayLike[IntPoint]], polyType: PolyType): scala.Boolean | java.lang.String = js.native
  def DisposeLocalMinimaList(): scala.Unit = js.native
  def GetBounds(): IntRect = js.native
  def InitEdge(e: TEdge, eNext: TEdge, ePrev: TEdge, pt: IntPoint, polyType: PolyType): scala.Unit = js.native
  def InsertLocalMinima(newLm: LocalMinima): scala.Unit = js.native
  def PointInPolygon(pt: IntPoint, pp: JoinRec, UseFulllongRange: scala.Boolean): scala.Boolean = js.native
  def PointIsVertex(pt: IntPoint, pp: JoinRec): scala.Boolean = js.native
  def PointsEqual(pt1: IntPoint, pt2: IntPoint): scala.Boolean = js.native
  def PopLocalMinima(): scala.Unit = js.native
  def Reset(): scala.Unit = js.native
  def SetDx(e: TEdge): scala.Unit = js.native
  def SlopesEqual(e1: TEdge, e2: TEdge, UseFullRange: scala.Boolean): scala.Boolean = js.native
  def SlopesEqual(pt1: IntPoint, pt2: IntPoint, pt3: IntPoint, UseFullRange: scala.Boolean): scala.Boolean = js.native
  def SlopesEqual(pt1: IntPoint, pt2: IntPoint, pt3: IntPoint, pt4: IntPoint, UseFullRange: scala.Boolean): scala.Boolean = js.native
  def SwapX(e: TEdge): scala.Unit = js.native
  def clear(): scala.Unit = js.native
}


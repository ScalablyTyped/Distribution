package typings.jsDashClipper.ClipperLibNs

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ClipperLib.ClipperBase")
@js.native
class ClipperBase () extends js.Object {
  var hiRange: Double = js.native
  var horizontal: Double = js.native
  var loRange: Double = js.native
  var m_CurrentLM: LocalMinima = js.native
  var m_MinimaList: LocalMinima = js.native
  var m_UseFullRange: Boolean = js.native
  var m_edges: ArrayLike[ArrayLike[TEdge]] = js.native
  def AddBoundsToLML(e: TEdge): TEdge = js.native
  def AddPolygon(pg: ArrayLike[IntPoint], polyType: PolyType, multiple: Boolean): Boolean | String = js.native
  def AddPolygons(ppg: ArrayLike[ArrayLike[IntPoint]], polyType: PolyType): Boolean | String = js.native
  def DisposeLocalMinimaList(): Unit = js.native
  def GetBounds(): IntRect = js.native
  def InitEdge(e: TEdge, eNext: TEdge, ePrev: TEdge, pt: IntPoint, polyType: PolyType): Unit = js.native
  def InsertLocalMinima(newLm: LocalMinima): Unit = js.native
  def PointInPolygon(pt: IntPoint, pp: JoinRec, UseFulllongRange: Boolean): Boolean = js.native
  def PointIsVertex(pt: IntPoint, pp: JoinRec): Boolean = js.native
  def PointsEqual(pt1: IntPoint, pt2: IntPoint): Boolean = js.native
  def PopLocalMinima(): Unit = js.native
  def Reset(): Unit = js.native
  def SetDx(e: TEdge): Unit = js.native
  def SlopesEqual(e1: TEdge, e2: TEdge, UseFullRange: Boolean): Boolean = js.native
  def SlopesEqual(pt1: IntPoint, pt2: IntPoint, pt3: IntPoint, UseFullRange: Boolean): Boolean = js.native
  def SlopesEqual(pt1: IntPoint, pt2: IntPoint, pt3: IntPoint, pt4: IntPoint, UseFullRange: Boolean): Boolean = js.native
  def SwapX(e: TEdge): Unit = js.native
  def clear(): Unit = js.native
}


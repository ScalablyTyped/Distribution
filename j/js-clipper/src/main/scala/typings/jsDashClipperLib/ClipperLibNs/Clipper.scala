package typings
package jsDashClipperLib.ClipperLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ClipperLib.Clipper")
@js.native
class Clipper () extends ClipperBase {
  var DoublePoint: js.Function = js.native
  var PolyOffsetBuilder: js.Function = js.native
  var m_ActiveEdges: TEdge = js.native
  var m_ClipFillType: PolyFillType = js.native
  var m_ClipType: ClipType = js.native
  var m_ExecuteLocked: scala.Boolean = js.native
  var m_HorizJoins: stdLib.ArrayLike[HorzJoinRec] = js.native
  var m_Joins: stdLib.ArrayLike[JoinRec] = js.native
  var m_PolyOuts: TEdge | stdLib.ArrayLike[TEdge] = js.native
  var m_ReverseOutput: scala.Boolean = js.native
  var m_Scanbeam: Scanbeam = js.native
  var m_SortedEdges: TEdge = js.native
  var m_SubjFillType: PolyFillType = js.native
  var m_UsingExPolygons: scala.Boolean = js.native
  var m_intersectnodes: IntersectNode = js.native
  def AddEdgeToSEL(edge: TEdge): scala.Unit = js.native
  def AddHorzJoin(e: TEdge, idx: scala.Double): scala.Unit = js.native
  def AddIntersectNode(e1: TEdge, e2: TEdge, pt: IntPoint): scala.Unit = js.native
  def AddJoin(e1: TEdge, e2: TEdge, e1OutIdx: scala.Double, e2OutIdx: scala.Double): scala.Unit = js.native
  def AddLocalMaxPoly(e1: TEdge, e2: TEdge, pt: OutPt): scala.Unit = js.native
  def AddLocalMinPoly(e1: TEdge, e2: TEdge, pt: OutPt): scala.Unit = js.native
  def AddOutPt(e: TEdge, pt: IntPoint): scala.Unit = js.native
  def AppendPolygon(e1: TEdge, e2: TEdge): scala.Unit = js.native
  def Area(outRec: OutRec, UseFull64BitRange: scala.Boolean): scala.Double = js.native
  def Area(poly: Polygon): scala.Double = js.native
  def BuildArc(pt: IntPoint, a1: IntPoint, a2: IntPoint, r: scala.Double): Polygon = js.native
  def BuildIntersectList(botY: scala.Double, topY: scala.Double): scala.Unit = js.native
  def BuildResult(polyg: Polygon): scala.Unit = js.native
  def BuildResultEx(polyg: ExPolygon): scala.Unit = js.native
  def CopyAELToSEL(): scala.Unit = js.native
  def CreateOutRec(): OutRec = js.native
  def DeleteFromAEL(e: TEdge): scala.Unit = js.native
  def DeleteFromSEL(e: TEdge): scala.Unit = js.native
  def DisposeIntersectNodes(): scala.Unit = js.native
  def DisposeOutPts(pp: OutPt): scala.Unit = js.native
  def DisposeOutRec(index: scala.Double): scala.Unit = js.native
  def DisposeScanbeamList(): scala.Unit = js.native
  def DoBothEdges(edge1: TEdge, edge2: TEdge, pt: OutPt): scala.Unit = js.native
  def DoEdge1(edge1: TEdge, edge2: TEdge, pt: OutPt): scala.Unit = js.native
  def DoEdge2(edge1: TEdge, edge2: TEdge, pt: OutPt): scala.Unit = js.native
  def DoMaxima(e: TEdge, topY: scala.Double): scala.Unit = js.native
  def E2InsertsBeforeE1(e1: TEdge, e2: TEdge): scala.Boolean = js.native
  def Execute(clipType: ClipType, solution: ExPolygon): scala.Boolean = js.native
  def Execute(clipType: ClipType, solution: ExPolygon, subjFillType: PolyFillType, clipFillType: PolyFillType): scala.Boolean = js.native
  def Execute(clipType: ClipType, solution: stdLib.ArrayLike[IntPoint]): scala.Boolean = js.native
  def Execute(
    clipType: ClipType,
    solution: stdLib.ArrayLike[IntPoint],
    subjFillType: PolyFillType,
    clipFillType: PolyFillType
  ): scala.Boolean = js.native
  def ExecuteInternal(): scala.Boolean = js.native
  def FindAppendLinkEnd(outRec: OutRec): OutRec = js.native
  def FindSegment(pp: IntPoint, pt1: IntPoint, pt2: IntPoint): scala.Boolean = js.native
  def FirstIsBottomPt(btmPt1: OutPt, btmPt2: OutPt): scala.Boolean = js.native
  def FixHoleLinkage(outRec: OutRec): scala.Unit = js.native
  def FixupIntersections(): scala.Boolean = js.native
  def FixupJoinRecs(j: JoinRec, pt: JoinRec, startIdx: scala.Double): scala.Unit = js.native
  def FixupOutPolygon(outRec: OutPt): scala.Unit = js.native
  def FullRangeNeeded(pts: stdLib.ArrayLike[IntPoint]): scala.Boolean = js.native
  def GetBottomPt(pp: OutPt): OutPt = js.native
  def GetDx(pt1: IntPoint, pt2: IntPoint): scala.Double = js.native
  def GetLowermostRec(outRec1: OutRec, outRec2: OutRec): OutRec = js.native
  def GetMaximaPair(e: TEdge): TEdge = js.native
  def GetNextInAEL(e: TEdge, Direction: TEdge): TEdge = js.native
  def GetOverlapSegment(pt1a: IntPoint, pt1b: IntPoint, pt2a: IntPoint, pt2b: IntPoint, pt1: IntPoint, pt2: IntPoint): scala.Boolean = js.native
  def GetUnitNormal(pt1: IntPoint, pt2: IntPoint): DoublePoint = js.native
  def InsertEdgeIntoAEL(edge: TEdge): scala.Unit = js.native
  def InsertLocalMinimaIntoAEL(botY: scala.Double): scala.Unit = js.native
  def InsertPolyPtBetween(p1: OutPt, p2: OutPt, pt: OutPt): OutPt = js.native
  def InsertScanbeam(Y: scala.Double): scala.Unit = js.native
  def IntersectEdges(e1: TEdge, e2: TEdge, pt: OutPt, protects: Protects): scala.Unit = js.native
  def IntersectPoint(edge1: TEdge, edge2: TEdge, ip: IntPoint): scala.Boolean = js.native
  def IsContributing(edge: TEdge): scala.Boolean = js.native
  def IsEvenOddAltFillType(edge: TEdge): scala.Boolean = js.native
  def IsEvenOddFillType(edge: TEdge): scala.Boolean = js.native
  def IsIntermediate(e: TEdge, Y: scala.Double): scala.Boolean = js.native
  def IsMaxima(e: TEdge, Y: scala.Double): scala.Boolean = js.native
  def IsMinima(e: TEdge): scala.Boolean = js.native
  def IsTopHorz(horzEdge: TEdge, XPos: IntPoint): scala.Boolean = js.native
  def JoinCommonEdges(): scala.Unit = js.native
  def JoinPoints(j: JoinRec, p1: IntPoint, p2: IntPoint): scala.Boolean = js.native
  def OffsetPolygons(
    poly: Polygon,
    delta: scala.Double,
    jointype: JoinType,
    MiterLimit: scala.Double,
    AutoFix: scala.Boolean
  ): stdLib.ArrayLike[stdLib.ArrayLike[IntPoint]] = js.native
  def Orientation(poly: Polygon): scala.Boolean = js.native
  def Param1RightOfParam2(outRec1: OutRec, outRec2: OutRec): scala.Boolean = js.native
  def PointCount(pts: stdLib.ArrayLike[OutPt]): scala.Double = js.native
  def PolySort(or1: OutRec, or2: OutRec): scala.Double = js.native
  def PopScanbeam(): scala.Double = js.native
  def ProcessEdgesAtTopOfScanbeam(topY: scala.Double): scala.Unit = js.native
  def ProcessHorizontal(horzEdge: TEdge): scala.Unit = js.native
  def ProcessHorizontals(): scala.Unit = js.native
  def ProcessIntersectList(): scala.Unit = js.native
  def ProcessIntersections(botY: scala.Double, topY: scala.Double): scala.Boolean = js.native
  def ProcessParam1BeforeParam2(node1: IntersectNode, node2: IntersectNode): scala.Boolean = js.native
  def Pt3IsBetweenPt1AndPt2(pt1: scala.Boolean, pt2: scala.Boolean, pt3: scala.Boolean): OutPt = js.native
  def ReversePolyPtLinks(pp: OutPt): scala.Unit = js.native
  def ReversePolygons(polys: Polygons): scala.Unit = js.native
  def Round(a: scala.Double): scala.Double = js.native
  def SetHoleState(e: TEdge, outRec: OutRec): scala.Unit = js.native
  def SetWindingCount(edge: TEdge): scala.Unit = js.native
  def SimplifyPolygon(poly: Polygon, fillType: PolyFillType): Polygon = js.native
  def SimplifyPolygons(polys: Polygons, fillType: PolyFillType): Polygons = js.native
  def SwapIntersectNodes(int1: IntersectNode, int2: IntersectNode): scala.Unit = js.native
  def SwapPoints(pt1: IntPoint, pt2: IntPoint): scala.Unit = js.native
  def SwapPolyIndexes(edge1: TEdge, edge2: TEdge): scala.Unit = js.native
  def SwapPositionsInAEL(edge1: TEdge, edge2: TEdge): scala.Unit = js.native
  def SwapPositionsInSEL(edge1: TEdge, edge2: TEdge): scala.Unit = js.native
  def SwapSides(edge1: TEdge, edge2: TEdge): scala.Unit = js.native
  def TopX(edge: TEdge, currentY: scala.Double): scala.Double = js.native
  def UpdateEdgeIntoAEL(e: TEdge): scala.Unit = js.native
  def get_ReverseSolution(): scala.Boolean = js.native
  def set_ReverseSolution(value: scala.Boolean): scala.Boolean = js.native
}


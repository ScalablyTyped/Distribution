package typings.jsClipper.ClipperLib

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clipper extends ClipperBase {
  var DoublePoint: js.Function = js.native
  var PolyOffsetBuilder: js.Function = js.native
  var m_ActiveEdges: TEdge = js.native
  var m_ClipFillType: PolyFillType = js.native
  var m_ClipType: ClipType = js.native
  var m_ExecuteLocked: Boolean = js.native
  var m_HorizJoins: ArrayLike[HorzJoinRec] = js.native
  var m_Joins: ArrayLike[JoinRec] = js.native
  var m_PolyOuts: TEdge | ArrayLike[TEdge] = js.native
  var m_ReverseOutput: Boolean = js.native
  var m_Scanbeam: Scanbeam = js.native
  var m_SortedEdges: TEdge = js.native
  var m_SubjFillType: PolyFillType = js.native
  var m_UsingExPolygons: Boolean = js.native
  var m_intersectnodes: IntersectNode = js.native
  def AddEdgeToSEL(edge: TEdge): Unit = js.native
  def AddHorzJoin(e: TEdge, idx: Double): Unit = js.native
  def AddIntersectNode(e1: TEdge, e2: TEdge, pt: IntPoint): Unit = js.native
  def AddJoin(e1: TEdge, e2: TEdge, e1OutIdx: Double, e2OutIdx: Double): Unit = js.native
  def AddLocalMaxPoly(e1: TEdge, e2: TEdge, pt: OutPt): Unit = js.native
  def AddLocalMinPoly(e1: TEdge, e2: TEdge, pt: OutPt): Unit = js.native
  def AddOutPt(e: TEdge, pt: IntPoint): Unit = js.native
  def AppendPolygon(e1: TEdge, e2: TEdge): Unit = js.native
  def Area(outRec: OutRec, UseFull64BitRange: Boolean): Double = js.native
  def Area(poly: Polygon): Double = js.native
  def BuildArc(pt: IntPoint, a1: IntPoint, a2: IntPoint, r: Double): Polygon = js.native
  def BuildIntersectList(botY: Double, topY: Double): Unit = js.native
  def BuildResult(polyg: Polygon): Unit = js.native
  def BuildResultEx(polyg: ExPolygon): Unit = js.native
  def CopyAELToSEL(): Unit = js.native
  def CreateOutRec(): OutRec = js.native
  def DeleteFromAEL(e: TEdge): Unit = js.native
  def DeleteFromSEL(e: TEdge): Unit = js.native
  def DisposeIntersectNodes(): Unit = js.native
  def DisposeOutPts(pp: OutPt): Unit = js.native
  def DisposeOutRec(index: Double): Unit = js.native
  def DisposeScanbeamList(): Unit = js.native
  def DoBothEdges(edge1: TEdge, edge2: TEdge, pt: OutPt): Unit = js.native
  def DoEdge1(edge1: TEdge, edge2: TEdge, pt: OutPt): Unit = js.native
  def DoEdge2(edge1: TEdge, edge2: TEdge, pt: OutPt): Unit = js.native
  def DoMaxima(e: TEdge, topY: Double): Unit = js.native
  def E2InsertsBeforeE1(e1: TEdge, e2: TEdge): Boolean = js.native
  def Execute(clipType: ClipType, solution: ExPolygon): Boolean = js.native
  def Execute(clipType: ClipType, solution: ExPolygon, subjFillType: PolyFillType, clipFillType: PolyFillType): Boolean = js.native
  def Execute(clipType: ClipType, solution: ArrayLike[IntPoint]): Boolean = js.native
  def Execute(
    clipType: ClipType,
    solution: ArrayLike[IntPoint],
    subjFillType: PolyFillType,
    clipFillType: PolyFillType
  ): Boolean = js.native
  def ExecuteInternal(): Boolean = js.native
  def FindAppendLinkEnd(outRec: OutRec): OutRec = js.native
  def FindSegment(pp: IntPoint, pt1: IntPoint, pt2: IntPoint): Boolean = js.native
  def FirstIsBottomPt(btmPt1: OutPt, btmPt2: OutPt): Boolean = js.native
  def FixHoleLinkage(outRec: OutRec): Unit = js.native
  def FixupIntersections(): Boolean = js.native
  def FixupJoinRecs(j: JoinRec, pt: JoinRec, startIdx: Double): Unit = js.native
  def FixupOutPolygon(outRec: OutPt): Unit = js.native
  def FullRangeNeeded(pts: ArrayLike[IntPoint]): Boolean = js.native
  def GetBottomPt(pp: OutPt): OutPt = js.native
  def GetDx(pt1: IntPoint, pt2: IntPoint): Double = js.native
  def GetLowermostRec(outRec1: OutRec, outRec2: OutRec): OutRec = js.native
  def GetMaximaPair(e: TEdge): TEdge = js.native
  def GetNextInAEL(e: TEdge, Direction: TEdge): TEdge = js.native
  def GetOverlapSegment(pt1a: IntPoint, pt1b: IntPoint, pt2a: IntPoint, pt2b: IntPoint, pt1: IntPoint, pt2: IntPoint): Boolean = js.native
  def GetUnitNormal(pt1: IntPoint, pt2: IntPoint): DoublePoint = js.native
  def InsertEdgeIntoAEL(edge: TEdge): Unit = js.native
  def InsertLocalMinimaIntoAEL(botY: Double): Unit = js.native
  def InsertPolyPtBetween(p1: OutPt, p2: OutPt, pt: OutPt): OutPt = js.native
  def InsertScanbeam(Y: Double): Unit = js.native
  def IntersectEdges(e1: TEdge, e2: TEdge, pt: OutPt, protects: Protects): Unit = js.native
  def IntersectPoint(edge1: TEdge, edge2: TEdge, ip: IntPoint): Boolean = js.native
  def IsContributing(edge: TEdge): Boolean = js.native
  def IsEvenOddAltFillType(edge: TEdge): Boolean = js.native
  def IsEvenOddFillType(edge: TEdge): Boolean = js.native
  def IsIntermediate(e: TEdge, Y: Double): Boolean = js.native
  def IsMaxima(e: TEdge, Y: Double): Boolean = js.native
  def IsMinima(e: TEdge): Boolean = js.native
  def IsTopHorz(horzEdge: TEdge, XPos: IntPoint): Boolean = js.native
  def JoinCommonEdges(): Unit = js.native
  def JoinPoints(j: JoinRec, p1: IntPoint, p2: IntPoint): Boolean = js.native
  def OffsetPolygons(poly: Polygon, delta: Double, jointype: JoinType, MiterLimit: Double, AutoFix: Boolean): ArrayLike[ArrayLike[IntPoint]] = js.native
  def Orientation(poly: Polygon): Boolean = js.native
  def Param1RightOfParam2(outRec1: OutRec, outRec2: OutRec): Boolean = js.native
  def PointCount(pts: ArrayLike[OutPt]): Double = js.native
  def PolySort(or1: OutRec, or2: OutRec): Double = js.native
  def PopScanbeam(): Double = js.native
  def ProcessEdgesAtTopOfScanbeam(topY: Double): Unit = js.native
  def ProcessHorizontal(horzEdge: TEdge): Unit = js.native
  def ProcessHorizontals(): Unit = js.native
  def ProcessIntersectList(): Unit = js.native
  def ProcessIntersections(botY: Double, topY: Double): Boolean = js.native
  def ProcessParam1BeforeParam2(node1: IntersectNode, node2: IntersectNode): Boolean = js.native
  def Pt3IsBetweenPt1AndPt2(pt1: Boolean, pt2: Boolean, pt3: Boolean): OutPt = js.native
  def ReversePolyPtLinks(pp: OutPt): Unit = js.native
  def ReversePolygons(polys: Polygons): Unit = js.native
  def Round(a: Double): Double = js.native
  def SetHoleState(e: TEdge, outRec: OutRec): Unit = js.native
  def SetWindingCount(edge: TEdge): Unit = js.native
  def SimplifyPolygon(poly: Polygon, fillType: PolyFillType): Polygon = js.native
  def SimplifyPolygons(polys: Polygons, fillType: PolyFillType): Polygons = js.native
  def SwapIntersectNodes(int1: IntersectNode, int2: IntersectNode): Unit = js.native
  def SwapPoints(pt1: IntPoint, pt2: IntPoint): Unit = js.native
  def SwapPolyIndexes(edge1: TEdge, edge2: TEdge): Unit = js.native
  def SwapPositionsInAEL(edge1: TEdge, edge2: TEdge): Unit = js.native
  def SwapPositionsInSEL(edge1: TEdge, edge2: TEdge): Unit = js.native
  def SwapSides(edge1: TEdge, edge2: TEdge): Unit = js.native
  def TopX(edge: TEdge, currentY: Double): Double = js.native
  def UpdateEdgeIntoAEL(e: TEdge): Unit = js.native
  def get_ReverseSolution(): Boolean = js.native
  def set_ReverseSolution(value: Boolean): Boolean = js.native
}


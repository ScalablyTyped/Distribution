package typings.jsClipper.ClipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TEdge extends js.Object {
  var deltaX: Double
  var deltaY: Double
  var dx: Double
  var next: TEdge
  var nextInAEL: TEdge
  var nextInLML: TEdge
  var nextInSEL: TEdge
  var outIdx: Double
  var polyType: PolyType
  var prev: TEdge
  var prevInAEL: TEdge
  var prevInSEL: TEdge
  var side: EdgeSide
  var tmpX: Double
  var windCnt: Double
  var windCnt2: Double
  var windDelta: Double
  var xbot: Double
  var xcurr: Double
  var xtop: Double
  var ybot: Double
  var ycurr: Double
  var ytop: Double
}

object TEdge {
  @scala.inline
  def apply(
    deltaX: Double,
    deltaY: Double,
    dx: Double,
    next: TEdge,
    nextInAEL: TEdge,
    nextInLML: TEdge,
    nextInSEL: TEdge,
    outIdx: Double,
    polyType: PolyType,
    prev: TEdge,
    prevInAEL: TEdge,
    prevInSEL: TEdge,
    side: EdgeSide,
    tmpX: Double,
    windCnt: Double,
    windCnt2: Double,
    windDelta: Double,
    xbot: Double,
    xcurr: Double,
    xtop: Double,
    ybot: Double,
    ycurr: Double,
    ytop: Double
  ): TEdge = {
    val __obj = js.Dynamic.literal(deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], nextInAEL = nextInAEL.asInstanceOf[js.Any], nextInLML = nextInLML.asInstanceOf[js.Any], nextInSEL = nextInSEL.asInstanceOf[js.Any], outIdx = outIdx.asInstanceOf[js.Any], polyType = polyType.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], prevInAEL = prevInAEL.asInstanceOf[js.Any], prevInSEL = prevInSEL.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any], tmpX = tmpX.asInstanceOf[js.Any], windCnt = windCnt.asInstanceOf[js.Any], windCnt2 = windCnt2.asInstanceOf[js.Any], windDelta = windDelta.asInstanceOf[js.Any], xbot = xbot.asInstanceOf[js.Any], xcurr = xcurr.asInstanceOf[js.Any], xtop = xtop.asInstanceOf[js.Any], ybot = ybot.asInstanceOf[js.Any], ycurr = ycurr.asInstanceOf[js.Any], ytop = ytop.asInstanceOf[js.Any])
    __obj.asInstanceOf[TEdge]
  }
}


package typings.jsClipper.ClipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TEdge extends js.Object {
  var deltaX: Double = js.native
  var deltaY: Double = js.native
  var dx: Double = js.native
  var next: TEdge = js.native
  var nextInAEL: TEdge = js.native
  var nextInLML: TEdge = js.native
  var nextInSEL: TEdge = js.native
  var outIdx: Double = js.native
  var polyType: PolyType = js.native
  var prev: TEdge = js.native
  var prevInAEL: TEdge = js.native
  var prevInSEL: TEdge = js.native
  var side: EdgeSide = js.native
  var tmpX: Double = js.native
  var windCnt: Double = js.native
  var windCnt2: Double = js.native
  var windDelta: Double = js.native
  var xbot: Double = js.native
  var xcurr: Double = js.native
  var xtop: Double = js.native
  var ybot: Double = js.native
  var ycurr: Double = js.native
  var ytop: Double = js.native
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
  @scala.inline
  implicit class TEdgeOps[Self <: TEdge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeltaX(value: Double): Self = this.set("deltaX", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeltaY(value: Double): Self = this.set("deltaY", value.asInstanceOf[js.Any])
    @scala.inline
    def setDx(value: Double): Self = this.set("dx", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: TEdge): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextInAEL(value: TEdge): Self = this.set("nextInAEL", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextInLML(value: TEdge): Self = this.set("nextInLML", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextInSEL(value: TEdge): Self = this.set("nextInSEL", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutIdx(value: Double): Self = this.set("outIdx", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolyType(value: PolyType): Self = this.set("polyType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrev(value: TEdge): Self = this.set("prev", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevInAEL(value: TEdge): Self = this.set("prevInAEL", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevInSEL(value: TEdge): Self = this.set("prevInSEL", value.asInstanceOf[js.Any])
    @scala.inline
    def setSide(value: EdgeSide): Self = this.set("side", value.asInstanceOf[js.Any])
    @scala.inline
    def setTmpX(value: Double): Self = this.set("tmpX", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindCnt(value: Double): Self = this.set("windCnt", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindCnt2(value: Double): Self = this.set("windCnt2", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindDelta(value: Double): Self = this.set("windDelta", value.asInstanceOf[js.Any])
    @scala.inline
    def setXbot(value: Double): Self = this.set("xbot", value.asInstanceOf[js.Any])
    @scala.inline
    def setXcurr(value: Double): Self = this.set("xcurr", value.asInstanceOf[js.Any])
    @scala.inline
    def setXtop(value: Double): Self = this.set("xtop", value.asInstanceOf[js.Any])
    @scala.inline
    def setYbot(value: Double): Self = this.set("ybot", value.asInstanceOf[js.Any])
    @scala.inline
    def setYcurr(value: Double): Self = this.set("ycurr", value.asInstanceOf[js.Any])
    @scala.inline
    def setYtop(value: Double): Self = this.set("ytop", value.asInstanceOf[js.Any])
  }
  
}


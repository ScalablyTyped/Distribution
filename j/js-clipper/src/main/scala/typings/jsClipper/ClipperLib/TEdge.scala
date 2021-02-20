package typings.jsClipper.ClipperLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TEdge extends StObject {
  
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
  implicit class TEdgeMutableBuilder[Self <: TEdge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: TEdge): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextInAEL(value: TEdge): Self = StObject.set(x, "nextInAEL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextInLML(value: TEdge): Self = StObject.set(x, "nextInLML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextInSEL(value: TEdge): Self = StObject.set(x, "nextInSEL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutIdx(value: Double): Self = StObject.set(x, "outIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolyType(value: PolyType): Self = StObject.set(x, "polyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrev(value: TEdge): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevInAEL(value: TEdge): Self = StObject.set(x, "prevInAEL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevInSEL(value: TEdge): Self = StObject.set(x, "prevInSEL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSide(value: EdgeSide): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTmpX(value: Double): Self = StObject.set(x, "tmpX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindCnt(value: Double): Self = StObject.set(x, "windCnt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindCnt2(value: Double): Self = StObject.set(x, "windCnt2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindDelta(value: Double): Self = StObject.set(x, "windDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXbot(value: Double): Self = StObject.set(x, "xbot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXcurr(value: Double): Self = StObject.set(x, "xcurr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXtop(value: Double): Self = StObject.set(x, "xtop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYbot(value: Double): Self = StObject.set(x, "ybot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYcurr(value: Double): Self = StObject.set(x, "ycurr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYtop(value: Double): Self = StObject.set(x, "ytop", value.asInstanceOf[js.Any])
  }
}

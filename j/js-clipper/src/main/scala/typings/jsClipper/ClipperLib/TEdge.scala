package typings.jsClipper.ClipperLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TEdge extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: TEdge](x: Self) {
    
    inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
    
    inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
    
    inline def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    inline def setNext(value: TEdge): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextInAEL(value: TEdge): Self = StObject.set(x, "nextInAEL", value.asInstanceOf[js.Any])
    
    inline def setNextInLML(value: TEdge): Self = StObject.set(x, "nextInLML", value.asInstanceOf[js.Any])
    
    inline def setNextInSEL(value: TEdge): Self = StObject.set(x, "nextInSEL", value.asInstanceOf[js.Any])
    
    inline def setOutIdx(value: Double): Self = StObject.set(x, "outIdx", value.asInstanceOf[js.Any])
    
    inline def setPolyType(value: PolyType): Self = StObject.set(x, "polyType", value.asInstanceOf[js.Any])
    
    inline def setPrev(value: TEdge): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    inline def setPrevInAEL(value: TEdge): Self = StObject.set(x, "prevInAEL", value.asInstanceOf[js.Any])
    
    inline def setPrevInSEL(value: TEdge): Self = StObject.set(x, "prevInSEL", value.asInstanceOf[js.Any])
    
    inline def setSide(value: EdgeSide): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setTmpX(value: Double): Self = StObject.set(x, "tmpX", value.asInstanceOf[js.Any])
    
    inline def setWindCnt(value: Double): Self = StObject.set(x, "windCnt", value.asInstanceOf[js.Any])
    
    inline def setWindCnt2(value: Double): Self = StObject.set(x, "windCnt2", value.asInstanceOf[js.Any])
    
    inline def setWindDelta(value: Double): Self = StObject.set(x, "windDelta", value.asInstanceOf[js.Any])
    
    inline def setXbot(value: Double): Self = StObject.set(x, "xbot", value.asInstanceOf[js.Any])
    
    inline def setXcurr(value: Double): Self = StObject.set(x, "xcurr", value.asInstanceOf[js.Any])
    
    inline def setXtop(value: Double): Self = StObject.set(x, "xtop", value.asInstanceOf[js.Any])
    
    inline def setYbot(value: Double): Self = StObject.set(x, "ybot", value.asInstanceOf[js.Any])
    
    inline def setYcurr(value: Double): Self = StObject.set(x, "ycurr", value.asInstanceOf[js.Any])
    
    inline def setYtop(value: Double): Self = StObject.set(x, "ytop", value.asInstanceOf[js.Any])
  }
}

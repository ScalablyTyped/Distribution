package typings.jsClipper.ClipperLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutRec extends StObject {
  
  var AppendLink: OutRec
  
  var FirstLeft: TEdge
  
  var bottomPt: OutPt
  
  var idx: Double
  
  var isHole: Boolean
  
  var pts: OutPt
}
object OutRec {
  
  inline def apply(AppendLink: OutRec, FirstLeft: TEdge, bottomPt: OutPt, idx: Double, isHole: Boolean, pts: OutPt): OutRec = {
    val __obj = js.Dynamic.literal(AppendLink = AppendLink.asInstanceOf[js.Any], FirstLeft = FirstLeft.asInstanceOf[js.Any], bottomPt = bottomPt.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any], isHole = isHole.asInstanceOf[js.Any], pts = pts.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutRec]
  }
  
  extension [Self <: OutRec](x: Self) {
    
    inline def setAppendLink(value: OutRec): Self = StObject.set(x, "AppendLink", value.asInstanceOf[js.Any])
    
    inline def setBottomPt(value: OutPt): Self = StObject.set(x, "bottomPt", value.asInstanceOf[js.Any])
    
    inline def setFirstLeft(value: TEdge): Self = StObject.set(x, "FirstLeft", value.asInstanceOf[js.Any])
    
    inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    
    inline def setIsHole(value: Boolean): Self = StObject.set(x, "isHole", value.asInstanceOf[js.Any])
    
    inline def setPts(value: OutPt): Self = StObject.set(x, "pts", value.asInstanceOf[js.Any])
  }
}

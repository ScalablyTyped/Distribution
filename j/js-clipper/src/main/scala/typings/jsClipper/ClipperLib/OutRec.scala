package typings.jsClipper.ClipperLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutRec extends StObject {
  
  var AppendLink: OutRec = js.native
  
  var FirstLeft: TEdge = js.native
  
  var bottomPt: OutPt = js.native
  
  var idx: Double = js.native
  
  var isHole: Boolean = js.native
  
  var pts: OutPt = js.native
}
object OutRec {
  
  @scala.inline
  def apply(AppendLink: OutRec, FirstLeft: TEdge, bottomPt: OutPt, idx: Double, isHole: Boolean, pts: OutPt): OutRec = {
    val __obj = js.Dynamic.literal(AppendLink = AppendLink.asInstanceOf[js.Any], FirstLeft = FirstLeft.asInstanceOf[js.Any], bottomPt = bottomPt.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any], isHole = isHole.asInstanceOf[js.Any], pts = pts.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutRec]
  }
  
  @scala.inline
  implicit class OutRecMutableBuilder[Self <: OutRec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendLink(value: OutRec): Self = StObject.set(x, "AppendLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomPt(value: OutPt): Self = StObject.set(x, "bottomPt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstLeft(value: TEdge): Self = StObject.set(x, "FirstLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHole(value: Boolean): Self = StObject.set(x, "isHole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPts(value: OutPt): Self = StObject.set(x, "pts", value.asInstanceOf[js.Any])
  }
}

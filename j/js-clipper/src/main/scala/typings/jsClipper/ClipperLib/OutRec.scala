package typings.jsClipper.ClipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutRec extends js.Object {
  
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
  implicit class OutRecOps[Self <: OutRec] (val x: Self) extends AnyVal {
    
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
    def setAppendLink(value: OutRec): Self = this.set("AppendLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstLeft(value: TEdge): Self = this.set("FirstLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomPt(value: OutPt): Self = this.set("bottomPt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdx(value: Double): Self = this.set("idx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHole(value: Boolean): Self = this.set("isHole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPts(value: OutPt): Self = this.set("pts", value.asInstanceOf[js.Any])
  }
}

package typings.jsClipper.ClipperLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutPt extends StObject {
  
  var idx: Double = js.native
  
  var next: OutPt = js.native
  
  var prev: OutPt = js.native
  
  var pt: OutPt = js.native
}
object OutPt {
  
  @scala.inline
  def apply(idx: Double, next: OutPt, prev: OutPt, pt: OutPt): OutPt = {
    val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], pt = pt.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutPt]
  }
  
  @scala.inline
  implicit class OutPtMutableBuilder[Self <: OutPt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: OutPt): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrev(value: OutPt): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPt(value: OutPt): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
  }
}

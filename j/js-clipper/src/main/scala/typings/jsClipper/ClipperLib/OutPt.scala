package typings.jsClipper.ClipperLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutPt extends StObject {
  
  var idx: Double
  
  var next: OutPt
  
  var prev: OutPt
  
  var pt: OutPt
}
object OutPt {
  
  inline def apply(idx: Double, next: OutPt, prev: OutPt, pt: OutPt): OutPt = {
    val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], pt = pt.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutPt]
  }
  
  extension [Self <: OutPt](x: Self) {
    
    inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    
    inline def setNext(value: OutPt): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setPrev(value: OutPt): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    inline def setPt(value: OutPt): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
  }
}

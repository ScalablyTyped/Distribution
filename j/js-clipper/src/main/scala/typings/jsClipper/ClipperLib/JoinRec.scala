package typings.jsClipper.ClipperLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JoinRec extends StObject {
  
  var poly1Idx: Double
  
  var poly2Idx: Double
  
  var pt1a: IntPoint
  
  var pt1b: IntPoint
  
  var pt2a: IntPoint
  
  var pt2b: IntPoint
}
object JoinRec {
  
  inline def apply(poly1Idx: Double, poly2Idx: Double, pt1a: IntPoint, pt1b: IntPoint, pt2a: IntPoint, pt2b: IntPoint): JoinRec = {
    val __obj = js.Dynamic.literal(poly1Idx = poly1Idx.asInstanceOf[js.Any], poly2Idx = poly2Idx.asInstanceOf[js.Any], pt1a = pt1a.asInstanceOf[js.Any], pt1b = pt1b.asInstanceOf[js.Any], pt2a = pt2a.asInstanceOf[js.Any], pt2b = pt2b.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinRec]
  }
  
  extension [Self <: JoinRec](x: Self) {
    
    inline def setPoly1Idx(value: Double): Self = StObject.set(x, "poly1Idx", value.asInstanceOf[js.Any])
    
    inline def setPoly2Idx(value: Double): Self = StObject.set(x, "poly2Idx", value.asInstanceOf[js.Any])
    
    inline def setPt1a(value: IntPoint): Self = StObject.set(x, "pt1a", value.asInstanceOf[js.Any])
    
    inline def setPt1b(value: IntPoint): Self = StObject.set(x, "pt1b", value.asInstanceOf[js.Any])
    
    inline def setPt2a(value: IntPoint): Self = StObject.set(x, "pt2a", value.asInstanceOf[js.Any])
    
    inline def setPt2b(value: IntPoint): Self = StObject.set(x, "pt2b", value.asInstanceOf[js.Any])
  }
}

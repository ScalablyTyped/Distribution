package typings.jsClipper.ClipperLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntersectNode extends StObject {
  
  var edge1: TEdge
  
  var edge2: TEdge
  
  var next: TEdge
  
  var pt: TEdge
}
object IntersectNode {
  
  @scala.inline
  def apply(edge1: TEdge, edge2: TEdge, next: TEdge, pt: TEdge): IntersectNode = {
    val __obj = js.Dynamic.literal(edge1 = edge1.asInstanceOf[js.Any], edge2 = edge2.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], pt = pt.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectNode]
  }
  
  @scala.inline
  implicit class IntersectNodeMutableBuilder[Self <: IntersectNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdge1(value: TEdge): Self = StObject.set(x, "edge1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdge2(value: TEdge): Self = StObject.set(x, "edge2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: TEdge): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPt(value: TEdge): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
  }
}

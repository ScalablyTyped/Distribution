package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EagerPrimMST extends StObject {
  
  var marked: js.Any
  
  var mst: js.Array[Edge]
  
  var pq: js.Any
  
  def visit(G: WeightedGraph, v: Double): Unit
}
object EagerPrimMST {
  
  @scala.inline
  def apply(marked: js.Any, mst: js.Array[Edge], pq: js.Any, visit: (WeightedGraph, Double) => Unit): EagerPrimMST = {
    val __obj = js.Dynamic.literal(marked = marked.asInstanceOf[js.Any], mst = mst.asInstanceOf[js.Any], pq = pq.asInstanceOf[js.Any], visit = js.Any.fromFunction2(visit))
    __obj.asInstanceOf[EagerPrimMST]
  }
  
  @scala.inline
  implicit class EagerPrimMSTMutableBuilder[Self <: EagerPrimMST] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarked(value: js.Any): Self = StObject.set(x, "marked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMst(value: js.Array[Edge]): Self = StObject.set(x, "mst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMstVarargs(value: Edge*): Self = StObject.set(x, "mst", js.Array(value :_*))
    
    @scala.inline
    def setPq(value: js.Any): Self = StObject.set(x, "pq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisit(value: (WeightedGraph, Double) => Unit): Self = StObject.set(x, "visit", js.Any.fromFunction2(value))
  }
}

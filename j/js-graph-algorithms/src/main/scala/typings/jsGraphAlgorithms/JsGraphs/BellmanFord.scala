package typings.jsGraphAlgorithms.JsGraphs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BellmanFord extends StObject {
  
  var cost: js.Any
  
  def distanceTo(v: Double): Double
  
  var edgeTo: js.Any
  
  def hasPathTo(v: Double): Boolean
  
  var marked: js.Any
  
  def pathTo(v: Double): js.Array[Edge]
  
  def relax(e: Edge): Unit
  
  var s: js.Any
}
object BellmanFord {
  
  @scala.inline
  def apply(
    cost: js.Any,
    distanceTo: Double => Double,
    edgeTo: js.Any,
    hasPathTo: Double => Boolean,
    marked: js.Any,
    pathTo: Double => js.Array[Edge],
    relax: Edge => Unit,
    s: js.Any
  ): BellmanFord = {
    val __obj = js.Dynamic.literal(cost = cost.asInstanceOf[js.Any], distanceTo = js.Any.fromFunction1(distanceTo), edgeTo = edgeTo.asInstanceOf[js.Any], hasPathTo = js.Any.fromFunction1(hasPathTo), marked = marked.asInstanceOf[js.Any], pathTo = js.Any.fromFunction1(pathTo), relax = js.Any.fromFunction1(relax), s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[BellmanFord]
  }
  
  @scala.inline
  implicit class BellmanFordMutableBuilder[Self <: BellmanFord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCost(value: js.Any): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceTo(value: Double => Double): Self = StObject.set(x, "distanceTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEdgeTo(value: js.Any): Self = StObject.set(x, "edgeTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPathTo(value: Double => Boolean): Self = StObject.set(x, "hasPathTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMarked(value: js.Any): Self = StObject.set(x, "marked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathTo(value: Double => js.Array[Edge]): Self = StObject.set(x, "pathTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRelax(value: Edge => Unit): Self = StObject.set(x, "relax", js.Any.fromFunction1(value))
    
    @scala.inline
    def setS(value: js.Any): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
  }
}

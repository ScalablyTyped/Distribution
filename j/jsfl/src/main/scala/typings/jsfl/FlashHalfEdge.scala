package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The HalfEdge object is the directed side of the edge of a Shape object.
  * An edge has two half edges. You can transverse the contours of a shape by "walking around"
  * these half edges. For example, starting from a half edge, you can trace all the half edges
  * around a contour of a shape, and return to the original half edge.  Half edges are ordered.
  * One half edge represents one side of the edge; the other half edge represents the other side.
  */
@js.native
trait FlashHalfEdge extends StObject {
  
  def getEdge(): FlashEdge = js.native
  
  def getNext(): FlashHalfEdge = js.native
  
  def getOppositeHalfEdge(): FlashHalfEdge = js.native
  
  def getPrev(): FlashHalfEdge = js.native
  
  def getVertex(): FlashVertex = js.native
  
  var id: Double = js.native
  
  var index: Double = js.native
}
object FlashHalfEdge {
  
  @scala.inline
  def apply(
    getEdge: () => FlashEdge,
    getNext: () => FlashHalfEdge,
    getOppositeHalfEdge: () => FlashHalfEdge,
    getPrev: () => FlashHalfEdge,
    getVertex: () => FlashVertex,
    id: Double,
    index: Double
  ): FlashHalfEdge = {
    val __obj = js.Dynamic.literal(getEdge = js.Any.fromFunction0(getEdge), getNext = js.Any.fromFunction0(getNext), getOppositeHalfEdge = js.Any.fromFunction0(getOppositeHalfEdge), getPrev = js.Any.fromFunction0(getPrev), getVertex = js.Any.fromFunction0(getVertex), id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashHalfEdge]
  }
  
  @scala.inline
  implicit class FlashHalfEdgeMutableBuilder[Self <: FlashHalfEdge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetEdge(value: () => FlashEdge): Self = StObject.set(x, "getEdge", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNext(value: () => FlashHalfEdge): Self = StObject.set(x, "getNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOppositeHalfEdge(value: () => FlashHalfEdge): Self = StObject.set(x, "getOppositeHalfEdge", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPrev(value: () => FlashHalfEdge): Self = StObject.set(x, "getPrev", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVertex(value: () => FlashVertex): Self = StObject.set(x, "getVertex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}

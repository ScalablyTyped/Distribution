package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The HalfEdge object is the directed side of the edge of a Shape object.
  * An edge has two half edges. You can transverse the contours of a shape by "walking around"
  * these half edges. For example, starting from a half edge, you can trace all the half edges
  * around a contour of a shape, and return to the original half edge.  Half edges are ordered.
  * One half edge represents one side of the edge; the other half edge represents the other side.
  */
trait FlashHalfEdge extends js.Object {
  var id: scala.Double
  var index: scala.Double
  def getEdge(): FlashEdge
  def getNext(): FlashHalfEdge
  def getOppositeHalfEdge(): FlashHalfEdge
  def getPrev(): FlashHalfEdge
  def getVertex(): FlashVertex
}

object FlashHalfEdge {
  @scala.inline
  def apply(
    getEdge: js.Function0[FlashEdge],
    getNext: js.Function0[FlashHalfEdge],
    getOppositeHalfEdge: js.Function0[FlashHalfEdge],
    getPrev: js.Function0[FlashHalfEdge],
    getVertex: js.Function0[FlashVertex],
    id: scala.Double,
    index: scala.Double
  ): FlashHalfEdge = {
    val __obj = js.Dynamic.literal(getEdge = getEdge, getNext = getNext, getOppositeHalfEdge = getOppositeHalfEdge, getPrev = getPrev, getVertex = getVertex, id = id, index = index)
  
    __obj.asInstanceOf[FlashHalfEdge]
  }
}


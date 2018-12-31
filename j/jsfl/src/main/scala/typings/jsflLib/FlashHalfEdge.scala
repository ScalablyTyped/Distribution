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


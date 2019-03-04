package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashEdge extends js.Object {
  var cubicSegmentIndex: scala.Double
  var id: scala.Double
  var isLine: scala.Boolean
  var stroke: FlashStroke
  def getControl(i: scala.Double): FlashPoint
  def getHalfEdge(index: scala.Double): FlashHalfEdge
  def setControl(index: scala.Double, x: scala.Double, y: scala.Double): scala.Unit
  def splitEdge(t: scala.Double): scala.Unit
}

object FlashEdge {
  @scala.inline
  def apply(
    cubicSegmentIndex: scala.Double,
    getControl: js.Function1[scala.Double, FlashPoint],
    getHalfEdge: js.Function1[scala.Double, FlashHalfEdge],
    id: scala.Double,
    isLine: scala.Boolean,
    setControl: js.Function3[scala.Double, scala.Double, scala.Double, scala.Unit],
    splitEdge: js.Function1[scala.Double, scala.Unit],
    stroke: FlashStroke
  ): FlashEdge = {
    val __obj = js.Dynamic.literal(cubicSegmentIndex = cubicSegmentIndex, getControl = getControl, getHalfEdge = getHalfEdge, id = id, isLine = isLine, setControl = setControl, splitEdge = splitEdge, stroke = stroke)
  
    __obj.asInstanceOf[FlashEdge]
  }
}


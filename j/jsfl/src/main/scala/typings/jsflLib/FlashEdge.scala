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
    getControl: scala.Double => FlashPoint,
    getHalfEdge: scala.Double => FlashHalfEdge,
    id: scala.Double,
    isLine: scala.Boolean,
    setControl: (scala.Double, scala.Double, scala.Double) => scala.Unit,
    splitEdge: scala.Double => scala.Unit,
    stroke: FlashStroke
  ): FlashEdge = {
    val __obj = js.Dynamic.literal(cubicSegmentIndex = cubicSegmentIndex, getControl = js.Any.fromFunction1(getControl), getHalfEdge = js.Any.fromFunction1(getHalfEdge), id = id, isLine = isLine, setControl = js.Any.fromFunction3(setControl), splitEdge = js.Any.fromFunction1(splitEdge), stroke = stroke)
  
    __obj.asInstanceOf[FlashEdge]
  }
}


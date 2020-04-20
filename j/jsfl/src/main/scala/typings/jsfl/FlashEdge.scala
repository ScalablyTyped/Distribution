package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashEdge extends js.Object {
  var cubicSegmentIndex: Double
  var id: Double
  var isLine: Boolean
  var stroke: FlashStroke
  def getControl(i: Double): FlashPoint
  def getHalfEdge(index: Double): FlashHalfEdge
  def setControl(index: Double, x: Double, y: Double): Unit
  def splitEdge(t: Double): Unit
}

object FlashEdge {
  @scala.inline
  def apply(
    cubicSegmentIndex: Double,
    getControl: Double => FlashPoint,
    getHalfEdge: Double => FlashHalfEdge,
    id: Double,
    isLine: Boolean,
    setControl: (Double, Double, Double) => Unit,
    splitEdge: Double => Unit,
    stroke: FlashStroke
  ): FlashEdge = {
    val __obj = js.Dynamic.literal(cubicSegmentIndex = cubicSegmentIndex.asInstanceOf[js.Any], getControl = js.Any.fromFunction1(getControl), getHalfEdge = js.Any.fromFunction1(getHalfEdge), id = id.asInstanceOf[js.Any], isLine = isLine.asInstanceOf[js.Any], setControl = js.Any.fromFunction3(setControl), splitEdge = js.Any.fromFunction1(splitEdge), stroke = stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashEdge]
  }
}


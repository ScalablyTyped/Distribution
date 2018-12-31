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


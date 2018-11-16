package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FlashContour extends js.Object {
  var fill: FlashFill
  var interior: scala.Boolean
  var orientation: scala.Double
  def getHalfEdge(): FlashHalfEdge
}


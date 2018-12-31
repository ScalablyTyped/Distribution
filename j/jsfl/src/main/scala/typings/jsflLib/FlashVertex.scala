package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashVertex extends js.Object {
  var x: scala.Double
  var y: scala.Double
  def getHalfEdge(): FlashHalfEdge
  def setLocation(x: scala.Double, y: scala.Double): js.Any
}


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

object FlashVertex {
  @scala.inline
  def apply(
    getHalfEdge: () => FlashHalfEdge,
    setLocation: (scala.Double, scala.Double) => js.Any,
    x: scala.Double,
    y: scala.Double
  ): FlashVertex = {
    val __obj = js.Dynamic.literal(getHalfEdge = js.Any.fromFunction0(getHalfEdge), setLocation = js.Any.fromFunction2(setLocation), x = x, y = y)
  
    __obj.asInstanceOf[FlashVertex]
  }
}


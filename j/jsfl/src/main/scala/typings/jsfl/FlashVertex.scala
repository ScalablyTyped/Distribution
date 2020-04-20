package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashVertex extends js.Object {
  var x: Double
  var y: Double
  def getHalfEdge(): FlashHalfEdge
  def setLocation(x: Double, y: Double): js.Any
}

object FlashVertex {
  @scala.inline
  def apply(getHalfEdge: () => FlashHalfEdge, setLocation: (Double, Double) => js.Any, x: Double, y: Double): FlashVertex = {
    val __obj = js.Dynamic.literal(getHalfEdge = js.Any.fromFunction0(getHalfEdge), setLocation = js.Any.fromFunction2(setLocation), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashVertex]
  }
}


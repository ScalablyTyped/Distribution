package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuickUnion extends js.Object {
  var id: js.Any
  def connected(v: Double, w: Double): Boolean
  def root(q: Double): Double
  def union(v: Double, w: Double): Unit
}

object QuickUnion {
  @scala.inline
  def apply(
    connected: (Double, Double) => Boolean,
    id: js.Any,
    root: Double => Double,
    union: (Double, Double) => Unit
  ): QuickUnion = {
    val __obj = js.Dynamic.literal(connected = js.Any.fromFunction2(connected), id = id.asInstanceOf[js.Any], root = js.Any.fromFunction1(root), union = js.Any.fromFunction2(union))
    __obj.asInstanceOf[QuickUnion]
  }
}


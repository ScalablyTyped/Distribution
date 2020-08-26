package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuickUnion extends js.Object {
  var id: js.Any = js.native
  def connected(v: Double, w: Double): Boolean = js.native
  def root(q: Double): Double = js.native
  def union(v: Double, w: Double): Unit = js.native
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
  @scala.inline
  implicit class QuickUnionOps[Self <: QuickUnion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnected(value: (Double, Double) => Boolean): Self = this.set("connected", js.Any.fromFunction2(value))
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: Double => Double): Self = this.set("root", js.Any.fromFunction1(value))
    @scala.inline
    def setUnion(value: (Double, Double) => Unit): Self = this.set("union", js.Any.fromFunction2(value))
  }
  
}


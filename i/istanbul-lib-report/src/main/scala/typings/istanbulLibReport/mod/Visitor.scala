package typings.istanbulLibReport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Visitor[N /* <: Node */] extends js.Object {
  def onDetail(root: N, state: js.Any): Unit = js.native
  def onEnd(root: N, state: js.Any): Unit = js.native
  def onStart(root: N, state: js.Any): Unit = js.native
  def onSummary(root: N, state: js.Any): Unit = js.native
  def onSummaryEnd(root: N, state: js.Any): Unit = js.native
}

object Visitor {
  @scala.inline
  def apply[/* <: typings.istanbulLibReport.mod.Node */ N](
    onDetail: (N, js.Any) => Unit,
    onEnd: (N, js.Any) => Unit,
    onStart: (N, js.Any) => Unit,
    onSummary: (N, js.Any) => Unit,
    onSummaryEnd: (N, js.Any) => Unit
  ): Visitor[N] = {
    val __obj = js.Dynamic.literal(onDetail = js.Any.fromFunction2(onDetail), onEnd = js.Any.fromFunction2(onEnd), onStart = js.Any.fromFunction2(onStart), onSummary = js.Any.fromFunction2(onSummary), onSummaryEnd = js.Any.fromFunction2(onSummaryEnd))
    __obj.asInstanceOf[Visitor[N]]
  }
  @scala.inline
  implicit class VisitorOps[Self <: Visitor[_], /* <: typings.istanbulLibReport.mod.Node */ N] (val x: Self with Visitor[N]) extends AnyVal {
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
    def setOnDetail(value: (N, js.Any) => Unit): Self = this.set("onDetail", js.Any.fromFunction2(value))
    @scala.inline
    def setOnEnd(value: (N, js.Any) => Unit): Self = this.set("onEnd", js.Any.fromFunction2(value))
    @scala.inline
    def setOnStart(value: (N, js.Any) => Unit): Self = this.set("onStart", js.Any.fromFunction2(value))
    @scala.inline
    def setOnSummary(value: (N, js.Any) => Unit): Self = this.set("onSummary", js.Any.fromFunction2(value))
    @scala.inline
    def setOnSummaryEnd(value: (N, js.Any) => Unit): Self = this.set("onSummaryEnd", js.Any.fromFunction2(value))
  }
  
}


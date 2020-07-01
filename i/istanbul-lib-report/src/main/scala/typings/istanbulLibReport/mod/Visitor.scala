package typings.istanbulLibReport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor[N /* <: Node */] extends js.Object {
  def onDetail(root: N, state: js.Any): Unit
  def onEnd(root: N, state: js.Any): Unit
  def onStart(root: N, state: js.Any): Unit
  def onSummary(root: N, state: js.Any): Unit
  def onSummaryEnd(root: N, state: js.Any): Unit
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
}


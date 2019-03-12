package typings
package istanbulDashLibDashReportLib.istanbulDashLibDashReportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor[N /* <: Node */] extends js.Object {
  def onDetail(root: N, state: js.Any): scala.Unit
  def onEnd(root: N, state: js.Any): scala.Unit
  def onStart(root: N, state: js.Any): scala.Unit
  def onSummary(root: N, state: js.Any): scala.Unit
  def onSummaryEnd(root: N, state: js.Any): scala.Unit
}

object Visitor {
  @scala.inline
  def apply[N /* <: Node */](
    onDetail: (N, js.Any) => scala.Unit,
    onEnd: (N, js.Any) => scala.Unit,
    onStart: (N, js.Any) => scala.Unit,
    onSummary: (N, js.Any) => scala.Unit,
    onSummaryEnd: (N, js.Any) => scala.Unit
  ): Visitor[N] = {
    val __obj = js.Dynamic.literal(onDetail = js.Any.fromFunction2(onDetail), onEnd = js.Any.fromFunction2(onEnd), onStart = js.Any.fromFunction2(onStart), onSummary = js.Any.fromFunction2(onSummary), onSummaryEnd = js.Any.fromFunction2(onSummaryEnd))
  
    __obj.asInstanceOf[Visitor[N]]
  }
}


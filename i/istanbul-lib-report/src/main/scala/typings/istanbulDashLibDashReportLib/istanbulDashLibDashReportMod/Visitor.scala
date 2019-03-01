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
    onDetail: js.Function2[N, js.Any, scala.Unit],
    onEnd: js.Function2[N, js.Any, scala.Unit],
    onStart: js.Function2[N, js.Any, scala.Unit],
    onSummary: js.Function2[N, js.Any, scala.Unit],
    onSummaryEnd: js.Function2[N, js.Any, scala.Unit]
  ): Visitor[N] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onDetail")(onDetail)
    __obj.updateDynamic("onEnd")(onEnd)
    __obj.updateDynamic("onStart")(onStart)
    __obj.updateDynamic("onSummary")(onSummary)
    __obj.updateDynamic("onSummaryEnd")(onSummaryEnd)
    __obj.asInstanceOf[Visitor[N]]
  }
}


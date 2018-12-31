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


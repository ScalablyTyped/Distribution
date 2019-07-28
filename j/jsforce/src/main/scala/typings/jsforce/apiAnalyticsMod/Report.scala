package typings.jsforce.apiAnalyticsMod

import typings.jsforce.connectionMod.Callback
import typings.jsforce.queryMod.ExplainInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/api/analytics", "Report")
@js.native
class Report () extends js.Object {
  def clone(name: String): js.Promise[ReportResult] = js.native
  def clone(name: String, callback: Callback[ReportResult]): js.Promise[ReportResult] = js.native
  def del(): js.Promise[ReportResult] = js.native
  def del(callback: Callback[ReportResult]): js.Promise[ReportResult] = js.native
  def delete(): js.Promise[ReportResult] = js.native
  def delete(callback: Callback[ReportResult]): js.Promise[ReportResult] = js.native
  def describe(): js.Promise[ReportMetadata] = js.native
  def describe(callback: Callback[ReportMetadata]): js.Promise[ReportMetadata] = js.native
  def destory(): js.Promise[ReportResult] = js.native
  def destory(callback: Callback[ReportResult]): js.Promise[ReportResult] = js.native
  def exec(options: js.Function0[_ | js.Object]): js.Promise[ReportResult] = js.native
  def exec(options: js.Function0[_ | js.Object], callback: Callback[ReportResult]): js.Promise[ReportResult] = js.native
  def execute(options: js.Function0[_ | js.Object]): js.Promise[ReportResult] = js.native
  def execute(options: js.Function0[_ | js.Object], callback: Callback[ReportResult]): js.Promise[ReportResult] = js.native
  def executeAsync(options: js.Function0[_ | js.Object]): js.Promise[ReportInstanceAttrs] = js.native
  def executeAsync(options: js.Function0[_ | js.Object], callback: Callback[ReportInstanceAttrs]): js.Promise[ReportInstanceAttrs] = js.native
  def explain(): js.Promise[ExplainInfo] = js.native
  def explain(callback: Callback[ExplainInfo]): js.Promise[ExplainInfo] = js.native
  def instance(id: String): ReportInstance = js.native
  def instances(): js.Promise[js.Array[ReportInstance]] = js.native
  def instances(callback: Callback[js.Array[ReportInstance]]): js.Promise[js.Array[ReportInstance]] = js.native
  def run(options: js.Function0[_ | js.Object]): js.Promise[ReportResult] = js.native
  def run(options: js.Function0[_ | js.Object], callback: Callback[ReportResult]): js.Promise[ReportResult] = js.native
}


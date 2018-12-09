package typings
package jsforceLib.apiAnalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/api/analytics", "Report")
@js.native
class Report () extends js.Object {
  def clone(name: java.lang.String): js.Promise[ReportResult] = js.native
  def clone(name: java.lang.String, callback: jsforceLib.connectionMod.Callback[ReportResult]): js.Promise[ReportResult] = js.native
  def del(): js.Promise[ReportResult] = js.native
  def del(callback: jsforceLib.connectionMod.Callback[ReportResult]): js.Promise[ReportResult] = js.native
  def delete(): js.Promise[ReportResult] = js.native
  def delete(callback: jsforceLib.connectionMod.Callback[ReportResult]): js.Promise[ReportResult] = js.native
  def describe(): js.Promise[ReportMetadata] = js.native
  def describe(callback: jsforceLib.connectionMod.Callback[ReportMetadata]): js.Promise[ReportMetadata] = js.native
  def destory(): js.Promise[ReportResult] = js.native
  def destory(callback: jsforceLib.connectionMod.Callback[ReportResult]): js.Promise[ReportResult] = js.native
  def exec(options: js.Function0[_ | js.Object]): js.Promise[ReportResult] = js.native
  def exec(options: js.Function0[_ | js.Object], callback: jsforceLib.connectionMod.Callback[ReportResult]): js.Promise[ReportResult] = js.native
  def execute(options: js.Function0[_ | js.Object]): js.Promise[ReportResult] = js.native
  def execute(options: js.Function0[_ | js.Object], callback: jsforceLib.connectionMod.Callback[ReportResult]): js.Promise[ReportResult] = js.native
  def executeAsync(options: js.Function0[_ | js.Object]): js.Promise[ReportInstanceAttrs] = js.native
  def executeAsync(
    options: js.Function0[_ | js.Object],
    callback: jsforceLib.connectionMod.Callback[ReportInstanceAttrs]
  ): js.Promise[ReportInstanceAttrs] = js.native
  def explain(): js.Promise[jsforceLib.queryMod.ExplainInfo] = js.native
  def explain(callback: jsforceLib.connectionMod.Callback[jsforceLib.queryMod.ExplainInfo]): js.Promise[jsforceLib.queryMod.ExplainInfo] = js.native
  def instance(id: java.lang.String): ReportInstance = js.native
  def instances(): js.Promise[js.Array[ReportInstance]] = js.native
  def instances(callback: jsforceLib.connectionMod.Callback[js.Array[ReportInstance]]): js.Promise[js.Array[ReportInstance]] = js.native
  def run(options: js.Function0[_ | js.Object]): js.Promise[ReportResult] = js.native
  def run(options: js.Function0[_ | js.Object], callback: jsforceLib.connectionMod.Callback[ReportResult]): js.Promise[ReportResult] = js.native
}


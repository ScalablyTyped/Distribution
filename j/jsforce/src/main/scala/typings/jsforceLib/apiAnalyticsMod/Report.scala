package typings
package jsforceLib.apiAnalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/api/analytics", "Report")
@js.native
class Report () extends js.Object {
  def clone(name: java.lang.String): stdLib.Promise[ReportResult] = js.native
  def clone(name: java.lang.String, callback: jsforceLib.connectionMod.Callback[ReportResult]): stdLib.Promise[ReportResult] = js.native
  def del(): stdLib.Promise[ReportResult] = js.native
  def del(callback: jsforceLib.connectionMod.Callback[ReportResult]): stdLib.Promise[ReportResult] = js.native
  def delete(): stdLib.Promise[ReportResult] = js.native
  def delete(callback: jsforceLib.connectionMod.Callback[ReportResult]): stdLib.Promise[ReportResult] = js.native
  def describe(): stdLib.Promise[ReportMetadata] = js.native
  def describe(callback: jsforceLib.connectionMod.Callback[ReportMetadata]): stdLib.Promise[ReportMetadata] = js.native
  def destory(): stdLib.Promise[ReportResult] = js.native
  def destory(callback: jsforceLib.connectionMod.Callback[ReportResult]): stdLib.Promise[ReportResult] = js.native
  def exec(options: js.Function0[_ | js.Object]): stdLib.Promise[ReportResult] = js.native
  def exec(options: js.Function0[_ | js.Object], callback: jsforceLib.connectionMod.Callback[ReportResult]): stdLib.Promise[ReportResult] = js.native
  def execute(options: js.Function0[_ | js.Object]): stdLib.Promise[ReportResult] = js.native
  def execute(options: js.Function0[_ | js.Object], callback: jsforceLib.connectionMod.Callback[ReportResult]): stdLib.Promise[ReportResult] = js.native
  def executeAsync(options: js.Function0[_ | js.Object]): stdLib.Promise[ReportInstanceAttrs] = js.native
  def executeAsync(
    options: js.Function0[_ | js.Object],
    callback: jsforceLib.connectionMod.Callback[ReportInstanceAttrs]
  ): stdLib.Promise[ReportInstanceAttrs] = js.native
  def explain(): stdLib.Promise[jsforceLib.queryMod.ExplainInfo] = js.native
  def explain(callback: jsforceLib.connectionMod.Callback[jsforceLib.queryMod.ExplainInfo]): stdLib.Promise[jsforceLib.queryMod.ExplainInfo] = js.native
  def instance(id: java.lang.String): ReportInstance = js.native
  def instances(): stdLib.Promise[js.Array[ReportInstance]] = js.native
  def instances(callback: jsforceLib.connectionMod.Callback[js.Array[ReportInstance]]): stdLib.Promise[js.Array[ReportInstance]] = js.native
  def run(options: js.Function0[_ | js.Object]): stdLib.Promise[ReportResult] = js.native
  def run(options: js.Function0[_ | js.Object], callback: jsforceLib.connectionMod.Callback[ReportResult]): stdLib.Promise[ReportResult] = js.native
}


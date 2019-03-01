package typings
package jsreportDashPhantomDashPdfLib.jsreportDashPhantomDashPdfMod.JsReportPhantomPdfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// const enum PhantomStrategy {
//   dedicatedProcess = 'dedicated-process',
//   phantomServer = 'phantom-server'
// }
trait Options extends js.Object {
  var allowLocalFilesAccess: scala.Boolean
  // appDirectory: string;
  var defaultPhantomjsVersion: java.lang.String
  var strategy: jsreportDashPhantomDashPdfLib.jsreportDashPhantomDashPdfLibStrings.`dedicated-process` | jsreportDashPhantomDashPdfLib.jsreportDashPhantomDashPdfLibStrings.`phantom-server`
  var timeout: scala.Double
}

object Options {
  @scala.inline
  def apply(
    allowLocalFilesAccess: scala.Boolean,
    defaultPhantomjsVersion: java.lang.String,
    strategy: jsreportDashPhantomDashPdfLib.jsreportDashPhantomDashPdfLibStrings.`dedicated-process` | jsreportDashPhantomDashPdfLib.jsreportDashPhantomDashPdfLibStrings.`phantom-server`,
    timeout: scala.Double
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowLocalFilesAccess")(allowLocalFilesAccess)
    __obj.updateDynamic("defaultPhantomjsVersion")(defaultPhantomjsVersion)
    __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[Options]
  }
}


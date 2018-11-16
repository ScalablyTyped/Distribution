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


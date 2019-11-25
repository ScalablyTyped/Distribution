package typings.jsreportDashPhantomDashPdf.jsreportDashPhantomDashPdfMod

import typings.jsreportDashPhantomDashPdf.jsreportDashPhantomDashPdfStrings.`dedicated-process`
import typings.jsreportDashPhantomDashPdf.jsreportDashPhantomDashPdfStrings.`phantom-server`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// const enum PhantomStrategy {
//   dedicatedProcess = 'dedicated-process',
//   phantomServer = 'phantom-server'
// }
trait Options extends js.Object {
  var allowLocalFilesAccess: Boolean
  // appDirectory: string;
  var defaultPhantomjsVersion: String
  var strategy: `dedicated-process` | `phantom-server`
  var timeout: Double
}

object Options {
  @scala.inline
  def apply(
    allowLocalFilesAccess: Boolean,
    defaultPhantomjsVersion: String,
    strategy: `dedicated-process` | `phantom-server`,
    timeout: Double
  ): Options = {
    val __obj = js.Dynamic.literal(allowLocalFilesAccess = allowLocalFilesAccess.asInstanceOf[js.Any], defaultPhantomjsVersion = defaultPhantomjsVersion.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}


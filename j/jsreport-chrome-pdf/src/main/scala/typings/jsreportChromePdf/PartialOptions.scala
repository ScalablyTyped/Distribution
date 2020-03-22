package typings.jsreportChromePdf

import typings.jsreportChromePdf.jsreportChromePdfStrings.`dedicated-process`
import typings.jsreportChromePdf.jsreportChromePdfStrings.`http-server`
import typings.jsreportChromePdf.jsreportChromePdfStrings.`in-process`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jsreport-chrome-pdf.jsreport-chrome-pdf.Options> */
trait PartialOptions extends js.Object {
  var allowLocalFilesAccess: js.UndefOr[Boolean] = js.undefined
  var allowedModules: js.UndefOr[js.Array[String]] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var launchOptions: js.UndefOr[PartialLaunchOptions] = js.undefined
  var numberOfWorkers: js.UndefOr[Double] = js.undefined
  var portLeftBoundary: js.UndefOr[Double] = js.undefined
  var portRightBoundary: js.UndefOr[Double] = js.undefined
  var strategy: js.UndefOr[`dedicated-process` | `http-server` | `in-process`] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    allowLocalFilesAccess: js.UndefOr[Boolean] = js.undefined,
    allowedModules: js.Array[String] = null,
    host: String = null,
    launchOptions: PartialLaunchOptions = null,
    numberOfWorkers: Int | Double = null,
    portLeftBoundary: Int | Double = null,
    portRightBoundary: Int | Double = null,
    strategy: `dedicated-process` | `http-server` | `in-process` = null,
    timeout: Int | Double = null
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowLocalFilesAccess)) __obj.updateDynamic("allowLocalFilesAccess")(allowLocalFilesAccess.asInstanceOf[js.Any])
    if (allowedModules != null) __obj.updateDynamic("allowedModules")(allowedModules.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (launchOptions != null) __obj.updateDynamic("launchOptions")(launchOptions.asInstanceOf[js.Any])
    if (numberOfWorkers != null) __obj.updateDynamic("numberOfWorkers")(numberOfWorkers.asInstanceOf[js.Any])
    if (portLeftBoundary != null) __obj.updateDynamic("portLeftBoundary")(portLeftBoundary.asInstanceOf[js.Any])
    if (portRightBoundary != null) __obj.updateDynamic("portRightBoundary")(portRightBoundary.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}


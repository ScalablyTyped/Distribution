package typings.jsreportChromePdf.anon

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
    numberOfWorkers: js.UndefOr[Double] = js.undefined,
    portLeftBoundary: js.UndefOr[Double] = js.undefined,
    portRightBoundary: js.UndefOr[Double] = js.undefined,
    strategy: `dedicated-process` | `http-server` | `in-process` = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowLocalFilesAccess)) __obj.updateDynamic("allowLocalFilesAccess")(allowLocalFilesAccess.get.asInstanceOf[js.Any])
    if (allowedModules != null) __obj.updateDynamic("allowedModules")(allowedModules.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (launchOptions != null) __obj.updateDynamic("launchOptions")(launchOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfWorkers)) __obj.updateDynamic("numberOfWorkers")(numberOfWorkers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(portLeftBoundary)) __obj.updateDynamic("portLeftBoundary")(portLeftBoundary.get.asInstanceOf[js.Any])
    if (!js.isUndefined(portRightBoundary)) __obj.updateDynamic("portRightBoundary")(portRightBoundary.get.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}


package typings.jsreportPhantomPdf

import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.`dedicated-process`
import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.`phantom-server`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jsreport-phantom-pdf.jsreport-phantom-pdf.Options> */
trait PartialOptions extends js.Object {
  var allowLocalFilesAccess: js.UndefOr[Boolean] = js.undefined
  var defaultPhantomjsVersion: js.UndefOr[String] = js.undefined
  var strategy: js.UndefOr[`dedicated-process` | `phantom-server`] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    allowLocalFilesAccess: js.UndefOr[Boolean] = js.undefined,
    defaultPhantomjsVersion: String = null,
    strategy: `dedicated-process` | `phantom-server` = null,
    timeout: Int | Double = null
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowLocalFilesAccess)) __obj.updateDynamic("allowLocalFilesAccess")(allowLocalFilesAccess.asInstanceOf[js.Any])
    if (defaultPhantomjsVersion != null) __obj.updateDynamic("defaultPhantomjsVersion")(defaultPhantomjsVersion.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}


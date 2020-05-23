package typings.istanbulLibReport.anon

import typings.istanbulLibReport.mod.Summarizers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<istanbul-lib-report.istanbul-lib-report.ReportBaseOptions> */
trait PartialReportBaseOptions extends js.Object {
  var summarizer: js.UndefOr[Summarizers] = js.undefined
}

object PartialReportBaseOptions {
  @scala.inline
  def apply(summarizer: Summarizers = null): PartialReportBaseOptions = {
    val __obj = js.Dynamic.literal()
    if (summarizer != null) __obj.updateDynamic("summarizer")(summarizer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialReportBaseOptions]
  }
}


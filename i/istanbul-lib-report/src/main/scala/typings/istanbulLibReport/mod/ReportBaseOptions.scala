package typings.istanbulLibReport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportBaseOptions extends js.Object {
  var summarizer: Summarizers
}

object ReportBaseOptions {
  @scala.inline
  def apply(summarizer: Summarizers): ReportBaseOptions = {
    val __obj = js.Dynamic.literal(summarizer = summarizer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportBaseOptions]
  }
}


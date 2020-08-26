package typings.istanbulLibReport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportBaseOptions extends js.Object {
  var summarizer: Summarizers = js.native
}

object ReportBaseOptions {
  @scala.inline
  def apply(summarizer: Summarizers): ReportBaseOptions = {
    val __obj = js.Dynamic.literal(summarizer = summarizer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportBaseOptions]
  }
  @scala.inline
  implicit class ReportBaseOptionsOps[Self <: ReportBaseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSummarizer(value: Summarizers): Self = this.set("summarizer", value.asInstanceOf[js.Any])
  }
  
}


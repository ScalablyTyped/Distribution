package typings.istanbulReports.mod

import typings.istanbulReports.istanbulReportsStrings.branches
import typings.istanbulReports.istanbulReportsStrings.functions
import typings.istanbulReports.istanbulReportsStrings.lines
import typings.istanbulReports.istanbulReportsStrings.statements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlSpaOptions extends HtmlOptions {
  var metricsToShow: js.Array[lines | branches | functions | statements] = js.native
}

object HtmlSpaOptions {
  @scala.inline
  def apply(
    linkMapper: LinkMapper,
    metricsToShow: js.Array[lines | branches | functions | statements],
    skipEmpty: Boolean,
    subdir: String,
    verbose: Boolean
  ): HtmlSpaOptions = {
    val __obj = js.Dynamic.literal(linkMapper = linkMapper.asInstanceOf[js.Any], metricsToShow = metricsToShow.asInstanceOf[js.Any], skipEmpty = skipEmpty.asInstanceOf[js.Any], subdir = subdir.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlSpaOptions]
  }
  @scala.inline
  implicit class HtmlSpaOptionsOps[Self <: HtmlSpaOptions] (val x: Self) extends AnyVal {
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
    def setMetricsToShowVarargs(value: (lines | branches | functions | statements)*): Self = this.set("metricsToShow", js.Array(value :_*))
    @scala.inline
    def setMetricsToShow(value: js.Array[lines | branches | functions | statements]): Self = this.set("metricsToShow", value.asInstanceOf[js.Any])
  }
  
}


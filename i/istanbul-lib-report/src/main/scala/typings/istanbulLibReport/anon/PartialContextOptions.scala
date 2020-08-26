package typings.istanbulLibReport.anon

import typings.istanbulLibCoverage.mod.CoverageMap
import typings.istanbulLibReport.mod.Summarizers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<istanbul-lib-report.istanbul-lib-report.ContextOptions> */
@js.native
trait PartialContextOptions extends js.Object {
  var coverageMap: js.UndefOr[CoverageMap] = js.native
  var defaultSummarizer: js.UndefOr[Summarizers] = js.native
  var dir: js.UndefOr[String] = js.native
  var sourceFinder: js.UndefOr[js.Function1[/* filepath */ String, String]] = js.native
  var watermarks: js.UndefOr[PartialWatermarks] = js.native
}

object PartialContextOptions {
  @scala.inline
  def apply(): PartialContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialContextOptions]
  }
  @scala.inline
  implicit class PartialContextOptionsOps[Self <: PartialContextOptions] (val x: Self) extends AnyVal {
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
    def setCoverageMap(value: CoverageMap): Self = this.set("coverageMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoverageMap: Self = this.set("coverageMap", js.undefined)
    @scala.inline
    def setDefaultSummarizer(value: Summarizers): Self = this.set("defaultSummarizer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSummarizer: Self = this.set("defaultSummarizer", js.undefined)
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setSourceFinder(value: /* filepath */ String => String): Self = this.set("sourceFinder", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSourceFinder: Self = this.set("sourceFinder", js.undefined)
    @scala.inline
    def setWatermarks(value: PartialWatermarks): Self = this.set("watermarks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatermarks: Self = this.set("watermarks", js.undefined)
  }
  
}


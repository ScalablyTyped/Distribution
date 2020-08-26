package typings.istanbulLibReport.mod

import typings.istanbulLibCoverage.mod.CoverageMap
import typings.istanbulLibReport.anon.PartialWatermarks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextOptions extends js.Object {
  var coverageMap: CoverageMap = js.native
  var defaultSummarizer: Summarizers = js.native
  var dir: String = js.native
  var watermarks: PartialWatermarks = js.native
  def sourceFinder(filepath: String): String = js.native
}

object ContextOptions {
  @scala.inline
  def apply(
    coverageMap: CoverageMap,
    defaultSummarizer: Summarizers,
    dir: String,
    sourceFinder: String => String,
    watermarks: PartialWatermarks
  ): ContextOptions = {
    val __obj = js.Dynamic.literal(coverageMap = coverageMap.asInstanceOf[js.Any], defaultSummarizer = defaultSummarizer.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], sourceFinder = js.Any.fromFunction1(sourceFinder), watermarks = watermarks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextOptions]
  }
  @scala.inline
  implicit class ContextOptionsOps[Self <: ContextOptions] (val x: Self) extends AnyVal {
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
    def setDefaultSummarizer(value: Summarizers): Self = this.set("defaultSummarizer", value.asInstanceOf[js.Any])
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceFinder(value: String => String): Self = this.set("sourceFinder", js.Any.fromFunction1(value))
    @scala.inline
    def setWatermarks(value: PartialWatermarks): Self = this.set("watermarks", value.asInstanceOf[js.Any])
  }
  
}


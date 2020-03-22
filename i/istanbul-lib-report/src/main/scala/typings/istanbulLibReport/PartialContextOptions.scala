package typings.istanbulLibReport

import typings.istanbulLibCoverage.mod.CoverageMap
import typings.istanbulLibReport.mod.Summarizers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<istanbul-lib-report.istanbul-lib-report.ContextOptions> */
trait PartialContextOptions extends js.Object {
  var coverageMap: js.UndefOr[CoverageMap] = js.undefined
  var defaultSummarizer: js.UndefOr[Summarizers] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var sourceFinder: js.UndefOr[js.Function1[/* filepath */ String, String]] = js.undefined
  var watermarks: js.UndefOr[PartialWatermarks] = js.undefined
}

object PartialContextOptions {
  @scala.inline
  def apply(
    coverageMap: CoverageMap = null,
    defaultSummarizer: Summarizers = null,
    dir: String = null,
    sourceFinder: /* filepath */ String => String = null,
    watermarks: PartialWatermarks = null
  ): PartialContextOptions = {
    val __obj = js.Dynamic.literal()
    if (coverageMap != null) __obj.updateDynamic("coverageMap")(coverageMap.asInstanceOf[js.Any])
    if (defaultSummarizer != null) __obj.updateDynamic("defaultSummarizer")(defaultSummarizer.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (sourceFinder != null) __obj.updateDynamic("sourceFinder")(js.Any.fromFunction1(sourceFinder))
    if (watermarks != null) __obj.updateDynamic("watermarks")(watermarks.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialContextOptions]
  }
}


package typings.istanbulLibReport.mod

import typings.istanbulLibCoverage.mod.CoverageMap
import typings.istanbulLibReport.PartialWatermarks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextOptions extends js.Object {
  var coverageMap: CoverageMap
  var defaultSummarizer: Summarizers
  var dir: String
  var watermarks: PartialWatermarks
  def sourceFinder(filepath: String): String
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
}


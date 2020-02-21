package typings.istanbulLibReport.mod

import typings.istanbulLibCoverage.mod.CoverageMap
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextOptions extends js.Object {
  var coverageMap: CoverageMap
  var defaultSummarizer: Summarizers
  var dir: String
  var watermarks: Partial[Watermarks]
  def sourceFinder(filepath: String): String
}

object ContextOptions {
  @scala.inline
  def apply(
    coverageMap: CoverageMap,
    defaultSummarizer: Summarizers,
    dir: String,
    sourceFinder: String => String,
    watermarks: Partial[Watermarks]
  ): ContextOptions = {
    val __obj = js.Dynamic.literal(coverageMap = coverageMap.asInstanceOf[js.Any], defaultSummarizer = defaultSummarizer.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], sourceFinder = js.Any.fromFunction1(sourceFinder), watermarks = watermarks.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContextOptions]
  }
}


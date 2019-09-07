package typings.karmaDashCoverageDashIstanbulDashReporter.karmaDashCoverageDashIstanbulDashReporterMod.karmaMod

import typings.karmaDashCoverageDashIstanbulDashReporter.karmaDashCoverageDashIstanbulDashReporterMod.CoverageIstanbulReporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  /** {@link https://github.com/istanbuljs/istanbuljs/blob/aae256fb8b9a3d19414dcf069c592e88712c32c6/packages/istanbul-api/lib/config.js#L33-L39 Any of these options are valid}. */
  val coverageIstanbulReporter: js.UndefOr[CoverageIstanbulReporter] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(coverageIstanbulReporter: CoverageIstanbulReporter = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (coverageIstanbulReporter != null) __obj.updateDynamic("coverageIstanbulReporter")(coverageIstanbulReporter)
    __obj.asInstanceOf[ConfigOptions]
  }
}


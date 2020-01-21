package typings.karmaCoverageIstanbulReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageIstanbulReporter extends js.Object {
  /** Combines coverage information from multiple browsers into one report rather than outputting a report for each browser */
  val combineBrowserReports: js.UndefOr[Boolean] = js.undefined
  /**
    * Base output directory.
    * If you include `%browser%` in the path it will be replaced with the karma browser name.
    */
  val dir: js.UndefOr[String] = js.undefined
  /** if using webpack and pre-loaders, work around webpack breaking the source path. */
  val fixWebpackSourcePaths: js.UndefOr[Boolean] = js.undefined
  // TODO: Add istanbul-api
  /** `instrumentation` is used to configure Istanbul API package. */
  val instrumentation: js.UndefOr[js.Any] = js.undefined
  // TODO: Add istanbul-api
  /** Most reporters accept additional config options. You can pass these through the `report-config` option. */
  val `report-config`: js.UndefOr[js.Any] = js.undefined
  /** Reports can be any that are listed {@link https://github.com/istanbuljs/istanbuljs/tree/aae256fb8b9a3d19414dcf069c592e88712c32c6/packages/istanbul-reports/lib here}. */
  val reports: js.UndefOr[js.Array[String]] = js.undefined
  /** Omit files with no statements, no functions and no branches from the report. */
  val skipFilesWithNoCoverage: js.UndefOr[Boolean] = js.undefined
  /**
    * Enforce percentage thresholds.
    * Anything under these percentages will cause karma to fail with an exit code of 1 if not running in watch mode.
    */
  val thresholds: js.UndefOr[ThresholdConfig] = js.undefined
  /** Output config used by istanbul for debugging. */
  val verbose: js.UndefOr[Boolean] = js.undefined
}

object CoverageIstanbulReporter {
  @scala.inline
  def apply(
    combineBrowserReports: js.UndefOr[Boolean] = js.undefined,
    dir: String = null,
    fixWebpackSourcePaths: js.UndefOr[Boolean] = js.undefined,
    instrumentation: js.Any = null,
    `report-config`: js.Any = null,
    reports: js.Array[String] = null,
    skipFilesWithNoCoverage: js.UndefOr[Boolean] = js.undefined,
    thresholds: ThresholdConfig = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): CoverageIstanbulReporter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(combineBrowserReports)) __obj.updateDynamic("combineBrowserReports")(combineBrowserReports.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(fixWebpackSourcePaths)) __obj.updateDynamic("fixWebpackSourcePaths")(fixWebpackSourcePaths.asInstanceOf[js.Any])
    if (instrumentation != null) __obj.updateDynamic("instrumentation")(instrumentation.asInstanceOf[js.Any])
    if (`report-config` != null) __obj.updateDynamic("report-config")(`report-config`.asInstanceOf[js.Any])
    if (reports != null) __obj.updateDynamic("reports")(reports.asInstanceOf[js.Any])
    if (!js.isUndefined(skipFilesWithNoCoverage)) __obj.updateDynamic("skipFilesWithNoCoverage")(skipFilesWithNoCoverage.asInstanceOf[js.Any])
    if (thresholds != null) __obj.updateDynamic("thresholds")(thresholds.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageIstanbulReporter]
  }
}


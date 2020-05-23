package typings.karmaMochaReporter.mod

import typings.karmaMochaReporter.karmaMochaReporterBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reporter options
  */
trait MochaReporterOptions extends js.Object {
  /**
    * Lets you overwrite the default colors.
    * Possible values are all colors and background colors from chalk.
    */
  var colors: js.UndefOr[ColorOptions] = js.undefined
  /** The string to output between multiple test runs. Set to false or empty string to disable */
  var divider: js.UndefOr[String | `false`] = js.undefined
  /**
    * When setting the ignoreSkipped flag to true, the reporter will ignore the skipped tests in the output
    * and you will see only the tests that where really executed.
    * The summary will still contain the number of skipped tests.
    */
  var ignoreSkipped: js.UndefOr[Boolean] = js.undefined
  /**
    * Lets you set the maximum number of lines which are printed for a failure.
    * The default value is 999. Helps to cut long stack traces. Set the value to -1 to disable stack traces.
    */
  var maxLogLines: js.UndefOr[Double] = js.undefined
  /**
    * output type printed to the console
    */
  var output: js.UndefOr[OutputOptions] = js.undefined
  /**
    * Prints the result of an it block after it is run in one browser.
    * This options is useful when you have tests which are conditionally run in one browser only.
    * Otherwise the result of the it block would not be printed because it was not run in all browsers.
    */
  var printFirstSuccess: js.UndefOr[Boolean] = js.undefined
  /**
    * Shows a diff output. Is disabled by default.
    * All credits to the contributors of mocha, since the diff logic is used from there and customized for this modul
    */
  var showDiff: js.UndefOr[ShowDiffOptions] = js.undefined
  /**
    * Lets you overwrite the default symbols.
    */
  var symbols: js.UndefOr[SymbolOptions] = js.undefined
}

object MochaReporterOptions {
  @scala.inline
  def apply(
    colors: ColorOptions = null,
    divider: String | `false` = null,
    ignoreSkipped: js.UndefOr[Boolean] = js.undefined,
    maxLogLines: js.UndefOr[Double] = js.undefined,
    output: OutputOptions = null,
    printFirstSuccess: js.UndefOr[Boolean] = js.undefined,
    showDiff: ShowDiffOptions = null,
    symbols: SymbolOptions = null
  ): MochaReporterOptions = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (divider != null) __obj.updateDynamic("divider")(divider.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSkipped)) __obj.updateDynamic("ignoreSkipped")(ignoreSkipped.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLogLines)) __obj.updateDynamic("maxLogLines")(maxLogLines.get.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (!js.isUndefined(printFirstSuccess)) __obj.updateDynamic("printFirstSuccess")(printFirstSuccess.get.asInstanceOf[js.Any])
    if (showDiff != null) __obj.updateDynamic("showDiff")(showDiff.asInstanceOf[js.Any])
    if (symbols != null) __obj.updateDynamic("symbols")(symbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[MochaReporterOptions]
  }
}


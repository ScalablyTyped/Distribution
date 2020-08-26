package typings.karmaMochaReporter.mod

import typings.karmaMochaReporter.karmaMochaReporterBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reporter options
  */
@js.native
trait MochaReporterOptions extends js.Object {
  /**
    * Lets you overwrite the default colors.
    * Possible values are all colors and background colors from chalk.
    */
  var colors: js.UndefOr[ColorOptions] = js.native
  /** The string to output between multiple test runs. Set to false or empty string to disable */
  var divider: js.UndefOr[String | `false`] = js.native
  /**
    * When setting the ignoreSkipped flag to true, the reporter will ignore the skipped tests in the output
    * and you will see only the tests that where really executed.
    * The summary will still contain the number of skipped tests.
    */
  var ignoreSkipped: js.UndefOr[Boolean] = js.native
  /**
    * Lets you set the maximum number of lines which are printed for a failure.
    * The default value is 999. Helps to cut long stack traces. Set the value to -1 to disable stack traces.
    */
  var maxLogLines: js.UndefOr[Double] = js.native
  /**
    * output type printed to the console
    */
  var output: js.UndefOr[OutputOptions] = js.native
  /**
    * Prints the result of an it block after it is run in one browser.
    * This options is useful when you have tests which are conditionally run in one browser only.
    * Otherwise the result of the it block would not be printed because it was not run in all browsers.
    */
  var printFirstSuccess: js.UndefOr[Boolean] = js.native
  /**
    * Shows a diff output. Is disabled by default.
    * All credits to the contributors of mocha, since the diff logic is used from there and customized for this modul
    */
  var showDiff: js.UndefOr[ShowDiffOptions] = js.native
  /**
    * Lets you overwrite the default symbols.
    */
  var symbols: js.UndefOr[SymbolOptions] = js.native
}

object MochaReporterOptions {
  @scala.inline
  def apply(): MochaReporterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MochaReporterOptions]
  }
  @scala.inline
  implicit class MochaReporterOptionsOps[Self <: MochaReporterOptions] (val x: Self) extends AnyVal {
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
    def setColors(value: ColorOptions): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setDivider(value: String | `false`): Self = this.set("divider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDivider: Self = this.set("divider", js.undefined)
    @scala.inline
    def setIgnoreSkipped(value: Boolean): Self = this.set("ignoreSkipped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreSkipped: Self = this.set("ignoreSkipped", js.undefined)
    @scala.inline
    def setMaxLogLines(value: Double): Self = this.set("maxLogLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLogLines: Self = this.set("maxLogLines", js.undefined)
    @scala.inline
    def setOutput(value: OutputOptions): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    @scala.inline
    def setPrintFirstSuccess(value: Boolean): Self = this.set("printFirstSuccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintFirstSuccess: Self = this.set("printFirstSuccess", js.undefined)
    @scala.inline
    def setShowDiff(value: ShowDiffOptions): Self = this.set("showDiff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDiff: Self = this.set("showDiff", js.undefined)
    @scala.inline
    def setSymbols(value: SymbolOptions): Self = this.set("symbols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbols: Self = this.set("symbols", js.undefined)
  }
  
}


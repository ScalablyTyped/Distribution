package typings.karmaNyanReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NyanCatOptions extends js.Object {
  /**
    * increase the number of rainbow lines displayed
    * enforced min = 4, enforced max = terminal height - 1
    * @default 4
    */
  var numberOfRainbowLines: js.UndefOr[Double] = js.undefined
  /**
    * Only render the graphic after all tests have finished.
    * This is ideal for using this reporter in a continuous integration environment
    * @default false
    */
  var renderOnRunCompleteOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Suppress the red background on errors in the error
    * report at the end of the test run.
    * @default false
    */
  var suppressErrorHighlighting: js.UndefOr[Boolean] = js.undefined
  /**
    * suppress the error report at the end of the test run
    * @default false
    */
  var suppressErrorReport: js.UndefOr[Boolean] = js.undefined
}

object NyanCatOptions {
  @scala.inline
  def apply(
    numberOfRainbowLines: js.UndefOr[Double] = js.undefined,
    renderOnRunCompleteOnly: js.UndefOr[Boolean] = js.undefined,
    suppressErrorHighlighting: js.UndefOr[Boolean] = js.undefined,
    suppressErrorReport: js.UndefOr[Boolean] = js.undefined
  ): NyanCatOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(numberOfRainbowLines)) __obj.updateDynamic("numberOfRainbowLines")(numberOfRainbowLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(renderOnRunCompleteOnly)) __obj.updateDynamic("renderOnRunCompleteOnly")(renderOnRunCompleteOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressErrorHighlighting)) __obj.updateDynamic("suppressErrorHighlighting")(suppressErrorHighlighting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressErrorReport)) __obj.updateDynamic("suppressErrorReport")(suppressErrorReport.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NyanCatOptions]
  }
}


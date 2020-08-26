package typings.karmaNyanReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NyanCatOptions extends js.Object {
  /**
    * increase the number of rainbow lines displayed
    * enforced min = 4, enforced max = terminal height - 1
    * @default 4
    */
  var numberOfRainbowLines: js.UndefOr[Double] = js.native
  /**
    * Only render the graphic after all tests have finished.
    * This is ideal for using this reporter in a continuous integration environment
    * @default false
    */
  var renderOnRunCompleteOnly: js.UndefOr[Boolean] = js.native
  /**
    * Suppress the red background on errors in the error
    * report at the end of the test run.
    * @default false
    */
  var suppressErrorHighlighting: js.UndefOr[Boolean] = js.native
  /**
    * suppress the error report at the end of the test run
    * @default false
    */
  var suppressErrorReport: js.UndefOr[Boolean] = js.native
}

object NyanCatOptions {
  @scala.inline
  def apply(): NyanCatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NyanCatOptions]
  }
  @scala.inline
  implicit class NyanCatOptionsOps[Self <: NyanCatOptions] (val x: Self) extends AnyVal {
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
    def setNumberOfRainbowLines(value: Double): Self = this.set("numberOfRainbowLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfRainbowLines: Self = this.set("numberOfRainbowLines", js.undefined)
    @scala.inline
    def setRenderOnRunCompleteOnly(value: Boolean): Self = this.set("renderOnRunCompleteOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderOnRunCompleteOnly: Self = this.set("renderOnRunCompleteOnly", js.undefined)
    @scala.inline
    def setSuppressErrorHighlighting(value: Boolean): Self = this.set("suppressErrorHighlighting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressErrorHighlighting: Self = this.set("suppressErrorHighlighting", js.undefined)
    @scala.inline
    def setSuppressErrorReport(value: Boolean): Self = this.set("suppressErrorReport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressErrorReport: Self = this.set("suppressErrorReport", js.undefined)
  }
  
}


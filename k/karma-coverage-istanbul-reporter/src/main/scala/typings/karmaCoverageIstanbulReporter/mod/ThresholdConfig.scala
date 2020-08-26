package typings.karmaCoverageIstanbulReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThresholdConfig extends js.Object {
  /** Thresholds per file. */
  val each: js.UndefOr[ThresholdsEach] = js.native
  /**
    * Set to `true` to not fail the test command when thresholds are not met.
    * @default false
    */
  val emitWarning: js.UndefOr[Boolean] = js.native
  /** Thresholds for all files. */
  val global: js.UndefOr[Threshold] = js.native
}

object ThresholdConfig {
  @scala.inline
  def apply(): ThresholdConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThresholdConfig]
  }
  @scala.inline
  implicit class ThresholdConfigOps[Self <: ThresholdConfig] (val x: Self) extends AnyVal {
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
    def setEach(value: ThresholdsEach): Self = this.set("each", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEach: Self = this.set("each", js.undefined)
    @scala.inline
    def setEmitWarning(value: Boolean): Self = this.set("emitWarning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmitWarning: Self = this.set("emitWarning", js.undefined)
    @scala.inline
    def setGlobal(value: Threshold): Self = this.set("global", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
  }
  
}


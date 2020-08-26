package typings.lab.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExperimentOptions extends js.Object {
  /** Execute only this test/experiment? (false) */
  var only: js.UndefOr[Boolean] = js.native
  /** Execute tests in parallel? (false) */
  var parallel: js.UndefOr[Boolean] = js.native
  /** Skip execution? (false) */
  var skip: js.UndefOr[Boolean] = js.native
  /** Set a specific timeout in milliseconds (2000) */
  var timeout: js.UndefOr[Double] = js.native
}

object ExperimentOptions {
  @scala.inline
  def apply(): ExperimentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentOptions]
  }
  @scala.inline
  implicit class ExperimentOptionsOps[Self <: ExperimentOptions] (val x: Self) extends AnyVal {
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
    def setOnly(value: Boolean): Self = this.set("only", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnly: Self = this.set("only", js.undefined)
    @scala.inline
    def setParallel(value: Boolean): Self = this.set("parallel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParallel: Self = this.set("parallel", js.undefined)
    @scala.inline
    def setSkip(value: Boolean): Self = this.set("skip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}


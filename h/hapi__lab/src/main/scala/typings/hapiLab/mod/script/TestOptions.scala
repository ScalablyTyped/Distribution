package typings.hapiLab.mod.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestOptions extends js.Object {
  /**
    * Sets all other experiments to skip.
    * 
    * @default false
    */
  val only: js.UndefOr[Boolean] = js.native
  /**
    * The expected number of assertions the test must execute.
    */
  val plan: js.UndefOr[Double] = js.native
  /**
    * Set the test to be retried a few times when it fails. Can be set to true to used the default number of retries or an exact number of maximum retries.
    *
    * @default false
    */
  val retry: js.UndefOr[Double | Boolean] = js.native
  /**
    * Sets the entire experiment content to be skipped during execution.
    * 
    * @default false
    */
  val skip: js.UndefOr[Boolean] = js.native
  /**
    * Overrides the default test timeout for tests and other timed operations in milliseconds.
    * 
    * @default 2000
    */
  val timeout: js.UndefOr[Double] = js.native
}

object TestOptions {
  @scala.inline
  def apply(): TestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestOptions]
  }
  @scala.inline
  implicit class TestOptionsOps[Self <: TestOptions] (val x: Self) extends AnyVal {
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
    def setPlan(value: Double): Self = this.set("plan", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlan: Self = this.set("plan", js.undefined)
    @scala.inline
    def setRetry(value: Double | Boolean): Self = this.set("retry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
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


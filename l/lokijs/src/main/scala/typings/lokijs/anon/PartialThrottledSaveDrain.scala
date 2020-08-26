package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<lokijs.ThrottledSaveDrainOptions> */
@js.native
trait PartialThrottledSaveDrain extends js.Object {
  var recursiveWait: js.UndefOr[Boolean] = js.native
  var recursiveWaitLimit: js.UndefOr[Boolean] = js.native
  var recursiveWaitLimitDuration: js.UndefOr[Double] = js.native
  var started: js.UndefOr[Double] = js.native
}

object PartialThrottledSaveDrain {
  @scala.inline
  def apply(): PartialThrottledSaveDrain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialThrottledSaveDrain]
  }
  @scala.inline
  implicit class PartialThrottledSaveDrainOps[Self <: PartialThrottledSaveDrain] (val x: Self) extends AnyVal {
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
    def setRecursiveWait(value: Boolean): Self = this.set("recursiveWait", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecursiveWait: Self = this.set("recursiveWait", js.undefined)
    @scala.inline
    def setRecursiveWaitLimit(value: Boolean): Self = this.set("recursiveWaitLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecursiveWaitLimit: Self = this.set("recursiveWaitLimit", js.undefined)
    @scala.inline
    def setRecursiveWaitLimitDuration(value: Double): Self = this.set("recursiveWaitLimitDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecursiveWaitLimitDuration: Self = this.set("recursiveWaitLimitDuration", js.undefined)
    @scala.inline
    def setStarted(value: Double): Self = this.set("started", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStarted: Self = this.set("started", js.undefined)
  }
  
}


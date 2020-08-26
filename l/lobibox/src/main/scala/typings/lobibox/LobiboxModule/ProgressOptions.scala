package typings.lobibox.LobiboxModule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressOptions
  extends MessageBoxesOptions
     with ProgressMethods
     with ProgressEvents {
    // Show percentage of progress
  var label: js.UndefOr[String] = js.native
  var progressCompleted: js.UndefOr[js.Any] = js.native
    // Show progress label
  var progressTpl: js.UndefOr[Boolean] = js.native
    //Template of progress bar
  //Events
  @JSName("progressUpdated")
  var progressUpdated_ProgressOptions: js.UndefOr[js.Any] = js.native
  var showProgressLabel: js.UndefOr[Boolean] = js.native
}

object ProgressOptions {
  @scala.inline
  def apply(): ProgressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressOptions]
  }
  @scala.inline
  implicit class ProgressOptionsOps[Self <: ProgressOptions] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setProgressCompleted(value: js.Any): Self = this.set("progressCompleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressCompleted: Self = this.set("progressCompleted", js.undefined)
    @scala.inline
    def setProgressTpl(value: Boolean): Self = this.set("progressTpl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressTpl: Self = this.set("progressTpl", js.undefined)
    @scala.inline
    def setProgressUpdated(value: js.Any): Self = this.set("progressUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressUpdated: Self = this.set("progressUpdated", js.undefined)
    @scala.inline
    def setShowProgressLabel(value: Boolean): Self = this.set("showProgressLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowProgressLabel: Self = this.set("showProgressLabel", js.undefined)
  }
  
}


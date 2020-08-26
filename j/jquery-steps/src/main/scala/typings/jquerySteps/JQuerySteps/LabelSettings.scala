package typings.jquerySteps.JQuerySteps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "Settings"
//#region "Label Settings"
@js.native
trait LabelSettings extends js.Object {
  /**
    * Label for the cancel button. Default value is Cancel.
    */
  var cancel: js.UndefOr[String] = js.native
  /**
    * This label is important for accessability reasons. Indicates which step is activated. Default value is current step:.
    */
  var current: js.UndefOr[String] = js.native
  /**
    * Label for the finish button. Default value is Finish.
    */
  var finish: js.UndefOr[String] = js.native
  /**
    * Label for the loading animation. Default value is Loading ... .
    */
  var loading: js.UndefOr[String] = js.native
  /**
    * Label for the next button. Default value is Next.
    */
  var next: js.UndefOr[String] = js.native
  /**
    * This label is important for accessability reasons and describes the kind of navigation. Default value is Pagination.
    */
  var pagination: js.UndefOr[String] = js.native
  /**
    * Label for the previous button. Default value is Previous.
    */
  var previous: js.UndefOr[String] = js.native
}

object LabelSettings {
  @scala.inline
  def apply(): LabelSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelSettings]
  }
  @scala.inline
  implicit class LabelSettingsOps[Self <: LabelSettings] (val x: Self) extends AnyVal {
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
    def setCancel(value: String): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setCurrent(value: String): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
    @scala.inline
    def setFinish(value: String): Self = this.set("finish", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinish: Self = this.set("finish", js.undefined)
    @scala.inline
    def setLoading(value: String): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setNext(value: String): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    @scala.inline
    def setPagination(value: String): Self = this.set("pagination", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagination: Self = this.set("pagination", js.undefined)
    @scala.inline
    def setPrevious(value: String): Self = this.set("previous", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevious: Self = this.set("previous", js.undefined)
  }
  
}


package typings.jqueryAreYouSure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**Options available to control dirty form checking*/
@js.native
trait AreYouSureOptions extends js.Object {
  /**Callback when form is found to be dirty - allows control of submit/reset buttons etc*/
  var change: js.UndefOr[js.Function] = js.native
  /**Class to assign to the form when dirty*/
  var dirtyClass: js.UndefOr[String] = js.native
  /**Jquery selector to use to find input elements*/
  var fieldSelector: js.UndefOr[String] = js.native
  /**Message to show when attempting to quit a dirty form without saving*/
  var message: js.UndefOr[String] = js.native
  /**Make Are-You-Sure "silent" by disabling the warning message*/
  var silent: js.UndefOr[Boolean] = js.native
}

object AreYouSureOptions {
  @scala.inline
  def apply(): AreYouSureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreYouSureOptions]
  }
  @scala.inline
  implicit class AreYouSureOptionsOps[Self <: AreYouSureOptions] (val x: Self) extends AnyVal {
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
    def setChange(value: js.Function): Self = this.set("change", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setDirtyClass(value: String): Self = this.set("dirtyClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirtyClass: Self = this.set("dirtyClass", js.undefined)
    @scala.inline
    def setFieldSelector(value: String): Self = this.set("fieldSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldSelector: Self = this.set("fieldSelector", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
  }
  
}


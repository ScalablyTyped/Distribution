package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HiddenEventUIParam extends js.Object {
  /**
    * Gets the content displayed in the popover as a string.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * Gets the element the popover is hidden for.
    */
  var element: js.UndefOr[String] = js.native
  /**
    * Gets reference to the %%WidgetName%% widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Gets the popover element hidden.
    */
  var popover: js.UndefOr[String] = js.native
}

object HiddenEventUIParam {
  @scala.inline
  def apply(): HiddenEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HiddenEventUIParam]
  }
  @scala.inline
  implicit class HiddenEventUIParamOps[Self <: HiddenEventUIParam] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setElement(value: String): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setPopover(value: String): Self = this.set("popover", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopover: Self = this.set("popover", js.undefined)
  }
  
}


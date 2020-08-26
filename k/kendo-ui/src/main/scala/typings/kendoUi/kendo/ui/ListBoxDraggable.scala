package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBoxDraggable extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var hint: js.UndefOr[js.Function | String | JQuery] = js.native
  var placeholder: js.UndefOr[js.Function | String | JQuery] = js.native
}

object ListBoxDraggable {
  @scala.inline
  def apply(): ListBoxDraggable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBoxDraggable]
  }
  @scala.inline
  implicit class ListBoxDraggableOps[Self <: ListBoxDraggable] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setHint(value: js.Function | String | JQuery): Self = this.set("hint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    @scala.inline
    def setPlaceholder(value: js.Function | String | JQuery): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
  }
  
}


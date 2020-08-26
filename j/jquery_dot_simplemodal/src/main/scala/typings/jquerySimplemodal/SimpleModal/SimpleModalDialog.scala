package typings.jquerySimplemodal.SimpleModal

import typings.jquerySimplemodal.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Sent to callbacks as a parameter. */
@js.native
trait SimpleModalDialog extends js.Object {
  var container: JQuery = js.native
  var data: js.Any = js.native
  var iframe: JQuery = js.native
  var overlay: JQuery = js.native
}

object SimpleModalDialog {
  @scala.inline
  def apply(container: JQuery, data: js.Any, iframe: JQuery, overlay: JQuery): SimpleModalDialog = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleModalDialog]
  }
  @scala.inline
  implicit class SimpleModalDialogOps[Self <: SimpleModalDialog] (val x: Self) extends AnyVal {
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
    def setContainer(value: JQuery): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setIframe(value: JQuery): Self = this.set("iframe", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverlay(value: JQuery): Self = this.set("overlay", value.asInstanceOf[js.Any])
  }
  
}


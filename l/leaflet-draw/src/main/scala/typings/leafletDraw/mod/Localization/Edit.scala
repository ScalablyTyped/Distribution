package typings.leafletDraw.mod.Localization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Edit extends js.Object {
  var handlers: EditHandlers = js.native
  var toolbar: EditToolbar = js.native
}

object Edit {
  @scala.inline
  def apply(handlers: EditHandlers, toolbar: EditToolbar): Edit = {
    val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edit]
  }
  @scala.inline
  implicit class EditOps[Self <: Edit] (val x: Self) extends AnyVal {
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
    def setHandlers(value: EditHandlers): Self = this.set("handlers", value.asInstanceOf[js.Any])
    @scala.inline
    def setToolbar(value: EditToolbar): Self = this.set("toolbar", value.asInstanceOf[js.Any])
  }
  
}


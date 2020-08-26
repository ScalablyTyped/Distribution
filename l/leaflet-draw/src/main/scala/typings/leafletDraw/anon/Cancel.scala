package typings.leafletDraw.anon

import typings.leafletDraw.mod.Localization.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cancel extends js.Object {
  var cancel: Action = js.native
  var clearAll: Action = js.native
  var save: Action = js.native
}

object Cancel {
  @scala.inline
  def apply(cancel: Action, clearAll: Action, save: Action): Cancel = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], clearAll = clearAll.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
  @scala.inline
  implicit class CancelOps[Self <: Cancel] (val x: Self) extends AnyVal {
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
    def setCancel(value: Action): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearAll(value: Action): Self = this.set("clearAll", value.asInstanceOf[js.Any])
    @scala.inline
    def setSave(value: Action): Self = this.set("save", value.asInstanceOf[js.Any])
  }
  
}


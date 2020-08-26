package typings.leafletDraw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Edit extends js.Object {
  var edit: String = js.native
  var editDisabled: String = js.native
  var remove: String = js.native
  var removeDisabled: String = js.native
}

object Edit {
  @scala.inline
  def apply(edit: String, editDisabled: String, remove: String, removeDisabled: String): Edit = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], editDisabled = editDisabled.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], removeDisabled = removeDisabled.asInstanceOf[js.Any])
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
    def setEdit(value: String): Self = this.set("edit", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditDisabled(value: String): Self = this.set("editDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: String): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveDisabled(value: String): Self = this.set("removeDisabled", value.asInstanceOf[js.Any])
  }
  
}


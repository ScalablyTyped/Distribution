package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueChangingEventUIParam extends js.Object {
  /**
    * Gets the editor input.
    */
  var editorInput: js.UndefOr[js.Any] = js.native
  /**
    * Gets the editor's new value. The argument type might differ depending on the editor type.
    */
  var newValue: js.UndefOr[js.Any] = js.native
  /**
    * Gets the editor's old value. The argument type might differ depending on the editor type.
    */
  var oldValue: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to the editor.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object ValueChangingEventUIParam {
  @scala.inline
  def apply(): ValueChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueChangingEventUIParam]
  }
  @scala.inline
  implicit class ValueChangingEventUIParamOps[Self <: ValueChangingEventUIParam] (val x: Self) extends AnyVal {
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
    def setEditorInput(value: js.Any): Self = this.set("editorInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditorInput: Self = this.set("editorInput", js.undefined)
    @scala.inline
    def setNewValue(value: js.Any): Self = this.set("newValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewValue: Self = this.set("newValue", js.undefined)
    @scala.inline
    def setOldValue(value: js.Any): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldValue: Self = this.set("oldValue", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}


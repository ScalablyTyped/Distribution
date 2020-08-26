package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueChangedEventUIParam extends js.Object {
  /**
    * Gets the editor input.
    */
  var editorInput: js.UndefOr[js.Any] = js.native
  /**
    * Gets the value entered from the user after internal formatting. The argument type might differ depending on the editor type.
    */
  var newValue: js.UndefOr[js.Any] = js.native
  /**
    * Gets the value entered from the user before internal formatting. The argument type might differ depending on the editor type.
    */
  var originalValue: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to the editor.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object ValueChangedEventUIParam {
  @scala.inline
  def apply(): ValueChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueChangedEventUIParam]
  }
  @scala.inline
  implicit class ValueChangedEventUIParamOps[Self <: ValueChangedEventUIParam] (val x: Self) extends AnyVal {
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
    def setOriginalValue(value: js.Any): Self = this.set("originalValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalValue: Self = this.set("originalValue", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}


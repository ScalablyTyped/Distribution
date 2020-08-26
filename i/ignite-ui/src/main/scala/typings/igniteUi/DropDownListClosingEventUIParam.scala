package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropDownListClosingEventUIParam extends js.Object {
  /**
    * Gets a reference to the editor container.
    */
  var editor: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to the editable input.
    */
  var editorInput: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to the list container.
    */
  var list: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to the editor.
    */
  var owner: js.UndefOr[js.Any] = js.native
}

object DropDownListClosingEventUIParam {
  @scala.inline
  def apply(): DropDownListClosingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownListClosingEventUIParam]
  }
  @scala.inline
  implicit class DropDownListClosingEventUIParamOps[Self <: DropDownListClosingEventUIParam] (val x: Self) extends AnyVal {
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
    def setEditor(value: js.Any): Self = this.set("editor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditor: Self = this.set("editor", js.undefined)
    @scala.inline
    def setEditorInput(value: js.Any): Self = this.set("editorInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditorInput: Self = this.set("editorInput", js.undefined)
    @scala.inline
    def setList(value: js.Any): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
  }
  
}


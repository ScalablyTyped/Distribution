package typings.jexcel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnEditor extends js.Object {
  // tslint:disable-next-line ban-types
  var closeEditor: js.UndefOr[js.Function] = js.native
  // tslint:disable-next-line ban-types
  var getValue: js.UndefOr[js.Function] = js.native
  // tslint:disable-next-line ban-types
  var openEditor: js.UndefOr[js.Function] = js.native
  // tslint:disable-next-line ban-types
  var setValue: js.UndefOr[js.Function] = js.native
}

object ColumnEditor {
  @scala.inline
  def apply(): ColumnEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnEditor]
  }
  @scala.inline
  implicit class ColumnEditorOps[Self <: ColumnEditor] (val x: Self) extends AnyVal {
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
    def setCloseEditor(value: js.Function): Self = this.set("closeEditor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseEditor: Self = this.set("closeEditor", js.undefined)
    @scala.inline
    def setGetValue(value: js.Function): Self = this.set("getValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetValue: Self = this.set("getValue", js.undefined)
    @scala.inline
    def setOpenEditor(value: js.Function): Self = this.set("openEditor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenEditor: Self = this.set("openEditor", js.undefined)
    @scala.inline
    def setSetValue(value: js.Function): Self = this.set("setValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
  }
  
}


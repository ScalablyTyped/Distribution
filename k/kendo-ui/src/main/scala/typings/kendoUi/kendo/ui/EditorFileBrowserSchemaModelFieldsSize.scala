package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorFileBrowserSchemaModelFieldsSize extends js.Object {
  var field: js.UndefOr[String] = js.native
  var parse: js.UndefOr[js.Function] = js.native
}

object EditorFileBrowserSchemaModelFieldsSize {
  @scala.inline
  def apply(): EditorFileBrowserSchemaModelFieldsSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorFileBrowserSchemaModelFieldsSize]
  }
  @scala.inline
  implicit class EditorFileBrowserSchemaModelFieldsSizeOps[Self <: EditorFileBrowserSchemaModelFieldsSize] (val x: Self) extends AnyVal {
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setParse(value: js.Function): Self = this.set("parse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
  }
  
}


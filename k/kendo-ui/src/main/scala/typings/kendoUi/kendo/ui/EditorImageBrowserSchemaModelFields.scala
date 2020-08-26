package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorImageBrowserSchemaModelFields extends js.Object {
  var name: js.UndefOr[String | EditorImageBrowserSchemaModelFieldsName] = js.native
  var size: js.UndefOr[String | EditorImageBrowserSchemaModelFieldsSize] = js.native
  var `type`: js.UndefOr[String | EditorImageBrowserSchemaModelFieldsType] = js.native
}

object EditorImageBrowserSchemaModelFields {
  @scala.inline
  def apply(): EditorImageBrowserSchemaModelFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorImageBrowserSchemaModelFields]
  }
  @scala.inline
  implicit class EditorImageBrowserSchemaModelFieldsOps[Self <: EditorImageBrowserSchemaModelFields] (val x: Self) extends AnyVal {
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
    def setName(value: String | EditorImageBrowserSchemaModelFieldsName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSize(value: String | EditorImageBrowserSchemaModelFieldsSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setType(value: String | EditorImageBrowserSchemaModelFieldsType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


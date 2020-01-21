package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorFileBrowserSchemaModelFields extends js.Object {
  var name: js.UndefOr[String | EditorFileBrowserSchemaModelFieldsName] = js.undefined
  var size: js.UndefOr[String | EditorFileBrowserSchemaModelFieldsSize] = js.undefined
  var `type`: js.UndefOr[String | EditorFileBrowserSchemaModelFieldsType] = js.undefined
}

object EditorFileBrowserSchemaModelFields {
  @scala.inline
  def apply(
    name: String | EditorFileBrowserSchemaModelFieldsName = null,
    size: String | EditorFileBrowserSchemaModelFieldsSize = null,
    `type`: String | EditorFileBrowserSchemaModelFieldsType = null
  ): EditorFileBrowserSchemaModelFields = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorFileBrowserSchemaModelFields]
  }
}


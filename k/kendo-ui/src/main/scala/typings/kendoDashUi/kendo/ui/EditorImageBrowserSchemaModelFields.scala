package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorImageBrowserSchemaModelFields extends js.Object {
  var name: js.UndefOr[String | EditorImageBrowserSchemaModelFieldsName] = js.undefined
  var size: js.UndefOr[String | EditorImageBrowserSchemaModelFieldsSize] = js.undefined
  var `type`: js.UndefOr[String | EditorImageBrowserSchemaModelFieldsType] = js.undefined
}

object EditorImageBrowserSchemaModelFields {
  @scala.inline
  def apply(
    name: String | EditorImageBrowserSchemaModelFieldsName = null,
    size: String | EditorImageBrowserSchemaModelFieldsSize = null,
    `type`: String | EditorImageBrowserSchemaModelFieldsType = null
  ): EditorImageBrowserSchemaModelFields = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorImageBrowserSchemaModelFields]
  }
}


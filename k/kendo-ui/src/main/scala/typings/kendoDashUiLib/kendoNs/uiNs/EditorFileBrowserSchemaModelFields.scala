package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorFileBrowserSchemaModelFields extends js.Object {
  var name: js.UndefOr[java.lang.String | EditorFileBrowserSchemaModelFieldsName] = js.undefined
  var size: js.UndefOr[java.lang.String | EditorFileBrowserSchemaModelFieldsSize] = js.undefined
  var `type`: js.UndefOr[java.lang.String | EditorFileBrowserSchemaModelFieldsType] = js.undefined
}

object EditorFileBrowserSchemaModelFields {
  @scala.inline
  def apply(
    name: java.lang.String | EditorFileBrowserSchemaModelFieldsName = null,
    size: java.lang.String | EditorFileBrowserSchemaModelFieldsSize = null,
    `type`: java.lang.String | EditorFileBrowserSchemaModelFieldsType = null
  ): EditorFileBrowserSchemaModelFields = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorFileBrowserSchemaModelFields]
  }
}


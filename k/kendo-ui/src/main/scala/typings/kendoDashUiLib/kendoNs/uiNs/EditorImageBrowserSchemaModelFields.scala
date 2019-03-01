package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorImageBrowserSchemaModelFields extends js.Object {
  var name: js.UndefOr[java.lang.String | EditorImageBrowserSchemaModelFieldsName] = js.undefined
  var size: js.UndefOr[java.lang.String | EditorImageBrowserSchemaModelFieldsSize] = js.undefined
  var `type`: js.UndefOr[java.lang.String | EditorImageBrowserSchemaModelFieldsType] = js.undefined
}

object EditorImageBrowserSchemaModelFields {
  @scala.inline
  def apply(
    name: java.lang.String | EditorImageBrowserSchemaModelFieldsName = null,
    size: java.lang.String | EditorImageBrowserSchemaModelFieldsSize = null,
    `type`: java.lang.String | EditorImageBrowserSchemaModelFieldsType = null
  ): EditorImageBrowserSchemaModelFields = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorImageBrowserSchemaModelFields]
  }
}


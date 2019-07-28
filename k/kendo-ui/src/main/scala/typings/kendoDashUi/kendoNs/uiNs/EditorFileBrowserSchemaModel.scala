package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorFileBrowserSchemaModel extends js.Object {
  var fields: js.UndefOr[EditorFileBrowserSchemaModelFields] = js.undefined
  var id: js.UndefOr[String] = js.undefined
}

object EditorFileBrowserSchemaModel {
  @scala.inline
  def apply(fields: EditorFileBrowserSchemaModelFields = null, id: String = null): EditorFileBrowserSchemaModel = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[EditorFileBrowserSchemaModel]
  }
}


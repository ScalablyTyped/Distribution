package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorImageBrowserSchemaModel extends js.Object {
  var fields: js.UndefOr[EditorImageBrowserSchemaModelFields] = js.undefined
  var id: js.UndefOr[String] = js.undefined
}

object EditorImageBrowserSchemaModel {
  @scala.inline
  def apply(fields: EditorImageBrowserSchemaModelFields = null, id: String = null): EditorImageBrowserSchemaModel = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[EditorImageBrowserSchemaModel]
  }
}


package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorImageBrowserSchemaModelFieldsSize extends js.Object {
  var field: js.UndefOr[String] = js.undefined
  var parse: js.UndefOr[js.Function] = js.undefined
}

object EditorImageBrowserSchemaModelFieldsSize {
  @scala.inline
  def apply(field: String = null, parse: js.Function = null): EditorImageBrowserSchemaModelFieldsSize = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    __obj.asInstanceOf[EditorImageBrowserSchemaModelFieldsSize]
  }
}


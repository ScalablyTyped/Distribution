package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridColumnEditorOptions extends js.Object {
  var field: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var model: js.UndefOr[Model] = js.undefined
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

object GridColumnEditorOptions {
  @scala.inline
  def apply(field: String = null, format: String = null, model: Model = null, values: js.Array[_] = null): GridColumnEditorOptions = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridColumnEditorOptions]
  }
}


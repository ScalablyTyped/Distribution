package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.kendoNs.dataNs.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListEditorOptions extends js.Object {
  var field: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var model: js.UndefOr[Model] = js.undefined
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

object TreeListEditorOptions {
  @scala.inline
  def apply(field: String = null, format: String = null, model: Model = null, values: js.Array[_] = null): TreeListEditorOptions = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (format != null) __obj.updateDynamic("format")(format)
    if (model != null) __obj.updateDynamic("model")(model)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[TreeListEditorOptions]
  }
}


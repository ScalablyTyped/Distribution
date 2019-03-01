package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridColumnEditorOptions extends js.Object {
  var field: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var model: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.Model] = js.undefined
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

object GridColumnEditorOptions {
  @scala.inline
  def apply(
    field: java.lang.String = null,
    format: java.lang.String = null,
    model: kendoDashUiLib.kendoNs.dataNs.Model = null,
    values: js.Array[_] = null
  ): GridColumnEditorOptions = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (format != null) __obj.updateDynamic("format")(format)
    if (model != null) __obj.updateDynamic("model")(model)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[GridColumnEditorOptions]
  }
}


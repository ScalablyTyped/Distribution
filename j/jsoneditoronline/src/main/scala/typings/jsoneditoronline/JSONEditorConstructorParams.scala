package typings.jsoneditoronline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONEditorConstructorParams extends js.Object {
  var field: js.UndefOr[String] = js.undefined
  var fieldEditable: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object JSONEditorConstructorParams {
  @scala.inline
  def apply(field: String = null, fieldEditable: js.UndefOr[Boolean] = js.undefined, value: js.Any = null): JSONEditorConstructorParams = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (!js.isUndefined(fieldEditable)) __obj.updateDynamic("fieldEditable")(fieldEditable)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[JSONEditorConstructorParams]
  }
}


package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceSchemaModelFieldValidation
  extends /* rule */ StringDictionary[js.Any] {
  var max: js.UndefOr[js.Any] = js.undefined
  var maxLength: js.UndefOr[js.Any] = js.undefined
  var min: js.UndefOr[js.Any] = js.undefined
  var minLength: js.UndefOr[js.Any] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
}

object DataSourceSchemaModelFieldValidation {
  @scala.inline
  def apply(
    StringDictionary: /* rule */ StringDictionary[js.Any] = null,
    max: js.Any = null,
    maxLength: js.Any = null,
    min: js.Any = null,
    minLength: js.Any = null,
    required: js.UndefOr[Boolean] = js.undefined
  ): DataSourceSchemaModelFieldValidation = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceSchemaModelFieldValidation]
  }
}


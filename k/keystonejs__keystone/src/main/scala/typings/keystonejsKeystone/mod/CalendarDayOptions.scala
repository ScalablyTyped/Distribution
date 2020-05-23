package typings.keystonejsKeystone.mod

import typings.keystonejsFields.mod.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.keystonejsKeystone.mod.AllFieldsOptions because Already inherited */ trait CalendarDayOptions extends BaseFieldOptions {
  var format: js.UndefOr[String] = js.undefined
  var yearPickerType: js.UndefOr[String] = js.undefined
  var yearRangeFrom: js.UndefOr[Double] = js.undefined
  var yearRangeTo: js.UndefOr[Double] = js.undefined
}

object CalendarDayOptions {
  @scala.inline
  def apply(
    `type`: FieldType,
    access: Access = null,
    defaultValue: Boolean | DefaultValueFunction = null,
    format: String = null,
    hooks: Hooks = null,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    isUnique: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    schemaDoc: String = null,
    yearPickerType: String = null,
    yearRangeFrom: js.UndefOr[Double] = js.undefined,
    yearRangeTo: js.UndefOr[Double] = js.undefined
  ): CalendarDayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isUnique)) __obj.updateDynamic("isUnique")(isUnique.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (schemaDoc != null) __obj.updateDynamic("schemaDoc")(schemaDoc.asInstanceOf[js.Any])
    if (yearPickerType != null) __obj.updateDynamic("yearPickerType")(yearPickerType.asInstanceOf[js.Any])
    if (!js.isUndefined(yearRangeFrom)) __obj.updateDynamic("yearRangeFrom")(yearRangeFrom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yearRangeTo)) __obj.updateDynamic("yearRangeTo")(yearRangeTo.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarDayOptions]
  }
}


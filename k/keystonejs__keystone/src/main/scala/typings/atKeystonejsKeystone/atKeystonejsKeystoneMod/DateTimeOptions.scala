package typings.atKeystonejsKeystone.atKeystonejsKeystoneMod

import typings.atKeystonejsFields.atKeystonejsFieldsMod.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.AllFieldsOptions because Already inherited */ trait DateTimeOptions extends CalendarDayOptions {
  var knexOptions: js.Any
}

object DateTimeOptions {
  @scala.inline
  def apply(
    knexOptions: js.Any,
    `type`: FieldType,
    access: Access = null,
    format: String = null,
    hooks: Hooks = null,
    isRequired: js.UndefOr[Boolean] = js.undefined,
    isUnique: js.UndefOr[Boolean] = js.undefined,
    yearPickerType: String = null,
    yearRangeFrom: Int | Double = null,
    yearRangeTo: Int | Double = null
  ): DateTimeOptions = {
    val __obj = js.Dynamic.literal(knexOptions = knexOptions)
    __obj.updateDynamic("type")(`type`)
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (hooks != null) __obj.updateDynamic("hooks")(hooks)
    if (!js.isUndefined(isRequired)) __obj.updateDynamic("isRequired")(isRequired)
    if (!js.isUndefined(isUnique)) __obj.updateDynamic("isUnique")(isUnique)
    if (yearPickerType != null) __obj.updateDynamic("yearPickerType")(yearPickerType)
    if (yearRangeFrom != null) __obj.updateDynamic("yearRangeFrom")(yearRangeFrom.asInstanceOf[js.Any])
    if (yearRangeTo != null) __obj.updateDynamic("yearRangeTo")(yearRangeTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeOptions]
  }
}


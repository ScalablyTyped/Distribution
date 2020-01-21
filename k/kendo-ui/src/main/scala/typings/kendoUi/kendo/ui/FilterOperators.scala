package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterOperators extends js.Object {
  var boolean: js.UndefOr[FilterOperatorsBoolean] = js.undefined
  var date: js.UndefOr[FilterOperatorsDate] = js.undefined
  var number: js.UndefOr[FilterOperatorsNumber] = js.undefined
  var string: js.UndefOr[FilterOperatorsString] = js.undefined
}

object FilterOperators {
  @scala.inline
  def apply(
    boolean: FilterOperatorsBoolean = null,
    date: FilterOperatorsDate = null,
    number: FilterOperatorsNumber = null,
    string: FilterOperatorsString = null
  ): FilterOperators = {
    val __obj = js.Dynamic.literal()
    if (boolean != null) __obj.updateDynamic("boolean")(boolean.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOperators]
  }
}


package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterMenuOperators extends js.Object {
  var date: js.UndefOr[FilterMenuOperatorsDate] = js.undefined
  var enums: js.UndefOr[FilterMenuOperatorsEnums] = js.undefined
  var number: js.UndefOr[FilterMenuOperatorsNumber] = js.undefined
  var string: js.UndefOr[FilterMenuOperatorsString] = js.undefined
}

object FilterMenuOperators {
  @scala.inline
  def apply(
    date: FilterMenuOperatorsDate = null,
    enums: FilterMenuOperatorsEnums = null,
    number: FilterMenuOperatorsNumber = null,
    string: FilterMenuOperatorsString = null
  ): FilterMenuOperators = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterMenuOperators]
  }
}


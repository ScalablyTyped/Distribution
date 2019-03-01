package typings
package kendoDashUiLib.kendoNs.uiNs

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
    if (date != null) __obj.updateDynamic("date")(date)
    if (enums != null) __obj.updateDynamic("enums")(enums)
    if (number != null) __obj.updateDynamic("number")(number)
    if (string != null) __obj.updateDynamic("string")(string)
    __obj.asInstanceOf[FilterMenuOperators]
  }
}


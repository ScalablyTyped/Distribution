package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridFilterableOperators extends js.Object {
  var date: js.UndefOr[GridFilterableOperatorsDate] = js.undefined
  var enums: js.UndefOr[GridFilterableOperatorsEnums] = js.undefined
  var number: js.UndefOr[GridFilterableOperatorsNumber] = js.undefined
  var string: js.UndefOr[GridFilterableOperatorsString] = js.undefined
}

object GridFilterableOperators {
  @scala.inline
  def apply(
    date: GridFilterableOperatorsDate = null,
    enums: GridFilterableOperatorsEnums = null,
    number: GridFilterableOperatorsNumber = null,
    string: GridFilterableOperatorsString = null
  ): GridFilterableOperators = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date)
    if (enums != null) __obj.updateDynamic("enums")(enums)
    if (number != null) __obj.updateDynamic("number")(number)
    if (string != null) __obj.updateDynamic("string")(string)
    __obj.asInstanceOf[GridFilterableOperators]
  }
}


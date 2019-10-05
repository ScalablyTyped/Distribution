package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListFilterableOperators extends js.Object {
  var date: js.UndefOr[TreeListFilterableOperatorsDate] = js.undefined
  var number: js.UndefOr[TreeListFilterableOperatorsNumber] = js.undefined
  var string: js.UndefOr[TreeListFilterableOperatorsString] = js.undefined
}

object TreeListFilterableOperators {
  @scala.inline
  def apply(
    date: TreeListFilterableOperatorsDate = null,
    number: TreeListFilterableOperatorsNumber = null,
    string: TreeListFilterableOperatorsString = null
  ): TreeListFilterableOperators = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date)
    if (number != null) __obj.updateDynamic("number")(number)
    if (string != null) __obj.updateDynamic("string")(string)
    __obj.asInstanceOf[TreeListFilterableOperators]
  }
}


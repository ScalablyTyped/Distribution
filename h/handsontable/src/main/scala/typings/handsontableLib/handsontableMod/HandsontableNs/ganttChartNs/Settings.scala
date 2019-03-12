package typings
package handsontableLib.handsontableMod.HandsontableNs.ganttChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var allowSplitWeeks: js.UndefOr[scala.Boolean] = js.undefined
  var dataSource: HandsontableBindingInformation | js.Array[DataObject]
  var firstWeekDay: handsontableLib.handsontableLibStrings.monday | handsontableLib.handsontableLibStrings.sunday
  var hideDaysAfterFullWeeks: js.UndefOr[scala.Boolean] = js.undefined
  var hideDaysBeforeFullWeeks: js.UndefOr[scala.Boolean] = js.undefined
  var startYear: scala.Double
  var weekHeaderGenerator: js.UndefOr[js.Function2[/* start */ scala.Double, /* end */ scala.Double, java.lang.String]] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    dataSource: HandsontableBindingInformation | js.Array[DataObject],
    firstWeekDay: handsontableLib.handsontableLibStrings.monday | handsontableLib.handsontableLibStrings.sunday,
    startYear: scala.Double,
    allowSplitWeeks: js.UndefOr[scala.Boolean] = js.undefined,
    hideDaysAfterFullWeeks: js.UndefOr[scala.Boolean] = js.undefined,
    hideDaysBeforeFullWeeks: js.UndefOr[scala.Boolean] = js.undefined,
    weekHeaderGenerator: (/* start */ scala.Double, /* end */ scala.Double) => java.lang.String = null
  ): Settings = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], firstWeekDay = firstWeekDay.asInstanceOf[js.Any], startYear = startYear)
    if (!js.isUndefined(allowSplitWeeks)) __obj.updateDynamic("allowSplitWeeks")(allowSplitWeeks)
    if (!js.isUndefined(hideDaysAfterFullWeeks)) __obj.updateDynamic("hideDaysAfterFullWeeks")(hideDaysAfterFullWeeks)
    if (!js.isUndefined(hideDaysBeforeFullWeeks)) __obj.updateDynamic("hideDaysBeforeFullWeeks")(hideDaysBeforeFullWeeks)
    if (weekHeaderGenerator != null) __obj.updateDynamic("weekHeaderGenerator")(js.Any.fromFunction2(weekHeaderGenerator))
    __obj.asInstanceOf[Settings]
  }
}


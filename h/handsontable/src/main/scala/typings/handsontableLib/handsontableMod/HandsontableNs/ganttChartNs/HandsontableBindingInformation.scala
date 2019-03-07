package typings
package handsontableLib.handsontableMod.HandsontableNs.ganttChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandsontableBindingInformation extends js.Object {
  var additionalData: handsontableLib.Anon_Label
  var asyncUpdates: js.UndefOr[scala.Boolean] = js.undefined
  var endDateColumn: scala.Double
  var instance: handsontableLib.handsontableMod.Handsontable
  var startDateColumn: scala.Double
}

object HandsontableBindingInformation {
  @scala.inline
  def apply(
    additionalData: handsontableLib.Anon_Label,
    endDateColumn: scala.Double,
    instance: handsontableLib.handsontableMod.Handsontable,
    startDateColumn: scala.Double,
    asyncUpdates: js.UndefOr[scala.Boolean] = js.undefined
  ): HandsontableBindingInformation = {
    val __obj = js.Dynamic.literal(additionalData = additionalData, endDateColumn = endDateColumn, instance = instance, startDateColumn = startDateColumn)
    if (!js.isUndefined(asyncUpdates)) __obj.updateDynamic("asyncUpdates")(asyncUpdates)
    __obj.asInstanceOf[HandsontableBindingInformation]
  }
}


package typings.handsontable.handsontableMod.Handsontable.ganttChart

import typings.handsontable.Anon_Label
import typings.handsontable.handsontableMod.Handsontable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandsontableBindingInformation extends js.Object {
  var additionalData: Anon_Label
  var asyncUpdates: js.UndefOr[Boolean] = js.undefined
  var endDateColumn: Double
  var instance: Handsontable
  var startDateColumn: Double
}

object HandsontableBindingInformation {
  @scala.inline
  def apply(
    additionalData: Anon_Label,
    endDateColumn: Double,
    instance: Handsontable,
    startDateColumn: Double,
    asyncUpdates: js.UndefOr[Boolean] = js.undefined
  ): HandsontableBindingInformation = {
    val __obj = js.Dynamic.literal(additionalData = additionalData, endDateColumn = endDateColumn, instance = instance, startDateColumn = startDateColumn)
    if (!js.isUndefined(asyncUpdates)) __obj.updateDynamic("asyncUpdates")(asyncUpdates)
    __obj.asInstanceOf[HandsontableBindingInformation]
  }
}


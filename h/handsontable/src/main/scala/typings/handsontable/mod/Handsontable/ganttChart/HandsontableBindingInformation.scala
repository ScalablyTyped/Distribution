package typings.handsontable.mod.Handsontable.ganttChart

import typings.handsontable.anon.Label
import typings.handsontable.mod.Handsontable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandsontableBindingInformation extends js.Object {
  var additionalData: Label
  var asyncUpdates: js.UndefOr[Boolean] = js.undefined
  var endDateColumn: Double
  var instance: Handsontable
  var startDateColumn: Double
}

object HandsontableBindingInformation {
  @scala.inline
  def apply(
    additionalData: Label,
    endDateColumn: Double,
    instance: Handsontable,
    startDateColumn: Double,
    asyncUpdates: js.UndefOr[Boolean] = js.undefined
  ): HandsontableBindingInformation = {
    val __obj = js.Dynamic.literal(additionalData = additionalData.asInstanceOf[js.Any], endDateColumn = endDateColumn.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], startDateColumn = startDateColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(asyncUpdates)) __obj.updateDynamic("asyncUpdates")(asyncUpdates.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandsontableBindingInformation]
  }
}


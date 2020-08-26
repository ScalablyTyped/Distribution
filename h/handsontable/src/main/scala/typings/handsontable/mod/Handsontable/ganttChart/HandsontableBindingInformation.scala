package typings.handsontable.mod.Handsontable.ganttChart

import typings.handsontable.anon.Label
import typings.handsontable.mod.Handsontable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandsontableBindingInformation extends js.Object {
  var additionalData: Label = js.native
  var asyncUpdates: js.UndefOr[Boolean] = js.native
  var endDateColumn: Double = js.native
  var instance: Handsontable = js.native
  var startDateColumn: Double = js.native
}

object HandsontableBindingInformation {
  @scala.inline
  def apply(additionalData: Label, endDateColumn: Double, instance: Handsontable, startDateColumn: Double): HandsontableBindingInformation = {
    val __obj = js.Dynamic.literal(additionalData = additionalData.asInstanceOf[js.Any], endDateColumn = endDateColumn.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], startDateColumn = startDateColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandsontableBindingInformation]
  }
  @scala.inline
  implicit class HandsontableBindingInformationOps[Self <: HandsontableBindingInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdditionalData(value: Label): Self = this.set("additionalData", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndDateColumn(value: Double): Self = this.set("endDateColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstance(value: Handsontable): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartDateColumn(value: Double): Self = this.set("startDateColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsyncUpdates(value: Boolean): Self = this.set("asyncUpdates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsyncUpdates: Self = this.set("asyncUpdates", js.undefined)
  }
  
}


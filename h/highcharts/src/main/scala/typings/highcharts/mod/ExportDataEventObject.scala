package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportDataEventObject extends js.Object {
  /**
    * Contains the data rows for the current export task and can be modified.
    */
  var dataRows: js.Array[js.Array[String]] = js.native
}

object ExportDataEventObject {
  @scala.inline
  def apply(dataRows: js.Array[js.Array[String]]): ExportDataEventObject = {
    val __obj = js.Dynamic.literal(dataRows = dataRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportDataEventObject]
  }
  @scala.inline
  implicit class ExportDataEventObjectOps[Self <: ExportDataEventObject] (val x: Self) extends AnyVal {
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
    def setDataRowsVarargs(value: js.Array[String]*): Self = this.set("dataRows", js.Array(value :_*))
    @scala.inline
    def setDataRows(value: js.Array[js.Array[String]]): Self = this.set("dataRows", value.asInstanceOf[js.Any])
  }
  
}


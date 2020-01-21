package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportDataEventObject extends js.Object {
  /**
    * Contains the data rows for the current export task and can be modified.
    */
  var dataRows: js.Array[js.Array[String]]
}

object ExportDataEventObject {
  @scala.inline
  def apply(dataRows: js.Array[js.Array[String]]): ExportDataEventObject = {
    val __obj = js.Dynamic.literal(dataRows = dataRows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExportDataEventObject]
  }
}


package typings.handsontable

import typings.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCol extends js.Object {
  var col: Double
  var dateFormat: js.UndefOr[String] = js.undefined
  var instance: Core
  var row: Double
  var `type`: String
  var visualCol: Double
  var visualRow: Double
}

object AnonCol {
  @scala.inline
  def apply(
    col: Double,
    instance: Core,
    row: Double,
    `type`: String,
    visualCol: Double,
    visualRow: Double,
    dateFormat: String = null
  ): AnonCol = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], visualCol = visualCol.asInstanceOf[js.Any], visualRow = visualRow.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCol]
  }
}


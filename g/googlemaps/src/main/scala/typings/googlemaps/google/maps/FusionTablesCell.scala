package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FusionTablesCell extends js.Object {
  var columnName: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object FusionTablesCell {
  @scala.inline
  def apply(columnName: String = null, value: String = null): FusionTablesCell = {
    val __obj = js.Dynamic.literal()
    if (columnName != null) __obj.updateDynamic("columnName")(columnName)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[FusionTablesCell]
  }
}


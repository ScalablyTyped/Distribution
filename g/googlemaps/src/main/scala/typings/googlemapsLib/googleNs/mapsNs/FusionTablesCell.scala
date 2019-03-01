package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FusionTablesCell extends js.Object {
  var columnName: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object FusionTablesCell {
  @scala.inline
  def apply(columnName: java.lang.String = null, value: java.lang.String = null): FusionTablesCell = {
    val __obj = js.Dynamic.literal()
    if (columnName != null) __obj.updateDynamic("columnName")(columnName)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[FusionTablesCell]
  }
}


package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO find source documentation
@js.native
trait FusionTablesCell extends js.Object {
  var columnName: js.UndefOr[String] = js.native
  var value: js.UndefOr[String] = js.native
}

object FusionTablesCell {
  @scala.inline
  def apply(): FusionTablesCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FusionTablesCell]
  }
  @scala.inline
  implicit class FusionTablesCellOps[Self <: FusionTablesCell] (val x: Self) extends AnyVal {
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
    def setColumnName(value: String): Self = this.set("columnName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnName: Self = this.set("columnName", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}


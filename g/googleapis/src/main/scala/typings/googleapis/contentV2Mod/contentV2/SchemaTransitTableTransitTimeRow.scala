package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTransitTableTransitTimeRow extends js.Object {
  var values: js.UndefOr[js.Array[SchemaTransitTableTransitTimeRowTransitTimeValue]] = js.native
}

object SchemaTransitTableTransitTimeRow {
  @scala.inline
  def apply(): SchemaTransitTableTransitTimeRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransitTableTransitTimeRow]
  }
  @scala.inline
  implicit class SchemaTransitTableTransitTimeRowOps[Self <: SchemaTransitTableTransitTimeRow] (val x: Self) extends AnyVal {
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
    def setValuesVarargs(value: SchemaTransitTableTransitTimeRowTransitTimeValue*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[SchemaTransitTableTransitTimeRowTransitTimeValue]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}


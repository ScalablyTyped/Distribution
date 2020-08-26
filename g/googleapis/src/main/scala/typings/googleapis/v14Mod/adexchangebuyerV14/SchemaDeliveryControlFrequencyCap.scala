package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDeliveryControlFrequencyCap extends js.Object {
  var maxImpressions: js.UndefOr[Double] = js.native
  var numTimeUnits: js.UndefOr[Double] = js.native
  var timeUnitType: js.UndefOr[String] = js.native
}

object SchemaDeliveryControlFrequencyCap {
  @scala.inline
  def apply(): SchemaDeliveryControlFrequencyCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeliveryControlFrequencyCap]
  }
  @scala.inline
  implicit class SchemaDeliveryControlFrequencyCapOps[Self <: SchemaDeliveryControlFrequencyCap] (val x: Self) extends AnyVal {
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
    def setMaxImpressions(value: Double): Self = this.set("maxImpressions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxImpressions: Self = this.set("maxImpressions", js.undefined)
    @scala.inline
    def setNumTimeUnits(value: Double): Self = this.set("numTimeUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumTimeUnits: Self = this.set("numTimeUnits", js.undefined)
    @scala.inline
    def setTimeUnitType(value: String): Self = this.set("timeUnitType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeUnitType: Self = this.set("timeUnitType", js.undefined)
  }
  
}


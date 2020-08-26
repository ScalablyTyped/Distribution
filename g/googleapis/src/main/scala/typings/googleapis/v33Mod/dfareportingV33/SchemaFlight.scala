package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Flight
  */
@js.native
trait SchemaFlight extends js.Object {
  /**
    * Inventory item flight end date.
    */
  var endDate: js.UndefOr[String] = js.native
  /**
    * Rate or cost of this flight.
    */
  var rateOrCost: js.UndefOr[String] = js.native
  /**
    * Inventory item flight start date.
    */
  var startDate: js.UndefOr[String] = js.native
  /**
    * Units of this flight.
    */
  var units: js.UndefOr[String] = js.native
}

object SchemaFlight {
  @scala.inline
  def apply(): SchemaFlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFlight]
  }
  @scala.inline
  implicit class SchemaFlightOps[Self <: SchemaFlight] (val x: Self) extends AnyVal {
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
    def setEndDate(value: String): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    @scala.inline
    def setRateOrCost(value: String): Self = this.set("rateOrCost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRateOrCost: Self = this.set("rateOrCost", js.undefined)
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    @scala.inline
    def setUnits(value: String): Self = this.set("units", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnits: Self = this.set("units", js.undefined)
  }
  
}


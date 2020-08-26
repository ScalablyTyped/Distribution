package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pricing Information
  */
@js.native
trait SchemaPricing extends js.Object {
  /**
    * Cap cost type of this inventory item.
    */
  var capCostType: js.UndefOr[String] = js.native
  /**
    * End date of this inventory item.
    */
  var endDate: js.UndefOr[String] = js.native
  /**
    * Flights of this inventory item. A flight (a.k.a. pricing period)
    * represents the inventory item pricing information for a specific period
    * of time.
    */
  var flights: js.UndefOr[js.Array[SchemaFlight]] = js.native
  /**
    * Group type of this inventory item if it represents a placement group. Is
    * null otherwise. There are two type of placement groups:
    * PLANNING_PLACEMENT_GROUP_TYPE_PACKAGE is a simple group of inventory
    * items that acts as a single pricing point for a group of tags.
    * PLANNING_PLACEMENT_GROUP_TYPE_ROADBLOCK is a group of inventory items
    * that not only acts as a single pricing point, but also assumes that all
    * the tags in it will be served at the same time. A roadblock requires one
    * of its assigned inventory items to be marked as primary.
    */
  var groupType: js.UndefOr[String] = js.native
  /**
    * Pricing type of this inventory item.
    */
  var pricingType: js.UndefOr[String] = js.native
  /**
    * Start date of this inventory item.
    */
  var startDate: js.UndefOr[String] = js.native
}

object SchemaPricing {
  @scala.inline
  def apply(): SchemaPricing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPricing]
  }
  @scala.inline
  implicit class SchemaPricingOps[Self <: SchemaPricing] (val x: Self) extends AnyVal {
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
    def setCapCostType(value: String): Self = this.set("capCostType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapCostType: Self = this.set("capCostType", js.undefined)
    @scala.inline
    def setEndDate(value: String): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    @scala.inline
    def setFlightsVarargs(value: SchemaFlight*): Self = this.set("flights", js.Array(value :_*))
    @scala.inline
    def setFlights(value: js.Array[SchemaFlight]): Self = this.set("flights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlights: Self = this.set("flights", js.undefined)
    @scala.inline
    def setGroupType(value: String): Self = this.set("groupType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupType: Self = this.set("groupType", js.undefined)
    @scala.inline
    def setPricingType(value: String): Self = this.set("pricingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePricingType: Self = this.set("pricingType", js.undefined)
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
  }
  
}


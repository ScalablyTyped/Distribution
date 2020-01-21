package typings.googleapis.v31Mod.dfareportingV31

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
  def apply(
    capCostType: String = null,
    endDate: String = null,
    flights: js.Array[SchemaFlight] = null,
    groupType: String = null,
    pricingType: String = null,
    startDate: String = null
  ): SchemaPricing = {
    val __obj = js.Dynamic.literal()
    if (capCostType != null) __obj.updateDynamic("capCostType")(capCostType.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (flights != null) __obj.updateDynamic("flights")(flights.asInstanceOf[js.Any])
    if (groupType != null) __obj.updateDynamic("groupType")(groupType.asInstanceOf[js.Any])
    if (pricingType != null) __obj.updateDynamic("pricingType")(pricingType.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPricing]
  }
}


package typings.googleapis.v31Mod.dfareportingV31

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
  def apply(endDate: String = null, rateOrCost: String = null, startDate: String = null, units: String = null): SchemaFlight = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (rateOrCost != null) __obj.updateDynamic("rateOrCost")(rateOrCost.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFlight]
  }
}


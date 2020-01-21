package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an event period update resource.
  */
@js.native
trait SchemaEventPeriodUpdate extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#eventPeriodUpdate.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The time period being covered by this update.
    */
  var timePeriod: js.UndefOr[SchemaEventPeriodRange] = js.native
  /**
    * The updates being made for this time period.
    */
  var updates: js.UndefOr[js.Array[SchemaEventUpdateRequest]] = js.native
}

object SchemaEventPeriodUpdate {
  @scala.inline
  def apply(
    kind: String = null,
    timePeriod: SchemaEventPeriodRange = null,
    updates: js.Array[SchemaEventUpdateRequest] = null
  ): SchemaEventPeriodUpdate = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (timePeriod != null) __obj.updateDynamic("timePeriod")(timePeriod.asInstanceOf[js.Any])
    if (updates != null) __obj.updateDynamic("updates")(updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEventPeriodUpdate]
  }
}


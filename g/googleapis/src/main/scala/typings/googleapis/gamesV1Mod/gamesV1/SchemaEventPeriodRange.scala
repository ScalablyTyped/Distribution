package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an event period time range.
  */
@js.native
trait SchemaEventPeriodRange extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#eventPeriodRange.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The time when this update period ends, in millis, since 1970 UTC (Unix
    * Epoch).
    */
  var periodEndMillis: js.UndefOr[String] = js.native
  /**
    * The time when this update period begins, in millis, since 1970 UTC (Unix
    * Epoch).
    */
  var periodStartMillis: js.UndefOr[String] = js.native
}

object SchemaEventPeriodRange {
  @scala.inline
  def apply(kind: String = null, periodEndMillis: String = null, periodStartMillis: String = null): SchemaEventPeriodRange = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (periodEndMillis != null) __obj.updateDynamic("periodEndMillis")(periodEndMillis.asInstanceOf[js.Any])
    if (periodStartMillis != null) __obj.updateDynamic("periodStartMillis")(periodStartMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEventPeriodRange]
  }
}


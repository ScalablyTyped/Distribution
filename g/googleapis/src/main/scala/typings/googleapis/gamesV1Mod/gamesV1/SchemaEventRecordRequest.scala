package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an event period update resource.
  */
@js.native
trait SchemaEventRecordRequest extends js.Object {
  /**
    * The current time when this update was sent, in milliseconds, since 1970
    * UTC (Unix Epoch).
    */
  var currentTimeMillis: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#eventRecordRequest.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The request ID used to identify this attempt to record events.
    */
  var requestId: js.UndefOr[String] = js.native
  /**
    * A list of the time period updates being made in this request.
    */
  var timePeriods: js.UndefOr[js.Array[SchemaEventPeriodUpdate]] = js.native
}

object SchemaEventRecordRequest {
  @scala.inline
  def apply(
    currentTimeMillis: String = null,
    kind: String = null,
    requestId: String = null,
    timePeriods: js.Array[SchemaEventPeriodUpdate] = null
  ): SchemaEventRecordRequest = {
    val __obj = js.Dynamic.literal()
    if (currentTimeMillis != null) __obj.updateDynamic("currentTimeMillis")(currentTimeMillis.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    if (timePeriods != null) __obj.updateDynamic("timePeriods")(timePeriods.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEventRecordRequest]
  }
}


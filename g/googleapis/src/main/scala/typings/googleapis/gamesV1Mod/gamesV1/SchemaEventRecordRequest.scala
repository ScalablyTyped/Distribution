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
  def apply(): SchemaEventRecordRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventRecordRequest]
  }
  @scala.inline
  implicit class SchemaEventRecordRequestOps[Self <: SchemaEventRecordRequest] (val x: Self) extends AnyVal {
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
    def setCurrentTimeMillis(value: String): Self = this.set("currentTimeMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentTimeMillis: Self = this.set("currentTimeMillis", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
    @scala.inline
    def setTimePeriodsVarargs(value: SchemaEventPeriodUpdate*): Self = this.set("timePeriods", js.Array(value :_*))
    @scala.inline
    def setTimePeriods(value: js.Array[SchemaEventPeriodUpdate]): Self = this.set("timePeriods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePeriods: Self = this.set("timePeriods", js.undefined)
  }
  
}


package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An open-ended realtime time range specified by the start timestamp. For
  * filter sets that specify a realtime time range RTB metrics continue to be
  * aggregated throughout the lifetime of the filter set.
  */
@js.native
trait SchemaRealtimeTimeRange extends js.Object {
  /**
    * The start timestamp of the real-time RTB metrics aggregation.
    */
  var startTimestamp: js.UndefOr[String] = js.native
}

object SchemaRealtimeTimeRange {
  @scala.inline
  def apply(): SchemaRealtimeTimeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRealtimeTimeRange]
  }
  @scala.inline
  implicit class SchemaRealtimeTimeRangeOps[Self <: SchemaRealtimeTimeRange] (val x: Self) extends AnyVal {
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
    def setStartTimestamp(value: String): Self = this.set("startTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTimestamp: Self = this.set("startTimestamp", js.undefined)
  }
  
}


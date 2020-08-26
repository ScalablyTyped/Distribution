package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single data point in a time series.
  */
@js.native
trait SchemaPoint extends js.Object {
  /**
    * The time interval to which the data point applies. For GAUGE metrics,
    * only the end time of the interval is used. For DELTA metrics, the start
    * and end time should specify a non-zero interval, with subsequent points
    * specifying contiguous and non-overlapping intervals. For CUMULATIVE
    * metrics, the start and end time should specify a non-zero interval, with
    * subsequent points specifying the same start time and increasing end
    * times, until an event resets the cumulative value to zero and sets a new
    * start time for the following points.
    */
  var interval: js.UndefOr[SchemaTimeInterval] = js.native
  /**
    * The value of the data point.
    */
  var value: js.UndefOr[SchemaTypedValue] = js.native
}

object SchemaPoint {
  @scala.inline
  def apply(): SchemaPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPoint]
  }
  @scala.inline
  implicit class SchemaPointOps[Self <: SchemaPoint] (val x: Self) extends AnyVal {
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
    def setInterval(value: SchemaTimeInterval): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setValue(value: SchemaTypedValue): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}


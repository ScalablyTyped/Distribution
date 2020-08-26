package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The attributes, like playtime and percent onscreen, that define the Custom
  * Viewability Metric.
  */
@js.native
trait SchemaCustomViewabilityMetricConfiguration extends js.Object {
  /**
    * Whether the video must be audible to count an impression.
    */
  var audible: js.UndefOr[Boolean] = js.native
  /**
    * The time in milliseconds the video must play for the Custom Viewability
    * Metric to count an impression. If both this and timePercent are
    * specified, the earlier of the two will be used.
    */
  var timeMillis: js.UndefOr[Double] = js.native
  /**
    * The percentage of video that must play for the Custom Viewability Metric
    * to count an impression. If both this and timeMillis are specified, the
    * earlier of the two will be used.
    */
  var timePercent: js.UndefOr[Double] = js.native
  /**
    * The percentage of video that must be on screen for the Custom Viewability
    * Metric to count an impression.
    */
  var viewabilityPercent: js.UndefOr[Double] = js.native
}

object SchemaCustomViewabilityMetricConfiguration {
  @scala.inline
  def apply(): SchemaCustomViewabilityMetricConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomViewabilityMetricConfiguration]
  }
  @scala.inline
  implicit class SchemaCustomViewabilityMetricConfigurationOps[Self <: SchemaCustomViewabilityMetricConfiguration] (val x: Self) extends AnyVal {
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
    def setAudible(value: Boolean): Self = this.set("audible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudible: Self = this.set("audible", js.undefined)
    @scala.inline
    def setTimeMillis(value: Double): Self = this.set("timeMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeMillis: Self = this.set("timeMillis", js.undefined)
    @scala.inline
    def setTimePercent(value: Double): Self = this.set("timePercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimePercent: Self = this.set("timePercent", js.undefined)
    @scala.inline
    def setViewabilityPercent(value: Double): Self = this.set("viewabilityPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewabilityPercent: Self = this.set("viewabilityPercent", js.undefined)
  }
  
}


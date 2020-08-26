package typings.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricsProperties extends js.Object {
  var commandGroup: String = js.native
  var commandKey: String = js.native
  var percentileWindowNumberOfBuckets: js.UndefOr[Double] = js.native
  var percentileWindowTimeInMilliSeconds: js.UndefOr[Double] = js.native
  var statisticalWindowNumberOfBuckets: js.UndefOr[Double] = js.native
  var statisticalWindowTimeInMilliSeconds: js.UndefOr[Double] = js.native
}

object MetricsProperties {
  @scala.inline
  def apply(commandGroup: String, commandKey: String): MetricsProperties = {
    val __obj = js.Dynamic.literal(commandGroup = commandGroup.asInstanceOf[js.Any], commandKey = commandKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsProperties]
  }
  @scala.inline
  implicit class MetricsPropertiesOps[Self <: MetricsProperties] (val x: Self) extends AnyVal {
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
    def setCommandGroup(value: String): Self = this.set("commandGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommandKey(value: String): Self = this.set("commandKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercentileWindowNumberOfBuckets(value: Double): Self = this.set("percentileWindowNumberOfBuckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentileWindowNumberOfBuckets: Self = this.set("percentileWindowNumberOfBuckets", js.undefined)
    @scala.inline
    def setPercentileWindowTimeInMilliSeconds(value: Double): Self = this.set("percentileWindowTimeInMilliSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentileWindowTimeInMilliSeconds: Self = this.set("percentileWindowTimeInMilliSeconds", js.undefined)
    @scala.inline
    def setStatisticalWindowNumberOfBuckets(value: Double): Self = this.set("statisticalWindowNumberOfBuckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatisticalWindowNumberOfBuckets: Self = this.set("statisticalWindowNumberOfBuckets", js.undefined)
    @scala.inline
    def setStatisticalWindowTimeInMilliSeconds(value: Double): Self = this.set("statisticalWindowTimeInMilliSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatisticalWindowTimeInMilliSeconds: Self = this.set("statisticalWindowTimeInMilliSeconds", js.undefined)
  }
  
}


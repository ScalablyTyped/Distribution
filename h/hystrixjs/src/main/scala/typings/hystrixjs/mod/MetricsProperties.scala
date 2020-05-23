package typings.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsProperties extends js.Object {
  var commandGroup: String
  var commandKey: String
  var percentileWindowNumberOfBuckets: js.UndefOr[Double] = js.undefined
  var percentileWindowTimeInMilliSeconds: js.UndefOr[Double] = js.undefined
  var statisticalWindowNumberOfBuckets: js.UndefOr[Double] = js.undefined
  var statisticalWindowTimeInMilliSeconds: js.UndefOr[Double] = js.undefined
}

object MetricsProperties {
  @scala.inline
  def apply(
    commandGroup: String,
    commandKey: String,
    percentileWindowNumberOfBuckets: js.UndefOr[Double] = js.undefined,
    percentileWindowTimeInMilliSeconds: js.UndefOr[Double] = js.undefined,
    statisticalWindowNumberOfBuckets: js.UndefOr[Double] = js.undefined,
    statisticalWindowTimeInMilliSeconds: js.UndefOr[Double] = js.undefined
  ): MetricsProperties = {
    val __obj = js.Dynamic.literal(commandGroup = commandGroup.asInstanceOf[js.Any], commandKey = commandKey.asInstanceOf[js.Any])
    if (!js.isUndefined(percentileWindowNumberOfBuckets)) __obj.updateDynamic("percentileWindowNumberOfBuckets")(percentileWindowNumberOfBuckets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(percentileWindowTimeInMilliSeconds)) __obj.updateDynamic("percentileWindowTimeInMilliSeconds")(percentileWindowTimeInMilliSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(statisticalWindowNumberOfBuckets)) __obj.updateDynamic("statisticalWindowNumberOfBuckets")(statisticalWindowNumberOfBuckets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(statisticalWindowTimeInMilliSeconds)) __obj.updateDynamic("statisticalWindowTimeInMilliSeconds")(statisticalWindowTimeInMilliSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsProperties]
  }
}


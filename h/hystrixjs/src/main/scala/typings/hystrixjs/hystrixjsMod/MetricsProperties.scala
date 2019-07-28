package typings.hystrixjs.hystrixjsMod

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
    percentileWindowNumberOfBuckets: Int | Double = null,
    percentileWindowTimeInMilliSeconds: Int | Double = null,
    statisticalWindowNumberOfBuckets: Int | Double = null,
    statisticalWindowTimeInMilliSeconds: Int | Double = null
  ): MetricsProperties = {
    val __obj = js.Dynamic.literal(commandGroup = commandGroup, commandKey = commandKey)
    if (percentileWindowNumberOfBuckets != null) __obj.updateDynamic("percentileWindowNumberOfBuckets")(percentileWindowNumberOfBuckets.asInstanceOf[js.Any])
    if (percentileWindowTimeInMilliSeconds != null) __obj.updateDynamic("percentileWindowTimeInMilliSeconds")(percentileWindowTimeInMilliSeconds.asInstanceOf[js.Any])
    if (statisticalWindowNumberOfBuckets != null) __obj.updateDynamic("statisticalWindowNumberOfBuckets")(statisticalWindowNumberOfBuckets.asInstanceOf[js.Any])
    if (statisticalWindowTimeInMilliSeconds != null) __obj.updateDynamic("statisticalWindowTimeInMilliSeconds")(statisticalWindowTimeInMilliSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsProperties]
  }
}


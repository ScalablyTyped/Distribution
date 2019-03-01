package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsProperties extends js.Object {
  var commandGroup: java.lang.String
  var commandKey: java.lang.String
  var percentileWindowNumberOfBuckets: js.UndefOr[scala.Double] = js.undefined
  var percentileWindowTimeInMilliSeconds: js.UndefOr[scala.Double] = js.undefined
  var statisticalWindowNumberOfBuckets: js.UndefOr[scala.Double] = js.undefined
  var statisticalWindowTimeInMilliSeconds: js.UndefOr[scala.Double] = js.undefined
}

object MetricsProperties {
  @scala.inline
  def apply(
    commandGroup: java.lang.String,
    commandKey: java.lang.String,
    percentileWindowNumberOfBuckets: scala.Int | scala.Double = null,
    percentileWindowTimeInMilliSeconds: scala.Int | scala.Double = null,
    statisticalWindowNumberOfBuckets: scala.Int | scala.Double = null,
    statisticalWindowTimeInMilliSeconds: scala.Int | scala.Double = null
  ): MetricsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("commandGroup")(commandGroup)
    __obj.updateDynamic("commandKey")(commandKey)
    if (percentileWindowNumberOfBuckets != null) __obj.updateDynamic("percentileWindowNumberOfBuckets")(percentileWindowNumberOfBuckets.asInstanceOf[js.Any])
    if (percentileWindowTimeInMilliSeconds != null) __obj.updateDynamic("percentileWindowTimeInMilliSeconds")(percentileWindowTimeInMilliSeconds.asInstanceOf[js.Any])
    if (statisticalWindowNumberOfBuckets != null) __obj.updateDynamic("statisticalWindowNumberOfBuckets")(statisticalWindowNumberOfBuckets.asInstanceOf[js.Any])
    if (statisticalWindowTimeInMilliSeconds != null) __obj.updateDynamic("statisticalWindowTimeInMilliSeconds")(statisticalWindowTimeInMilliSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsProperties]
  }
}


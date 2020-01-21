package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Strategy that specifies how clients of Google Service Controller want to
  * send traffic to use different config versions. This is generally used by
  * API proxy to split traffic based on your configured precentage for each
  * config version.  One example of how to gradually rollout a new service
  * configuration using this strategy: Day 1      Rollout {       id:
  * &quot;example.googleapis.com/rollout_20160206&quot;
  * traffic_percent_strategy {         percentages: {
  * &quot;example.googleapis.com/20160201&quot;: 70.00
  * &quot;example.googleapis.com/20160206&quot;: 30.00         }       }     }
  * Day 2      Rollout {       id:
  * &quot;example.googleapis.com/rollout_20160207&quot;
  * traffic_percent_strategy: {         percentages: {
  * &quot;example.googleapis.com/20160206&quot;: 100.00         }       }     }
  */
@js.native
trait SchemaTrafficPercentStrategy extends js.Object {
  /**
    * Maps service configuration IDs to their corresponding traffic percentage.
    * Key is the service configuration ID, Value is the traffic percentage
    * which must be greater than 0.0 and the sum must equal to 100.0.
    */
  var percentages: js.UndefOr[StringDictionary[Double]] = js.native
}

object SchemaTrafficPercentStrategy {
  @scala.inline
  def apply(percentages: StringDictionary[Double] = null): SchemaTrafficPercentStrategy = {
    val __obj = js.Dynamic.literal()
    if (percentages != null) __obj.updateDynamic("percentages")(percentages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTrafficPercentStrategy]
  }
}


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
  def apply(): SchemaTrafficPercentStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrafficPercentStrategy]
  }
  @scala.inline
  implicit class SchemaTrafficPercentStrategyOps[Self <: SchemaTrafficPercentStrategy] (val x: Self) extends AnyVal {
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
    def setPercentages(value: StringDictionary[Double]): Self = this.set("percentages", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentages: Self = this.set("percentages", js.undefined)
  }
  
}


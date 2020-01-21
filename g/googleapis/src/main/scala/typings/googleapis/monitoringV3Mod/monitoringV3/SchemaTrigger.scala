package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies how many time series must fail a predicate to trigger a
  * condition. If not specified, then a {count: 1} trigger is used.
  */
@js.native
trait SchemaTrigger extends js.Object {
  /**
    * The absolute number of time series that must fail the predicate for the
    * condition to be triggered.
    */
  var count: js.UndefOr[Double] = js.native
  /**
    * The percentage of time series that must fail the predicate for the
    * condition to be triggered.
    */
  var percent: js.UndefOr[Double] = js.native
}

object SchemaTrigger {
  @scala.inline
  def apply(count: Int | Double = null, percent: Int | Double = null): SchemaTrigger = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTrigger]
  }
}


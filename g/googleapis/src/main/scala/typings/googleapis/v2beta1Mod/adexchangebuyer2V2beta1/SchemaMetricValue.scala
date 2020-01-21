package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A metric value, with an expected value and a variance; represents a count
  * that may be either exact or estimated (i.e. when sampled).
  */
@js.native
trait SchemaMetricValue extends js.Object {
  /**
    * The expected value of the metric.
    */
  var value: js.UndefOr[String] = js.native
  /**
    * The variance (i.e. square of the standard deviation) of the metric value.
    * If value is exact, variance is 0. Can be used to calculate margin of
    * error as a percentage of value, using the following formula, where Z is
    * the standard constant that depends on the desired size of the confidence
    * interval (e.g. for 90% confidence interval, use Z = 1.645): marginOfError
    * = 100 * Z * sqrt(variance) / value
    */
  var variance: js.UndefOr[String] = js.native
}

object SchemaMetricValue {
  @scala.inline
  def apply(value: String = null, variance: String = null): SchemaMetricValue = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (variance != null) __obj.updateDynamic("variance")(variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMetricValue]
  }
}


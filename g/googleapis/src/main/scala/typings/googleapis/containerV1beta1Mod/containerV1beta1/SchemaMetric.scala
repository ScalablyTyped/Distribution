package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Progress metric is (string, int|float|string) pair.
  */
@js.native
trait SchemaMetric extends js.Object {
  /**
    * For metrics with floating point value.
    */
  var doubleValue: js.UndefOr[Double] = js.native
  /**
    * For metrics with integer value.
    */
  var intValue: js.UndefOr[String] = js.native
  /**
    * Metric name, required. e.g., &quot;nodes total&quot;, &quot;percent
    * done&quot;
    */
  var name: js.UndefOr[String] = js.native
  /**
    * For metrics with custom values (ratios, visual progress, etc.).
    */
  var stringValue: js.UndefOr[String] = js.native
}

object SchemaMetric {
  @scala.inline
  def apply(
    doubleValue: js.UndefOr[Double] = js.undefined,
    intValue: String = null,
    name: String = null,
    stringValue: String = null
  ): SchemaMetric = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(doubleValue)) __obj.updateDynamic("doubleValue")(doubleValue.get.asInstanceOf[js.Any])
    if (intValue != null) __obj.updateDynamic("intValue")(intValue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMetric]
  }
}


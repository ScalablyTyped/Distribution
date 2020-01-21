package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single strongly-typed value.
  */
@js.native
trait SchemaTypedValue extends js.Object {
  /**
    * A Boolean value: true or false.
    */
  var boolValue: js.UndefOr[Boolean] = js.native
  /**
    * A distribution value.
    */
  var distributionValue: js.UndefOr[SchemaDistribution] = js.native
  /**
    * A 64-bit double-precision floating-point number. Its magnitude is
    * approximately &amp;plusmn;10&lt;sup&gt;&amp;plusmn;300&lt;/sup&gt; and it
    * has 16 significant digits of precision.
    */
  var doubleValue: js.UndefOr[Double] = js.native
  /**
    * A 64-bit integer. Its range is approximately
    * &amp;plusmn;9.2x10&lt;sup&gt;18&lt;/sup&gt;.
    */
  var int64Value: js.UndefOr[String] = js.native
  /**
    * A variable-length string value.
    */
  var stringValue: js.UndefOr[String] = js.native
}

object SchemaTypedValue {
  @scala.inline
  def apply(
    boolValue: js.UndefOr[Boolean] = js.undefined,
    distributionValue: SchemaDistribution = null,
    doubleValue: Int | Double = null,
    int64Value: String = null,
    stringValue: String = null
  ): SchemaTypedValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolValue)) __obj.updateDynamic("boolValue")(boolValue.asInstanceOf[js.Any])
    if (distributionValue != null) __obj.updateDynamic("distributionValue")(distributionValue.asInstanceOf[js.Any])
    if (doubleValue != null) __obj.updateDynamic("doubleValue")(doubleValue.asInstanceOf[js.Any])
    if (int64Value != null) __obj.updateDynamic("int64Value")(int64Value.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTypedValue]
  }
}


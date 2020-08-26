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
  def apply(): SchemaTypedValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTypedValue]
  }
  @scala.inline
  implicit class SchemaTypedValueOps[Self <: SchemaTypedValue] (val x: Self) extends AnyVal {
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
    def setBoolValue(value: Boolean): Self = this.set("boolValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoolValue: Self = this.set("boolValue", js.undefined)
    @scala.inline
    def setDistributionValue(value: SchemaDistribution): Self = this.set("distributionValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistributionValue: Self = this.set("distributionValue", js.undefined)
    @scala.inline
    def setDoubleValue(value: Double): Self = this.set("doubleValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoubleValue: Self = this.set("doubleValue", js.undefined)
    @scala.inline
    def setInt64Value(value: String): Self = this.set("int64Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInt64Value: Self = this.set("int64Value", js.undefined)
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
  }
  
}


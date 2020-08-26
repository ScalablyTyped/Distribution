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
  def apply(): SchemaMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetric]
  }
  @scala.inline
  implicit class SchemaMetricOps[Self <: SchemaMetric] (val x: Self) extends AnyVal {
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
    def setDoubleValue(value: Double): Self = this.set("doubleValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoubleValue: Self = this.set("doubleValue", js.undefined)
    @scala.inline
    def setIntValue(value: String): Self = this.set("intValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntValue: Self = this.set("intValue", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
  }
  
}


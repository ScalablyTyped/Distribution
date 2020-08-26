package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProductUnitPricingBaseMeasure extends js.Object {
  /**
    * The unit of the denominator.
    */
  var unit: js.UndefOr[String] = js.native
  /**
    * The denominator of the unit price.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaProductUnitPricingBaseMeasure {
  @scala.inline
  def apply(): SchemaProductUnitPricingBaseMeasure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductUnitPricingBaseMeasure]
  }
  @scala.inline
  implicit class SchemaProductUnitPricingBaseMeasureOps[Self <: SchemaProductUnitPricingBaseMeasure] (val x: Self) extends AnyVal {
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
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

